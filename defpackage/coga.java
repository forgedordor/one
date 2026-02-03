package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coga extends fcyz implements fdat {
    int a;
    final /* synthetic */ cogh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coga(cogh coghVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coghVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coga) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cogh coghVar = this.b;
            ayrq ayrqVar = ayrq.a;
            cofz cofzVar = new cofz(coghVar, null);
            this.a = 1;
            obj = ayrqVar.a("TelephonyDatabaseUpdater#updateThreadIdForMmsMessagesInThreadZero", cofzVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long j = ((fdhi) obj).c;
        ekrw ekrwVarE = cogh.a.e();
        ekrwVarE.X(eksq.a, "BugleTelephony");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateThreadIdForMmsMessagesInThreadZero$1", "invokeSuspend", 128, "TelephonyDatabaseUpdater.kt")).s("TelephonyDatabaseUpdater#updateThreadIdForMmsMessagesInThreadZero time: [%s]ms", fdhi.g(j));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new coga(this.b, fcxyVar);
    }
}
