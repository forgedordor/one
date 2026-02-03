package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class admv extends aewb {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final Boolean f;

    public admv(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = bool6;
    }

    @Override // defpackage.aewb
    public final Boolean a() {
        return this.a;
    }

    @Override // defpackage.aewb
    public final Boolean b() {
        return this.b;
    }

    @Override // defpackage.aewb
    public final Boolean c() {
        return this.f;
    }

    @Override // defpackage.aewb
    public final Boolean d() {
        return this.e;
    }

    @Override // defpackage.aewb
    public final Boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aewb) {
            aewb aewbVar = (aewb) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(aewbVar.a()) : aewbVar.a() == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(aewbVar.b()) : aewbVar.b() == null) {
                    Boolean bool3 = this.c;
                    if (bool3 != null ? bool3.equals(aewbVar.f()) : aewbVar.f() == null) {
                        Boolean bool4 = this.d;
                        if (bool4 != null ? bool4.equals(aewbVar.e()) : aewbVar.e() == null) {
                            Boolean bool5 = this.e;
                            if (bool5 != null ? bool5.equals(aewbVar.d()) : aewbVar.d() == null) {
                                Boolean bool6 = this.f;
                                if (bool6 != null ? bool6.equals(aewbVar.c()) : aewbVar.c() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aewb
    public final Boolean f() {
        return this.c;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        int i = iHashCode ^ 1000003;
        Boolean bool3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.f;
        return iHashCode5 ^ (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        return "HomeScreenQueryBuilder{whereArchived=" + this.a + ", whereNotArchived=" + this.b + ", whereSpam=" + this.c + ", whereNotRbm=" + this.d + ", whereNotPenpal=" + this.e + ", whereNotEmergencySos=" + this.f + "}";
    }
}
