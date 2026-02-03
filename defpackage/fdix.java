package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdix extends fdjg {
    public final fdhw a;

    public fdix(fcxy fcxyVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.h(fcxyVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new fdhw(false, fdia.a);
    }
}
