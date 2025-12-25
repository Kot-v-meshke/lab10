public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setName("Санкт-Петербургский Политехнический Университет Петра Великого");
        university.setNumderOfEmployees(720);

        Faculty faculty = new Faculty();
        faculty.setName("Факультет Вычислительной Техники и Информатики");

        Dean dean = new Dean();
        dean.setName("Сергей Владимирович Морозов");
        dean.setEmail("s.morozov@spbu.ptu.ru");
        dean.setSocialSecurityNumber("567-89-0123");

        Institute institute = new Institute();
        institute.setName("Кафедра Прикладной Кибернетики");
        institute.setAddress("г. Санкт-Петербург, ул. Политехническая, д. 29");

        ResearchStaff researchStaff = new ResearchStaff();
        researchStaff.setName("Елена Сергеевна Ковалёва");
        researchStaff.setEmail("e.kovalyova@spbu.ptu.ru");
        researchStaff.setSocialSecurityNumber("345-67-8901");
        researchStaff.setResearchArea("Машинное обучение и анализ данных");

        Course course = new Course();
        course.setId("INF205");
        course.setName("Основы алгоритмов и структур данных");
        course.setWeeklyDuration(3);

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Елена Сергеевна Ковалёва");
        lecturer.setEmail("e.kovalyova@spbu.ptu.ru");
        lecturer.setSocialSecurityNumber("345-67-8901");
        lecturer.setResearchArea("Машинное обучение и анализ данных");

        Project project = new Project();
        project.setName("Интеллектуальная система мониторинга успеваемости студентов");
        project.setStartDate(java.time.LocalDate.of(2025, 3, 1));
        project.setEndDate(java.time.LocalDate.of(2025, 11, 30));

        Participation participation = new Participation();
        participation.setHours(35);

        System.out.println("Университет: " + university.getName());
        System.out.println("Число сотрудников: " + university.getNumderOfEmployees());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Декан: " + dean.getName());
        System.out.println("Кафедра: " + institute.getName());
        System.out.println("Научный сотрудник: " + researchStaff.getName());
        System.out.println("Курс: " + course.getName());
        System.out.println("Преподаватель: " + lecturer.getName());
        System.out.println("Проект: " + project.getName());
        System.out.println("Участие: " + participation.getHours() + " часов.");
    }
}