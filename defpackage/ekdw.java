package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekdw extends ekdx {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekdw(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // defpackage.ekdx
    public final void c(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    @Override // defpackage.ekdx
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    @Override // defpackage.ekdx
    public final boolean e(Comparable comparable) {
        return eknz.b(this.b, comparable) <= 0;
    }

    @Override // defpackage.ekdx
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "\\" + this.b.toString() + "/";
    }
}
