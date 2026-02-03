package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtr implements djtg {
    public final djtq a;
    public final boolean b;
    public final fdae c;
    public final String d;
    public final fdae e;

    public /* synthetic */ djtr(djtq djtqVar, boolean z, fdae fdaeVar, String str, fdae fdaeVar2, int i) {
        this.a = djtqVar;
        this.b = ((i & 2) == 0) & z;
        this.c = (i & 4) != 0 ? null : fdaeVar;
        this.d = (i & 8) != 0 ? null : str;
        this.e = (i & 16) != 0 ? null : fdaeVar2;
    }

    @Override // defpackage.dkgq
    public final String a() {
        return this.a.k;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.a.p;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        return this.a.q;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.a.l;
    }

    @Override // defpackage.djtg
    public final Uri e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djtr)) {
            return false;
        }
        djtr djtrVar = (djtr) obj;
        return fdbq.f(this.a, djtrVar.a) && this.b == djtrVar.b && fdbq.f(this.c, djtrVar.c) && fdbq.f(this.d, djtrVar.d) && fdbq.f(this.e, djtrVar.e);
    }

    @Override // defpackage.dkez
    public final dker f() {
        return this.a.j;
    }

    @Override // defpackage.dkez
    public final dlhy g() {
        return this.a.o;
    }

    @Override // defpackage.dkez
    public final Integer h() {
        return this.a.n;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdae fdaeVar = this.c;
        int iHashCode2 = (((iHashCode + (true != this.b ? 1237 : 1231)) * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        fdae fdaeVar2 = this.e;
        return iHashCode3 + (fdaeVar2 != null ? fdaeVar2.hashCode() : 0);
    }

    @Override // defpackage.dkez
    public final Integer i() {
        return this.a.m;
    }

    @Override // defpackage.dkez
    public final int j() {
        return this.a.r;
    }

    @Override // defpackage.djtg
    public final Uri k() {
        return this.a.b;
    }

    @Override // defpackage.djtg
    public final Uri l() {
        return this.a.a;
    }

    @Override // defpackage.djtg
    public final djtf m() {
        return this.a.f;
    }

    @Override // defpackage.djtg
    public final dknh n() {
        return this.a.e;
    }

    @Override // defpackage.djtg
    public final String o() {
        return this.a.h;
    }

    @Override // defpackage.djtg
    public final String p() {
        return this.a.g;
    }

    @Override // defpackage.djtg
    public final boolean q() {
        return this.a.i;
    }

    public final String toString() {
        return "MaskedImageBubbleUiData(imageBubbleUiData=" + this.a + ", showLoadingIndicator=" + this.b + ", onClickToggle=" + this.c + ", contentMaskText=" + this.d + ", onClickContentMask=" + this.e + ")";
    }
}
