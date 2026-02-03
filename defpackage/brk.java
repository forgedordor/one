package defpackage;

import android.util.Rational;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brk {
    public final Rational a;
    public final boolean b;
    private final int c;
    private final int d;

    public brk(bir birVar, Rational rational) {
        this.c = birVar.b();
        this.d = birVar.a();
        this.a = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.b = z;
    }

    public final Size a(bku bkuVar) {
        int iC = bkuVar.C(0);
        Size sizeO = bkuVar.O();
        if (sizeO != null) {
            int iA = bnq.a(bnq.b(iC), this.c, this.d == 1);
            if (iA == 90 || iA == 270) {
                return new Size(sizeO.getHeight(), sizeO.getWidth());
            }
        }
        return sizeO;
    }
}
