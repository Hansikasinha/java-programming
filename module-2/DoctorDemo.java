// Base class
class Doctor {
    void consultationFee() {
        System.out.println("General consultation fee: $50");
    }
}

// Subclass Dentist
class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: $80");
    }
}

// Subclass Cardiologist
class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: $120");
    }
}

// Subclass Surgeon
class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: $200");
    }
}

// Main class
public class DoctorDemo {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.consultationFee();

        Dentist dentist = new Dentist();
        dentist.consultationFee();

        Cardiologist cardio = new Cardiologist();
        cardio.consultationFee();

        Surgeon surgeon = new Surgeon();
        surgeon.consultationFee();
    }
}

