package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdl implements kdm {
    private final int a;
    private final int b;

    public kdl(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            kfq.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = kdqVar.a;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = kdn.a(kdqVar.a((i5 - i4) + (-1)), kdqVar.a(kdqVar.a - i4)) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = this.b;
        int iC = 0;
        while (true) {
            if (i >= i6) {
                break;
            }
            int i7 = iC + 1;
            if (kdqVar.b + i7 >= kdqVar.c()) {
                iC = kdqVar.c() - kdqVar.b;
                break;
            } else {
                iC = kdn.a(kdqVar.a((kdqVar.b + i7) + (-1)), kdqVar.a(kdqVar.b + i7)) ? iC + 2 : i7;
                i++;
            }
        }
        int i8 = kdqVar.b;
        kdqVar.g(i8, iC + i8);
        int i9 = kdqVar.a;
        kdqVar.g(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdl)) {
            return false;
        }
        kdl kdlVar = (kdl) obj;
        return this.a == kdlVar.a && this.b == kdlVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
