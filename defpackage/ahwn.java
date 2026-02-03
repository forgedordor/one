package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwn extends fcyz implements fdat {
    final /* synthetic */ ahwo a;
    final /* synthetic */ boolean b;
    final /* synthetic */ enzp c;
    final /* synthetic */ UUID d;
    final /* synthetic */ aiba e;
    final /* synthetic */ Integer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwn(ahwo ahwoVar, boolean z, enzp enzpVar, UUID uuid, aiba aibaVar, Integer num, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwoVar;
        this.b = z;
        this.c = enzpVar;
        this.d = uuid;
        this.e = aibaVar;
        this.f = num;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrg ekrgVar = ahwo.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logStartEvent$1", "invokeSuspend", 67, "RestoreEventLogger.kt")).q("Logging restore start event to clearcut");
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.RESTORE_WORKFLOW_EVENT, ellgVar);
        enzn enznVar = (enzn) enzq.a.createBuilder();
        enznVar.getClass();
        enzp enzpVar = this.c;
        enza.b(enzpVar, enznVar);
        enza.d(cobs.a(this.d), enznVar);
        enza.c(this.e, enznVar);
        Integer num = this.f;
        if (num != null) {
            int iIntValue = num.intValue();
            enznVar.copyOnWrite();
            enzq enzqVar = (enzq) enznVar.instance;
            enzqVar.b |= 16;
            enzqVar.i = iIntValue;
        }
        enzw enzwVar = (enzw) enzx.a.createBuilder();
        enzwVar.getClass();
        evsn evsnVarBuild = enzwVar.build();
        evsnVarBuild.getClass();
        enznVar.copyOnWrite();
        enzq enzqVar2 = (enzq) enznVar.instance;
        enzqVar2.d = (enzx) evsnVarBuild;
        enzqVar2.c = 4;
        elgr.i(enza.a(enznVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ailn ailnVarA = ((aimb) this.a.a(this.b).b()).a();
        ailnVarA.d(emxt.RESTORE_WORKFLOW_EVENT);
        ailnVarA.j((ellg) builder, aioj.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logStartEvent$1", "invokeSuspend", 84, "RestoreEventLogger.kt")).t("Logging restore start event to clearcut: %s", enzpVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwn(this.a, this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
