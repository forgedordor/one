package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampa implements anpj {
    public final fdjx a;
    public final anpj b;
    public final anpj c;
    public cquc d;
    public final cqtq e;

    public ampa(fdjx fdjxVar, cqtp cqtpVar, anpj anpjVar, anpj anpjVar2) {
        this.a = fdjxVar;
        this.b = anpjVar;
        this.c = anpjVar2;
        this.e = cqtpVar.a(new amox(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: amou
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "GeofilterConstraintSupplier:register", "GeofilterConstraintSupplier:callback", "GeofilterConstraintSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new amov(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
