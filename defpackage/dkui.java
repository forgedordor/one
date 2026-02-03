package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkui implements dkul {
    public final int a;
    private final boolean b = true;

    public dkui(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkui)) {
            return false;
        }
        dkui dkuiVar = (dkui) obj;
        if (this.a != dkuiVar.a) {
            return false;
        }
        boolean z = dkuiVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }

    public final String toString() {
        return "RichCardActionIconResource(iconResource=" + this.a + ", tint=true)";
    }
}
