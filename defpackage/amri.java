package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amri implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/voiceaccess/EmergencyVoiceAccessConstraintSupplier");
    public final fdjx b;
    public final fcsu c;
    public final fcsu d;
    public final cqtq e;
    public fdlr f;

    public amri(fdjx fdjxVar, cqtp cqtpVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        cqtpVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = cqtpVar.a(new amrh(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: amrc
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyVoiceAccessConstraintSupplier:register", "EmergencyVoiceAccessConstraintSupplier:callback", "EmergencyVoiceAccessConstraintSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new amrd(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
