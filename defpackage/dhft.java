package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dhft extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;

    public dhft(int i, String str) {
        super(str);
        this.a = i;
    }

    public dhft(String str, Throwable th) {
        super(str, th);
        this.a = 0;
    }

    public dhft(Throwable th) {
        super(th);
        this.a = 0;
    }
}
