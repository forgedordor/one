package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cogd extends fcyz implements fdat {
    int a;
    final /* synthetic */ cogh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cogd(cogh coghVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coghVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cogd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ayrq ayrqVar = ayrq.a;
                cogc cogcVar = new cogc(this.b, null);
                this.a = 1;
                obj = ayrqVar.a("TelephonyDatabaseUpdater#updateThreadIdForSmsMessagesInThreadZero", cogcVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            long j = ((fdhi) obj).c;
            ekrw ekrwVarE = cogh.a.e();
            ekrwVarE.X(eksq.a, "BugleTelephony");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateThreadIdForSmsMessagesInThreadZero$1", "invokeSuspend", 106, "TelephonyDatabaseUpdater.kt")).s("TelephonyDatabaseUpdater#updateThreadIdForSmsMessagesInThreadZero time: [%s]ms", fdhi.g(j));
        } catch (Exception e) {
            ekrw ekrwVarJ = cogh.a.j();
            ekrwVarJ.X(eksq.a, "BugleTelephony");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateThreadIdForSmsMessagesInThreadZero$1", "invokeSuspend", 112, "TelephonyDatabaseUpdater.kt")).q("Error thrown during SMS Thread ID update!");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cogd(this.b, fcxyVar);
    }
}
