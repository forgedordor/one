package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fil {
    public final fik a;
    public final fik b;
    public final boolean c;

    public fil(fik fikVar, fik fikVar2, boolean z) {
        this.a = fikVar;
        this.b = fikVar2;
        this.c = z;
    }

    public static /* synthetic */ fil a(fil filVar, fik fikVar, fik fikVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            fikVar = filVar.a;
        }
        if ((i & 2) != 0) {
            fikVar2 = filVar.b;
        }
        return new fil(fikVar, fikVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fil)) {
            return false;
        }
        fil filVar = (fil) obj;
        return fdbq.f(this.a, filVar.a) && fdbq.f(this.b, filVar.b) && this.c == filVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
