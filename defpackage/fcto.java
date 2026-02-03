package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcto implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public fcto(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcto)) {
            return false;
        }
        fcto fctoVar = (fcto) obj;
        return fdbq.f(this.a, fctoVar.a) && fdbq.f(this.b, fctoVar.b) && fdbq.f(this.c, fctoVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int iHashCode2 = obj2 == null ? 0 : obj2.hashCode();
        int i = iHashCode * 31;
        Object obj3 = this.c;
        return ((i + iHashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }
}
