package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anar extends ancl {
    public final boolean a;
    public final ajmb b;
    public final angr c;
    public final ajmx d;
    public final String e;
    public final ekgb f;
    public final amwc g;
    public final ekgp h;
    public final ekgb i;
    public final ekgb j;
    public final anms k;
    public final angj l;
    public final int m;
    private final anac o;

    public anar(boolean z, ajmb ajmbVar, angr angrVar, ajmx ajmxVar, String str, int i, ekgb ekgbVar, amwc amwcVar, anms anmsVar, ekgp ekgpVar, ekgb ekgbVar2, ekgb ekgbVar3, angj angjVar, anac anacVar) {
        this.a = z;
        this.b = ajmbVar;
        this.c = angrVar;
        this.d = ajmxVar;
        this.e = str;
        this.m = i;
        this.f = ekgbVar;
        this.g = amwcVar;
        this.k = anmsVar;
        this.h = ekgpVar;
        this.i = ekgbVar2;
        this.j = ekgbVar3;
        this.l = angjVar;
        this.o = anacVar;
    }

    @Override // defpackage.ancl
    public final ajmb a() {
        return this.b;
    }

    @Override // defpackage.ancl
    public final ajmx b() {
        return this.d;
    }

    @Override // defpackage.ancl
    public final amwc c() {
        return this.g;
    }

    @Override // defpackage.ancl
    public final anac d() {
        return this.o;
    }

    @Override // defpackage.ancl
    public final angr e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        ajmb ajmbVar;
        angr angrVar;
        ajmx ajmxVar;
        String str;
        amwc amwcVar;
        anms anmsVar;
        angj angjVar;
        anac anacVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ancl) {
            ancl anclVar = (ancl) obj;
            if (this.a == anclVar.k() && ((ajmbVar = this.b) != null ? ajmbVar.equals(anclVar.a()) : anclVar.a() == null) && ((angrVar = this.c) != null ? angrVar.equals(anclVar.e()) : anclVar.e() == null) && ((ajmxVar = this.d) != null ? ajmxVar.equals(anclVar.b()) : anclVar.b() == null) && ((str = this.e) != null ? str.equals(anclVar.j()) : anclVar.j() == null)) {
                int i = this.m;
                int iN = anclVar.n();
                if (i == 0) {
                    throw null;
                }
                if (i == iN && ekjz.h(this.f, anclVar.f()) && ((amwcVar = this.g) != null ? amwcVar.equals(anclVar.c()) : anclVar.c() == null) && ((anmsVar = this.k) != null ? anmsVar.equals(anclVar.l()) : anclVar.l() == null) && this.h.equals(anclVar.i()) && ekjz.h(this.i, anclVar.h()) && ekjz.h(this.j, anclVar.g()) && ((angjVar = this.l) != null ? angjVar.equals(anclVar.m()) : anclVar.m() == null) && ((anacVar = this.o) != null ? anacVar.equals(anclVar.d()) : anclVar.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ancl
    public final ekgb f() {
        return this.f;
    }

    @Override // defpackage.ancl
    public final ekgb g() {
        return this.j;
    }

    @Override // defpackage.ancl
    public final ekgb h() {
        return this.i;
    }

    public final int hashCode() {
        ajmb ajmbVar = this.b;
        int iHashCode = (ajmbVar == null ? 0 : ajmbVar.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
        angr angrVar = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (angrVar == null ? 0 : angrVar.hashCode())) * 1000003;
        ajmx ajmxVar = this.d;
        int iHashCode3 = (iHashCode2 ^ (ajmxVar == null ? 0 : ajmxVar.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i = this.m;
        amkb.a(i);
        int iHashCode5 = (((iHashCode4 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003;
        amwc amwcVar = this.g;
        int iHashCode6 = (iHashCode5 ^ (amwcVar == null ? 0 : amwcVar.hashCode())) * 1000003;
        anms anmsVar = this.k;
        int iHashCode7 = (((((((iHashCode6 ^ (anmsVar == null ? 0 : anmsVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        angj angjVar = this.l;
        int iHashCode8 = (iHashCode7 ^ (angjVar == null ? 0 : angjVar.hashCode())) * 1000003;
        anac anacVar = this.o;
        return iHashCode8 ^ (anacVar != null ? anacVar.hashCode() : 0);
    }

    @Override // defpackage.ancl
    public final ekgp i() {
        return this.h;
    }

    @Override // defpackage.ancl
    public final String j() {
        return this.e;
    }

    @Override // defpackage.ancl
    public final boolean k() {
        return this.a;
    }

    @Override // defpackage.ancl
    public final anms l() {
        return this.k;
    }

    @Override // defpackage.ancl
    public final angj m() {
        return this.l;
    }

    @Override // defpackage.ancl
    public final int n() {
        return this.m;
    }

    public final String toString() {
        int i = this.m;
        ajmx ajmxVar = this.d;
        angr angrVar = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(angrVar);
        String strValueOf3 = String.valueOf(ajmxVar);
        String str = i != 1 ? i != 2 ? "null" : "OTP" : "NORMAL";
        ekgb ekgbVar = this.f;
        amwc amwcVar = this.g;
        anms anmsVar = this.k;
        ekgp ekgpVar = this.h;
        ekgb ekgbVar2 = this.i;
        ekgb ekgbVar3 = this.j;
        angj angjVar = this.l;
        anac anacVar = this.o;
        return "MessageExtensionState{starred=" + this.a + ", preview=" + strValueOf + ", reactions=" + strValueOf2 + ", repliedTo=" + strValueOf3 + ", caption=" + this.e + ", contentCategory=" + str + ", annotations=" + String.valueOf(ekgbVar) + ", suggestionShortcut=" + String.valueOf(amwcVar) + ", calendarEvent=" + String.valueOf(anmsVar) + ", voiceTranscriptions=" + String.valueOf(ekgpVar) + ", readByRecipients=" + String.valueOf(ekgbVar2) + ", failedToDecryptRecipients=" + String.valueOf(ekgbVar3) + ", editStatus=" + String.valueOf(angjVar) + ", extensionMetadata=" + String.valueOf(anacVar) + "}";
    }
}
