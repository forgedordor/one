package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agff implements afzx {
    public final crmc a;

    public agff(crmc crmcVar) {
        crmcVar.getClass();
        this.a = crmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agff) && this.a == ((agff) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestPermission(permission=" + this.a + ")";
    }
}
