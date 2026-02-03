package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnc extends abs {
    public final ddp a;
    private final fdjx d;
    private final fdae e;

    public gnc(fdjx fdjxVar, ddp ddpVar, fdae fdaeVar) {
        super(true);
        this.d = fdjxVar;
        this.a = ddpVar;
        this.e = fdaeVar;
    }

    @Override // defpackage.abs
    public final void a() {
        fdil.d(this.d, null, null, new gmz(this, null), 3);
    }

    @Override // defpackage.abs
    public final void b() {
        this.e.invoke();
    }

    @Override // defpackage.abs
    public final void c(aao aaoVar) {
        fdil.d(this.d, null, null, new gna(this, aaoVar, null), 3);
    }

    @Override // defpackage.abs
    public final void d(aao aaoVar) {
        fdil.d(this.d, null, null, new gnb(this, aaoVar, null), 3);
    }
}
