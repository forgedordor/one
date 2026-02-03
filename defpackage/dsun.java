package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsun extends dsup {
    public final String a;
    public final evuh b;
    public final emky c;
    public final Integer d;
    public final eyek e;
    public final int[] f;
    public final int[] g;
    public final dbyw h;

    public dsun(String str, evuh evuhVar, emky emkyVar, Integer num, eyek eyekVar, int[] iArr, int[] iArr2, dbyw dbywVar) {
        this.a = str;
        this.b = evuhVar;
        this.c = emkyVar;
        this.d = num;
        this.e = eyekVar;
        this.f = iArr;
        this.g = iArr2;
        this.h = dbywVar;
    }

    @Override // defpackage.dsup
    public final dbyw a() {
        return this.h;
    }

    @Override // defpackage.dsup
    public final emky b() {
        return this.c;
    }

    @Override // defpackage.dsup
    public final evuh c() {
        return this.b;
    }

    @Override // defpackage.dsup
    public final eyek d() {
        return this.e;
    }

    @Override // defpackage.dsup
    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        emky emkyVar;
        Integer num;
        dbyw dbywVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsup) {
            dsup dsupVar = (dsup) obj;
            if (this.a.equals(dsupVar.f()) && this.b.equals(dsupVar.c()) && ((emkyVar = this.c) != null ? emkyVar.equals(dsupVar.b()) : dsupVar.b() == null) && ((num = this.d) != null ? num.equals(dsupVar.e()) : dsupVar.e() == null)) {
                dsupVar.j();
                dsupVar.i();
                if (this.e.equals(dsupVar.d())) {
                    dsupVar.k();
                    boolean z = dsupVar instanceof dsun;
                    if (Arrays.equals(this.f, z ? ((dsun) dsupVar).f : dsupVar.g())) {
                        if (Arrays.equals(this.g, z ? ((dsun) dsupVar).g : dsupVar.h()) && ((dbywVar = this.h) != null ? dbywVar.equals(dsupVar.a()) : dsupVar.a() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dsup
    public final String f() {
        return this.a;
    }

    @Override // defpackage.dsup
    public final int[] g() {
        return this.f;
    }

    @Override // defpackage.dsup
    public final int[] h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        emky emkyVar = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (emkyVar == null ? 0 : emkyVar.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode3 = (((((((iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 583896283) ^ this.e.hashCode()) * (-721379959)) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003;
        dbyw dbywVar = this.h;
        return iHashCode3 ^ (dbywVar != null ? dbywVar.hashCode() : 0);
    }

    public final String toString() {
        dbyw dbywVar = this.h;
        int[] iArr = this.g;
        int[] iArr2 = this.f;
        eyek eyekVar = this.e;
        emky emkyVar = this.c;
        return "ClearcutData{logSource=" + this.a + ", message=" + this.b.toString() + ", visualElements=" + String.valueOf(emkyVar) + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + eyekVar.toString() + ", logVerifier=null, experimentIds=" + Arrays.toString(iArr2) + ", testCodes=" + Arrays.toString(iArr) + ", complianceProductData=" + String.valueOf(dbywVar) + "}";
    }

    @Override // defpackage.dsup
    public final void i() {
    }

    @Override // defpackage.dsup
    public final void j() {
    }

    @Override // defpackage.dsup
    public final void k() {
    }
}
