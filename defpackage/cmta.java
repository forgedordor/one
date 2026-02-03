package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmta extends fcyz implements fdat {
    final /* synthetic */ cmte a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmta(cmte cmteVar, String str, long j, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmteVar;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmta) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = cmte.a.h();
        ekrwVarH.X(eksq.a, "BugleTelephony");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 139, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Logging RCS Telephony persistence failure event to clearcut.");
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.TELEPHONY_PERSISTENCE_EVENT, ellgVar);
        emjk emjkVar = (emjk) emjm.a.createBuilder();
        emjkVar.getClass();
        emmt.b(cqmg.a(this.b), emjkVar);
        long j = this.c;
        emmt.e(cqmf.a(j), emjkVar);
        long jB = cmte.b();
        cmte cmteVar = this.a;
        if (cmteVar.c.a()) {
            emmt.f(cqld.a(jB), emjkVar);
        } else {
            emmt.d(cqmf.a(jB), emjkVar);
        }
        int i = this.d;
        eobk eobkVar = (eobk) eobl.a.createBuilder();
        eobkVar.getClass();
        eobm eobmVar = (eobm) eobo.a.createBuilder();
        eobmVar.getClass();
        eobmVar.copyOnWrite();
        eobo eoboVar = (eobo) eobmVar.instance;
        eoboVar.c = i - 1;
        eoboVar.b |= 1;
        boolean z = j < jB;
        eobmVar.copyOnWrite();
        eobo eoboVar2 = (eobo) eobmVar.instance;
        eoboVar2.b |= 2;
        eoboVar2.d = z;
        evsn evsnVarBuild = eobmVar.build();
        evsnVarBuild.getClass();
        eobkVar.copyOnWrite();
        eobl eoblVar = (eobl) eobkVar.instance;
        eoblVar.c = (eobo) evsnVarBuild;
        eoblVar.b = 2;
        emmt.c(eobj.a(eobkVar), emjkVar);
        elgr.j(emmt.a(emjkVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        try {
            cmteVar.a((ellg) builder);
        } catch (Exception e) {
            ekrw ekrwVarJ = cmte.a.j();
            ekrwVarJ.X(eksq.a, "BugleTelephony");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 154, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Failed to log telephony file persist failure event to clearcut");
        }
        ekrw ekrwVarH2 = cmte.a.h();
        ekrwVarH2.X(eksq.a, "BugleTelephony");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 160, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Successfully logged RCS Telephony persistence failure event to clearcut.");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmta(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
