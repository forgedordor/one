package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhj extends blq {
    private final blp a;
    private final blp b;
    private final blp c;
    private final blp d;

    public bhj(blp blpVar, blp blpVar2, blp blpVar3, blp blpVar4) {
        if (blpVar == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.a = blpVar;
        if (blpVar2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.b = blpVar2;
        this.c = blpVar3;
        this.d = blpVar4;
    }

    @Override // defpackage.blq
    public final blp a() {
        return this.c;
    }

    @Override // defpackage.blq
    public final blp b() {
        return this.b;
    }

    @Override // defpackage.blq
    public final blp c() {
        return this.d;
    }

    @Override // defpackage.blq
    public final blp d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        blp blpVar;
        blp blpVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof blq) {
            blq blqVar = (blq) obj;
            if (this.a.equals(blqVar.d()) && this.b.equals(blqVar.b()) && ((blpVar = this.c) != null ? blpVar.equals(blqVar.a()) : blqVar.a() == null) && ((blpVar2 = this.d) != null ? blpVar2.equals(blqVar.c()) : blqVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        blp blpVar = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (blpVar == null ? 0 : blpVar.hashCode())) * 1000003;
        blp blpVar2 = this.d;
        return iHashCode2 ^ (blpVar2 != null ? blpVar2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}
