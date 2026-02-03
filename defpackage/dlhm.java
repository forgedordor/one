package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhm implements dijt, dlhy {
    public final String a;
    public final List b;
    public final dlhu c;
    public final String d;
    public final boolean e;
    public final fdae f;
    public final boolean g;
    public final List h;
    public final dlhx i;
    public final fdae j;
    public final boolean k;
    public final evxl l;
    public final boolean m;
    public final dkzl n;
    public final dkpc o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final fdae v;

    public dlhm(String str, List list, dlhu dlhuVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, fdae fdaeVar, fdae fdaeVar2, boolean z5, List list2, dlhx dlhxVar, fdae fdaeVar3, boolean z6, evxl evxlVar, boolean z7, dkzl dkzlVar, dkpc dkpcVar, boolean z8, boolean z9, boolean z10) {
        str.getClass();
        list.getClass();
        fdaeVar.getClass();
        fdaeVar2.getClass();
        dlhxVar.getClass();
        fdaeVar3.getClass();
        this.a = str;
        this.b = list;
        this.c = dlhuVar;
        this.s = z;
        this.t = z2;
        this.d = str2;
        this.e = z3;
        this.u = z4;
        this.v = fdaeVar;
        this.f = fdaeVar2;
        this.g = z5;
        this.h = list2;
        this.i = dlhxVar;
        this.j = fdaeVar3;
        this.k = z6;
        this.l = evxlVar;
        this.m = z7;
        this.n = dkzlVar;
        this.o = dkpcVar;
        this.p = z8;
        this.q = z9;
        this.r = z10;
    }

    public static /* synthetic */ dlhm l(dlhm dlhmVar, String str, List list, dlhu dlhuVar, fdae fdaeVar, evxl evxlVar, boolean z, boolean z2, int i) {
        String str2 = (i & 1) != 0 ? dlhmVar.a : str;
        List list2 = (i & 2) != 0 ? dlhmVar.b : list;
        dlhu dlhuVar2 = (i & 4) != 0 ? dlhmVar.c : dlhuVar;
        boolean z3 = (i & 8) != 0 ? dlhmVar.s : false;
        boolean z4 = (i & 16) != 0 ? dlhmVar.t : false;
        String str3 = (i & 32) != 0 ? dlhmVar.d : null;
        boolean z5 = (i & 64) != 0 ? dlhmVar.e : false;
        boolean z6 = (i & 128) != 0 ? dlhmVar.u : false;
        fdae fdaeVar2 = (i & 256) != 0 ? dlhmVar.v : null;
        fdae fdaeVar3 = (i & 512) != 0 ? dlhmVar.f : fdaeVar;
        boolean z7 = (i & 1024) != 0 ? dlhmVar.g : false;
        List list3 = (i & 2048) != 0 ? dlhmVar.h : null;
        dlhx dlhxVar = (i & 4096) != 0 ? dlhmVar.i : null;
        fdae fdaeVar4 = (i & 8192) != 0 ? dlhmVar.j : null;
        boolean z8 = (i & 16384) != 0 ? dlhmVar.k : false;
        evxl evxlVar2 = (32768 & i) != 0 ? dlhmVar.l : evxlVar;
        boolean z9 = (65536 & i) != 0 ? dlhmVar.m : z;
        dkzl dkzlVar = (131072 & i) != 0 ? dlhmVar.n : null;
        dkpc dkpcVar = (262144 & i) != 0 ? dlhmVar.o : null;
        boolean z10 = (524288 & i) != 0 ? dlhmVar.p : false;
        boolean z11 = (i & 1048576) != 0 ? dlhmVar.q : z2;
        boolean z12 = dlhmVar.r;
        str2.getClass();
        list2.getClass();
        fdaeVar2.getClass();
        fdaeVar3.getClass();
        dlhxVar.getClass();
        fdaeVar4.getClass();
        return new dlhm(str2, list2, dlhuVar2, z3, z4, str3, z5, z6, fdaeVar2, fdaeVar3, z7, list3, dlhxVar, fdaeVar4, z8, evxlVar2, z9, dkzlVar, dkpcVar, z10, z11, z12);
    }

    @Override // defpackage.dijt
    public final String a() {
        return this.d;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.v;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dlhy, defpackage.dkgq
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dijt
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhm)) {
            return false;
        }
        dlhm dlhmVar = (dlhm) obj;
        return fdbq.f(this.a, dlhmVar.a) && fdbq.f(this.b, dlhmVar.b) && fdbq.f(this.c, dlhmVar.c) && this.s == dlhmVar.s && this.t == dlhmVar.t && fdbq.f(this.d, dlhmVar.d) && this.e == dlhmVar.e && this.u == dlhmVar.u && fdbq.f(this.v, dlhmVar.v) && fdbq.f(this.f, dlhmVar.f) && this.g == dlhmVar.g && fdbq.f(this.h, dlhmVar.h) && fdbq.f(this.i, dlhmVar.i) && fdbq.f(this.j, dlhmVar.j) && this.k == dlhmVar.k && fdbq.f(this.l, dlhmVar.l) && this.m == dlhmVar.m && fdbq.f(this.n, dlhmVar.n) && fdbq.f(this.o, dlhmVar.o) && this.p == dlhmVar.p && this.q == dlhmVar.q && this.r == dlhmVar.r;
    }

    @Override // defpackage.dijt
    public final List f() {
        return this.b;
    }

    @Override // defpackage.dlhy
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.dlhy
    public final boolean h() {
        return this.u;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dlhu dlhuVar = this.c;
        int iHashCode2 = ((((((iHashCode * 31) + (dlhuVar == null ? 0 : dlhuVar.hashCode())) * 31) + dlhi.a(this.s)) * 31) + dlhi.a(this.t)) * 31;
        String str = this.d;
        int iHashCode3 = (((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + dlhi.a(this.e)) * 31) + dlhi.a(this.u)) * 31) + this.v.hashCode()) * 31) + this.f.hashCode()) * 31) + dlhi.a(this.g)) * 31;
        List list = this.h;
        int iHashCode4 = (((((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + dlhi.a(this.k)) * 31;
        evxl evxlVar = this.l;
        int iHashCode5 = (((iHashCode4 + (evxlVar == null ? 0 : evxlVar.hashCode())) * 31) + dlhi.a(this.m)) * 31;
        dkzl dkzlVar = this.n;
        int iHashCode6 = (iHashCode5 + (dkzlVar == null ? 0 : dkzlVar.hashCode())) * 31;
        dkpc dkpcVar = this.o;
        return ((((((iHashCode6 + (dkpcVar != null ? dkpcVar.hashCode() : 0)) * 31) + dlhi.a(this.p)) * 31) + dlhi.a(this.q)) * 31) + dlhi.a(this.r);
    }

    @Override // defpackage.dlhy
    public final boolean i() {
        return this.k;
    }

    @Override // defpackage.dlhy
    public final boolean j() {
        return this.s;
    }

    @Override // defpackage.dlhy
    public final boolean k() {
        return this.p;
    }

    @Override // defpackage.dlhy
    public final boolean s() {
        return this.t;
    }

    public final String toString() {
        return "TextBubbleUiData(text=" + this.a + ", annotations=" + this.b + ", preview=" + this.c + ", isRichType=" + this.s + ", useLargeFontSize=" + this.t + ", contentDescription=" + this.d + ", isHighlighted=" + this.e + ", isOutgoing=" + this.u + ", onClick=" + this.v + ", onLayout=" + this.f + ", isEmojiOnly=" + this.g + ", emojiAnimationFiles=" + this.h + ", flags=" + this.i + ", onAnimatedEmojiShown=" + this.j + ", isReply=" + this.k + ", effect=" + this.l + ", isCaption=" + this.m + ", messageReplySnippetUiData=" + this.n + ", statusUiData=" + this.o + ", isSensitiveContent=" + this.p + ", shouldDisplayBackground=" + this.q + ", hasSuggestionShortcut=" + this.r + ")";
    }

    public /* synthetic */ dlhm(String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, fdae fdaeVar, boolean z5, List list2, dlhx dlhxVar, fdae fdaeVar2, boolean z6, boolean z7, dkzl dkzlVar, dkpc dkpcVar, boolean z8, boolean z9, boolean z10, int i) {
        this(str, (i & 2) != 0 ? fcvo.a : list, null, ((i & 8) == 0) & z, ((i & 16) == 0) & z2, str2, ((i & 64) == 0) & z3, ((i & 128) == 0) & z4, (i & 256) != 0 ? new fdae() { // from class: dlhj
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : null, (i & 512) != 0 ? new fdae() { // from class: dlhk
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar, ((i & 1024) == 0) & z5, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? new dlhx(false, false, 63) : dlhxVar, (i & 8192) != 0 ? new fdae() { // from class: dlhl
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2, ((i & 16384) == 0) & z6, null, ((65536 & i) == 0) & z7, (131072 & i) != 0 ? null : dkzlVar, (262144 & i) != 0 ? null : dkpcVar, ((524288 & i) == 0) & z8, (!((1048576 & i) == 0)) | z9, ((i & 2097152) == 0) & z10);
    }
}
