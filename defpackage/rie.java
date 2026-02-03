package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rie implements rgn, rgm {
    public final rgo a;
    public final rgm b;
    public volatile Object c;
    public volatile rgk d;
    private volatile int e;
    private volatile rgj f;
    private volatile rlp g;

    public rie(rgo rgoVar, rgm rgmVar) {
        this.a = rgoVar;
        this.b = rgmVar;
    }

    @Override // defpackage.rgn
    public final void a() {
        rlp rlpVar = this.g;
        if (rlpVar != null) {
            rlpVar.c.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: IOException -> 0x011b, TRY_ENTER, TryCatch #4 {IOException -> 0x011b, blocks: (B:17:0x00a9, B:36:0x0113, B:37:0x011a), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    @Override // defpackage.rgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rie.b():boolean");
    }

    @Override // defpackage.rgm
    public final void c(res resVar, Exception exc, rfg rfgVar, reb rebVar) {
        this.b.c(resVar, exc, rfgVar, this.g.c.eX());
    }

    @Override // defpackage.rgm
    public final void d(res resVar, Object obj, rfg rfgVar, reb rebVar, res resVar2) {
        this.b.d(resVar, obj, rfgVar, this.g.c.eX(), resVar);
    }

    final boolean e(rlp rlpVar) {
        rlp rlpVar2 = this.g;
        return rlpVar2 != null && rlpVar2 == rlpVar;
    }
}
