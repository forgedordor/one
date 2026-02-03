package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vui {
    public final ejxm a;
    public final vvr b;

    public vui(ejxm ejxmVar, vvr vvrVar) {
        this.a = ejxmVar;
        this.b = vvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vui)) {
            return false;
        }
        vui vuiVar = (vui) obj;
        return fdbq.f(this.a, vuiVar.a) && fdbq.f(this.b, vuiVar.b);
    }

    public final int hashCode() {
        ejxm ejxmVar = this.a;
        return ((ejxmVar == null ? 0 : ejxmVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AddRenderingState(addStartStopwatch=" + this.a + ", attachment=" + this.b + ")";
    }
}
