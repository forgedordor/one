package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypn implements dkgq {
    public final yov a;
    public final fdae b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final fdae g;
    public final yqc h;
    public final boolean i;
    public final dlro j;
    public final List k;
    public final dkpc l;
    public final ypm m;
    private final fdae n;

    public ypn(yov yovVar, fdae fdaeVar, String str, boolean z, boolean z2, boolean z3, fdae fdaeVar2, fdae fdaeVar3, yqc yqcVar, boolean z4, dlro dlroVar, List list, dkpc dkpcVar, ypm ypmVar) {
        this.a = yovVar;
        this.b = fdaeVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.n = fdaeVar2;
        this.g = fdaeVar3;
        this.h = yqcVar;
        this.i = z4;
        this.j = dlroVar;
        this.k = list;
        this.l = dkpcVar;
        this.m = ypmVar;
    }

    public static /* synthetic */ ypn e(ypn ypnVar, dlro dlroVar, int i) {
        yov yovVar = (i & 1) != 0 ? ypnVar.a : null;
        fdae fdaeVar = (i & 2) != 0 ? ypnVar.b : null;
        String str = (i & 4) != 0 ? ypnVar.c : null;
        boolean z = (i & 8) != 0 ? ypnVar.d : false;
        boolean z2 = (i & 16) != 0 ? ypnVar.e : false;
        boolean z3 = (i & 32) != 0 ? ypnVar.f : false;
        fdae fdaeVar2 = (i & 64) != 0 ? ypnVar.n : null;
        fdae fdaeVar3 = (i & 128) != 0 ? ypnVar.g : null;
        yqc yqcVar = (i & 256) != 0 ? ypnVar.h : null;
        boolean z4 = (i & 512) != 0 ? ypnVar.i : false;
        dlro dlroVar2 = (i & 1024) != 0 ? ypnVar.j : dlroVar;
        List list = ypnVar.k;
        dkpc dkpcVar = ypnVar.l;
        ypm ypmVar = ypnVar.m;
        yovVar.getClass();
        fdaeVar.getClass();
        str.getClass();
        fdaeVar2.getClass();
        fdaeVar3.getClass();
        return new ypn(yovVar, fdaeVar, str, z, z2, z3, fdaeVar2, fdaeVar3, yqcVar, z4, dlroVar2, list, dkpcVar, ypmVar);
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
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypn)) {
            return false;
        }
        ypn ypnVar = (ypn) obj;
        return fdbq.f(this.a, ypnVar.a) && fdbq.f(this.b, ypnVar.b) && fdbq.f(this.c, ypnVar.c) && this.d == ypnVar.d && this.e == ypnVar.e && this.f == ypnVar.f && fdbq.f(this.n, ypnVar.n) && fdbq.f(this.g, ypnVar.g) && fdbq.f(this.h, ypnVar.h) && this.i == ypnVar.i && fdbq.f(this.j, ypnVar.j) && fdbq.f(this.k, ypnVar.k) && fdbq.f(this.l, ypnVar.l) && fdbq.f(this.m, ypnVar.m);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fdae fdaeVar = this.n;
        int iA = (((((((((iHashCode * 31) + ypj.a(this.d)) * 31) + ypj.a(this.e)) * 31) + ypj.a(this.f)) * 31) + fdaeVar.hashCode()) * 31) + this.g.hashCode();
        yqc yqcVar = this.h;
        int iHashCode2 = ((((iA * 31) + (yqcVar == null ? 0 : yqcVar.hashCode())) * 31) + ypj.a(this.i)) * 31;
        dlro dlroVar = this.j;
        int iHashCode3 = (iHashCode2 + (dlroVar == null ? 0 : dlroVar.hashCode())) * 31;
        List list = this.k;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        dkpc dkpcVar = this.l;
        return ((iHashCode4 + (dkpcVar != null ? dkpcVar.hashCode() : 0)) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "BugleAudioBubbleUiData(audioPlayer=" + this.a + ", onDispose=" + this.b + ", contentDescription=" + this.c + ", isHighlighted=" + this.d + ", isOutgoing=" + this.e + ", isTransferring=" + this.f + ", onClick=" + this.n + ", onLayout=" + this.g + ", transcript=" + this.h + ", isRichType=" + this.i + ", voiceMood=" + this.j + ", amplitudeList=" + this.k + ", statusUiData=" + this.l + ", flags=" + this.m + ")";
    }
}
