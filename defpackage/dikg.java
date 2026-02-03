package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikg implements diks {
    public final dike a;
    private final String b;
    private final dikr c;
    private final dlro d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final dkpc h;
    private final diki i;

    public /* synthetic */ dikg(String str, dikr dikrVar, boolean z, boolean z2, boolean z3, dike dikeVar, diki dikiVar, int i) {
        dikiVar = (i & 256) != 0 ? new diki(false, false) : dikiVar;
        int i2 = i & 128;
        int i3 = i & 32;
        int i4 = i & 16;
        int i5 = i & 8;
        int i6 = i & 2;
        boolean z4 = i3 == 0;
        boolean z5 = i4 == 0;
        boolean z6 = i5 == 0;
        dikeVar = i2 != 0 ? null : dikeVar;
        boolean z7 = z3 & z4;
        boolean z8 = z2 & z5;
        boolean z9 = z & z6;
        dikrVar = i6 != 0 ? null : dikrVar;
        dikiVar.getClass();
        this.b = str;
        this.c = dikrVar;
        this.d = null;
        this.e = z9;
        this.f = z8;
        this.g = z7;
        this.h = null;
        this.a = dikeVar;
        this.i = dikiVar;
    }

    @Override // defpackage.diks
    public final diki a() {
        return this.i;
    }

    @Override // defpackage.diks
    public final dikr b() {
        return this.c;
    }

    @Override // defpackage.diks
    public final dkpc c() {
        return null;
    }

    @Override // defpackage.diks
    public final dlro d() {
        return null;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikg)) {
            return false;
        }
        dikg dikgVar = (dikg) obj;
        if (!fdbq.f(this.b, dikgVar.b) || !fdbq.f(this.c, dikgVar.c)) {
            return false;
        }
        dlro dlroVar = dikgVar.d;
        if (!fdbq.f(null, null) || this.e != dikgVar.e || this.f != dikgVar.f || this.g != dikgVar.g) {
            return false;
        }
        dkpc dkpcVar = dikgVar.h;
        return fdbq.f(null, null) && fdbq.f(this.a, dikgVar.a) && fdbq.f(this.i, dikgVar.i);
    }

    @Override // defpackage.diks
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.diks
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.diks
    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        dikr dikrVar = this.c;
        int iHashCode2 = (((((iHashCode + (dikrVar == null ? 0 : dikrVar.hashCode())) * 961) + dikf.a(this.e)) * 31) + dikf.a(this.f)) * 31;
        boolean z = this.g;
        dike dikeVar = this.a;
        return ((((iHashCode2 + dikf.a(z)) * 961) + (dikeVar != null ? dikeVar.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "Error(contentDescription=" + this.b + ", transcript=" + this.c + ", voiceMood=null, isOutgoing=" + this.e + ", isRichType=" + this.f + ", isHighlighted=" + this.g + ", statusUiData=null, renderListener=" + this.a + ", flags=" + this.i + ")";
    }
}
