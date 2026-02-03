package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qas {
    public static final Object b = new Object();
    public static volatile qas c;

    public static qas c() {
        qas qasVar;
        synchronized (b) {
            if (c == null) {
                c = new qar(3);
            }
            qasVar = c;
        }
        return qasVar;
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);
}
