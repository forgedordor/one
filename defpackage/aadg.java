package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadg implements divg {
    public final fdae a;
    public final fdae b;

    public aadg(fdae fdaeVar, fdae fdaeVar2) {
        this.a = fdaeVar;
        this.b = fdaeVar2;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new aadg(fdaeVar, this.b);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.a;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadg)) {
            return false;
        }
        aadg aadgVar = (aadg) obj;
        return fdbq.f(this.a, aadgVar.a) && fdbq.f(this.b, aadgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DuoKitStartSetupQuestionUiData(onDismiss=" + this.a + ", onStartSetup=" + this.b + ")";
    }
}
