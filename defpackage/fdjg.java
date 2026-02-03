package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdjg {
    public final Throwable b;
    public final fdhw c;

    public fdjg(Throwable th, boolean z) {
        this.b = th;
        this.c = new fdhw(z, fdia.a);
    }

    public final boolean a() {
        return this.c.a(false, true);
    }

    public final String toString() {
        return fdkc.a(this) + "[" + this.b + "]";
    }

    public /* synthetic */ fdjg(Throwable th) {
        this(th, false);
    }
}
