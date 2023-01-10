public class App {
    public static void main(String[] args) {
        User user = new User();

        user.setName("Luna");
        user.setEmail("luna@email.com");
        user.course = "Ciencia da computacao";
        user.yearOfEntry = 2018;
        user.admissionPeriod = 1;

        Discipline discipline = new Discipline();
        discipline.discipline = "cálculo";
        discipline.subjectMatter = "derivadas";

        System.out.println("Nome:" + user.getName());
        System.out.println("Email:"+user.getEmail());
        System.out.println("Curso:"+user.course);
        System.out.println("Ano de entrada:"+user.yearOfEntry);
        System.out.println("Período de admissão:"+user.admissionPeriod);
        System.out.println("Disciplina selecionada:"+discipline.discipline);
        System.out.println("Assunto selecionado:"+discipline.subjectMatter);
    }
}
