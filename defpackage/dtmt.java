package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmt extends dtqe {
    public final String a;
    public final long b;
    public final String c;
    public final ejwi d;
    public final ekgb e;
    public final ekgp f;
    public final ejwi g;

    public dtmt(String str, long j, String str2, ejwi ejwiVar, ekgb ekgbVar, ekgp ekgpVar, ejwi ejwiVar2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = ejwiVar;
        this.e = ekgbVar;
        this.f = ekgpVar;
        this.g = ejwiVar2;
    }

    @Override // defpackage.dtqe
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dtqe
    public final ejwi b() {
        return this.g;
    }

    @Override // defpackage.dtqe
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dtqe
    public final ekgb d() {
        return this.e;
    }

    @Override // defpackage.dtqe
    public final ekgp e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtqe) {
            dtqe dtqeVar = (dtqe) obj;
            if (this.a.equals(dtqeVar.f()) && this.b == dtqeVar.a() && this.c.equals(dtqeVar.g()) && this.d.equals(dtqeVar.c()) && ekjz.h(this.e, dtqeVar.d()) && ekmi.m(this.f, dtqeVar.e()) && this.g.equals(dtqeVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dtqe
    public final String f() {
        return this.a;
    }

    @Override // defpackage.dtqe
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "ImportFilesRequest{groupName=" + this.a + ", buildId=" + this.b + ", variantId=" + this.c + ", customPropertyOptional=" + String.valueOf(this.d) + ", updatedDataFileList=" + this.e.toString() + ", inlineFileMap=" + ekmi.g(this.f) + ", accountOptional=" + String.valueOf(this.g) + "}";
    }
}
