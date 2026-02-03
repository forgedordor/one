package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipk {
    public final float a;
    public final fdap b;
    public final fdae c;

    public dipk() {
        this(0.0f, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dipk)) {
            return false;
        }
        dipk dipkVar = (dipk) obj;
        return Float.compare(this.a, dipkVar.a) == 0 && fdbq.f(this.b, dipkVar.b) && fdbq.f(this.c, dipkVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PlaybackUiData(progress=" + this.a + ", onSeek=" + this.b + ", onSeekFinished=" + this.c + ")";
    }

    public dipk(float f, fdap fdapVar, fdae fdaeVar) {
        fdapVar.getClass();
        fdaeVar.getClass();
        this.a = f;
        this.b = fdapVar;
        this.c = fdaeVar;
    }

    public /* synthetic */ dipk(float f, int i) {
        this(1 == (i & 1) ? 0.0f : f, new fdap() { // from class: dipi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return fctx.a;
            }
        }, new fdae() { // from class: dipj
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
