package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektw {
    public static final ekty a = a(ekty.d);

    private static ekty a(String[] strArr) {
        ekug ekugVar;
        try {
            ekugVar = ekuh.a;
        } catch (NoClassDefFoundError unused) {
            ekugVar = null;
        }
        if (ekugVar != null) {
            return ekugVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (ekty) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
