package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmp extends dtqa {
    public final String a;
    public final boolean b;
    private final ejwi c;
    private final ejwi d;

    public dtmp(String str, ejwi ejwiVar, ejwi ejwiVar2, boolean z) {
        this.a = str;
        this.c = ejwiVar;
        this.d = ejwiVar2;
        this.b = z;
    }

    @Override // defpackage.dtqa
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.dtqa
    public final ejwi b() {
        return this.d;
    }

    @Override // defpackage.dtqa
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dtqa
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtqa) {
            dtqa dtqaVar = (dtqa) obj;
            if (this.a.equals(dtqaVar.c()) && this.c.equals(dtqaVar.a()) && this.d.equals(dtqaVar.b())) {
                dtqaVar.e();
                if (this.b == dtqaVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "GetFileGroupRequest{groupName=" + this.a + ", accountOptional=Optional.absent(), variantIdOptional=Optional.absent(), preserveZipDirectories=false, verifyIsolatedStructure=" + this.b + "}";
    }

    @Override // defpackage.dtqa
    public final void e() {
    }
}
