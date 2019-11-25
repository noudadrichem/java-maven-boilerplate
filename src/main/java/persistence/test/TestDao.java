package persistence.test;

public interface TestDao {
    public boolean save();
    public Object getById(String feedId);
    public boolean notNull() throws ClassNotFoundException;
    public boolean update(String columnName, String newValue, int blueprintId);
    public boolean delete(String feedId);
}
