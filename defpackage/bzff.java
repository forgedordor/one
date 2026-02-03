package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzff implements bzca {
    public final bzcc a;
    public final Object b;

    public bzff(bzcc bzccVar, Object obj) {
        bzccVar.getClass();
        this.a = bzccVar;
        this.b = obj;
    }

    @Override // defpackage.bzca
    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzff)) {
            return false;
        }
        bzff bzffVar = (bzff) obj;
        return fdbq.f(this.a, bzffVar.a) && fdbq.f(this.b, bzffVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "BatchInsertionResult(insertionResult=" + this.a + ", localData=" + this.b + ")";
    }
}
