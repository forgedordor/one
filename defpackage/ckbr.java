package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbr implements anpj {
    public final cjzq a;
    public final fdjx b;
    public final cqtq c;

    public ckbr(cqtp cqtpVar, cjzq cjzqVar, fdjx fdjxVar) {
        cqtpVar.getClass();
        cjzqVar.getClass();
        fdjxVar.getClass();
        this.a = cjzqVar;
        this.b = fdjxVar;
        this.c = cqtpVar.a(new ckbo(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: ckbl
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "RcsSettingsObservableSupplierV2::register", "RcsSettingsObservableSupplierV2::callback", "RcsSettingsObservableSupplierV2::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new ckbm(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
