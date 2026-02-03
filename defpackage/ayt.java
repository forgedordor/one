package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayt extends bdm {
    private final int a;
    private final Surface b;

    public ayt(int i, Surface surface) {
        this.a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    @Override // defpackage.bdm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bdm
    public final Surface b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdm) {
            bdm bdmVar = (bdm) obj;
            if (this.a == bdmVar.a() && this.b.equals(bdmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
