package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxhc extends dxhe {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final ekhx h;
    public final String i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final String n;
    public final long o;
    public final int p;

    public dxhc(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, ekhx ekhxVar, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        this.a = j;
        this.b = str;
        this.p = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = ekhxVar;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = str7;
        this.o = j5;
    }

    @Override // defpackage.dxhe
    public final int a() {
        return this.l;
    }

    @Override // defpackage.dxhe
    public final int b() {
        return this.f;
    }

    @Override // defpackage.dxhe
    public final long c() {
        return this.m;
    }

    @Override // defpackage.dxhe
    public final long d() {
        return this.o;
    }

    @Override // defpackage.dxhe
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ekhx ekhxVar;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxhe) {
            dxhe dxheVar = (dxhe) obj;
            if (this.a == dxheVar.e() && this.b.equals(dxheVar.j()) && this.p == dxheVar.q() && ((str = this.c) != null ? str.equals(dxheVar.n()) : dxheVar.n() == null) && ((str2 = this.d) != null ? str2.equals(dxheVar.k()) : dxheVar.k() == null) && ((str3 = this.e) != null ? str3.equals(dxheVar.l()) : dxheVar.l() == null) && this.f == dxheVar.b() && ((str4 = this.g) != null ? str4.equals(dxheVar.o()) : dxheVar.o() == null) && ((ekhxVar = this.h) != null ? ekhxVar.equals(dxheVar.i()) : dxheVar.i() == null) && ((str5 = this.i) != null ? str5.equals(dxheVar.p()) : dxheVar.p() == null) && this.j == dxheVar.g() && this.k == dxheVar.f() && this.l == dxheVar.a() && this.m == dxheVar.c() && ((str6 = this.n) != null ? str6.equals(dxheVar.m()) : dxheVar.m() == null) && this.o == dxheVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dxhe
    public final long f() {
        return this.k;
    }

    @Override // defpackage.dxhe
    public final long g() {
        return this.j;
    }

    @Override // defpackage.dxhe
    public final dxhd h() {
        return new dxhb(this);
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ this.p) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f) * 1000003;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        ekhx ekhxVar = this.h;
        int iHashCode6 = (iHashCode5 ^ (ekhxVar == null ? 0 : ekhxVar.hashCode())) * 1000003;
        String str5 = this.i;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        long j2 = this.j;
        int i = (((iHashCode6 ^ iHashCode7) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.k;
        int i2 = (((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j4 = this.m;
        int i3 = (i2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str6 = this.n;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        long j5 = this.o;
        return ((i3 ^ iHashCode8) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5));
    }

    @Override // defpackage.dxhe
    public final ekhx i() {
        return this.h;
    }

    @Override // defpackage.dxhe
    public final String j() {
        return this.b;
    }

    @Override // defpackage.dxhe
    public final String k() {
        return this.d;
    }

    @Override // defpackage.dxhe
    public final String l() {
        return this.e;
    }

    @Override // defpackage.dxhe
    public final String m() {
        return this.n;
    }

    @Override // defpackage.dxhe
    public final String n() {
        return this.c;
    }

    @Override // defpackage.dxhe
    public final String o() {
        return this.g;
    }

    @Override // defpackage.dxhe
    public final String p() {
        return this.i;
    }

    @Override // defpackage.dxhe
    public final int q() {
        return this.p;
    }
}
