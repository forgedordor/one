package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csia implements cqci {
    public final fcsu a;
    private final fdjx b;

    public csia(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        cczi ccziVar = crtr.a;
        if (((Boolean) ((cczi) crtr.R.get()).e()).booleanValue()) {
            if (i >= 60 || (i >= 5 && i < 16)) {
                auvw.m(this.b, null, new cshz(this, null), 3);
            }
        }
    }
}
