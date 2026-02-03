package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtq implements djtg {
    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final djse d;
    public final dknh e;
    public final djtf f;
    public final String g;
    public final String h;
    public final boolean i;
    public final dker j;
    public final String k;
    public final boolean l;
    public final Integer m;
    public final Integer n;
    public final dlhy o;
    public final fdae p;
    public final fdae q;
    public final int r;

    public djtq(Uri uri, Uri uri2, Uri uri3, djse djseVar, dknh dknhVar, djtf djtfVar, String str, String str2, boolean z, dker dkerVar, String str3, boolean z2, Integer num, Integer num2, dlhy dlhyVar, int i, fdae fdaeVar, fdae fdaeVar2) {
        djtfVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.c = uri3;
        this.d = djseVar;
        this.e = dknhVar;
        this.f = djtfVar;
        this.g = str;
        this.h = str2;
        this.i = z;
        this.j = dkerVar;
        this.k = str3;
        this.l = z2;
        this.m = num;
        this.n = num2;
        this.o = dlhyVar;
        this.r = i;
        this.p = fdaeVar;
        this.q = fdaeVar2;
    }

    public static /* synthetic */ djtq r(djtq djtqVar, dknh dknhVar, djtf djtfVar, String str, String str2, boolean z, dlhy dlhyVar, fdae fdaeVar, fdae fdaeVar2, int i) {
        Uri uri = (i & 1) != 0 ? djtqVar.a : null;
        Uri uri2 = (i & 2) != 0 ? djtqVar.b : null;
        Uri uri3 = (i & 4) != 0 ? djtqVar.c : null;
        djse djseVar = (i & 8) != 0 ? djtqVar.d : null;
        dknh dknhVar2 = (i & 16) != 0 ? djtqVar.e : dknhVar;
        djtf djtfVar2 = (i & 32) != 0 ? djtqVar.f : djtfVar;
        String str3 = (i & 64) != 0 ? djtqVar.g : str;
        String str4 = (i & 128) != 0 ? djtqVar.h : str2;
        boolean z2 = (i & 256) != 0 ? djtqVar.i : z;
        dker dkerVar = (i & 512) != 0 ? djtqVar.j : null;
        String str5 = (i & 1024) != 0 ? djtqVar.k : null;
        boolean z3 = (i & 2048) != 0 ? djtqVar.l : false;
        Integer num = (i & 4096) != 0 ? djtqVar.m : null;
        Integer num2 = (i & 8192) != 0 ? djtqVar.n : null;
        dlhy dlhyVar2 = (i & 16384) != 0 ? djtqVar.o : dlhyVar;
        int i2 = (32768 & i) != 0 ? djtqVar.r : 0;
        fdae fdaeVar3 = (65536 & i) != 0 ? djtqVar.p : fdaeVar;
        fdae fdaeVar4 = (i & 131072) != 0 ? djtqVar.q : fdaeVar2;
        djtfVar2.getClass();
        str3.getClass();
        str4.getClass();
        dkerVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        fdaeVar3.getClass();
        fdaeVar4.getClass();
        return new djtq(uri, uri2, uri3, djseVar, dknhVar2, djtfVar2, str3, str4, z2, dkerVar, str5, z3, num, num2, dlhyVar2, i2, fdaeVar3, fdaeVar4);
    }

    @Override // defpackage.dkgq
    public final String a() {
        return this.k;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.p;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        return this.q;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.l;
    }

    @Override // defpackage.djtg
    public final Uri e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djtq)) {
            return false;
        }
        djtq djtqVar = (djtq) obj;
        return fdbq.f(this.a, djtqVar.a) && fdbq.f(this.b, djtqVar.b) && fdbq.f(this.c, djtqVar.c) && fdbq.f(this.d, djtqVar.d) && fdbq.f(this.e, djtqVar.e) && this.f == djtqVar.f && fdbq.f(this.g, djtqVar.g) && fdbq.f(this.h, djtqVar.h) && this.i == djtqVar.i && fdbq.f(this.j, djtqVar.j) && fdbq.f(this.k, djtqVar.k) && this.l == djtqVar.l && fdbq.f(this.m, djtqVar.m) && fdbq.f(this.n, djtqVar.n) && fdbq.f(this.o, djtqVar.o) && this.r == djtqVar.r && fdbq.f(this.p, djtqVar.p) && fdbq.f(this.q, djtqVar.q);
    }

    @Override // defpackage.dkez
    public final dker f() {
        return this.j;
    }

    @Override // defpackage.dkez
    public final dlhy g() {
        return this.o;
    }

    @Override // defpackage.dkez
    public final Integer h() {
        return this.n;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.b;
        int iHashCode2 = uri2 == null ? 0 : uri2.hashCode();
        int i = iHashCode * 31;
        Uri uri3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        djse djseVar = this.d;
        int iHashCode4 = (iHashCode3 + (djseVar == null ? 0 : djseVar.hashCode())) * 31;
        dknh dknhVar = this.e;
        int iHashCode5 = (((((((((((iHashCode4 + (dknhVar == null ? 0 : dknhVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + djtp.a(this.i)) * 31) + this.j.hashCode()) * 31;
        String str = this.k;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + djtp.a(this.l)) * 31;
        Integer num = this.m;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.n;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        dlhy dlhyVar = this.o;
        return ((((((iHashCode8 + (dlhyVar != null ? dlhyVar.hashCode() : 0)) * 31) + this.r) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
    }

    @Override // defpackage.dkez
    public final Integer i() {
        return this.m;
    }

    @Override // defpackage.dkez
    public final int j() {
        return this.r;
    }

    @Override // defpackage.djtg
    public final Uri k() {
        return this.b;
    }

    @Override // defpackage.djtg
    public final Uri l() {
        return this.a;
    }

    @Override // defpackage.djtg
    public final djtf m() {
        return this.f;
    }

    @Override // defpackage.djtg
    public final dknh n() {
        return this.e;
    }

    @Override // defpackage.djtg
    public final String o() {
        return this.h;
    }

    @Override // defpackage.djtg
    public final String p() {
        return this.g;
    }

    @Override // defpackage.djtg
    public final boolean q() {
        return this.i;
    }

    public final String toString() {
        return "ImageBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", fallbackUri=" + this.c + ", requestListener=" + this.d + ", progressBarOverlayUiData=" + this.e + ", state=" + this.f + ", attachmentBubbleTitle=" + this.g + ", attachmentBubbleSubtitle=" + this.h + ", needBlur=" + this.i + ", flags=" + this.j + ", contentDescription=" + this.k + ", isHighlighted=" + this.l + ", width=" + this.m + ", height=" + this.n + ", caption=" + this.o + ", displayMode=" + ((Object) dkey.a(this.r)) + ", onClick=" + this.p + ", onLayout=" + this.q + ")";
    }
}
