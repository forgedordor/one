package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edsx extends edtc {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;
    private final ekgb d;

    public edsx(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ekgb ekgbVar) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        if (ekgbVar == null) {
            throw new NullPointerException("Null logEvents");
        }
        this.d = ekgbVar;
    }

    @Override // defpackage.edtc
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.edtc
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.edtc
    public final ejwi c() {
        return this.b;
    }

    @Override // defpackage.edtc
    public final ekgb d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edtc) {
            edtc edtcVar = (edtc) obj;
            if (this.a.equals(edtcVar.b()) && this.b.equals(edtcVar.c()) && this.c.equals(edtcVar.a()) && ekjz.h(this.d, edtcVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.d;
        ejwi ejwiVar = this.c;
        ejwi ejwiVar2 = this.b;
        return "PreviewData{photo=" + this.a.toString() + ", profileState=" + ejwiVar2.toString() + ", errorState=" + ejwiVar.toString() + ", logEvents=" + ekgbVar.toString() + "}";
    }
}
