public class CustomerManager {
    private BaseDataBaseManager baseDataBaseManager;

    CustomerManager(BaseDataBaseManager baseDataBaseManager){
        this.baseDataBaseManager=baseDataBaseManager;
    }
    public void getCustomers() {
        baseDataBaseManager.getData();
    }

    public BaseDataBaseManager getBaseDataBaseManager() {
        return baseDataBaseManager;
    }

    public void setBaseDataBaseManager(BaseDataBaseManager baseDataBaseManager) {
        this.baseDataBaseManager = baseDataBaseManager;
    }
}
