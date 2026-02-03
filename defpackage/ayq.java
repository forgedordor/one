package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayq extends bbp {
    private final bmx a;
    private final long b;
    private final Matrix c;

    public ayq(bmx bmxVar, long j, Matrix matrix) {
        if (bmxVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.a = bmxVar;
        this.b = j;
        this.c = matrix;
    }

    @Override // defpackage.bbp, defpackage.bbh
    public final long a() {
        return this.b;
    }

    @Override // defpackage.bbp
    public final Matrix b() {
        return this.c;
    }

    @Override // defpackage.bbp, defpackage.bbh
    public final bmx c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbp) {
            bbp bbpVar = (bbp) obj;
            if (this.a.equals(bbpVar.c()) && this.b == bbpVar.a()) {
                bbpVar.e();
                if (this.c.equals(bbpVar.b())) {
                    bbpVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return ((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=0, sensorToBufferTransformMatrix=" + this.c + ", flashState=0}";
    }

    @Override // defpackage.bbp
    public final void d() {
    }

    @Override // defpackage.bbp
    public final void e() {
    }
}
