package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dhfu extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;

    public dhfu() {
        super("ImsServiceSessionException: 6");
        this.a = 6;
    }

    public dhfu(int i, String str) {
        super(str);
        this.a = i;
    }

    public dhfu(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    public dhfu(Throwable th) {
        super("ImsServiceSessionException: 0", th);
        this.a = 0;
    }
}
