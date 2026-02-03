package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczp implements anpj {
    public final acve a;
    private final fdjx b;
    private final cqtq c;

    public aczp(fdjx fdjxVar, cqtp cqtpVar, acve acveVar) {
        fdjxVar.getClass();
        cqtpVar.getClass();
        this.b = fdjxVar;
        this.a = acveVar;
        this.c = cqtpVar.a(new aczo());
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: aczm
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "GroupUpgradeCounterSupplier::register", "GroupUpgradeCounterSupplier::callback", "GroupUpgradeCounterSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.b, eicg.a(fcyiVar), fdjzVar, new aczn(null, this)));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
