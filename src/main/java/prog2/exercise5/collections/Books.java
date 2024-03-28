package prog2.exercise5.collections;
    public enum Books {
        BOOK1("001", "Carrie", "Stephen King",
                272, "Horror", 3.0,
                1974, "Wings", 14.0),
        BOOK2("002", "The Firm",
                "Robin Waterfield / John Grisham", 448, "Thriller",
                4.0, 1991,
                "Addison Wesley Publishing Company", 25.0),
        BOOK3("003", "Slaughterhouse-Five",
                "Kurt Vonnegut Jr.", 275, "Sci-Fi",
                4.0, 1969, "Dial Press", 18.0),
        BOOK4("004", "The Great Gatsby",
                "F. Scott Fitzgerald", 188, "Classic",
                3.0, 1925, "Scribner", 8.0),

        BOOK5("005","American Gods",
                "Neil Gaiman",635,"Fantasy",
                4.0,2001,"Harper Collins",4.0);

        private final String bookName;
        private final String bookAuthor;
        private final int bookPages;
        private final String bookGenre;
        private final double bookRating;
        private final int bookPublishedYear;
        private final String bookPublisher;
        private final double bookPrice;
        private final double bookRent = 5.0;
        private final String bookID;

        Books(String bookID, String bookName, String bookAuthor,
                    int bookPages, String bookGenre, double bookRating,
                    int bookPublishedYear, String bookPublisher, double bookPrice) {
            this.bookID = bookID;
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookPages = bookPages;
            this.bookGenre = bookGenre;
            this.bookRating = bookRating;
            this.bookPublishedYear = bookPublishedYear;
            this.bookPublisher = bookPublisher;
            this.bookPrice = bookPrice;
        }

        public String getBookID() {
            return bookID;
        }

        public String getBookName() {
            return bookName;
        }

        public String getBookAuthor() {
            return bookAuthor;
        }

        public int getBookPages() {
            return bookPages;
        }

        public String getBookGenre() {
            return bookGenre;
        }

        public double getBookRating() {
            return bookRating;
        }
        public int getBookPublishedYear() {
            return bookPublishedYear;
        }

        public String getBookPublisher() {
            return bookPublisher;
        }

        public double getBookPrice() {
            return bookPrice;
        }
    }

