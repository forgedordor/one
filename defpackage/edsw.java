package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edsw extends edsy {
    private final boolean a;
    private final ekgp b;
    private final ecqt c;

    public edsw(ecqt ecqtVar, boolean z, ekgp ekgpVar) {
        this.c = ecqtVar;
        this.a = z;
        this.b = ekgpVar;
    }

    @Override // defpackage.edsy
    public final ekgp a() {
        return this.b;
    }

    @Override // defpackage.edsy
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.edsy
    public final ecqt c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edsy) {
            edsy edsyVar = (edsy) obj;
            if (this.c.equals(edsyVar.c()) && this.a == edsyVar.b() && ekmi.m(this.b, edsyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HatsSurveyData{surveyData=" + this.c.toString() + ", wasMonogram=" + this.a + ", psd=" + ekmi.g(this.b) + "}";
    }
}
