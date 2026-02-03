package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrz {
    public final ajlt a;
    public final amvr b;
    public final boolean c;
    public final ynj d;
    public final boolean e;
    public final bvdk f;
    public final dkgv g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public yrz(ajlt ajltVar, amvr amvrVar, boolean z, ynj ynjVar, boolean z2, bvdk bvdkVar, dkgv dkgvVar, String str, boolean z3, boolean z4, boolean z5, boolean z6) {
        ajltVar.getClass();
        dkgvVar.getClass();
        this.a = ajltVar;
        this.b = amvrVar;
        this.c = z;
        this.d = ynjVar;
        this.e = z2;
        this.f = bvdkVar;
        this.g = dkgvVar;
        this.h = str;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrz)) {
            return false;
        }
        yrz yrzVar = (yrz) obj;
        return fdbq.f(this.a, yrzVar.a) && fdbq.f(this.b, yrzVar.b) && this.c == yrzVar.c && fdbq.f(this.d, yrzVar.d) && this.e == yrzVar.e && this.f == yrzVar.f && this.g == yrzVar.g && fdbq.f(this.h, yrzVar.h) && this.i == yrzVar.i && this.j == yrzVar.j && this.k == yrzVar.k && this.l == yrzVar.l;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ynj ynjVar = this.d;
        return (((((((((((((((((((iHashCode * 31) + yry.a(this.c)) * 31) + (ynjVar == null ? 0 : ynjVar.hashCode())) * 31) + yry.a(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + yry.a(this.i)) * 31) + yry.a(this.j)) * 31) + yry.a(this.k)) * 31) + yry.a(this.l);
    }

    public final String toString() {
        return "MessageBubbleContentArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", searchData=" + this.d + ", isGroupConversation=" + this.e + ", archiveStatus=" + this.f + ", horizontalAlignment=" + this.g + ", contentDescription=" + this.h + ", isSpatulaSettingsEnabled=" + this.i + ", shouldShowDeliveryStatus=" + this.j + ", hasSuggestionShortcut=" + this.k + ", enableSwipeToShowTimestamps=" + this.l + ")";
    }

    public /* synthetic */ yrz(ajlt ajltVar, amvr amvrVar, boolean z, ynj ynjVar, boolean z2, bvdk bvdkVar, dkgv dkgvVar, String str, boolean z3) {
        this(ajltVar, amvrVar, z, ynjVar, z2, bvdkVar, dkgvVar, str, false, true, false, z3);
    }
}
