package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmiv {
    public final dmiu a;
    public final domv b;
    public final dmiw c;
    public final boolean d;
    private final boolean e = true;
    private final boolean f = true;

    public dmiv(dmiu dmiuVar, domv domvVar, dmiw dmiwVar, boolean z) {
        this.a = dmiuVar;
        this.b = domvVar;
        this.c = dmiwVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmiv)) {
            return false;
        }
        dmiv dmivVar = (dmiv) obj;
        if (!fdbq.f(this.a, dmivVar.a)) {
            return false;
        }
        boolean z = dmivVar.e;
        if (!fdbq.f(this.b, dmivVar.b) || !fdbq.f(this.c, dmivVar.c)) {
            return false;
        }
        boolean z2 = dmivVar.f;
        return this.d == dmivVar.d;
    }

    public final int hashCode() {
        dmiu dmiuVar = this.a;
        return ((((((((((dmiuVar == null ? 0 : dmiuVar.hashCode()) * 31) + dmiq.a(true)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + dmiq.a(true)) * 31) + dmiq.a(this.d);
    }

    public final String toString() {
        return "CameraConfiguration(miniCameraMode=" + this.a + ", showFab=true, outputFileProvider=" + this.b + ", launcher=" + this.c + ", mirrorFrontFacingCameraHorizontally=true, enableMiniCameraLifecycleObserverFix=" + this.d + ")";
    }
}
