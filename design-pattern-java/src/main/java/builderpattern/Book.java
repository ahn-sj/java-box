package builderpattern;

public class Book {
    // 필수 매개변수
    private String ISBN;
    private int page;
    private String name;

    // 선택 매개변수
    private int width;
    private int height;

    public static class Builder {
        private String ISBN; // 필수
        private int page;    // 필수
        private String name; // 필수

        private int width;   // 선택
        private int height;  // 선택

        public Builder(String ISBN, int page, String name) {
            this.ISBN = ISBN;
            this.page = page;
            this.name = name;
        }

        public Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
    private Book(Builder builder) {
        this.ISBN = builder.ISBN;
        this.page = builder.page;
        this.name = builder.name;
        this.width = builder.width;
        this.height = builder.height;
    }

    @Override
    public String toString() {
        return "Book {" +
                "ISBN='" + ISBN + '\'' +
                ", page=" + page +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
