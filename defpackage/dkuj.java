package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuj implements dkul {
    public final djrr a;
    private final boolean b = true;

    public dkuj(djrr djrrVar) {
        this.a = djrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkuj)) {
            return false;
        }
        dkuj dkujVar = (dkuj) obj;
        if (this.a != dkujVar.a) {
            return false;
        }
        boolean z = dkujVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "RichCardActionIconUiData(uiData=" + this.a + ", tint=true)";
    }
}
