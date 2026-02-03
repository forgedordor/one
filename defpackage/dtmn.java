package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmn extends dtoz {
    public final String a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final ejwi e;
    public final boolean f;
    public final int g;
    private final ejwi h;
    private final ejwi i;
    private final ejwi j;

    public dtmn(String str, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, ejwi ejwiVar5, ejwi ejwiVar6, ejwi ejwiVar7, int i, boolean z) {
        this.a = str;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.h = ejwiVar3;
        this.i = ejwiVar4;
        this.j = ejwiVar5;
        this.d = ejwiVar6;
        this.e = ejwiVar7;
        this.g = i;
        this.f = z;
    }

    @Override // defpackage.dtoz
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dtoz
    public final ejwi b() {
        return this.j;
    }

    @Override // defpackage.dtoz
    public final ejwi c() {
        return this.i;
    }

    @Override // defpackage.dtoz
    public final ejwi d() {
        return this.h;
    }

    @Override // defpackage.dtoz
    public final ejwi e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtoz) {
            dtoz dtozVar = (dtoz) obj;
            if (this.a.equals(dtozVar.h()) && this.b.equals(dtozVar.a()) && this.c.equals(dtozVar.g()) && this.h.equals(dtozVar.d()) && this.i.equals(dtozVar.c()) && this.j.equals(dtozVar.b()) && this.d.equals(dtozVar.e()) && this.e.equals(dtozVar.f())) {
                dtozVar.k();
                dtozVar.l();
                if (this.g == dtozVar.j()) {
                    dtozVar.m();
                    if (this.f == dtozVar.i()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dtoz
    public final ejwi f() {
        return this.e;
    }

    @Override // defpackage.dtoz
    public final ejwi g() {
        return this.c;
    }

    @Override // defpackage.dtoz
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 583896283) ^ this.g) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    @Override // defpackage.dtoz
    public final boolean i() {
        return this.f;
    }

    @Override // defpackage.dtoz
    public final int j() {
        return this.g;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.d);
        String str = this.g != 1 ? "ALL" : "NONE";
        return "DownloadFileGroupRequest{groupName=" + this.a + ", accountOptional=" + strValueOf + ", variantIdOptional=Optional.absent(), contentTitleOptional=Optional.absent(), contentTextOptional=Optional.absent(), contentIntentOptional=Optional.absent(), downloadConditionsOptional=" + strValueOf2 + ", listenerOptional=Optional.absent(), groupSizeBytes=0, groupSizeBytesLong=0, showNotifications=" + str + ", preserveZipDirectories=false, verifyIsolatedStructure=" + this.f + "}";
    }

    @Override // defpackage.dtoz
    @Deprecated
    public final void k() {
    }

    @Override // defpackage.dtoz
    public final void l() {
    }

    @Override // defpackage.dtoz
    public final void m() {
    }
}
