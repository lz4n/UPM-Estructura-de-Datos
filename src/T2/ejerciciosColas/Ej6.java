package T2.ejerciciosColas;

import java.util.ArrayDeque;

public class Ej6 {
    public static void main(String[] args) {
        ArrayDeque<Alumno> cola = new ArrayDeque<>();
        cola.add(new Alumno(7));
        cola.add(new Alumno(5));
        cola.add(new Alumno(9));
        cola.add(new Alumno(2));
        cola.add(new Alumno(3));

        System.out.println(cola);
        System.out.println(filtrarAprobados(cola));
        System.out.println(cola);
    }

    public static Alumno filtrarAprobados(ArrayDeque<Alumno> cola) {
        if (cola.isEmpty()) {
            return new Alumno();
        }

        Alumno maxAlumno = new Alumno(), alumno;
        for (int i = 0, colaSize = cola.size(); i < colaSize; i++) {
            alumno = cola.pop();

            if (alumno.getCalificacion() >= 5) {
                if (maxAlumno.getCalificacion() < alumno.getCalificacion()) {
                    maxAlumno = alumno;
                }

                cola.add(alumno);
            }
        }

        return maxAlumno;
    }

    private static class Alumno {
        float calificacion;

        public Alumno(float calificacion) {
            this.calificacion = calificacion;
        }

        public Alumno() {
            this(-1);
        }

        public float getCalificacion() {
            return calificacion;
        }

        @Override
        public String toString() {
            return "Alumno{" +
                    "calificacion=" + calificacion + "," +
                    "id=" + super.toString() +
                    '}';
        }
    }
}
