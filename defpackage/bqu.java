package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqu extends brd {
    public final float a;
    private final float b;
    private final float c;
    private final float d;

    public bqu(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.brd, defpackage.bdv
    public final float a() {
        return this.b;
    }

    @Override // defpackage.brd, defpackage.bdv
    public final float b() {
        return this.c;
    }

    @Override // defpackage.brd, defpackage.bdv
    public final float c() {
        return this.a;
    }

    @Override // defpackage.brd
    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brd) {
            brd brdVar = (brd) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(brdVar.c()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(brdVar.a()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(brdVar.b()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(brdVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
