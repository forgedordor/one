package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgm extends efgv {
    public efgz a;
    private ekfi b;
    private ekfk c;
    private ekfw d;
    private ekgb e;

    public efgm() {
    }

    @Override // defpackage.efgv
    public final efgw a() {
        ekfi ekfiVar = this.b;
        if (ekfiVar != null) {
            this.c = ekfiVar.c();
        } else if (this.c == null) {
            this.c = ekod.a;
        }
        ekfw ekfwVar = this.d;
        if (ekfwVar != null) {
            this.e = ekfwVar.g();
        } else if (this.e == null) {
            int i = ekgb.d;
            this.e = ekoe.a;
        }
        efgz efgzVar = this.a;
        if (efgzVar != null) {
            return new efgn(this.c, this.e, efgzVar);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // defpackage.efgv
    public final ekfi b() {
        if (this.b == null) {
            if (this.c == null) {
                this.b = new ekfi();
            } else {
                ekfi ekfiVar = new ekfi();
                this.b = ekfiVar;
                ekfiVar.f(this.c);
                this.c = null;
            }
        }
        return this.b;
    }

    @Override // defpackage.efgv
    public final ekfw c() {
        if (this.d == null) {
            if (this.e == null) {
                int i = ekgb.d;
                this.d = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.d = ekfwVar;
                ekfwVar.j(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    public efgm(efgw efgwVar) {
        efgn efgnVar = (efgn) efgwVar;
        this.c = efgnVar.a;
        this.e = efgnVar.b;
        this.a = efgnVar.c;
    }
}
