package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikp implements diks {
    public final dkpc a;
    public final long b;
    public final dipu c;
    private final String d;
    private final dikr e;
    private final dlro f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final diki j;

    public dikp(String str, dikr dikrVar, dlro dlroVar, boolean z, boolean z2, boolean z3, dkpc dkpcVar, long j, dipu dipuVar, diki dikiVar) {
        this.d = str;
        this.e = dikrVar;
        this.f = dlroVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.a = dkpcVar;
        this.b = j;
        this.c = dipuVar;
        this.j = dikiVar;
    }

    @Override // defpackage.diks
    public final diki a() {
        return this.j;
    }

    @Override // defpackage.diks
    public final dikr b() {
        return this.e;
    }

    @Override // defpackage.diks
    public final dkpc c() {
        return this.a;
    }

    @Override // defpackage.diks
    public final dlro d() {
        return this.f;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikp)) {
            return false;
        }
        dikp dikpVar = (dikp) obj;
        return fdbq.f(this.d, dikpVar.d) && fdbq.f(this.e, dikpVar.e) && fdbq.f(this.f, dikpVar.f) && this.g == dikpVar.g && this.h == dikpVar.h && this.i == dikpVar.i && fdbq.f(this.a, dikpVar.a) && this.b == dikpVar.b && fdbq.f(this.c, dikpVar.c) && fdbq.f(this.j, dikpVar.j);
    }

    @Override // defpackage.diks
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.diks
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.diks
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        dikr dikrVar = this.e;
        int iHashCode2 = (iHashCode + (dikrVar == null ? 0 : dikrVar.hashCode())) * 31;
        dlro dlroVar = this.f;
        int iHashCode3 = (((((((iHashCode2 + (dlroVar == null ? 0 : dlroVar.hashCode())) * 31) + diko.a(this.g)) * 31) + diko.a(this.h)) * 31) + diko.a(this.i)) * 31;
        dkpc dkpcVar = this.a;
        int iHashCode4 = dkpcVar == null ? 0 : dkpcVar.hashCode();
        long j = this.b;
        int i = (((iHashCode3 + iHashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        dipu dipuVar = this.c;
        return ((i + (dipuVar != null ? dipuVar.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "LoadingPlayback(contentDescription=" + this.d + ", transcript=" + this.e + ", voiceMood=" + this.f + ", isOutgoing=" + this.g + ", isRichType=" + this.h + ", isHighlighted=" + this.i + ", statusUiData=" + this.a + ", displayedTimeInMillis=" + this.b + ", waveformUiData=" + this.c + ", flags=" + this.j + ")";
    }
}
