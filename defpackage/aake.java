package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aake implements aajz {
    public final aakh a;
    private final fdjx b;
    private final fcsu c;
    private final zqi d;

    public aake(fdjx fdjxVar, aakh aakhVar, zqi zqiVar, @apob fcsu fcsuVar) {
        fdjxVar.getClass();
        aakhVar.getClass();
        zqiVar.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.a = aakhVar;
        this.d = zqiVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.aajz
    public final fdpl a() {
        if (!((Boolean) this.c.b()).booleanValue()) {
            return new fdpu(null);
        }
        fdpl fdplVarA = fdqq.a(new aakc(this.d.e));
        aakd aakdVar = new aakd(null, this);
        int i = fdsn.a;
        return fdtg.b(new fdwg(aakdVar, fdplVarA), this.b, fdur.a(0L, 3), null);
    }
}
