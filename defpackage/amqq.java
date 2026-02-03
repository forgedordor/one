package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqq implements cqto {
    final /* synthetic */ amqt a;

    public amqq(amqt amqtVar) {
        this.a = amqtVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amqt amqtVar = this.a;
        amqtVar.f = cqty.b(amqtVar.c.a(amqt.e(), "EmergencySessionSupplier#suggestionsQueryRbm").f(new cqtk() { // from class: amql
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return amqtVar.d();
            }
        }, "EmergencySessionSupplier::register", "EmergencySessionSupplier::callback", "EmergencySessionSupplier::unregister"), amqtVar.e.a(new anpi() { // from class: amqo
            @Override // defpackage.anpi
            public final eiju a() {
                return amqtVar.d();
            }
        }), amqtVar.d.f.a(new cqtk() { // from class: amqp
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return amqtVar.d();
            }
        }, "EmergencySessionTimeoutTracker::Register", "EmergencySessionTimeoutTracker::Callback", "EmergencySessionTimeoutTracker::Unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        amqt amqtVar = this.a;
        cquc cqucVar = amqtVar.f;
        if (cqucVar != null) {
            cqucVar.a();
        }
        amqtVar.f = null;
    }
}
