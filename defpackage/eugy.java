package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugy extends euki {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final eujv d;
    private final ekgb e;

    public eugy(boolean z, boolean z2, boolean z3, ekgb ekgbVar, eujv eujvVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.e = ekgbVar;
        this.d = eujvVar;
    }

    @Override // defpackage.euki
    public final ekgb a() {
        return this.e;
    }

    @Override // defpackage.euki
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.euki
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.euki
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.euki
    public final eujv e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euki) {
            euki eukiVar = (euki) obj;
            if (this.a == eukiVar.c() && this.b == eukiVar.b()) {
                eukiVar.f();
                if (this.c == eukiVar.d()) {
                    eukiVar.g();
                    eukiVar.h();
                    eukiVar.i();
                    if (ekjz.h(this.e, eukiVar.a()) && this.d.equals(eukiVar.e())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eujv eujvVar = this.d;
        return "TextClassifierContactOptions{annotateName=" + this.a + ", annotateGivenName=" + this.b + ", annotateFamilyName=false, annotateNickname=" + this.c + ", enableChangeMonitoring=false, enableDeclension=false, enableShortcutContacts=false, shortcutContactNames=" + this.e.toString() + ", lightweightTokensProvider=" + eujvVar.toString() + "}";
    }

    @Override // defpackage.euki
    public final void f() {
    }

    @Override // defpackage.euki
    public final void g() {
    }

    @Override // defpackage.euki
    public final void h() {
    }

    @Override // defpackage.euki
    public final void i() {
    }
}
