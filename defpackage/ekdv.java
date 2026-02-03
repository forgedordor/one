package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekdv extends ekdx {
    public static final ekdv a = new ekdv();
    private static final long serialVersionUID = 0;

    private ekdv() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ekdx
    /* renamed from: a */
    public final int compareTo(ekdx ekdxVar) {
        return ekdxVar == this ? 0 : -1;
    }

    @Override // defpackage.ekdx
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.ekdx
    public final void c(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.ekdx, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((ekdx) obj);
    }

    @Override // defpackage.ekdx
    public final void d(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.ekdx
    public final boolean e(Comparable comparable) {
        return true;
    }

    @Override // defpackage.ekdx
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
