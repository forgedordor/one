package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class draf extends drdl {
    public ekgi a;
    public ekgp b;
    private ekhv c;
    private ekhx d;
    private ekhv e;
    private ekhx f;
    private ekfw g;
    private ekgb h;

    public draf() {
    }

    @Override // defpackage.drdl
    public final drdm a() {
        ekgp ekgpVarC;
        ekhv ekhvVar = this.c;
        if (ekhvVar != null) {
            this.d = ekhvVar.g();
        } else if (this.d == null) {
            this.d = ekon.a;
        }
        ekhv ekhvVar2 = this.e;
        if (ekhvVar2 != null) {
            this.f = ekhvVar2.g();
        } else if (this.f == null) {
            this.f = ekon.a;
        }
        ekfw ekfwVar = this.g;
        if (ekfwVar != null) {
            this.h = ekfwVar.g();
        } else if (this.h == null) {
            int i = ekgb.d;
            this.h = ekoe.a;
        }
        ekgi ekgiVar = this.a;
        if (ekgiVar == null) {
            if (this.b == null) {
                ekgpVarC = ekoj.a;
            }
            return new drag(this.d, this.f, this.h, this.b);
        }
        ekgpVarC = ekgiVar.c();
        this.b = ekgpVarC;
        return new drag(this.d, this.f, this.h, this.b);
    }

    @Override // defpackage.drdl
    public final ekfw b() {
        if (this.g == null) {
            if (this.h == null) {
                int i = ekgb.d;
                this.g = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.g = ekfwVar;
                ekfwVar.j(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.drdl
    public final ekhv c() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = new ekhv();
            } else {
                ekhv ekhvVar = new ekhv();
                this.c = ekhvVar;
                ekhvVar.j(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.drdl
    public final ekhv d() {
        if (this.e == null) {
            if (this.f == null) {
                this.e = new ekhv();
            } else {
                ekhv ekhvVar = new ekhv();
                this.e = ekhvVar;
                ekhvVar.j(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    public draf(drdm drdmVar) {
        drag dragVar = (drag) drdmVar;
        this.d = dragVar.a;
        this.f = dragVar.b;
        this.h = dragVar.c;
        this.b = dragVar.d;
    }
}
