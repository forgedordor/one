package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaop extends eass {
    public eatb a;
    public eatb b;
    public eatb c;
    public eatb d;
    public eatb e;
    public eatb f;
    public eatb g;

    @Override // defpackage.eass
    public final void a(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.f = eatbVar;
    }

    @Override // defpackage.eass
    public final void b(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.a = eatbVar;
    }

    @Override // defpackage.eass
    public final void c(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.c = eatbVar;
    }

    @Override // defpackage.eass
    public final void d(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.g = eatbVar;
    }

    @Override // defpackage.eass
    public final void e(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.b = eatbVar;
    }

    @Override // defpackage.eass
    public final void f(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.d = eatbVar;
    }

    @Override // defpackage.eass
    public final void g(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.e = eatbVar;
    }
}
