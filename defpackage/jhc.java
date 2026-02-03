package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhc {
    public static final boolean a() {
        try {
            if (AndroidComposeView.a == null) {
                AndroidComposeView.a = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.b == null) {
                Class cls = AndroidComposeView.a;
                AndroidComposeView.b = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.b;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", false) : null;
            return fdbq.f(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, true);
        } catch (Exception unused) {
            return false;
        }
    }
}
