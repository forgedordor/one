package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes6.dex */
public final class fcts implements Comparable<fcts> {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(fcts fctsVar) {
        return fdbq.b(Long.MIN_VALUE ^ this.a, fctsVar.a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fcts) && this.a == ((fcts) obj).a;
    }

    public final int hashCode() {
        return fctr.a(this.a);
    }

    public final String toString() {
        return fctz.b(this.a, 10);
    }
}
