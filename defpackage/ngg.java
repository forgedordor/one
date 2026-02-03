package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngg extends mcl {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final boolean e;
    private final mbo f;
    private final mbk g;

    static {
        mbd mbdVar = new mbd();
        mbdVar.b("SinglePeriodTimeline");
        mbdVar.a = Uri.EMPTY;
        mbdVar.a();
    }

    public ngg(long j, boolean z, boolean z2, mbo mboVar) {
        mbk mbkVar = z2 ? mboVar.c : null;
        this.c = j;
        this.d = j;
        this.e = z;
        mee.f(mboVar);
        this.f = mboVar;
        this.g = mbkVar;
    }

    @Override // defpackage.mcl
    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.mcl
    public final int b() {
        return 1;
    }

    @Override // defpackage.mcl
    public final int c() {
        return 1;
    }

    @Override // defpackage.mcl
    public final mcj d(int i, mcj mcjVar, boolean z) {
        mee.e(i, 1);
        mcjVar.n(null, z ? b : null, this.c, 0L);
        return mcjVar;
    }

    @Override // defpackage.mcl
    public final mck e(int i, mck mckVar, long j) {
        mee.e(i, 1);
        mckVar.d(mck.a, this.f, this.e, false, this.g, this.d);
        return mckVar;
    }

    @Override // defpackage.mcl
    public final Object f(int i) {
        mee.e(i, 1);
        return b;
    }
}
