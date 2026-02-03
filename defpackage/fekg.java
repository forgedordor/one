package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekg {
    public final fcsu a;
    public final fcyh b;
    public final fcsu c;
    private final dofb d;

    public fekg(fcsu fcsuVar, fcyh fcyhVar, dofb dofbVar, fcsu fcsuVar2) {
        fcyhVar.getClass();
        dofbVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcyhVar;
        this.d = dofbVar;
        this.c = fcsuVar2;
    }

    public final void a(fdjx fdjxVar, fdae fdaeVar) {
        boolean zBooleanValue = ((Boolean) crbf.bd.e()).booleanValue();
        dofb dofbVar = this.d;
        if (zBooleanValue || ((Boolean) crbf.ba.e()).booleanValue()) {
            dofbVar.d(fdtg.b(new fejz(((vbv) this.a.b()).a(), this, fdjxVar), fdjxVar, fdur.b, doec.a));
        } else {
            dofbVar.d(((vbv) this.a.b()).a());
        }
        auvw.k(fdjxVar, null, null, new fekf(this, fdaeVar, dofbVar, null), 3);
    }
}
