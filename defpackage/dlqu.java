package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqu implements dkez {
    public final Uri a;
    public final Uri b;
    public final fdae c;
    public final String d;
    public final djse e;
    public final String f;
    private final boolean g;
    private final boolean h;
    private final Integer i;
    private final Integer j;
    private final dlhm k;
    private final fdae l;
    private final fdae m;
    private final dker n;
    private final int o;

    public dlqu(Uri uri, Uri uri2, fdae fdaeVar, String str, djse djseVar, String str2, boolean z, Integer num, Integer num2, int i, fdae fdaeVar2, fdae fdaeVar3, dker dkerVar) {
        fdaeVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.g = false;
        this.c = fdaeVar;
        this.d = str;
        this.e = djseVar;
        this.f = str2;
        this.h = z;
        this.i = num;
        this.j = num2;
        this.k = null;
        this.o = i;
        this.l = fdaeVar2;
        this.m = fdaeVar3;
        this.n = dkerVar;
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.l;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlqu)) {
            return false;
        }
        dlqu dlquVar = (dlqu) obj;
        if (!fdbq.f(this.a, dlquVar.a) || !fdbq.f(this.b, dlquVar.b)) {
            return false;
        }
        boolean z = dlquVar.g;
        if (!fdbq.f(this.c, dlquVar.c) || !fdbq.f(this.d, dlquVar.d) || !fdbq.f(this.e, dlquVar.e) || !fdbq.f(this.f, dlquVar.f) || this.h != dlquVar.h || !fdbq.f(this.i, dlquVar.i) || !fdbq.f(this.j, dlquVar.j)) {
            return false;
        }
        dlhm dlhmVar = dlquVar.k;
        return fdbq.f(null, null) && this.o == dlquVar.o && fdbq.f(this.l, dlquVar.l) && fdbq.f(this.m, dlquVar.m) && fdbq.f(this.n, dlquVar.n);
    }

    @Override // defpackage.dkez
    public final dker f() {
        return this.n;
    }

    @Override // defpackage.dkez
    public final /* bridge */ /* synthetic */ dlhy g() {
        return null;
    }

    @Override // defpackage.dkez
    public final Integer h() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + dlqt.a(false)) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        djse djseVar = this.e;
        int iHashCode4 = (iHashCode3 + (djseVar == null ? 0 : djseVar.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + dlqt.a(this.h)) * 31;
        Integer num = this.i;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        return ((((((((iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 961) + this.o) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    @Override // defpackage.dkez
    public final Integer i() {
        return this.i;
    }

    @Override // defpackage.dkez
    public final int j() {
        return this.o;
    }

    public final String toString() {
        return "VideoBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", isTransferring=false, onPlayButtonClick=" + this.c + ", formattedTimeString=" + this.d + ", requestListener=" + this.e + ", contentDescription=" + this.f + ", isHighlighted=" + this.h + ", width=" + this.i + ", height=" + this.j + ", caption=null, displayMode=" + ((Object) dkey.a(this.o)) + ", onClick=" + this.l + ", onLayout=" + this.m + ", flags=" + this.n + ")";
    }
}
