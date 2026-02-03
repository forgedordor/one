package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxf extends oxh {
    public final int a;
    public final int b;

    public oxf(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.oxh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxf)) {
            return false;
        }
        oxf oxfVar = (oxf) obj;
        return this.a == oxfVar.a && this.b == oxfVar.b && this.c == oxfVar.c && this.d == oxfVar.d && this.e == oxfVar.e && this.f == oxfVar.f;
    }

    @Override // defpackage.oxh
    public final int hashCode() {
        return super.hashCode() + this.a + this.b;
    }

    public final String toString() {
        return fdgn.c("ViewportHint.Access(\n            |    pageOffset=" + this.a + ",\n            |    indexInPage=" + this.b + ",\n            |    presentedItemsBefore=" + this.c + ",\n            |    presentedItemsAfter=" + this.d + ",\n            |    originalPageOffsetFirst=" + this.e + ",\n            |    originalPageOffsetLast=" + this.f + ",\n            |)", "|");
    }
}
