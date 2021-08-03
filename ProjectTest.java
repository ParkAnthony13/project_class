

public class ProjectTest {
    public static void main(String[] args) {
        Project test = new Project();
        Portfolio testList = new Portfolio();

        System.out.println(test.elevatorPitch());

        System.out.println("#####   2   #####");
        Project testOneParam = new Project("One Param Project");
        System.out.println(testOneParam.elevatorPitch());


        System.out.println("#####   3   #####");
        Project testTwoParam = new Project("TWO Param Project","This is a Project with description provided",200.0);
        System.out.println(testTwoParam.elevatorPitch());
        System.out.println("#####   4   #####");

        
        testList.addItem(test);
        testList.addItem(testOneParam);
        testList.addItem(testTwoParam);
        System.out.println(testList);
        System.out.println(testList.returnList());
    }
}