package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdeu implements fdev {
    public final fdae a;
    public final fdap b;

    public fdeu(fdae fdaeVar, fdap fdapVar) {
        this.a = fdaeVar;
        this.b = fdapVar;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdet(this);
    }
}
