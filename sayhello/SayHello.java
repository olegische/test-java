class SayHello {
    public static void main(String[] args) {
        String[] params = new String[]{"",""};
        int alen = args.length;
        if (alen > 0 && alen <= 2) {
            if (args[alen-1].equals("-u")) {
                params[alen-1] = System.getProperty("user.name");
            } else if (args[alen-1].equals("-s")) {
                params[alen-1] = System.getProperty("os.version");
            }
            if (alen > 1) {
                if (args[alen-2].equals("-u")) {
                    params[alen-2] = System.getProperty("user.name");
                } else if (args[alen-2].equals("-s")) {
                    params[alen-2] = System.getProperty("os.version");
                }
            }

        }
        sayHello(params);
    }

    public static void sayHello(String[] p) {
        if (p[0] != "" && p[1] != "") {
            System.out.println("Hello, " + p[0] + " of " + p[1] + "!");
        } else if (p[0] != "") {
            System.out.println("Hello, " + p[0] + "!");
        } else if (p[1] != "") {
            System.out.println("Hello, " + p[1] + "!");
        } else {
            System.out.println("Hello!");
        }
    }
}