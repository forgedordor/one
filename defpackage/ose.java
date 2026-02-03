package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ose extends osg {
    public final orq a;
    public final orq b = null;

    public ose(orq orqVar) {
        this.a = orqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ose)) {
            return false;
        }
        ose oseVar = (ose) obj;
        if (!fdbq.f(this.a, oseVar.a)) {
            return false;
        }
        orq orqVar = oseVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return fdgn.c(("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ").concat("|)"), "|");
    }
}
