public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
    // {Object} -> {int} (Объект не фиксированой длины преобразуется в число определенной длины)
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
    Контракт hashcode() equals()
    1) У двух проверяемых объектов вызываем метод hashcode()
    если хэши разные -> два объекта точно разные.

    2) если  хэши одинаковы -> equals()

    3) equals() -> выдает ответ
     */

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
