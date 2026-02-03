package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynm implements vwm {
    public boolean a;
    public final fdvc b;
    private final fdjx c;
    private final fduf d;
    private fdlr e;

    public ynm(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.c = fdjxVar;
        fduf fdufVarA = fdvf.a(false);
        this.d = fdufVarA;
        this.b = fdufVarA;
    }

    @Override // defpackage.vwm
    public final void a(vvw vvwVar) {
        if (vvwVar.g != null) {
            return;
        }
        c();
    }

    public final void b() {
        this.a = false;
        this.d.f(false);
        fdlr fdlrVar = this.e;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.e = null;
    }

    public final void c() {
        this.a = true;
    }

    public final void d() {
        this.d.f(true);
        fdlr fdlrVar = this.e;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.e = auvw.k(this.c, null, null, new ynl(this, null), 3);
    }
}
