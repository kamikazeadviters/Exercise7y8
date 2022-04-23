package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "postulante", schema = "gym")
public class PostulantDB {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String surname;
        private LocalDate birth;
        private int identification;
        private double height;
        private int weight;
        private int idPaymentPlan;
        private int idPaymentMethod;
        private int idAddress;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setBirth(LocalDate birth) {
            this.birth = birth;
        }

        public LocalDate getBirth() {
            return birth;
        }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public int getIdentification() {
        return identification;
    }

    public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setIdPaymentPlan(int idPaymentPlan) {
            this.idPaymentPlan = idPaymentPlan;
        }

        public int getIdPaymentPlan() {
            return idPaymentPlan;
        }

        public void setIdPaymentMethod(int idPaymentMethod) {
            this.idPaymentMethod = idPaymentMethod;
        }

        public int getIdPaymentMethod() {
            return idPaymentMethod;
        }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public PostulantDB(int id, String name,
                       String surname,
                       LocalDate birth,
                       int identification,
                       double height,
                       int weight,
                       int idPaymentPlan,
                       int idPaymentMethod,
                       int idAddress)
        {
            setId(id);
            setName(name);
            setSurname(surname);
            setBirth(birth);
            setIdentification(identification);
            setHeight(height);
            setWeight(weight);
            setIdPaymentPlan(idPaymentPlan);
            setIdPaymentMethod(idPaymentMethod);
            setIdAddress(idAddress);
        }
        public void showPostulantInfo(){
            System.out.printf("Nombre: %s%n", this.getName());
            System.out.printf("Apellido: %s%n", this.getSurname());
            System.out.printf("Fecha de nacimiento: %s%n", this.getBirth());
            System.out.printf("DNI: %s%n", this.getIdentification());
            System.out.printf("Altura: %s%n", this.getHeight());
            System.out.printf("Peso: %s%n", this.getWeight());
        }

}

