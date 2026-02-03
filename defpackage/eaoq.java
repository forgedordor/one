package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaoq extends east {
    public final eatb a;
    public final eatb b;
    public final eatb c;
    public final eatb d;
    public final eatb e;
    public final eatb f;
    public final eatb g;

    public eaoq(eatb eatbVar, eatb eatbVar2, eatb eatbVar3, eatb eatbVar4, eatb eatbVar5, eatb eatbVar6, eatb eatbVar7) {
        if (eatbVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.a = eatbVar;
        if (eatbVar2 == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.b = eatbVar2;
        if (eatbVar3 == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.c = eatbVar3;
        if (eatbVar4 == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.d = eatbVar4;
        if (eatbVar5 == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.e = eatbVar5;
        if (eatbVar6 == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.f = eatbVar6;
        if (eatbVar7 == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.g = eatbVar7;
    }

    @Override // defpackage.east
    public final eatb a() {
        return this.f;
    }

    @Override // defpackage.east
    public final eatb b() {
        return this.a;
    }

    @Override // defpackage.east
    public final eatb c() {
        return this.c;
    }

    @Override // defpackage.east
    public final eatb d() {
        return this.g;
    }

    @Override // defpackage.east
    public final eatb e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof east) {
            east eastVar = (east) obj;
            if (this.a.equals(eastVar.b()) && this.b.equals(eastVar.e()) && this.c.equals(eastVar.c()) && this.d.equals(eastVar.f()) && this.e.equals(eastVar.g()) && this.f.equals(eastVar.a()) && this.g.equals(eastVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.east
    public final eatb f() {
        return this.d;
    }

    @Override // defpackage.east
    public final eatb g() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        eatb eatbVar = this.g;
        eatb eatbVar2 = this.f;
        eatb eatbVar3 = this.e;
        eatb eatbVar4 = this.d;
        eatb eatbVar5 = this.c;
        eatb eatbVar6 = this.b;
        return "ParkingOptions{freeParkingLot=" + this.a.toString() + ", paidParkingLot=" + eatbVar6.toString() + ", freeStreetParking=" + eatbVar5.toString() + ", paidStreetParking=" + eatbVar4.toString() + ", valetParking=" + eatbVar3.toString() + ", freeGarageParking=" + eatbVar2.toString() + ", paidGarageParking=" + eatbVar.toString() + "}";
    }
}
