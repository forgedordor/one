package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwm extends fcyz implements fdat {
    final /* synthetic */ ahwo a;
    final /* synthetic */ enzp b;
    final /* synthetic */ aiba c;
    final /* synthetic */ enze d;
    final /* synthetic */ UUID e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwm(ahwo ahwoVar, enzp enzpVar, int i, aiba aibaVar, enze enzeVar, int i2, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwoVar;
        this.b = enzpVar;
        this.f = i;
        this.c = aibaVar;
        this.d = enzeVar;
        this.g = i2;
        this.e = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logProcessFailedEvent$1", "invokeSuspend", 269, "RestoreEventLogger.kt")).q("Logging restore failed event to clearcut");
        enzn enznVar = (enzn) enzq.a.createBuilder();
        enznVar.getClass();
        enza.b(this.b, enznVar);
        enza.c(this.c, enznVar);
        enzt enztVar = (enzt) enzv.a.createBuilder();
        enztVar.getClass();
        enztVar.copyOnWrite();
        enzv enzvVar = (enzv) enztVar.instance;
        enzvVar.c = this.f - 1;
        enzvVar.b |= 1;
        enze enzeVar = this.d;
        if (enzeVar != null) {
            enztVar.copyOnWrite();
            enzv enzvVar2 = (enzv) enztVar.instance;
            enzvVar2.d = enzeVar;
            enzvVar2.b |= 2;
        }
        int i = this.g;
        if (i != 0) {
            enztVar.copyOnWrite();
            enzv enzvVar3 = (enzv) enztVar.instance;
            enzvVar3.e = i - 1;
            enzvVar3.b |= 4;
        }
        evsn evsnVarBuild = enztVar.build();
        evsnVarBuild.getClass();
        enznVar.copyOnWrite();
        enzq enzqVar = (enzq) enznVar.instance;
        enzqVar.d = (enzv) evsnVarBuild;
        enzqVar.c = 6;
        evsf builder = enza.a(enznVar).toBuilder();
        builder.getClass();
        UUID uuid = this.e;
        enzn enznVar2 = (enzn) builder;
        if (uuid != null) {
            evqs evqsVarA = cobs.a(uuid);
            enznVar2.copyOnWrite();
            enzq enzqVar2 = (enzq) enznVar2.instance;
            enzqVar2.b |= 2;
            enzqVar2.f = evqsVarA;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.RESTORE_WORKFLOW_EVENT, ellgVar);
        evsn evsnVarBuild2 = enznVar2.build();
        evsnVarBuild2.getClass();
        elgr.i((enzq) evsnVarBuild2, ellgVar);
        evsf builder2 = elgr.a(ellgVar).toBuilder();
        builder2.getClass();
        ailn ailnVarA = ((aimb) this.a.a(false).b()).a();
        ailnVarA.d(emxt.RESTORE_WORKFLOW_EVENT);
        ailnVarA.j((ellg) builder2, aioj.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logProcessFailedEvent$1", "invokeSuspend", 292, "RestoreEventLogger.kt")).q("Logged restore failed event to clearcut");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwm(this.a, this.b, this.f, this.c, this.d, this.g, this.e, fcxyVar);
    }
}
