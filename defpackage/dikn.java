package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikn implements diks {
    private final String a;
    private final dikr b;
    private final dlro c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final dkpc g;
    private final diki h;

    public dikn(String str, dikr dikrVar, dlro dlroVar, boolean z, boolean z2, boolean z3, dkpc dkpcVar, diki dikiVar) {
        this.a = str;
        this.b = dikrVar;
        this.c = dlroVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = dkpcVar;
        this.h = dikiVar;
    }

    @Override // defpackage.diks
    public final diki a() {
        return this.h;
    }

    @Override // defpackage.diks
    public final dikr b() {
        return this.b;
    }

    @Override // defpackage.diks
    public final dkpc c() {
        return this.g;
    }

    @Override // defpackage.diks
    public final dlro d() {
        return this.c;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikn)) {
            return false;
        }
        dikn diknVar = (dikn) obj;
        return fdbq.f(this.a, diknVar.a) && fdbq.f(this.b, diknVar.b) && fdbq.f(this.c, diknVar.c) && this.d == diknVar.d && this.e == diknVar.e && this.f == diknVar.f && fdbq.f(this.g, diknVar.g) && fdbq.f(this.h, diknVar.h);
    }

    @Override // defpackage.diks
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.diks
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.diks
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dikr dikrVar = this.b;
        int iHashCode2 = (iHashCode + (dikrVar == null ? 0 : dikrVar.hashCode())) * 31;
        dlro dlroVar = this.c;
        int iHashCode3 = (((((((iHashCode2 + (dlroVar == null ? 0 : dlroVar.hashCode())) * 31) + dikm.a(this.d)) * 31) + dikm.a(this.e)) * 31) + dikm.a(this.f)) * 31;
        dkpc dkpcVar = this.g;
        return ((iHashCode3 + (dkpcVar != null ? dkpcVar.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ", transcript=" + this.b + ", voiceMood=" + this.c + ", isOutgoing=" + this.d + ", isRichType=" + this.e + ", isHighlighted=" + this.f + ", statusUiData=" + this.g + ", flags=" + this.h + ")";
    }
}
