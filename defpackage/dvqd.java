package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqd extends dvqq {
    private final dwsm a;

    public dvqd(dwsm dwsmVar) {
        this.a = dwsmVar;
    }

    @Override // defpackage.dvqq
    public final dwsm a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqq) {
            return this.a.equals(((dvqq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetUserPropertiesResult{userProperties=" + this.a.toString() + "}";
    }
}
