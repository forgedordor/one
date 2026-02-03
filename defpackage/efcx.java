package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efcx extends efgb {
    private final Optional a;
    private final Optional b;

    public efcx(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.efgb
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.efgb
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efgb) {
            efgb efgbVar = (efgb) obj;
            if (this.a.equals(efgbVar.a()) && this.b.equals(efgbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
