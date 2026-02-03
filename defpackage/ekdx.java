package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekdx implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public ekdx(Comparable comparable) {
        this.b = comparable;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ekdx ekdxVar) {
        if (ekdxVar == ekdv.a) {
            return 1;
        }
        if (ekdxVar == ekdt.a) {
            return -1;
        }
        int iB = eknz.b(this.b, ekdxVar.b);
        return iB != 0 ? iB : Boolean.compare(this instanceof ekdu, ekdxVar instanceof ekdu);
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof ekdx) {
            try {
                if (compareTo((ekdx) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
