package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eghn extends eghk {
    private final Object a;
    private final eghr b;

    public eghn(Object obj, eghr eghrVar) {
        this.a = obj;
        if (eghrVar == null) {
            throw new NullPointerException("Null accountData");
        }
        this.b = eghrVar;
    }

    @Override // defpackage.eghk
    public final eghr a() {
        return this.b;
    }

    @Override // defpackage.eghk
    public final Object b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eghk) {
            eghk eghkVar = (eghk) obj;
            if (ekmi.m(this.a, eghkVar.b()) && this.b.equals(eghkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        return "ResultAndAccountData{result=" + ekmi.g(this.a) + ", accountData=" + this.b.toString() + "}";
    }
}
