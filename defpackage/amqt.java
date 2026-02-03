package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqt implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionSupplier");
    public final cogw b;
    public final bbmo c;
    public final amqz d;
    public final anpj e;
    public cquc f;
    public final cqtq g;
    private final fdjx h;
    private final fdjx i;

    public amqt(fdjx fdjxVar, fdjx fdjxVar2, cogw cogwVar, bbmo bbmoVar, cqtp cqtpVar, amqz amqzVar, anpj anpjVar) {
        this.h = fdjxVar;
        this.i = fdjxVar2;
        this.b = cogwVar;
        this.c = bbmoVar;
        this.d = amqzVar;
        this.e = anpjVar;
        this.g = cqtpVar.a(new amqq(this));
    }

    public static final bpfi e() {
        String[] strArr = bpfo.a;
        bpfj bpfjVar = new bpfj(bpfo.a);
        bpfjVar.A("EmergencySessionSupplier.createEmergencySessionsTableQuery");
        bpfjVar.s();
        return bpfjVar.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.g.a(new cqtk() { // from class: amqm
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencySessionSupplier:register", "EmergencySessionSupplier:callback", "EmergencySessionSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.i, fcyi.a, fdjz.a, new amqn(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju d() {
        return auvw.c(this.h, fcyi.a, fdjz.a, new amqs(this, null));
    }
}
