package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edu extends edx {
    public static final /* synthetic */ int a = 0;
    private final ibx c;

    public edu(ibx ibxVar) {
        this.c = ibxVar;
    }

    @Override // defpackage.edx
    public final int a(int i, kji kjiVar) {
        return this.c.a(0, i, kjiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edu) && fdbq.f(this.c, ((edu) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.c + ')';
    }
}
