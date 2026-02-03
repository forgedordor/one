package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckw extends fcdo {
    static final fbmv b = new fbmv("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    public final fckr c;
    public final fbtk d;

    public fckw(fbru fbruVar, fckr fckrVar, fbtk fbtkVar) {
        super(fbruVar);
        this.c = fckrVar;
        this.d = fbtkVar;
    }

    @Override // defpackage.fcdo, defpackage.fbru
    public final void b() {
        this.a.b();
        this.c.a();
    }

    @Override // defpackage.fbru
    public final void c(fbrq fbrqVar) {
        this.a.c(new fckv(this, fbrqVar));
    }
}
