package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqf extends fcyz implements fdat {
    int a;
    final /* synthetic */ amqh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqf(amqh amqhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amqhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.e.b();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            amqh amqhVar = this.b;
            if (amqhVar.k.compareAndSet(false, true)) {
                ddnn ddnnVar = amqhVar.d;
                long millis = Duration.ofSeconds(amqhVar.f.b).toMillis();
                long millis2 = Duration.ofSeconds(amqhVar.g.b).toMillis();
                ddnv ddnvVar = new ddnv(millis);
                ddnvVar.f(100);
                ddnvVar.a = false;
                ddnvVar.e(millis);
                ddnvVar.d(millis2);
                ddnnVar.b(ddnvVar.a(), amqhVar.b, amqhVar.l).t(new defe() { // from class: amqe
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        ((ekrd) ((ekrd) amqh.a.j()).g(exc).h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/location/EmergencyLocationSupplier$onPermissionChanged$1", "invokeSuspend$lambda$0", 113, "EmergencyLocationSupplier.kt")).o();
                    }
                });
                return null;
            }
        }
        if (bool.booleanValue()) {
            return null;
        }
        amqh amqhVar2 = this.b;
        if (!amqhVar2.k.compareAndSet(true, false)) {
            return null;
        }
        amqhVar2.d.d(amqhVar2.l);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amqf(this.b, fcxyVar);
    }
}
