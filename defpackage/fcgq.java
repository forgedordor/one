package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgq extends fcbw {
    final fbog c;
    final fbrk d;
    final fbnc e;
    final /* synthetic */ fcgr f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    public fcgq(fcgr fcgrVar, fbog fbogVar, fbrk fbrkVar, fbnc fbncVar) {
        this.f = fcgrVar;
        fcgx fcgxVar = fcgrVar.c;
        super(fcgxVar.h(fbncVar), fcgxVar.j, fbncVar.b);
        this.c = fbogVar;
        this.d = fbrkVar;
        this.e = fbncVar;
        this.g = System.nanoTime();
    }

    @Override // defpackage.fcbw
    protected final void b() {
        this.f.c.m.execute(new fcgp(this));
    }

    final void j() {
        fcbh fcbhVar;
        fbog fbogVarA = this.c.a();
        try {
            fbnc fbncVar = this.e;
            fbnb fbnbVar = fbnm.f;
            fbnh fbnhVarC = this.f.c(this.d, fbncVar.f(fbnbVar, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    fcbhVar = null;
                } else {
                    super.i(fbnhVarC);
                    fcbhVar = new fcbh(this, this.a);
                }
            }
            if (fcbhVar == null) {
                fcgr fcgrVar = this.f;
                fcgrVar.c.m.execute(new fcgp(this));
            } else {
                fcgr fcgrVar2 = this.f;
                fcgrVar2.c.h(this.e).execute(new fcgo(this, fcbhVar));
            }
        } finally {
            this.c.f(fbogVarA);
        }
    }
}
