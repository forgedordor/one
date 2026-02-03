package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coet extends fcyz implements fdat {
    final /* synthetic */ coeu a;
    final /* synthetic */ ewte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coet(coeu coeuVar, ewte ewteVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = coeuVar;
        this.b = ewteVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coet) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = coeu.a.h();
        ekrwVarH.X(eksq.a, "BugleTelephony");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateScheduler$scheduleTelephonyPartsCharsetUpdate$1", "invokeSuspend", 41, "TelephonyDatabaseUpdateScheduler.kt")).q("Scheduling telephony database update work for charset update.");
        evsn evsnVarBuild = this.b.build();
        evsnVarBuild.getClass();
        coeu coeuVar = this.a;
        auvw.k(coeuVar.c, null, null, new coes(coeuVar, (ewtf) evsnVarBuild, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new coet(this.a, this.b, fcxyVar);
    }
}
