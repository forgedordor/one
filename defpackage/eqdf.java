package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdf extends eqdo {
    public final eqdn a;
    public final eqdm b;
    public final eqdk c;
    public final eqdl d;

    public eqdf(eqdn eqdnVar, eqdm eqdmVar, eqdk eqdkVar, eqdl eqdlVar) {
        this.a = eqdnVar;
        this.b = eqdmVar;
        this.c = eqdkVar;
        this.d = eqdlVar;
    }

    @Override // defpackage.eqdo
    public final eqdk a() {
        return this.c;
    }

    @Override // defpackage.eqdo
    public final eqdl b() {
        return this.d;
    }

    @Override // defpackage.eqdo
    public final eqdm c() {
        return this.b;
    }

    @Override // defpackage.eqdo
    public final eqdn d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqdo) {
            eqdo eqdoVar = (eqdo) obj;
            if (this.a.equals(eqdoVar.d()) && this.b.equals(eqdoVar.c()) && this.c.equals(eqdoVar.a()) && this.d.equals(eqdoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eqdl eqdlVar = this.d;
        eqdk eqdkVar = this.c;
        eqdm eqdmVar = this.b;
        return "GroupFeatures{userRemovalPolicy=" + this.a.toString() + ", renamingPolicy=" + eqdmVar.toString() + ", groupIconModificationPolicy=" + eqdkVar.toString() + ", joinByLinkPolicy=" + eqdlVar.toString() + "}";
    }
}
