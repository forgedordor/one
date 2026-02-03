package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anwf implements anpj {
    public final fdjx a;
    public final bbmo b;
    public final fcsu c;
    public final alqm d;
    public cquc e;
    public final cqtq f;
    private final fdjx g;
    private final cqtp h;

    public anwf(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, fcsu fcsuVar, alqm alqmVar) {
        this.a = fdjxVar;
        this.g = fdjxVar2;
        this.h = cqtpVar;
        this.b = bbmoVar;
        this.c = fcsuVar;
        this.d = alqmVar;
        this.f = cqtpVar.a(new anwc(this));
    }

    public static final bkuv d(String str) {
        bkuw bkuwVarA = bkuz.a();
        bkuwVarA.A("createRecipientBusinessInfo");
        if (str == null) {
            return bkuwVarA.b();
        }
        bkuy bkuyVar = new bkuy();
        bkuyVar.b(str);
        bkuwVarA.k(new bkux(bkuyVar));
        return bkuwVarA.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.f.a(new cqtk() { // from class: anwa
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "RecipientBusinessInfoObservableSupplier::register", "RecipientBusinessInfoObservableSupplier::callback", "RecipientBusinessInfoObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new anwb(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
