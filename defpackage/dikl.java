package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikl implements diks {
    public final boolean a;
    public final long b;
    public final fdae c;
    public final dikq d;
    public final fdae e;
    public final dkpc f;
    public final dipu g;
    public final dike h;
    private final String i;
    private final dikr j;
    private final dlro k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final diki o;

    public /* synthetic */ dikl(String str, dikr dikrVar, dlro dlroVar, boolean z, boolean z2, boolean z3, boolean z4, long j, fdae fdaeVar, dikq dikqVar, fdae fdaeVar2, dkpc dkpcVar, dipu dipuVar, dike dikeVar, diki dikiVar, int i) {
        fdae fdaeVar3 = (i & 256) != 0 ? new fdae() { // from class: dikk
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        fdae fdaeVar4 = (i & 1024) != 0 ? null : fdaeVar2;
        dkpc dkpcVar2 = (i & 2048) != 0 ? null : dkpcVar;
        dipu dipuVar2 = (i & 4096) != 0 ? null : dipuVar;
        dike dikeVar2 = (i & 8192) != 0 ? null : dikeVar;
        diki dikiVar2 = (i & 16384) != 0 ? new diki(false, false) : dikiVar;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 4;
        int i5 = i & 2;
        boolean z5 = ((i & 32) == 0) & z3;
        boolean z6 = (i2 == 0) & z2;
        boolean z7 = (i3 == 0) & z;
        dlro dlroVar2 = i4 != 0 ? null : dlroVar;
        dikr dikrVar2 = i5 == 0 ? dikrVar : null;
        fdaeVar3.getClass();
        dikiVar2.getClass();
        this.i = str;
        this.j = dikrVar2;
        this.k = dlroVar2;
        this.l = z7;
        this.m = z6;
        this.n = z5;
        this.a = z4;
        this.b = j;
        this.c = fdaeVar3;
        this.d = dikqVar;
        this.e = fdaeVar4;
        this.f = dkpcVar2;
        this.g = dipuVar2;
        this.h = dikeVar2;
        this.o = dikiVar2;
    }

    @Override // defpackage.diks
    public final diki a() {
        return this.o;
    }

    @Override // defpackage.diks
    public final dikr b() {
        return this.j;
    }

    @Override // defpackage.diks
    public final dkpc c() {
        return this.f;
    }

    @Override // defpackage.diks
    public final dlro d() {
        return this.k;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikl)) {
            return false;
        }
        dikl diklVar = (dikl) obj;
        return fdbq.f(this.i, diklVar.i) && fdbq.f(this.j, diklVar.j) && fdbq.f(this.k, diklVar.k) && this.l == diklVar.l && this.m == diklVar.m && this.n == diklVar.n && this.a == diklVar.a && this.b == diklVar.b && fdbq.f(this.c, diklVar.c) && fdbq.f(this.d, diklVar.d) && fdbq.f(this.e, diklVar.e) && fdbq.f(this.f, diklVar.f) && fdbq.f(this.g, diklVar.g) && fdbq.f(this.h, diklVar.h) && fdbq.f(this.o, diklVar.o);
    }

    @Override // defpackage.diks
    public final boolean f() {
        return this.n;
    }

    @Override // defpackage.diks
    public final boolean g() {
        return this.l;
    }

    @Override // defpackage.diks
    public final boolean h() {
        return this.m;
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        dikr dikrVar = this.j;
        int iHashCode2 = (iHashCode + (dikrVar == null ? 0 : dikrVar.hashCode())) * 31;
        dlro dlroVar = this.k;
        int iHashCode3 = (((((((((iHashCode2 + (dlroVar == null ? 0 : dlroVar.hashCode())) * 31) + dikj.a(this.l)) * 31) + dikj.a(this.m)) * 31) + dikj.a(this.n)) * 31) + dikj.a(this.a)) * 31;
        long j = this.b;
        int iHashCode4 = (((((iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        fdae fdaeVar = this.e;
        int iHashCode5 = (iHashCode4 + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        dkpc dkpcVar = this.f;
        int iHashCode6 = (iHashCode5 + (dkpcVar == null ? 0 : dkpcVar.hashCode())) * 31;
        dipu dipuVar = this.g;
        int iHashCode7 = (iHashCode6 + (dipuVar == null ? 0 : dipuVar.hashCode())) * 31;
        dike dikeVar = this.h;
        return ((iHashCode7 + (dikeVar != null ? dikeVar.hashCode() : 0)) * 31) + this.o.hashCode();
    }

    public final String toString() {
        return "Loaded(contentDescription=" + this.i + ", transcript=" + this.j + ", voiceMood=" + this.k + ", isOutgoing=" + this.l + ", isRichType=" + this.m + ", isHighlighted=" + this.n + ", isPlaying=" + this.a + ", displayedTimeInMillis=" + this.b + ", onPlayButtonClick=" + this.c + ", seekbarUiData=" + this.d + ", onDispose=" + this.e + ", statusUiData=" + this.f + ", waveformUiData=" + this.g + ", renderListener=" + this.h + ", flags=" + this.o + ")";
    }
}
