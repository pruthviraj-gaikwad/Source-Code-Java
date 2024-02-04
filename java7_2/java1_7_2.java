class SY2022bit024 {
    public static void main(String[] args) {
        String[] enrollnumber = { "2022bit024", "2023bcs023", "2029bit023", "2000bch399", "2024bme501" };
        SY2022bit024 b = new SY2022bit024();
        int count = b.getValidRegistrationsCount(enrollnumber);
        System.out.println(count);
    }

    public int getValidRegistrationsCount(String[] registrations) {
        boolean isSatisfy = false;
        int count = 0;
        if (registrations == null) {
            return -1;
        }
        for (int i = 0; i < registrations.length; i++) {
            isSatisfy = true;
            if (registrations[i].length() != 10) {
                continue;
            } 
            else {
                for (int j = 0; j < registrations[i].length()-2; j++) {
                    if (j < 4 || (j > 6 && j < registrations[i].length())) {
                        char charAtInd = registrations[i].charAt(j);
                        if (Character.isDigit(charAtInd) == true) {
                            isSatisfy = true;
                        } else if (Character.isDigit(charAtInd) == false) {
                            isSatisfy = false;
                        }
                    } else {
                        int YYY = Integer.parseInt(registrations[i].substring(0, 4));
                        if (YYY < 2000 || YYY > 2024) {
                            isSatisfy = false;
                            break;
                        }
                    }
                    if (j >= 4 && j <= 6) {
                        String DDD = registrations[i].substring(4, 7);
                        if (DDD.equals("bit") == true || DDD.equals("bcs") == true
                                || DDD.equals("bme") == true || DDD.equals("bch") == true) {
                            isSatisfy = true;
                        } else {
                            isSatisfy = false;
                            break;
                        }
                    }
                    if(j>=7){
                        Character a = registrations[i].charAt(7);
                        int p = a.getNumericValue(a);
                        if(p>=0 && p<2)
                        {
                            System.out.println(i + " is regular student");
                            isSatisfy =true;
                            break;
                        }
                        else {
                            System.out.println(i +" is not student");
                            continue;
                        }
                    }
                if (isSatisfy == true) {
                    count++;
                }}
            }
        }
        return count;
}
}
