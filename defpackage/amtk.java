package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amtk extends amur {
    private final ekgb a;

    public amtk(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.amwh
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amur) {
            return ekjz.h(this.a, ((amur) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BugleTombstoneContent{lines=" + this.a.toString() + "}";
    }
}
