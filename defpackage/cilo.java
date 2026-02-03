package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilo implements Comparable<cilo> {
    public static final Comparator a = new Comparator() { // from class: cilm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fcxl.a(((eknz) obj).f(), ((eknz) obj2).f());
        }
    };
    public final int b;
    public final int c;
    public final eknz d;
    public final anue e;

    public cilo(int i, int i2, anue anueVar) {
        anueVar.getClass();
        this.b = i;
        this.c = i2;
        this.e = anueVar;
        this.d = ciln.a(i, i2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cilo ciloVar) {
        cilo ciloVar2 = ciloVar;
        ciloVar2.getClass();
        return a.compare(this.d, ciloVar2.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cilo)) {
            return false;
        }
        cilo ciloVar = (cilo) obj;
        return this.b == ciloVar.b && this.c == ciloVar.c && fdbq.f(this.e, ciloVar.e);
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "DraftMention(start=" + this.b + ", end=" + this.c + ", recipient=" + this.e + ")";
    }
}
