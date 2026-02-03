package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampu implements anpj {
    public final fdjx a;
    public cquc b;
    public final cqtq c;
    public final akfe d;

    public ampu(fdjx fdjxVar, akfe akfeVar, cqtp cqtpVar) {
        this.a = fdjxVar;
        this.d = akfeVar;
        this.c = cqtpVar.a(new ampt(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: ampo
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyLocationPermissionSupplier:register", "EmergencyLocationPermissionSupplier:callback", "EmergencyLocationPermissionSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new ampp(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
