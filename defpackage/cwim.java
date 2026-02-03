package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwim {
    public final djvp a;
    public final dizj b;

    public cwim(djvp djvpVar, dizj dizjVar) {
        this.a = djvpVar;
        this.b = dizjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwim)) {
            return false;
        }
        cwim cwimVar = (cwim) obj;
        return fdbq.f(this.a, cwimVar.a) && fdbq.f(this.b, cwimVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dizj dizjVar = this.b;
        return iHashCode + (dizjVar == null ? 0 : dizjVar.hashCode());
    }

    public final String toString() {
        return "SearchActionItemUiData(listItemUiData=" + this.a + ", previewUiData=" + this.b + ")";
    }

    public /* synthetic */ cwim(djvp djvpVar) {
        this(djvpVar, null);
    }
}
