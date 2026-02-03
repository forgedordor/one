package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxv extends BroadcastReceiver {
    public volatile boolean b;
    public volatile boolean c;
    private volatile boolean e;
    private static final ekrg d = ekrg.c("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor");
    public static final drxv a = new drxv();

    private drxv() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ekrg ekrgVar = d;
        ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 123, "UserUnlockMonitor.java")).t("onReceive(): %s", intent);
        if (!this.b && "android.intent.action.USER_UNLOCKED".equals(intent.getAction())) {
            boolean z = false;
            if (drxp.a && Build.VERSION.SDK_INT < 28) {
                try {
                    Class<?> cls = Class.forName("android.os.storage.StorageManager");
                    try {
                        Method method = cls.getMethod("inCryptKeeperBounce", null);
                        if (method == null) {
                            ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", 190, "UserUnlockMonitor.java")).q("Cannot find StorageManager.inCryptKeeperBounce()");
                        } else {
                            try {
                                Object objInvoke = method.invoke(cls, null);
                                boolean z2 = objInvoke != null && ((Boolean) objInvoke).booleanValue();
                                if (z2) {
                                    ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", 198, "UserUnlockMonitor.java")).q("Device in crypt keeper bounce state.");
                                }
                                z = z2;
                            } catch (Exception e) {
                                ((ekrd) ((ekrd) ((ekrd) d.j()).g(e)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 202, "UserUnlockMonitor.java")).q("Failed to invoke StorageManager.inCryptKeeperBounce()");
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                        ((ekrd) ((ekrd) ((ekrd) d.j()).g(e2)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 185, "UserUnlockMonitor.java")).q("Cannot find StorageManager.inCryptKeeperBounce()");
                    }
                } catch (ClassNotFoundException e3) {
                    ((ekrd) ((ekrd) ((ekrd) d.j()).g(e3)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 177, "UserUnlockMonitor.java")).q("Cannot find android.os.storage.StorageManager");
                }
            }
            this.b = !z;
            if (this.b) {
                drvp.d(drxw.a);
            } else {
                ((ekrd) ((ekrd) d.h()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 135, "UserUnlockMonitor.java")).q("Received ACTION_USER_UNLOCKED under crypt keeper bounce state.");
            }
        }
    }
}
