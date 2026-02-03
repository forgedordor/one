package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdfq implements fdev, fden {
    public final fdev a;
    public final int b;

    public fdfq(fdev fdevVar, int i) {
        this.a = fdevVar;
        this.b = i;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdfp(this);
    }

    @Override // defpackage.fden
    public final fdev b(int i) {
        int i2 = this.b;
        return i >= i2 ? fdeo.a : new fdfo(this.a, i, i2);
    }

    @Override // defpackage.fden
    public final fdev c(int i) {
        return i >= this.b ? this : new fdfq(this.a, i);
    }
}
