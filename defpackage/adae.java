package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adae implements anpj {
    public final fdjx a;
    public final auaq b;
    public final alrj c;
    public final cogw d;
    public final cqtq e;
    public cquc f;
    private final fdjx g;

    public adae(cqtp cqtpVar, fdjx fdjxVar, fdjx fdjxVar2, auaq auaqVar, alrj alrjVar, cogw cogwVar) {
        cqtpVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        auaqVar.getClass();
        alrjVar.getClass();
        cogwVar.getClass();
        this.a = fdjxVar;
        this.g = fdjxVar2;
        this.b = auaqVar;
        this.c = alrjVar;
        this.d = cogwVar;
        this.e = cqtpVar.a(new adab(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: aczx
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "HomeScreenActiveComposersSupplier::register", "HomeScreenActiveComposersSupplier::callback", "HomeScreenActiveComposersSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.g, eicg.a(fcyiVar), fdjzVar, new aczz(null, this)));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
