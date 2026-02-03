package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yko {
    public final ymx a;
    public final boolean b;
    public final bvdk c;
    public final zqk d;
    public final ynj e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final fdap l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    public /* synthetic */ yko(ymx ymxVar, boolean z, bvdk bvdkVar, zqk zqkVar, ynj ynjVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, fdap fdapVar, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        bvdk bvdkVar2 = (i & 4) != 0 ? bvdk.UNARCHIVED : bvdkVar;
        zqk zqkVar2 = (i & 8) != 0 ? new zqk(null) : zqkVar;
        ynj ynjVar2 = (i & 16) != 0 ? null : ynjVar;
        boolean z14 = ((i & 32) == 0) & z2;
        boolean z15 = (!((i & 64) == 0)) | z3;
        boolean z16 = ((i & 128) == 0) & z4;
        boolean z17 = ((i & 256) == 0) & z5;
        boolean z18 = (i & 512) != 0;
        boolean z19 = ((i & 1024) == 0) & z6;
        fdap fdapVar2 = (i & 2048) == 0 ? fdapVar : null;
        boolean z20 = ((i & 4096) == 0) & z7;
        boolean z21 = ((i & 8192) == 0) & z8;
        boolean z22 = ((i & 16384) == 0) & z9;
        boolean z23 = (i & 32768) != 0;
        boolean z24 = (i & 65536) != 0;
        boolean z25 = ((i & 131072) == 0) & z10;
        boolean z26 = ((i & 262144) == 0) & z11;
        boolean z27 = (i & 524288) != 0;
        boolean z28 = (i & 1048576) == 0;
        ymxVar.getClass();
        bvdkVar2.getClass();
        zqkVar2.getClass();
        this.a = ymxVar;
        this.b = z;
        this.c = bvdkVar2;
        this.d = zqkVar2;
        this.e = ynjVar2;
        this.f = z14;
        this.g = z15;
        this.h = z16;
        this.i = z17;
        this.j = z18;
        this.k = z19;
        this.l = fdapVar2;
        this.m = z20;
        this.n = z21;
        this.o = z22;
        this.p = z23;
        this.q = z24;
        this.r = z25;
        this.s = z26;
        this.t = z27;
        this.u = z28 & z12;
        this.v = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yko)) {
            return false;
        }
        yko ykoVar = (yko) obj;
        return fdbq.f(this.a, ykoVar.a) && this.b == ykoVar.b && this.c == ykoVar.c && fdbq.f(this.d, ykoVar.d) && fdbq.f(this.e, ykoVar.e) && this.f == ykoVar.f && this.g == ykoVar.g && this.h == ykoVar.h && this.i == ykoVar.i && this.j == ykoVar.j && this.k == ykoVar.k && fdbq.f(this.l, ykoVar.l) && this.m == ykoVar.m && this.n == ykoVar.n && this.o == ykoVar.o && this.p == ykoVar.p && this.q == ykoVar.q && this.r == ykoVar.r && this.s == ykoVar.s && this.t == ykoVar.t && this.u == ykoVar.u && this.v == ykoVar.v;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + ykn.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        ynj ynjVar = this.e;
        int iHashCode2 = ((((((((((((((iHashCode * 31) + (ynjVar == null ? 0 : ynjVar.hashCode())) * 31) + ykn.a(this.f)) * 31) + ykn.a(this.g)) * 31) + ykn.a(this.h)) * 31) + ykn.a(this.i)) * 31) + ykn.a(this.j)) * 31) + ykn.a(this.k)) * 31;
        fdap fdapVar = this.l;
        return ((((((((((((((((((((iHashCode2 + (fdapVar != null ? fdapVar.hashCode() : 0)) * 31) + ykn.a(this.m)) * 31) + ykn.a(this.n)) * 31) + ykn.a(this.o)) * 31) + ykn.a(this.p)) * 31) + ykn.a(this.q)) * 31) + ykn.a(this.r)) * 31) + ykn.a(this.s)) * 31) + ykn.a(this.t)) * 31) + ykn.a(this.u)) * 31) + ykn.a(this.v);
    }

    public final String toString() {
        return "MessageBubbleArgs(messageWithMetadata=" + this.a + ", isGroupConversation=" + this.b + ", archiveStats=" + this.c + ", selectionData=" + this.d + ", searchData=" + this.e + ", canSwipeToReply=" + this.f + ", canLongPress=" + this.g + ", shouldShowSimName=" + this.h + ", shouldShowE2eeStatusChangeNotice=" + this.i + ", shouldShowSeparators=" + this.j + ", hasLastReadMarker=" + this.k + ", onReplySnippetClick=" + this.l + ", shouldCreateLazyUiData=" + this.m + ", isPenpalConversation=" + this.n + ", isScreenEffectTargetedMessageBubble=" + this.o + ", shouldShowMetatext=" + this.p + ", isInteractive=" + this.q + ", isSpatulaSettingsEnabled=" + this.r + ", isCenterAligned=" + this.s + ", shouldShowDeliveryStatus=" + this.t + ", hasSuggestionShortcut=" + this.u + ", enableSwipeToShowTimestamps=" + this.v + ")";
    }
}
