import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlFileWriter {

    private String link;
    private String imageUrl;
    private String imageUrl2;
    private String title;
    private String text;
    private String author;
    private String postDate;
    private String readTime;

    // Constructor to initialize variables
    public HtmlFileWriter(String link, String imageUrl, String imageUrl2, String title, String text, String author, String postDate, String readTime) {
        this.link = link;
        this.imageUrl = imageUrl;
        this.imageUrl2 = imageUrl2;
        this.title = title;
        this.text = text;
        this.author = author;
        this.postDate = postDate;
        this.readTime = readTime;
    }

    // Method to create HTML file
    public void createHtmlFile(String fileName) {
        StringBuilder htmlContent = new StringBuilder();

        // HTML structure with placeholders replaced by variables
        htmlContent.append("<!-- Home Featured -->\n")
                .append("<!-- begin post -->\n")
                .append("\t<div class=\"card\">\n")
                .append("\t\t<div class=\"row\">\n")
                .append("\t\t\t<div class=\"col-md-5 wrapthumbnail\">\n")
                .append("\t\t\t\t<a href=\"").append(link).append("\"> \n")
                .append("\t\t\t\t\t<div class=\"thumbnail\" style=\"background-image:url(assets/img/").append(imageUrl2).append(");\">\n")
                .append("\t\t\t\t\t</div>\n")
                .append("\t\t\t\t</a>\n")
                .append("\t\t\t</div>\n")
                .append("\t\t\t<div class=\"col-md-7\">\n")
                .append("\t\t\t\t<div class=\"card-block\">\n")
                .append("\t\t\t\t\t<h2 class=\"card-title\"><a href=\"").append(link).append("\">").append(title).append("</a></h2> \n")
                .append("\t\t\t\t\t<h4 class=\"card-text\">").append(text).append("</h4> \n")
                .append("\t\t\t\t\t<div class=\"metafooter\">\n")
                .append("\t\t\t\t\t\t<div class=\"wrapfooter\">\n")
                .append("\t\t\t\t\t\t\t<span class=\"meta-footer-thumb\">\n")
                .append("\t\t\t\t\t\t\t\t<a href=\"author.html\"><img class=\"author-thumb\" src=\"assets/img/profile-picture.png\" alt=\"\"></a>\n")
                .append("\t\t\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t\t\t<span class=\"author-meta\">\n")
                .append("\t\t\t\t\t\t\t\t<span class=\"post-name\"><a href=\"author.html\">").append(author).append("</a></span><br/>\n")
                .append("\t\t\t\t\t\t\t\t<span class=\"post-date\">").append(postDate).append("</span><span class=\"dot\"></span><span class=\"post-read\">").append(readTime).append(" min read</span> \n")
                .append("\t\t\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t\t</div>\n")
                .append("\t\t\t\t\t</div>\n")
                .append("\t\t\t\t</div>\n")
                .append("\t\t\t</div>\n")
                .append("\t\t</div>\n")
                .append("\t</div>\n")
                .append("\t<!-- end post -->\n\n");

        // Appending additional sections in a similar manner
        htmlContent.append("<!-- Home All -->\n")
                .append("<!-- begin post -->\n")
                .append("\t<div class=\"card\">\n")
                .append("\t\t<a href=\"").append(link).append("\"> \n")
                .append("\t\t\t<img class=\"img-fluid\" src=\"assets/img/").append(imageUrl).append("\" alt=\"\"> \n")
                .append("\t\t</a>\n")
                .append("\t\t<div class=\"card-block\">\n")
                .append("\t\t\t<h2 class=\"card-title\"><a href=\"").append(link).append("\">").append(title).append("</a></h2> \n")
                .append("\t\t\t<h4 class=\"card-text\">").append(text).append("</h4> \n")
                .append("\t\t\t<div class=\"metafooter\">\n")
                .append("\t\t\t\t<div class=\"wrapfooter\">\n")
                .append("\t\t\t\t\t<span class=\"meta-footer-thumb\">\n")
                .append("\t\t\t\t\t\t<a href=\"author.html\"><img class=\"author-thumb\" src=\"assets/img/profile-picture.png\" alt=\"\"></a>\n")
                .append("\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t<span class=\"author-meta\">\n")
                .append("\t\t\t\t\t\t<span class=\"post-name\"><a href=\"author.html\">").append(author).append("</a></span><br/>\n")
                .append("\t\t\t\t\t\t<span class=\"post-date\">").append(postDate).append("</span><span class=\"dot\"></span><span class=\"post-read\">").append(readTime).append(" min read</span> \n")
                .append("\t\t\t\t\t</span>\n")
                .append("\t\t\t\t</div>\n")
                .append("\t\t\t</div>\n")
                .append("\t\t</div>\n")
                .append("\t</div>\n")
                .append("<!-- end post -->\n\n");

        // Adding "Post Featured" section
        htmlContent.append("<!-- Post Featured -->\n")
                .append("<!-- begin post -->\n")
                .append("\t<div class=\"col-md-4\">\n")
                .append("\t\t<div class=\"card\">\n")
                .append("\t\t\t<a href=\"").append(link).append("\"> \n")
                .append("\t\t\t\t<img class=\"img-fluid img-thumb\" src=\"assets/img/").append(imageUrl).append("\" alt=\"\"> \n")
                .append("\t\t\t</a>\n")
                .append("\t\t\t<div class=\"card-block\">\n")
                .append("\t\t\t\t<h2 class=\"card-title\"><a href=\"").append(link).append("\">").append(title).append("</a></h2> \n")
                .append("\t\t\t\t<div class=\"metafooter\">\n")
                .append("\t\t\t\t\t<div class=\"wrapfooter\">\n")
                .append("\t\t\t\t\t\t<span class=\"meta-footer-thumb\">\n")
                .append("\t\t\t\t\t\t\t<a href=\"author.html\"><img class=\"author-thumb\" src=\"assets/img/profile-picture.png\" alt=\"\"></a>\n")
                .append("\t\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t\t<span class=\"author-meta\">\n")
                .append("\t\t\t\t\t\t\t<span class=\"post-name\"><a href=\"author.html\">").append(author).append("</a></span><br/>\n")
                .append("\t\t\t\t\t\t\t<span class=\"post-date\">").append(postDate).append("</span><span class=\"dot\"></span><span class=\"post-read\">").append(readTime).append(" min read</span> \n")
                .append("\t\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t</div>\n")
                .append("\t\t\t\t</div>\n")
                .append("\t\t\t</div>\n")
                .append("\t\t</div>\n")
                .append("\t</div>\n")
                .append("<!-- end post -->\n\n");

        // Adding "Author Post" section
        htmlContent.append("<!-- Author Post -->\n")
                .append("<!-- begin post -->\n")
                .append("\t<div class=\"\">\n")
                .append("\t\t<div class=\"card\">\n")
                .append("\t\t\t<a href=\"").append(link).append("\"> \n")
                .append("\t\t\t\t<img class=\"img-fluid img-thumb\" src=\"assets/img/").append(imageUrl).append("\" alt=\"\"> \n")
                .append("\t\t\t</a>\n")
                .append("\t\t\t<div class=\"card-block\">\n")
                .append("\t\t\t\t<h2 class=\"card-title\"><a href=\"").append(link).append("\">").append(title).append("</a></h2> \n")
                .append("\t\t\t\t<h4 class=\"card-text\">").append(text).append("</h4> \n")
                .append("\t\t\t\t<div class=\"metafooter\">\n")
                .append("\t\t\t\t\t<div class=\"wrapfooter\">\n")
                .append("\t\t\t\t\t\t<span class=\"meta-footer-thumb\">\n")
                .append("\t\t\t\t\t\t\t<a href=\"author.html\"><img class=\"author-thumb\" src=\"assets/img/profile-picture.png\" alt=\"\"></a>\n")
                .append("\t\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t\t<span class=\"author-meta\">\n")
                .append("\t\t\t\t\t\t\t<span class=\"post-name\"><a href=\"author.html\">").append(author).append("</a></span><br/>\n")
                .append("\t\t\t\t\t\t\t<span class=\"post-date\">").append(postDate).append("</span><span class=\"dot\"></span><span class=\"post-read\">").append(readTime).append(" min read</span> \n")
                .append("\t\t\t\t\t\t</span>\n")
                .append("\t\t\t\t\t</div>\n")
                .append("\t\t\t\t</div>\n")
                .append("\t\t\t</div>\n")
                .append("\t\t</div>\n")
                .append("\t</div>\n")
                .append("<!-- end post -->\n");

        // Writing content to the HTML file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(htmlContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO - add tags + keywords + readtime
    // TODO - change code across website to use new thing (SEO and search bar)
    // TODO - add new libraries to this structure

    public static void main(String[] args) {
        String fileName = "post8.html";
        String pageTitle = "What Comes Next";
        String authorName = "Alessio";
        String authorDescription = "Just a developer who loves to create unique things!";

        String postDate = "June 5 2025";
        String readTime = "6";
        String postTitle = "One Year Later";
        String featuredImage = "oneYearLater1.png";
        String featuredImage2 = "oneYearLater2.png";
        String postContent = "Looking back on my first year post-graduation.";
        String[] tags = {"Personal", "Coding", "Game Development", "Devlog", "Projects"};
        String keywords = "blog, computer, science, computer science, code, coding, programming, programmer, developer, developing, devlog, tutorial, help, devlog, graduate, graduation, " +
                            "what, comes, come, next, what comes next, what come next, " +
                            "hackathon, first, concordia, university, concordia university, conuhacks, game, development, game development, game dev, " + 
                            "unity, wild, west, wild west, horse, cowboy, 2d, platformer, puzzle, top down, shooter, roguelike, beenox, " + 
                            "discord, bot, discord bot, js, node js, node, node.js, host, hosting, free, free hosting, free host, create discord bot, create bot, " +
                            "api, command, vscode, cloudfare, google, search, console, google search console, bootstrap, html, js, css";

        // Create the HTML content
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<!DOCTYPE html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("    <meta charset=\"utf-8\">\n")
                .append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n")
                .append("    <meta name=\"description\" content=\"A blog about what comes next for a Computer Science graduate\">\n")
                .append("    <meta name=\"keywords\" content=\"").append(keywords).append("\">\n") // Using keywords variable
                .append("    <meta name=\"author\" content=\"").append(authorName).append("\">\n")
                .append("    <link rel=\"icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\n")
                .append("    <title>").append(pageTitle).append("</title>\n")
                .append("    <!-- Bootstrap core CSS -->\n")
                .append("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n")
                .append("    <!-- Fonts -->\n")
                .append("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n")
                .append("    <link href=\"https://fonts.googleapis.com/css?family=Righteous%7CMerriweather:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n")
                .append("    <!-- Custom styles for this template -->\n")
                .append("    <link href=\"assets/css/mediumish.css\" rel=\"stylesheet\">\n")
                .append("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/prism/1.25.0/themes/prism.css\" rel=\"stylesheet\">\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("\n")
                .append("<!-- Begin Nav\n")
                .append("================================================== -->\n")
                .append("<nav class=\"navbar navbar-toggleable-md navbar-light bg-white fixed-top mediumnavigation\">\n")
                .append("    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n")
                .append("        <span class=\"navbar-toggler-icon\"></span>\n")
                .append("    </button>\n")
                .append("    <div class=\"container\">\n")
                .append("        <!-- Begin Logo -->\n")
                .append("        <a class=\"navbar-brand\" href=\"index.html\">\n")
                .append("            <img src=\"assets/img/logo.png\" alt=\"logo\">\n")
                .append("        </a>\n")
                .append("        <!-- End Logo -->\n")
                .append("        <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n")
                .append("            <!-- Begin Menu -->\n")
                .append("            <ul class=\"navbar-nav ml-auto\">\n")
                .append("                <li class=\"nav-item\">\n")
                .append("                    <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\n")
                .append("                </li>\n")
                .append("                <li class=\"nav-item\">\n")
                .append("                    <a class=\"nav-link\" href=\"author.html\">Author</a>\n")
                .append("                </li>\n")
                .append("            </ul>\n")
                .append("            <!-- End Menu -->\n")
                .append("            <!-- Begin Search -->\n")
                .append("            <form class=\"form-inline my-2 my-lg-0\">\n")
                .append("                <input id=\"searchInput\" class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n")
                .append("                <span class=\"search-icon\" onclick=\"search()\"><svg class=\"svgIcon-use\" width=\"25\" height=\"25\" viewbox=\"0 0 25 25\"><path d=\"M20.067 18.933l-4.157-4.157a6 6 0 1 0-.884.884l4.157 4.157a.624.624 0 1 0 .884-.884zM6.5 11c0-2.62 2.13-4.75 4.75-4.75S16 8.38 16 11s-2.13 4.75-4.75 4.75S6.5 13.62 6.5 11z\"></path></svg></span>\n")
                .append("            </form>\n")
                .append("            <!-- End Search -->\n")
                .append("        </div>\n")
                .append("    </div>\n")
                .append("</nav>\n")
                .append("<!-- End Nav\n")
                .append("================================================== -->\n")
                .append("\n")
                .append("<!-- Begin Article\n")
                .append("================================================== -->\n")
                .append("<div class=\"container\">\n")
                .append("    <div class=\"row\">\n")
                .append("\n")
                .append("        <!-- Begin Fixed Left Share -->\n")
                .append("        <div class=\"col-md-1 col-xs-12\">\n")
                .append("            <div class=\"share\">\n")
                .append("                <p>\n")
                .append("                    Talk\n")
                .append("                </p>\n")
                .append("                <ul>\n")
                .append("                    <li>\n")
                .append("                        <a href=\"#comments\">\n")
                .append("                            <svg class=\"svgIcon-use\" width=\"29\" height=\"29\" viewbox=\"0 0 29 29\"><path d=\"M21.27 20.058c1.89-1.826 2.754-4.17 2.754-6.674C24.024 8.21 19.67 4 14.1 4 8.53 4 4 8.21 4 13.384c0 5.175 4.53 9.385 10.1 9.385 1.007 0 2-.14 2.95-.41.285.25.592.49.918.7 1.306.87 2.716 1.31 4.19 1.31.276-.01.494-.14.6-.36a.625.625 0 0 0-.052-.65c-.61-.84-1.042-1.71-1.282-2.58a5.417 5.417 0 0 1-.154-.75zm-3.85 1.324l-.083-.28-.388.12a9.72 9.72 0 0 1-2.85.424c-4.96 0-8.99-3.706-8.99-8.262 0-4.556 4.03-8.263 8.99-8.263 4.95 0 8.77 3.71 8.77 8.27 0 2.25-.75 4.35-2.5 5.92l-.24.21v.32c0 .07 0 .19.02.37.03.29.1.6.19.92.19.7.49 1.4.89 2.08-.93-.14-1.83-.49-2.67-1.06-.34-.22-.88-.48-1.16-.74z\"></path></svg>\n")
                .append("                        </a>\n")
                .append("                    </li>\n")
                .append("                </ul>\n")
                .append("            </div>\n")
                .append("        </div>\n")
                .append("        <!-- End Fixed Left Share -->\n")
                .append("\n")
                .append("        <!-- Begin Post -->\n")
                .append("        <div class=\"col-md-10 col-md-offset-2 col-xs-12\">\n")
                .append("            <div class=\"mainheading\">\n")
                .append("\n")
                .append("                <!-- Begin Top Meta -->\n")
                .append("                <div class=\"row post-top-meta\">\n")
                .append("                    <div class=\"col-md-2\">\n")
                .append("                        <a href=\"author.html\"><img class=\"author-thumb\" src=\"assets/img/profile-picture.png\" alt=\"\"></a>\n")
                .append("                    </div>\n")
                .append("                    <div class=\"col-md-10\">\n")
                .append("                        <a class=\"link-dark\" href=\"author.html\">").append(authorName).append("</a><br>\n")
                .append("                        <span class=\"author-description\">").append(authorDescription).append("</span><br>\n")
                .append("                        <span class=\"post-date\">").append(postDate).append("</span><span class=\"dot\"></span><span class=\"post-read\">").append(readTime).append(" min read</span>\n")
                .append("                    </div>\n")
                .append("                </div>\n")
                .append("                <!-- End Top Meta -->\n")
                .append("\n")
                .append("                <h1 class=\"posttitle\">").append(postTitle).append("</h1>\n")
                .append("\n")
                .append("            </div>\n")
                .append("\n")
                .append("            <!-- Begin Featured Image -->\n")
                .append("            <img class=\"featured-image img-fluid\" src=\"assets/img/").append(featuredImage).append("\" alt=\"\">\n")
                .append("            <!-- End Featured Image -->\n")
                .append("\n")
                .append("            <!-- Begin Post Content -->\n")
                .append("            <div class=\"article-post\">\n")
                .append("                <p>\n")
                .append("                    ").append(postContent).append("\n")
                .append("                </p>\n")
                .append("            </div>\n")
                .append("            <!-- End Post Content -->\n")
                .append("\n")
                .append("            <!-- Begin Tags -->\n")
                .append("            <div class=\"after-post-tags\">\n")
                .append("                <ul class=\"tags\">\n");
        for (String tag : tags) {
            htmlContent.append("                    <li><a>").append(tag).append("</a></li>\n");
        }
        htmlContent.append("                </ul>\n")
                .append("            </div>\n")
                .append("            <!-- End Tags -->\n")
                .append("\n")
                .append("        </div>\n")
                .append("        <!-- End Post -->\n")
                .append("\n")
                .append("    </div>\n")
                .append("</div>\n")
                .append("<!-- End Article\n")
                .append("================================================== -->\n")
                .append("\n")
                .append("<!-- Start Comments\n")
                .append("================================================== -->\n")
                .append("<div id=\"comments\" class=\"container col-md-6 col-xs-12\">\n")
                .append("    <div class=\"\">\n")
                .append("        <script src=\"https://giscus.app/client.js\"\n")
                .append("            data-repo=\"alessioamo/What-Comes-Next\"\n")
                .append("            data-repo-id=\"R_kgDOL1hzEQ\"\n")
                .append("            data-category=\"General\"\n")
                .append("            data-category-id=\"DIC_kwDOL1hzEc4CfEHA\"\n")
                .append("            data-mapping=\"pathname\"\n")
                .append("            data-strict=\"0\"\n")
                .append("            data-reactions-enabled=\"1\"\n")
                .append("            data-emit-metadata=\"0\"\n")
                .append("            data-input-position=\"top\"\n")
                .append("            data-theme=\"preferred_color_scheme\"\n")
                .append("            data-lang=\"en\"\n")
                .append("            crossorigin=\"anonymous\"\n")
                .append("            async>\n")
                .append("        </script>\n")
                .append("    </div>\n")
                .append("</div>\n")
                .append("<!-- End Comments\n")
                .append("================================================== -->\n")
                .append("\n")
                .append("<div class=\"hideshare\"></div>\n")
                .append("\n")
                .append("<!-- Begin Related\n")
                .append("================================================== -->\n")
                .append("<div class=\"graybg\">\n")
                .append("    <div class=\"container\">\n")
                .append("        <div class=\"row listrecent listrelated\">\n")
                .append("            <!-- begin post -->\n")
                .append("            <!-- end post -->\n")
                .append("        </div>\n")
                .append("    </div>\n")
                .append("</div>\n")
                .append("<!-- End Related Posts\n")
                .append("================================================== -->\n")
                .append("\n")
                .append("<!-- Begin Twitter Timeline\n")
                .append("================================================== -->\n")
                .append("<div class=\"container margtop3rem\">\n")
                .append("<!-- <a class=\"twitter-grid\" href=\"\"></a> <script async src=\"\" charset=\"utf-8\"></script> -->\n")
                .append("</div>\n")
                .append("<!-- End Twitter Timeline\n")
                .append("================================================== -->\n")
                .append("\n")
                .append("<!-- Begin Footer\n")
                .append("================================================== -->\n")
                .append("<div class=\"container\">\n")
                .append("    <div class=\"footer\">\n")
                .append("        <p class=\"pull-left\">\n")
                .append("        </p>\n")
                .append("        <p class=\"pull-right\">\n")
                .append("        </p>\n")
                .append("        <div class=\"clearfix\">\n")
                .append("        </div>\n")
                .append("    </div>\n")
                .append("</div>\n")
                .append("<!-- End Footer\n")
                .append("================================================== -->\n")
                .append("\n")
                .append("<!-- Bootstrap core JavaScript\n")
                .append("================================================== -->\n")
                .append("<!-- Placed at the end of the document so the pages load faster -->\n")
                .append("<script src=\"assets/js/jquery.min.js\"></script>\n")
                .append("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\" crossorigin=\"anonymous\"></script>\n")
                .append("<script src=\"assets/js/bootstrap.min.js\"></script>\n")
                .append("<script src=\"assets/js/ie10-viewport-bug-workaround.js\"></script>\n")
                .append("<script src=\"assets/js/mediumish.js\"></script>\n")
                .append("<script src=\"assets/js/search.js\"></script>\n")
                .append("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/prism/1.25.0/prism.min.js\"></script>\n")
                .append("</body>\n")
                .append("</html>");

        // Write the HTML content to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(htmlContent.toString());
            System.out.println("HTML file created: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HtmlFileWriter writer = new HtmlFileWriter(
            fileName, // Link
            featuredImage, // Image URL
            featuredImage2, // Image 2 URL
            postTitle, // Title
            postContent, // Text
            authorName, // Author
            postDate, // Post Date
            readTime // Read Time
        );

        writer.createHtmlFile("htmlOutput.html");
        System.out.println("HTML file created successfully!");
    }
}
