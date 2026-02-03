package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvd {
    public final cogw a;
    public dnwy b;
    public dnwz c;
    public dnww d;
    public long e;
    public long f;

    public abvd(cogw cogwVar) {
        this.a = cogwVar;
    }

    public final void a(dnwy dnwyVar) {
        dnwyVar.getClass();
        c();
        this.b = dnwyVar;
    }

    public final void b(dnwz dnwzVar) {
        dnwzVar.getClass();
        if (this.c == null) {
            this.c = dnwzVar;
        }
    }

    public final void c() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void d(dnww dnwwVar) {
        dnwwVar.getClass();
        if (this.c != null) {
            dnwwVar = dnww.b;
        }
        this.d = dnwwVar;
    }
}
