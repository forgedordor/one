package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdjf {
    public final Object a;
    public final fdiq b;
    public final fdau c;
    public final Object d;
    public final Throwable e;

    public fdjf(Object obj, fdiq fdiqVar, fdau fdauVar, Throwable th) {
        this.a = obj;
        this.b = fdiqVar;
        this.c = fdauVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ fdjf b(fdjf fdjfVar, fdiq fdiqVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? fdjfVar.a : null;
        if ((i & 2) != 0) {
            fdiqVar = fdjfVar.b;
        }
        fdau fdauVar = (i & 4) != 0 ? fdjfVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = fdjfVar.d;
        }
        if ((i & 16) != 0) {
            th = fdjfVar.e;
        }
        return new fdjf(obj, fdiqVar, fdauVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdjf)) {
            return false;
        }
        fdjf fdjfVar = (fdjf) obj;
        if (!fdbq.f(this.a, fdjfVar.a) || !fdbq.f(this.b, fdjfVar.b) || !fdbq.f(this.c, fdjfVar.c)) {
            return false;
        }
        Object obj2 = fdjfVar.d;
        return fdbq.f(null, null) && fdbq.f(this.e, fdjfVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        fdiq fdiqVar = this.b;
        int iHashCode2 = fdiqVar == null ? 0 : fdiqVar.hashCode();
        int i = iHashCode * 31;
        fdau fdauVar = this.c;
        int iHashCode3 = fdauVar == null ? 0 : fdauVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }

    public /* synthetic */ fdjf(Object obj, fdiq fdiqVar, fdau fdauVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : fdiqVar, (i & 4) != 0 ? null : fdauVar, (i & 16) != 0 ? null : th);
    }
}
