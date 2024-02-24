class student {
    public boolean validRegistrationOfStudent(String registrations) {
        boolean isSatisfy = false;
        for (int i = 0; i < registrations.length(); i++) {
            isSatisfy = true;
            if (registrations.length() != 10) {
                continue;
            } else {
                    if (i < 4 || (i > 6 && i < registrations.length())) {
                        char charAtInd = registrations.charAt(i);
                        if (Character.isDigit(charAtInd) == true) {
                            isSatisfy = true;
                        } else if (Character.isDigit(charAtInd) == false) {
                            isSatisfy = false;
                        }
                    } else {
                        int YYY = Integer.parseInt(registrations.substring(0, 4));
                        if (YYY < 2000 || YYY > 2024) {
                            isSatisfy = false;
                            break;
                        }
                    }
                    if (i >= 4 && i <= 6) {
                        String DDD = registrations.substring(4, 7);
                        if (DDD.equals("bit") == true || DDD.equals("bcs") == true
                                || DDD.equals("bme") == true || DDD.equals("bch") == true) {
                            isSatisfy = true;
                        } else {
                            isSatisfy = false;
                            break;
                        }
                    }
                    if (i > 7 && i < 10) {
                        int sss = Integer.parseInt(registrations.substring(7, 10));
                        if (sss >= 001) {
                            isSatisfy = true;
                        }
                    }
            }
        }
        if (isSatisfy == true)
            return true;
        else
            return false;
    }
}

class faculty{
    public boolean ristrationOfFaculty(String registrations) {
        boolean isSatisfy = false;
        for (int i = 0; i < registrations.length(); i++) {
            isSatisfy = true;
            if (registrations.length() != 10) {
                continue;
            } else {
                    if (i < 4 || (i > 6 && i < registrations.length())) {
                        char charAtInd = registrations.charAt(i);
                        if (Character.isDigit(charAtInd) == true) {
                            isSatisfy = true;
                        } else if (Character.isDigit(charAtInd) == false) {
                            isSatisfy = false;
                        }
                    } else {
                        int YYY = Integer.parseInt(registrations.substring(0, 4));
                        if (YYY < 2000 || YYY > 2024) {
                            isSatisfy = false;
                            break;
                        }
                    }
                    if (i >= 4 && i <= 6) {
                        String DDD = registrations.substring(4, 7);
                        if (DDD.equals("bit") == true || DDD.equals("bcs") == true
                                || DDD.equals("bme") == true || DDD.equals("bch") == true) {
                            isSatisfy = true;
                        } else {
                            isSatisfy = false;
                            break;
                        }
                    }
                    if (i > 7 && i < 10) {
                        int sss = Integer.parseInt(registrations.substring(7, 10));
                        if (sss >= 001) {
                            isSatisfy = true;
                        }
                    }
            }
        }
        if (isSatisfy == true)
            return true;
        else
            return false;
    }
}
class library {
    public static void main(String args[]) {
        String a = "2022bit024";
        student c = new student();
        boolean b = c.validRegistrationOfStudent(a);
        System.out.println(b);
    }
}