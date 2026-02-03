package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icl extends icg {
    private final String b;
    private final Object c;
    private final Object d;

    public icl(String str, Object obj, Object obj2, fdau fdauVar) {
        super(fdauVar);
        this.b = str;
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof icl)) {
            return false;
        }
        icl iclVar = (icl) obj;
        return fdbq.f(this.b, iclVar.b) && fdbq.f(this.c, iclVar.c) && fdbq.f(this.d, iclVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.d;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
