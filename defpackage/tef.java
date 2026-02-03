package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tef implements tdw, tdp {
    public final fduf a;
    public boolean b;
    private final fdjx c;
    private fdvc d;
    private final tdu e;

    public tef(tdu tduVar, fdjx fdjxVar) {
        tduVar.getClass();
        fdjxVar.getClass();
        this.e = tduVar;
        this.c = fdjxVar;
        this.a = fdvf.a(true);
        this.b = true;
    }

    @Override // defpackage.tcj
    public final /* bridge */ /* synthetic */ fdpl a(tdh tdhVar, fdpl fdplVar) {
        tdo tdoVar = (tdo) tdhVar;
        if (this.d == null) {
            tee teeVar = new tee(null, this);
            int i = fdsn.a;
            this.d = fdtg.b(new fdwg(teeVar, fdplVar), this.c, fdur.a, false);
        }
        fdvc fdvcVar = this.d;
        fdvcVar.getClass();
        return new tec(fdvcVar, this, tdoVar);
    }

    public final void b(tdo tdoVar) {
        this.e.a(tdoVar.a, tdv.b);
        tdoVar.k.invoke();
    }
}
