package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fcmq {
    public static final fcmq a;

    static {
        fcmq fcbbVar;
        try {
            Class.forName("java.time.Instant");
            fcbbVar = new fceh();
        } catch (ClassNotFoundException unused) {
            fcbbVar = new fcbb();
        }
        a = fcbbVar;
    }

    long a();
}
