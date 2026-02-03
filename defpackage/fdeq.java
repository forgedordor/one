package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdeq implements fdev {
    public final fdev a;
    public final boolean b;
    public final fdap c;

    public fdeq(fdev fdevVar, boolean z, fdap fdapVar) {
        this.a = fdevVar;
        this.b = z;
        this.c = fdapVar;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdep(this);
    }
}
