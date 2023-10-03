package ca.sfu.cmpt213;

/**
 * Shows example of Feature Envy
 */
public class FeatureEnvy {
    public static class Phone {
        private final String unformattedNumber;
        private final String areaCode;
        private final String prefNumber;
        private final String postNumber;

        public Phone(String unformattedNumber) {
            this.unformattedNumber = unformattedNumber;
            areaCode = unformattedNumber.substring(0,3);
            prefNumber = unformattedNumber.substring(3,6);
            postNumber = unformattedNumber.substring(6,10);
        }
       public String getAreaCode() {
           return areaCode;
       }
       public String getPrefix() {
           return prefNumber;
       }
       public String getPostfix() {
           return postNumber;
       }

       //refactored
       public String getFormatted(){
            return "(" +
                   this.areaCode + ") " +
                   this.prefNumber + "-" +
                   this.postNumber;
       }

    }

    public static class Customer {
        private Phone mobilePhone;

        public Customer(String phone){
            mobilePhone = new Phone(phone);
        }

        public String getMobilePhoneNumber() {
        //    return "(" +
        //            mobilePhone.getAreaCode() + ") " +
        //            mobilePhone.getPrefix() + "-" +
        //            mobilePhone.getPostfix();
            return mobilePhone.getFormatted();
        }



    }


    public static void main(String[] args){
        Customer bob = new Customer("7785551234");
        System.out.println(bob.getMobilePhoneNumber());
    }

}
