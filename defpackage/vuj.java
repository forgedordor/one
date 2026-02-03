package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuj {
    public final ejxm a;

    public vuj(ejxm ejxmVar) {
        this.a = ejxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuj) && fdbq.f(this.a, ((vuj) obj).a);
    }

    public final int hashCode() {
        ejxm ejxmVar = this.a;
        if (ejxmVar == null) {
            return 0;
        }
        return ejxmVar.hashCode();
    }

    public final String toString() {
        return "AddingState(addStartStopwatch=" + this.a + ")";
    }
}
