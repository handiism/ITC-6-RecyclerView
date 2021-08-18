package id.handiism.languages;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    private final ArrayList<Language> languages = new ArrayList<>(Arrays.asList(
            new Language("Python", "Guido van Rossum", R.drawable.ic_logo_python,
                    "Python has become one of the most popular programming languages in " +
                            "the world in recent years. It's used in everything from machine " +
                            "learning to building websites and software testing. It can be used by" +
                            " developers and non-developers alike."),
            new Language("Javascript", "Brendan Eich", R.drawable.ic_logo_javascript,
                    "JavaScript is a scripting or programming language that allows you to" +
                            " implement complex features on web pages — every time a web page does " +
                            "more than just sit there and display static information for you to " +
                            "look at — displaying timely content updates, interactive maps, animated" +
                            " 2D/3D graphics, scrolling video jukeboxes, etc."),
            new Language("Java", "James Gosling", R.drawable.ic_logo_java,
                    "Java is a general-purpose, class-based, object-oriented programming" +
                            " language designed for having lesser implementation dependencies. It" +
                            " is a computing platform for application development. Java is fast," +
                            " secure, and reliable, therefore."),
            new Language("C#", "Microsoft", R.drawable.ic_logo_csharp,
                    "C# is a modern, general-purpose programming language that can be " +
                            "used to perform a wide range of tasks and objectives that span over a" +
                            " variety of professions. C# is primarily used on the Windows .NET " +
                            "framework, although it can be applied to an open source platform. " +
                            "This highly versatile programming language is an object-oriented " +
                            "programming language (OOP)—which isn’t very common—and fairly new " +
                            "to the game, yet already a reliable crowd pleaser."),
            new Language("C", "Dennis Ritchie", R.drawable.ic_logo_c,
                    "C is a programming language that is both versatile and popular," +
                            " allowing it to be used in a vast array of applications and " +
                            "technologies. It can, for example, be used to write the code " +
                            "for operating systems, much more complex programs and everything " +
                            "in between. Its simplicity and flexibility are largely because it " +
                            "can function independently from machines, which has lent itself to " +
                            "becoming one of the foundational programming languages in the industry."),
            new Language("C++", "Bjarne Stroustrup", R.drawable.ic_logo_cpp,
                    "C++ is a powerful general-purpose programming language. It can be " +
                            "used to develop operating systems, browsers, games, and so on. C++" +
                            " supports different ways of programming like procedural, " +
                            "object-oriented, functional, and so on. This makes C++ " +
                            "powerful as well as flexible."),
            new Language("Go", "Rob Pike", R.drawable.ic_logo_go,
                    "Go, or Golang as it is often called, was developed by Google " +
                            "employees—chiefly longtime Unix guru and Google distinguished " +
                            "engineer Rob Pike—but it’s not strictly speaking a “Google project.”" +
                            " Rather, Go is developed as a community-led open source project, " +
                            "spearheaded by leadership that has strong opinions about how Go " +
                            "should be used and the direction the language should take."),
            new Language("R", "Ross Ihaka", R.drawable.ic_logo_r,
                    "R is a programming language and free software environment for " +
                            "statistical computing and graphics supported by the R Core Team" +
                            " and the R Foundation for Statistical Computing. The R language " +
                            "is widely used among statisticians and data miners for developing " +
                            "statistical software and data analysis."),
            new Language("Swift", "Chris Lattner", R.drawable.ic_logo_swift,
                    "Swift is a powerful and intuitive programming language for iOS," +
                            " iPadOS, macOS, tvOS, and watchOS. Writing Swift code is interactive" +
                            " and fun, the syntax is concise yet expressive, and Swift includes " +
                            "modern features developers love. Swift code is safe by design," +
                            " yet also produces software that runs lightning-fast."),
            new Language("PHP", "Rasmus Lerdorf", R.drawable.ic_logo_php,
                    "PHP is a server side scripting language that is embedded in HTML. " +
                            "It is used to manage dynamic content, databases, session tracking," +
                            " even build entire e-commerce sites. It is integrated with a number " +
                            "of popular databases, including MySQL, PostgreSQL, Oracle, Sybase," +
                            " Informix, and Microsoft SQL Server.")
    ));

    // method to share data to other classes
    public ArrayList<Language> getAllData() {
        return languages;
    }
}
