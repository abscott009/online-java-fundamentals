package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class HotWheels {

        private String name = "Monster Truck";
        private String catchPhrase = "Go Big Go Hot Wheels";
        private String engine = "V8";

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getCatchPhrase () {
            return catchPhrase;
        }

        public void setCatchPhrase (String catchPhrase){
            this.catchPhrase = catchPhrase;
        }

        public String getEngine () {
            return engine;
        }

        public void setEngine (String engine){
            this.engine = engine;
        }

        public void name () {
            System.out.println(name);
        }

        public void motto () {
            System.out.println(catchPhrase);
        }

        public void engine () {
            System.out.println(engine);
        }

        public void driver(){

        }
    }

