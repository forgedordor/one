package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdem implements fdev, fden {
    public final fdev a;
    public final int b;

    public fdem(fdev fdevVar, int i) {
        this.a = fdevVar;
        this.b = i;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdel(this);
    }

    @Override // defpackage.fden
    public final fdev b(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new fdem(this, i) : new fdem(this.a, i2);
    }

    @Override // defpackage.fden
    public final fdev c(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new fdfq(this, i) : new fdfo(this.a, i2, i3);
    }
}
