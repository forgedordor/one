package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eiol extends eipk {
    public final eiqt a;

    public eiol(eiqt eiqtVar) {
        if (eiqtVar == null) {
            throw new NullPointerException("Null capability");
        }
        this.a = eiqtVar;
    }

    @Override // defpackage.eipk
    public final eiqt a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eipk) {
            return this.a.equals(((eipk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IdentifiableActionCapability{capability=" + this.a.toString() + "}";
    }
}
