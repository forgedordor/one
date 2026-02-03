package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avcu extends fcyz implements fdat {
    int a;
    final /* synthetic */ avcx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avcu(avcx avcxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avcxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avcu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                avcx avcxVar = this.b;
                this.a = 1;
                if (avcxVar.a(this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (Throwable th) {
            ekrw ekrwVarI = avcx.a.i();
            ekrwVarI.X(eksq.a, "BugleContacts");
            ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/shared/contacts/sync/analytics/ContactsSyncRecurringMetricsLoggerImpl$log$1", "invokeSuspend", 58, "ContactsSyncRecurringMetricsLoggerImpl.kt")).q("Error while logging contacts sync recurring metrics");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avcu(this.b, fcxyVar);
    }
}
