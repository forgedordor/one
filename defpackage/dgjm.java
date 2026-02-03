package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjm extends dgjn {
    private final cjqp a;
    private final String b;

    public dgjm(cjqp cjqpVar, String str) {
        if (cjqpVar == null) {
            throw new NullPointerException("Null googleToSConsentState");
        }
        this.a = cjqpVar;
        this.b = str;
    }

    @Override // defpackage.dgjn
    public final cjqp a() {
        return this.a;
    }

    @Override // defpackage.dgjn
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgjn) {
            dgjn dgjnVar = (dgjn) obj;
            if (this.a.equals(dgjnVar.a()) && ((str = this.b) != null ? str.equals(dgjnVar.b()) : dgjnVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "GoogleToSConsent{googleToSConsentState=" + this.a.toString() + ", token=" + this.b + "}";
    }
}
