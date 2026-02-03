package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zij implements zgr {
    public final Uri a;
    public final Uri b;
    public final long c;
    public final dknh d;
    public final zgq e;
    public final String f;
    public final String g;
    public final djse h;
    public final dker i;
    public final String j;
    public final boolean k;
    public final Integer l;
    public final Integer m;
    public final fdae n;
    public final fdae o;
    public final int p;
    private final boolean q;
    private final dlhm r;
    private final boolean s;

    public zij(Uri uri, Uri uri2, long j, dknh dknhVar, zgq zgqVar, String str, String str2, djse djseVar, dker dkerVar, String str3, boolean z, Integer num, Integer num2, int i, fdae fdaeVar, fdae fdaeVar2) {
        zgqVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.q = false;
        this.c = j;
        this.d = dknhVar;
        this.e = zgqVar;
        this.f = str;
        this.g = str2;
        this.h = djseVar;
        this.i = dkerVar;
        this.j = str3;
        this.k = z;
        this.l = num;
        this.m = num2;
        this.r = null;
        this.p = i;
        this.n = fdaeVar;
        this.o = fdaeVar2;
        this.s = false;
    }

    public static /* synthetic */ zij k(zij zijVar, dknh dknhVar, zgq zgqVar, String str, String str2, fdae fdaeVar, fdae fdaeVar2, int i) {
        Uri uri = (i & 1) != 0 ? zijVar.a : null;
        Uri uri2 = (i & 2) != 0 ? zijVar.b : null;
        long j = (i & 8) != 0 ? zijVar.c : 0L;
        dknh dknhVar2 = (i & 16) != 0 ? zijVar.d : dknhVar;
        zgq zgqVar2 = (i & 32) != 0 ? zijVar.e : zgqVar;
        String str3 = (i & 64) != 0 ? zijVar.f : str;
        String str4 = (i & 128) != 0 ? zijVar.g : str2;
        djse djseVar = (i & 256) != 0 ? zijVar.h : null;
        dker dkerVar = (i & 512) != 0 ? zijVar.i : null;
        String str5 = (i & 1024) != 0 ? zijVar.j : null;
        boolean z = (i & 2048) != 0 ? zijVar.k : false;
        Integer num = (i & 4096) != 0 ? zijVar.l : null;
        Integer num2 = (i & 8192) != 0 ? zijVar.m : null;
        int i2 = (32768 & i) != 0 ? zijVar.p : 0;
        fdae fdaeVar3 = (65536 & i) != 0 ? zijVar.n : fdaeVar;
        fdae fdaeVar4 = (i & 131072) != 0 ? zijVar.o : fdaeVar2;
        uri.getClass();
        zgqVar2.getClass();
        str3.getClass();
        str4.getClass();
        dkerVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        fdaeVar3.getClass();
        fdaeVar4.getClass();
        return new zij(uri, uri2, j, dknhVar2, zgqVar2, str3, str4, djseVar, dkerVar, str5, z, num, num2, i2, fdaeVar3, fdaeVar4);
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.n;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.zgr
    public final zgq e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zij)) {
            return false;
        }
        zij zijVar = (zij) obj;
        if (!fdbq.f(this.a, zijVar.a) || !fdbq.f(this.b, zijVar.b)) {
            return false;
        }
        boolean z = zijVar.q;
        if (this.c != zijVar.c || !fdbq.f(this.d, zijVar.d) || this.e != zijVar.e || !fdbq.f(this.f, zijVar.f) || !fdbq.f(this.g, zijVar.g) || !fdbq.f(this.h, zijVar.h) || !fdbq.f(this.i, zijVar.i) || !fdbq.f(this.j, zijVar.j) || this.k != zijVar.k || !fdbq.f(this.l, zijVar.l) || !fdbq.f(this.m, zijVar.m)) {
            return false;
        }
        dlhm dlhmVar = zijVar.r;
        if (!fdbq.f(null, null) || this.p != zijVar.p || !fdbq.f(this.n, zijVar.n) || !fdbq.f(this.o, zijVar.o)) {
            return false;
        }
        boolean z2 = zijVar.s;
        return true;
    }

    @Override // defpackage.dkez
    public final dker f() {
        return this.i;
    }

    @Override // defpackage.dkez
    public final /* bridge */ /* synthetic */ dlhy g() {
        return null;
    }

    @Override // defpackage.dkez
    public final Integer h() {
        return this.m;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + zii.a(false)) * 31;
        long j = this.c;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        dknh dknhVar = this.d;
        int iHashCode3 = (((((((i + (dknhVar == null ? 0 : dknhVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        djse djseVar = this.h;
        int iHashCode4 = (((iHashCode3 + (djseVar == null ? 0 : djseVar.hashCode())) * 31) + this.i.hashCode()) * 31;
        String str = this.j;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + zii.a(this.k)) * 31;
        Integer num = this.l;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.m;
        return ((((((((iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 961) + this.p) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + zii.a(false);
    }

    @Override // defpackage.dkez
    public final Integer i() {
        return this.l;
    }

    @Override // defpackage.dkez
    public final int j() {
        return this.p;
    }

    public final String toString() {
        return "VideoBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", isTransferring=false, durationMillis=" + this.c + ", progressBarOverlayUiData=" + this.d + ", state=" + this.e + ", attachmentBubbleTitle=" + this.f + ", attachmentBubbleSubtitle=" + this.g + ", requestListener=" + this.h + ", flags=" + this.i + ", contentDescription=" + this.j + ", isHighlighted=" + this.k + ", width=" + this.l + ", height=" + this.m + ", caption=null, displayMode=" + ((Object) dkey.a(this.p)) + ", onClick=" + this.n + ", onLayout=" + this.o + ", needBlur=false)";
    }
}
