package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsk {
    public final fdap a;
    public final fdae b;

    public xsk(fdap fdapVar, fdae fdaeVar) {
        this.a = fdapVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsk)) {
            return false;
        }
        xsk xskVar = (xsk) obj;
        return fdbq.f(this.a, xskVar.a) && fdbq.f(this.b, xskVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MenuButtonUiData(onClickConfirm=" + this.a + ", onClickCancel=" + this.b + ")";
    }
}
