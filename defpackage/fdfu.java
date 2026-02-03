package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdfu implements fdev {
    public final fdev a;
    public final fdap b;

    public fdfu(fdev fdevVar, fdap fdapVar) {
        this.a = fdevVar;
        this.b = fdapVar;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdft(this);
    }
}
