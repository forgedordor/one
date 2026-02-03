package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taa {
    public final int a;
    public final int b;
    public final int c;

    public taa() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taa)) {
            return false;
        }
        taa taaVar = (taa) obj;
        return this.a == taaVar.a && this.b == taaVar.b && this.c == taaVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BugleDatabaseAssetInfo(messageCount=" + this.a + ", conversationCount=" + this.b + ", attachmentCount=" + this.c + ")";
    }

    public taa(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public /* synthetic */ taa(byte[] bArr) {
        this(0, 0, 0);
    }
}
