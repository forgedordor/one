package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmk extends dtmh {
    public final dtns a;
    public final ejwi b;
    public final ejwi c;

    public dtmk(dtns dtnsVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = dtnsVar;
        this.b = ejwiVar;
        this.c = ejwiVar2;
    }

    @Override // defpackage.dtmh
    public final dtns a() {
        return this.a;
    }

    @Override // defpackage.dtmh
    public final ejwi b() {
        return this.b;
    }

    @Override // defpackage.dtmh
    public final ejwi c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtmh) {
            dtmh dtmhVar = (dtmh) obj;
            if (this.a.equals(dtmhVar.a()) && this.b.equals(dtmhVar.b()) && this.c.equals(dtmhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        ejwi ejwiVar2 = this.b;
        return "AddFileGroupRequest{dataFileGroup=" + this.a.toString() + ", accountOptional=" + String.valueOf(ejwiVar2) + ", variantIdOptional=" + String.valueOf(ejwiVar) + "}";
    }
}
