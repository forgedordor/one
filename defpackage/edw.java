package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edw extends edx {
    public static final /* synthetic */ int a = 0;
    private final icc c;

    public edw(icc iccVar) {
        this.c = iccVar;
    }

    @Override // defpackage.edx
    public final int a(int i, kji kjiVar) {
        return this.c.a(0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edw) && fdbq.f(this.c, ((edw) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.c + ')';
    }
}
