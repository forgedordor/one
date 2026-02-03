package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdfo implements fdev, fden {
    public final fdev a;
    public final int b;
    public final int c;

    public fdfo(fdev fdevVar, int i, int i2) {
        this.a = fdevVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "startIndex should be non-negative, but is "));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.g(i2, "endIndex should be non-negative, but is "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.s(i, i2, "endIndex should be not less than startIndex, but was ", " < "));
        }
    }

    private final int d() {
        return this.c - this.b;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdfn(this);
    }

    @Override // defpackage.fden
    public final fdev b(int i) {
        if (i >= d()) {
            return fdeo.a;
        }
        return new fdfo(this.a, this.b + i, this.c);
    }

    @Override // defpackage.fden
    public final fdev c(int i) {
        if (i >= d()) {
            return this;
        }
        fdev fdevVar = this.a;
        int i2 = this.b;
        return new fdfo(fdevVar, i2, i + i2);
    }
}
