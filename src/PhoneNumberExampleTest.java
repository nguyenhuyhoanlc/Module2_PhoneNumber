
class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhonenumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhonenumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phone: validPhonenumber) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid " + isvalid);
        }  for (String phone: invalidPhonenumber) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid " + isvalid);
        }
    }
}