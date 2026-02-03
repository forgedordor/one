package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eipm extends eipq {
    private final String f = "";
    private final int g;

    public eipm(int i) {
        this.g = i;
    }

    @Override // defpackage.eipq
    public final String a() {
        return this.f;
    }

    @Override // defpackage.eipq
    public final int b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eipq) {
            eipq eipqVar = (eipq) obj;
            if (this.g == eipqVar.b() && this.f.equals(eipqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g ^ 1000003) * 1000003) ^ this.f.hashCode();
    }
}
