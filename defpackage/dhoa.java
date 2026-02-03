package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhoa {
    public final eqso a;
    private final String b = null;

    public dhoa(eqso eqsoVar) {
        this.a = eqsoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhoa)) {
            return false;
        }
        dhoa dhoaVar = (dhoa) obj;
        if (!fdbq.f(this.a, dhoaVar.a)) {
            return false;
        }
        String str = dhoaVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ProtectionEncryptionKey{ vm_owner=null }";
    }
}
