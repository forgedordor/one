package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djpa implements dlhy {
    public final List a;
    public final fdae b;
    public final evxl c;
    public final String d;
    public final boolean e;
    public final fdae f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final dkzl j;
    public final dkpc k;
    public final boolean l;
    public final dlhx m;
    private final boolean n;
    private final fdae o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s = false;

    public djpa(List list, fdae fdaeVar, evxl evxlVar, String str, boolean z, boolean z2, fdae fdaeVar2, fdae fdaeVar3, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, dkzl dkzlVar, dkpc dkpcVar, boolean z8, dlhx dlhxVar) {
        this.a = list;
        this.b = fdaeVar;
        this.c = evxlVar;
        this.d = str;
        this.n = z;
        this.e = z2;
        this.o = fdaeVar2;
        this.f = fdaeVar3;
        this.g = str2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.h = z6;
        this.i = z7;
        this.j = dkzlVar;
        this.k = dkpcVar;
        this.l = z8;
        this.m = dlhxVar;
    }

    public static /* synthetic */ djpa l(djpa djpaVar, evxl evxlVar, boolean z, boolean z2, int i) {
        List list = (i & 1) != 0 ? djpaVar.a : null;
        fdae fdaeVar = (i & 2) != 0 ? djpaVar.b : null;
        evxl evxlVar2 = (i & 4) != 0 ? djpaVar.c : evxlVar;
        String str = (i & 8) != 0 ? djpaVar.d : null;
        boolean z3 = (i & 16) != 0 ? djpaVar.n : false;
        boolean z4 = (i & 32) != 0 ? djpaVar.e : false;
        fdae fdaeVar2 = (i & 64) != 0 ? djpaVar.o : null;
        fdae fdaeVar3 = (i & 128) != 0 ? djpaVar.f : null;
        String str2 = (i & 256) != 0 ? djpaVar.g : null;
        boolean z5 = (i & 512) != 0 ? djpaVar.p : false;
        boolean z6 = (i & 1024) != 0 ? djpaVar.q : false;
        boolean z7 = (i & 2048) != 0 ? djpaVar.r : false;
        boolean z8 = (i & 4096) != 0 ? djpaVar.h : false;
        boolean z9 = (i & 8192) != 0 ? djpaVar.i : z;
        dkzl dkzlVar = (i & 16384) != 0 ? djpaVar.j : null;
        dkpc dkpcVar = (32768 & i) != 0 ? djpaVar.k : null;
        if ((65536 & i) != 0) {
            boolean z10 = djpaVar.s;
        }
        boolean z11 = (i & 131072) != 0 ? djpaVar.l : z2;
        dlhx dlhxVar = djpaVar.m;
        fdaeVar.getClass();
        str.getClass();
        fdaeVar2.getClass();
        fdaeVar3.getClass();
        return new djpa(list, fdaeVar, evxlVar2, str, z3, z4, fdaeVar2, fdaeVar3, str2, z5, z6, z7, z8, z9, dkzlVar, dkpcVar, z11, dlhxVar);
    }

    @Override // defpackage.dlhy, defpackage.dkgq
    public final String a() {
        return this.g;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.o;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dlhy, defpackage.dkgq
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dlhy
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djpa)) {
            return false;
        }
        djpa djpaVar = (djpa) obj;
        if (!fdbq.f(this.a, djpaVar.a) || !fdbq.f(this.b, djpaVar.b) || !fdbq.f(this.c, djpaVar.c) || !fdbq.f(this.d, djpaVar.d) || this.n != djpaVar.n || this.e != djpaVar.e || !fdbq.f(this.o, djpaVar.o) || !fdbq.f(this.f, djpaVar.f) || !fdbq.f(this.g, djpaVar.g) || this.p != djpaVar.p || this.q != djpaVar.q || this.r != djpaVar.r || this.h != djpaVar.h || this.i != djpaVar.i || !fdbq.f(this.j, djpaVar.j) || !fdbq.f(this.k, djpaVar.k)) {
            return false;
        }
        boolean z = djpaVar.s;
        return this.l == djpaVar.l && fdbq.f(this.m, djpaVar.m);
    }

    @Override // defpackage.dlhy
    public final boolean g() {
        return this.r;
    }

    @Override // defpackage.dlhy
    public final boolean h() {
        return this.q;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) * 31) + this.b.hashCode();
        evxl evxlVar = this.c;
        int iHashCode2 = ((((((((((((iHashCode * 31) + (evxlVar == null ? 0 : evxlVar.hashCode())) * 31) + this.d.hashCode()) * 31) + djox.a(this.n)) * 31) + djox.a(this.e)) * 31) + this.o.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        int iHashCode3 = (((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + djox.a(this.p)) * 31) + djox.a(this.q)) * 31) + djox.a(this.r)) * 31) + djox.a(this.h)) * 31) + djox.a(this.i)) * 31;
        dkzl dkzlVar = this.j;
        int iHashCode4 = (iHashCode3 + (dkzlVar == null ? 0 : dkzlVar.hashCode())) * 31;
        dkpc dkpcVar = this.k;
        return ((((((iHashCode4 + (dkpcVar == null ? 0 : dkpcVar.hashCode())) * 31) + djox.a(false)) * 31) + djox.a(this.l)) * 31) + this.m.hashCode();
    }

    @Override // defpackage.dlhy
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.dlhy
    public final boolean j() {
        return this.n;
    }

    @Override // defpackage.dlhy
    public final boolean k() {
        return false;
    }

    @Override // defpackage.dlhy
    public final boolean s() {
        return this.p;
    }

    public final String toString() {
        return "EmojiBubbleUiData(emojiAnimationFiles=" + this.a + ", onAnimatedEmojiShown=" + this.b + ", effect=" + this.c + ", text=" + this.d + ", isRichType=" + this.n + ", isHighlighted=" + this.e + ", onClick=" + this.o + ", onLayout=" + this.f + ", contentDescription=" + this.g + ", useLargeFontSize=" + this.p + ", isOutgoing=" + this.q + ", isEmojiOnly=" + this.r + ", isReply=" + this.h + ", isCaption=" + this.i + ", messageReplySnippetUiData=" + this.j + ", statusUiData=" + this.k + ", isSensitiveContent=false, shouldDisplayBackground=" + this.l + ", flags=" + this.m + ")";
    }
}
