package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abst extends absu {
    private final String a;

    public abst(String str) {
        this.a = str;
    }

    @Override // defpackage.absu
    public final /* bridge */ /* synthetic */ Object a() {
        Method method = ecek.a;
        String str = this.a;
        boolean zBooleanValue = false;
        try {
            Method method2 = ecek.a;
            if (method2 != null) {
                zBooleanValue = ((Boolean) method2.invoke(null, str, false)).booleanValue();
            }
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
