package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdes implements fdev {
    public final fdev a;
    public final fdap b;

    public fdes(fdev fdevVar, fdap fdapVar) {
        this.a = fdevVar;
        this.b = fdapVar;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fder(this);
    }
}
