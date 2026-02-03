package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eanx extends eapm {
    public final eatb a;
    public final eatb b;
    public final eatb c;
    public final eatb d;

    public eanx(eatb eatbVar, eatb eatbVar2, eatb eatbVar3, eatb eatbVar4) {
        if (eatbVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.a = eatbVar;
        if (eatbVar2 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.b = eatbVar2;
        if (eatbVar3 == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.c = eatbVar3;
        if (eatbVar4 == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.d = eatbVar4;
    }

    @Override // defpackage.eapm
    public final eatb a() {
        return this.b;
    }

    @Override // defpackage.eapm
    public final eatb b() {
        return this.a;
    }

    @Override // defpackage.eapm
    public final eatb c() {
        return this.c;
    }

    @Override // defpackage.eapm
    public final eatb d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eapm) {
            eapm eapmVar = (eapm) obj;
            if (this.a.equals(eapmVar.b()) && this.b.equals(eapmVar.a()) && this.c.equals(eapmVar.c()) && this.d.equals(eapmVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eatb eatbVar = this.d;
        eatb eatbVar2 = this.c;
        eatb eatbVar3 = this.b;
        return "AccessibilityOptions{wheelchairAccessibleParking=" + this.a.toString() + ", wheelchairAccessibleEntrance=" + eatbVar3.toString() + ", wheelchairAccessibleRestroom=" + eatbVar2.toString() + ", wheelchairAccessibleSeating=" + eatbVar.toString() + "}";
    }
}
