package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfwb extends dgym {
    final /* synthetic */ dfwc a;
    private final String b;
    private final dgzn c;

    public dfwb(dfwc dfwcVar, String str, dgzn dgznVar) {
        this.a = dfwcVar;
        this.b = str;
        this.c = dgznVar;
    }

    private final void d() {
        dfwc dfwcVar = this.a;
        synchronized (dfwcVar.b) {
            dfwa dfwaVar = dfwcVar.c;
            String str = this.b;
            dgzn dgznVar = (dgzn) dfwaVar.get(str);
            dgzn dgznVar2 = this.c;
            if (dgznVar == dgznVar2) {
                dhja.c("removing session: %s", dhiz.PHONE_NUMBER.c(str));
                dfwaVar.remove(str);
            }
            dgznVar2.aU(this);
        }
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void e() {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void f() {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void g(dhfu dhfuVar) {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void h(int i, String str) {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void k() {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void l(dhfu dhfuVar) {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void m() {
        d();
    }
}
