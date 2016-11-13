package jp.techacademy.takuya.okitsu.taskapplication;

/**
 * Created by takuy on 2016/11/13.
 */
import android.app.Application;
import io.realm.Realm;

public class TaskApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
