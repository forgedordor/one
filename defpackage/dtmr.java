package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmr extends dtqc {
    public final boolean a;
    public final boolean b;
    private final ejwi c;
    private final ejwi d;
    private final ejwi e;
    private final ejwi f;

    public dtmr(boolean z, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, boolean z2) {
        this.a = z;
        this.c = ejwiVar;
        this.d = ejwiVar2;
        this.e = ejwiVar3;
        this.f = ejwiVar4;
        this.b = z2;
    }

    @Override // defpackage.dtqc
    public final ejwi a() {
        return this.e;
    }

    @Override // defpackage.dtqc
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dtqc
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dtqc
    public final ejwi d() {
        return this.f;
    }

    @Override // defpackage.dtqc
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtqc) {
            dtqc dtqcVar = (dtqc) obj;
            if (this.a == dtqcVar.e()) {
                dtqcVar.g();
                if (this.c.equals(dtqcVar.b()) && this.d.equals(dtqcVar.c()) && this.e.equals(dtqcVar.a()) && this.f.equals(dtqcVar.d())) {
                    dtqcVar.h();
                    if (this.b == dtqcVar.f()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dtqc
    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "GetFileGroupsByFilterRequest{includeAllGroups=" + this.a + ", groupWithNoAccountOnly=false, groupNameOptional=Optional.absent(), groupNamePrefixOptional=Optional.absent(), accountOptional=Optional.absent(), sourceOptional=Optional.absent(), preserveZipDirectories=false, verifyIsolatedStructure=" + this.b + "}";
    }

    @Override // defpackage.dtqc
    public final void g() {
    }

    @Override // defpackage.dtqc
    public final void h() {
    }
}
