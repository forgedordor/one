package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzoy {
    public static volatile long a;
    private static volatile float b;

    private dzoy() {
    }

    public static ejwi a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ejud.a;
        }
        float f = b;
        if (f == 0.0f) {
            synchronized (dzoy.class) {
                f = b;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return ejwi.j(Float.valueOf(f));
    }
}
