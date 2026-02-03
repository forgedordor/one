package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elfo extends elfq {
    final int a;
    final Duration b;
    final double c;

    /* JADX WARN: Failed to inline method: elfq.e(int):void */
    /* JADX WARN: Not passed register '(r1v0 'i' int)' in method call: elfq.e(int):void */
    public elfo(Duration duration, double d, int i) {
        elfq.e(i);
        this.a = i;
        int i2 = eonv.a;
        ejwl.f((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be positive", duration);
        this.b = duration;
        ejwl.i(d > 0.0d, "%s (%s) must be > 0", "multiplier", Double.valueOf(d));
        this.c = d;
    }

    @Override // defpackage.elfq
    public final Duration a(int i) {
        return i == 0 ? Duration.ZERO : !b(i) ? elfq.d : Duration.ofNanos((long) (eonv.b(this.b) * Math.pow(this.c, i - 1)));
    }

    /* JADX WARN: Failed to inline method: elfq.d(int):void */
    /* JADX WARN: Not passed register '(r2v0 'i' int)' in method call: elfq.d(int):void */
    @Override // defpackage.elfq
    public final boolean b(int i) {
        elfq.d(i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elfo) {
            elfo elfoVar = (elfo) obj;
            if (this.b.equals(elfoVar.b) && this.c == elfoVar.c && this.a == elfoVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Double.valueOf(this.c)});
    }
}
