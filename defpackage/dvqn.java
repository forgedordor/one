package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqn extends dvrb {
    private final dwsm a;

    public dvqn(dwsm dwsmVar) {
        this.a = dwsmVar;
    }

    @Override // defpackage.dvrb
    public final dwsm a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvrb) {
            return this.a.equals(((dvrb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetUserPropertiesResult{userProperties=" + this.a.toString() + "}";
    }
}
