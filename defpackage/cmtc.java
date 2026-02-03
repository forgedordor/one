package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmtc extends fcyz implements fdat {
    final /* synthetic */ cmte a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmtc(cmte cmteVar, String str, long j, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmteVar;
        this.b = str;
        this.c = j;
        this.d = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmtc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = cmte.a.h();
        ekrwVarH.X(eksq.a, "BugleTelephony");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 71, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Logging RCS Telephony persistence success event to clearcut.");
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.TELEPHONY_PERSISTENCE_EVENT, ellgVar);
        emjk emjkVar = (emjk) emjm.a.createBuilder();
        emjkVar.getClass();
        emmt.b(cqmg.a(this.b), emjkVar);
        emmt.e(cqmf.a(this.c), emjkVar);
        long jB = cmte.b();
        cmte cmteVar = this.a;
        if (cmteVar.c.a()) {
            emmt.f(cqld.a(jB), emjkVar);
        } else {
            emmt.d(cqmf.a(jB), emjkVar);
        }
        Duration duration = this.d;
        eobk eobkVar = (eobk) eobl.a.createBuilder();
        eobkVar.getClass();
        eobp eobpVar = (eobp) eobq.a.createBuilder();
        eobpVar.getClass();
        evrj evrjVarA = evxd.a(duration);
        eobpVar.copyOnWrite();
        eobq eobqVar = (eobq) eobpVar.instance;
        eobqVar.c = evrjVarA;
        eobqVar.b |= 1;
        evsn evsnVarBuild = eobpVar.build();
        evsnVarBuild.getClass();
        eobkVar.copyOnWrite();
        eobl eoblVar = (eobl) eobkVar.instance;
        eoblVar.c = (eobq) evsnVarBuild;
        eoblVar.b = 1;
        emmt.c(eobj.a(eobkVar), emjkVar);
        elgr.j(emmt.a(emjkVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        try {
            cmteVar.a((ellg) builder);
        } catch (Exception e) {
            ekrw ekrwVarJ = cmte.a.j();
            ekrwVarJ.X(eksq.a, "BugleTelephony");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 86, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Failed to log telephony file persist success event to clearcut");
        }
        ekrw ekrwVarH2 = cmte.a.h();
        ekrwVarH2.X(eksq.a, "BugleTelephony");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 92, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Successfully logged RCS Telephony persistence success event to clearcut.");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmtc(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
