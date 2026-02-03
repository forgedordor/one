package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdk implements kdm {
    private final int a;
    private final int b;

    public kdk(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            kfq.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        int i = kdqVar.b;
        int i2 = this.b;
        int iC = i + i2;
        if (((i ^ iC) & (i2 ^ iC)) < 0) {
            iC = kdqVar.c();
        }
        kdqVar.g(kdqVar.b, Math.min(iC, kdqVar.c()));
        int i3 = kdqVar.a;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i3 ^ i5) & (i4 ^ i3)) < 0) {
            i5 = 0;
        }
        kdqVar.g(Math.max(0, i5), kdqVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdk)) {
            return false;
        }
        kdk kdkVar = (kdk) obj;
        return this.a == kdkVar.a && this.b == kdkVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
