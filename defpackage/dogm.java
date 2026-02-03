package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogm extends dogp<dohm, dogm> {
    private final boolean a;
    private final boolean b;

    public dogm() {
        this(3);
    }

    @Override // defpackage.dogp
    public final /* bridge */ /* synthetic */ boolean a(dogj dogjVar) {
        dohm dohmVar = (dohm) dogjVar;
        if (fdbq.f(dohmVar, dohj.a)) {
            return this.a;
        }
        if (fdbq.f(dohmVar, dogx.a)) {
            return this.b;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogm)) {
            return false;
        }
        dogm dogmVar = (dogm) obj;
        return this.a == dogmVar.a && this.b == dogmVar.b;
    }

    public final int hashCode() {
        return (dogl.a(this.a) * 31) + dogl.a(this.b);
    }

    public final String toString() {
        return "Image(supportsWebP=" + this.a + ", supportsHEIF=" + this.b + ")";
    }

    public dogm(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ dogm(int i) {
        this(1 == (i & 1), false);
    }
}
