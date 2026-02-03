package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfd implements ykp {
    public final amwf a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ynj m;
    public final ajmb n;
    public final fdae o;
    public final fdae p;
    public final boolean q;
    public final bvdk r;
    public final MessageId s;
    public final dkpc t;
    public final dkzl u;
    public final boolean v;
    private final boolean w;
    private final String x;

    public /* synthetic */ zfd(amwf amwfVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ynj ynjVar, ajmb ajmbVar, fdae fdaeVar, fdae fdaeVar2, boolean z12, bvdk bvdkVar, MessageId messageId, dkpc dkpcVar, dkzl dkzlVar, boolean z13, int i) {
        fdae fdaeVar3 = (32768 & i) != 0 ? new fdae() { // from class: zfb
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        fdae fdaeVar4 = (65536 & i) != 0 ? new fdae() { // from class: zfc
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2;
        boolean z14 = ((131072 & i) == 0) & z12;
        bvdk bvdkVar2 = (262144 & i) != 0 ? bvdk.UNARCHIVED : bvdkVar;
        int i2 = i & 8192;
        boolean z15 = (i & 32) == 0;
        ynj ynjVar2 = i2 != 0 ? null : ynjVar;
        boolean z16 = z15 & z4;
        dkpc dkpcVar2 = (1048576 & i) != 0 ? null : dkpcVar;
        String str2 = (2097152 & i) != 0 ? "" : null;
        dkzl dkzlVar2 = (4194304 & i) == 0 ? dkzlVar : null;
        boolean z17 = (i & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) == 0;
        fdaeVar3.getClass();
        fdaeVar4.getClass();
        bvdkVar2.getClass();
        str2.getClass();
        this.a = amwfVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.w = z16;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = ynjVar2;
        this.n = ajmbVar;
        this.o = fdaeVar3;
        this.p = fdaeVar4;
        this.q = z14;
        this.r = bvdkVar2;
        this.s = messageId;
        this.t = dkpcVar2;
        this.x = str2;
        this.u = dkzlVar2;
        this.v = z17 & z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfd)) {
            return false;
        }
        zfd zfdVar = (zfd) obj;
        return fdbq.f(this.a, zfdVar.a) && this.b == zfdVar.b && this.c == zfdVar.c && fdbq.f(this.d, zfdVar.d) && this.e == zfdVar.e && this.w == zfdVar.w && this.f == zfdVar.f && this.g == zfdVar.g && this.h == zfdVar.h && this.i == zfdVar.i && this.j == zfdVar.j && this.k == zfdVar.k && this.l == zfdVar.l && fdbq.f(this.m, zfdVar.m) && fdbq.f(this.n, zfdVar.n) && fdbq.f(this.o, zfdVar.o) && fdbq.f(this.p, zfdVar.p) && this.q == zfdVar.q && this.r == zfdVar.r && fdbq.f(this.s, zfdVar.s) && fdbq.f(this.t, zfdVar.t) && fdbq.f(this.x, zfdVar.x) && fdbq.f(this.u, zfdVar.u) && this.v == zfdVar.v;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + zfa.a(this.b)) * 31) + zfa.a(this.c)) * 31) + this.d.hashCode();
        ynj ynjVar = this.m;
        int iHashCode2 = ynjVar == null ? 0 : ynjVar.hashCode();
        boolean z = this.e;
        boolean z2 = this.w;
        int iA = ((iHashCode * 31) + zfa.a(z)) * 31;
        boolean z3 = this.f;
        int iA2 = (iA + zfa.a(z2)) * 31;
        boolean z4 = this.g;
        int iA3 = (iA2 + zfa.a(z3)) * 31;
        boolean z5 = this.h;
        int iA4 = (iA3 + zfa.a(z4)) * 31;
        boolean z6 = this.i;
        int iA5 = (iA4 + zfa.a(z5)) * 31;
        boolean z7 = this.j;
        int iA6 = (((((((((iA5 + zfa.a(z6)) * 31) + zfa.a(z7)) * 31) + zfa.a(this.k)) * 31) + zfa.a(this.l)) * 31) + iHashCode2) * 31;
        ajmb ajmbVar = this.n;
        int iHashCode3 = (((((((((((iA6 + (ajmbVar == null ? 0 : ajmbVar.hashCode())) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + zfa.a(this.q)) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31;
        dkpc dkpcVar = this.t;
        int iHashCode4 = (((iHashCode3 + (dkpcVar == null ? 0 : dkpcVar.hashCode())) * 31) + this.x.hashCode()) * 31;
        dkzl dkzlVar = this.u;
        return ((iHashCode4 + (dkzlVar != null ? dkzlVar.hashCode() : 0)) * 31) + zfa.a(this.v);
    }

    public final String toString() {
        return "TextBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", isOutgoing=" + this.c + ", contentDescription=" + this.d + ", enableSwipeToShowTimestamps=" + this.e + ", isGroupConversation=" + this.w + ", isRichType=" + this.f + ", isScheduled=" + this.g + ", isContact=" + this.h + ", isSpamRecipient=" + this.i + ", isUserMarkedNotSpamRecipient=" + this.j + ", isBusinessRecipient=" + this.k + ", isBusinessRecipientVerified=" + this.l + ", searchData=" + this.m + ", preview=" + this.n + ", onTapToLoadLinkPreview=" + this.o + ", onAnimatedEmojiShown=" + this.p + ", isReply=" + this.q + ", archiveStatus=" + this.r + ", messageId=" + this.s + ", statusUiData=" + this.t + ", readReceiptsTestTag=" + this.x + ", messageReplySnippetUiData=" + this.u + ", hasSuggestionShortcut=" + this.v + ")";
    }
}
