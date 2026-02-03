package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cpza extends RuntimeException {
    public final cpyz b;
    public final int c;

    protected cpza(int i, cpyz cpyzVar) {
        this.c = i;
        this.b = cpyzVar;
    }

    public int a() {
        return 1;
    }

    protected cpza(int i, cpyz cpyzVar, String str) {
        super(str);
        this.c = i;
        this.b = cpyzVar;
    }

    protected cpza(int i, cpyz cpyzVar, String str, Throwable th) {
        super(str, th);
        this.c = i;
        this.b = cpyzVar;
    }

    protected cpza(int i, cpyz cpyzVar, Throwable th) {
        super(th);
        this.c = i;
        this.b = cpyzVar;
    }
}
