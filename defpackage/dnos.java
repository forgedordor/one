package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnos {
    public final int a;
    public final int b;

    public dnos(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnos)) {
            return false;
        }
        dnos dnosVar = (dnos) obj;
        return this.a == dnosVar.a && this.b == dnosVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "EmojiCategoryResources(title=" + this.a + ", icon=" + this.b + ")";
    }
}
