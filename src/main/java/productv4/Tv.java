package productv4;

    public class Tv extends Product {

        private String manufacturer;
        private String screenSize;


        public Tv() {
            super();
            manufacturer = "";
            screenSize = "";
            count++;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setScreenSize(String screenSize) {
            this.screenSize = screenSize;
        }

        public String getScreenSize() {
            return screenSize;
        }

        @Override
        public String toString() {
            return super.toString() + " by " + ". The screen size is " + manufacturer + screenSize;

        }

    }


