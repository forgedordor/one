package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kul extends kxj {
    public static void a(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: kuj
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    Activity activity2 = activity;
                    if (activity2.isFinishing()) {
                        return;
                    }
                    Handler handler = kus.g;
                    if (Build.VERSION.SDK_INT >= 28) {
                        activity2.recreate();
                        return;
                    }
                    if ((!kus.a() || kus.f != null) && (kus.e != null || kus.d != null)) {
                        try {
                            Object obj2 = kus.c.get(activity2);
                            if (obj2 != null && (obj = kus.b.get(activity2)) != null) {
                                Application application = activity2.getApplication();
                                kur kurVar = new kur(activity2);
                                application.registerActivityLifecycleCallbacks(kurVar);
                                kus.g.post(new kuo(kurVar, obj2));
                                try {
                                    if (kus.a()) {
                                        kus.f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                                    } else {
                                        activity2.recreate();
                                    }
                                    return;
                                } finally {
                                    kus.g.post(new kup(application, kurVar));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity2.recreate();
                }
            });
        }
    }

    public static boolean b(Activity activity, String str) {
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (Build.VERSION.SDK_INT != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
