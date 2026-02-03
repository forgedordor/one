package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class neh extends mcl {
    private final mbo b;

    public neh(mbo mboVar) {
        this.b = mboVar;
    }

    @Override // defpackage.mcl
    public final int a(Object obj) {
        return obj == neg.c ? 0 : -1;
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
        mcjVar.l(z ? 0 : null, z ? neg.c : null, 0, -9223372036854775807L, 0L, lzz.a, true);
        return mcjVar;
    }

    @Override // defpackage.mcl
    public final mck e(int i, mck mckVar, long j) {
        mckVar.d(mck.a, this.b, false, true, null, -9223372036854775807L);
        mckVar.k = true;
        return mckVar;
    }

    @Override // defpackage.mcl
    public final Object f(int i) {
        return neg.c;
    }
}
