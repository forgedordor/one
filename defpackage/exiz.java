package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exiz extends exkb {
    public final long a;
    public final ekgb b;

    public exiz(long j, ekgb ekgbVar) {
        this.a = j;
        this.b = ekgbVar;
    }

    @Override // defpackage.exkb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.exkb
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exkb) {
            exkb exkbVar = (exkb) obj;
            if (this.a == exkbVar.a()) {
                exkbVar.c();
                if (ekjz.h(this.b, exkbVar.b())) {
                    exkbVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "ExternalGraphComponents{parentGlContextHandle=" + this.a + ", drishtiCache=null, servicePacketHandles=" + this.b.toString() + ", gpuBufferPoolOptions=null}";
    }

    @Override // defpackage.exkb
    public final void c() {
    }

    @Override // defpackage.exkb
    public final void d() {
    }
}
