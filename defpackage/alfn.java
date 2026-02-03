package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alfn extends allr {
    public final alwk a;
    public final int b;
    private final String c;
    private final String d;
    private final ephf e;
    private final ejxr f;
    private final ejxr g;
    private final ejxr h;

    public alfn(String str, alwk alwkVar, String str2, ephf ephfVar, int i, ejxr ejxrVar, ejxr ejxrVar2, ejxr ejxrVar3) {
        this.c = str;
        if (alwkVar == null) {
            throw new NullPointerException("Null destinationType");
        }
        this.a = alwkVar;
        if (str2 == null) {
            throw new NullPointerException("Null sourceRegionCode");
        }
        this.d = str2;
        this.e = ephfVar;
        this.b = i;
        if (ejxrVar == null) {
            throw new NullPointerException("Null targetCountrySupplier");
        }
        this.f = ejxrVar;
        this.g = ejxrVar2;
        this.h = ejxrVar3;
    }

    @Override // defpackage.allr
    public final alwk a() {
        return this.a;
    }

    @Override // defpackage.allr
    public final ejxr b() {
        return this.h;
    }

    @Override // defpackage.allr
    public final ejxr c() {
        return this.f;
    }

    @Override // defpackage.allr
    public final ejxr d() {
        return this.g;
    }

    @Override // defpackage.allr
    public final ephf e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ephf ephfVar;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof allr) {
            allr allrVar = (allr) obj;
            String str = this.c;
            if (str != null ? str.equals(allrVar.f()) : allrVar.f() == null) {
                if (this.a.equals(allrVar.a()) && this.d.equals(allrVar.g()) && ((ephfVar = this.e) != null ? ephfVar.equals(allrVar.e()) : allrVar.e() == null) && ((i = this.b) != 0 ? i == allrVar.h() : allrVar.h() == 0) && this.f.equals(allrVar.c()) && this.g.equals(allrVar.d()) && this.h.equals(allrVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.allr
    public final String f() {
        return this.c;
    }

    @Override // defpackage.allr
    public final String g() {
        return this.d;
    }

    @Override // defpackage.allr
    public final int h() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.d.hashCode();
        ephf ephfVar = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ephfVar == null ? 0 : ephfVar.hashCode())) * 1000003;
        int i = this.b;
        return ((((((iHashCode2 ^ (i != 0 ? i : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        ejxr ejxrVar = this.h;
        ejxr ejxrVar2 = this.g;
        ejxr ejxrVar3 = this.f;
        ephf ephfVar = this.e;
        return "ParsedDestination{rawDestination=" + this.c + ", destinationType=" + this.a.toString() + ", sourceRegionCode=" + this.d + ", parsedNumber=" + String.valueOf(ephfVar) + ", validation=" + ephh.a(this.b) + ", targetCountrySupplier=" + ejxrVar3.toString() + ", targetRegionCodeSupplier=" + ejxrVar2.toString() + ", targetCallingCodeSupplier=" + ejxrVar.toString() + "}";
    }
}
