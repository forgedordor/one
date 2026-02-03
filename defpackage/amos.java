package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amos implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/carrier/EmergencyCarrierConstraintSupplier");
    public final fdjx b;
    public final anpj c;
    public cquc d;
    public final cqtq e;

    public amos(fdjx fdjxVar, cqtp cqtpVar, anpj anpjVar) {
        this.b = fdjxVar;
        this.c = anpjVar;
        this.e = cqtpVar.a(new amop(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: amom
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyCarrierConstraintSupplier:register", "EmergencyCarrierConstraintSupplier:callback", "EmergencyCarrierConstraintSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new amon(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
