package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ahwk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahwk)) {
            return false;
        }
        ahwk ahwkVar = (ahwk) obj;
        return this.a == ahwkVar.a && this.b == ahwkVar.b && this.c == ahwkVar.c && this.d == ahwkVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "DatabaseCounts(participantCount=" + this.a + ", conversationCount=" + this.b + ", messageCount=" + this.c + ", partCount=" + this.d + ")";
    }
}
