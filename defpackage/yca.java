package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yca {
    public final ajlj a;
    public final bvdk b;
    public final boolean c;
    public final boolean d;

    public yca(ajlj ajljVar, bvdk bvdkVar, boolean z, boolean z2) {
        this.a = ajljVar;
        this.b = bvdkVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yca)) {
            return false;
        }
        yca ycaVar = (yca) obj;
        return this.a == ycaVar.a && this.b == ycaVar.b && this.c == ycaVar.c && this.d == ycaVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ybz.a(this.c)) * 31) + ybz.a(this.d);
    }

    public final String toString() {
        return "ConversationPropertiesProjection(kind=" + this.a + ", archiveStatus=" + this.b + ", longPressActionsEnabled=" + this.c + ", shouldShowSimName=" + this.d + ")";
    }
}
