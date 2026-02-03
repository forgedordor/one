package defpackage;

import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwl extends fcyz implements fdat {
    final /* synthetic */ ahwo a;
    final /* synthetic */ enzp b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ enzh i;
    final /* synthetic */ ahwj j;
    final /* synthetic */ Long k;
    final /* synthetic */ aiba l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwl(ahwo ahwoVar, enzp enzpVar, UUID uuid, Duration duration, int i, int i2, int i3, int i4, enzh enzhVar, ahwj ahwjVar, Long l, aiba aibaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwoVar;
        this.b = enzpVar;
        this.c = uuid;
        this.d = duration;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = enzhVar;
        this.j = ahwjVar;
        this.k = l;
        this.l = aibaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        boolean z;
        ekrg ekrgVar;
        enzm enzmVarA;
        fctl.b(obj);
        ekrg ekrgVar2 = ahwo.a;
        ekrw ekrwVarH = ekrgVar2.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logCompleteEvent$1", "invokeSuspend", 137, "RestoreEventLogger.kt")).q("Logging restore complete event to clearcut");
        enzn enznVar = (enzn) enzq.a.createBuilder();
        enznVar.getClass();
        enza.b(this.b, enznVar);
        enza.d(cobs.a(this.c), enznVar);
        enzr enzrVar = (enzr) enzs.a.createBuilder();
        enzrVar.getClass();
        Duration duration = this.d;
        evrj evrjVarA = evxd.a(duration);
        enzrVar.copyOnWrite();
        enzs enzsVar = (enzs) enzrVar.instance;
        enzsVar.c = evrjVarA;
        enzsVar.b |= 1;
        evsn evsnVarBuild = enzrVar.build();
        evsnVarBuild.getClass();
        enznVar.copyOnWrite();
        enzq enzqVar = (enzq) enznVar.instance;
        enzqVar.d = (enzs) evsnVarBuild;
        enzqVar.c = 5;
        evsf builder = enza.a(enznVar).toBuilder();
        builder.getClass();
        enzn enznVar2 = (enzn) builder;
        long millis = duration.toMillis();
        ahwo ahwoVar = this.a;
        int i2 = this.h;
        enzh enzhVar = this.i;
        if (millis == 0) {
            enzj enzjVar = (enzj) enzm.a.createBuilder();
            enzjVar.getClass();
            enyy.c(cnma.a(i2), enzjVar);
            if (enzhVar != null) {
                enyy.b(enzhVar, enzjVar);
            }
            enzmVarA = enyy.a(enzjVar);
            ekrgVar = ekrgVar2;
            i = 10;
            z = true;
        } else {
            int i3 = this.g;
            int i4 = this.f;
            i = 10;
            int i5 = this.e;
            z = true;
            enzj enzjVar2 = (enzj) enzm.a.createBuilder();
            enzjVar2.getClass();
            int iB = ahwo.b(i5, duration);
            enzjVar2.copyOnWrite();
            ekrgVar = ekrgVar2;
            enzm enzmVar = (enzm) enzjVar2.instance;
            enzmVar.b |= 1;
            enzmVar.c = iB;
            int iB2 = ahwo.b(i4, duration);
            enzjVar2.copyOnWrite();
            enzm enzmVar2 = (enzm) enzjVar2.instance;
            enzmVar2.b |= 2;
            enzmVar2.d = iB2;
            int iA = cnma.a(i3);
            enzjVar2.copyOnWrite();
            enzm enzmVar3 = (enzm) enzjVar2.instance;
            enzmVar3.e = iA - 1;
            enzmVar3.b |= 4;
            enyy.c(cnma.a(i2), enzjVar2);
            if (enzhVar != null) {
                enyy.b(enzhVar, enzjVar2);
            }
            Long l = this.k;
            if (l != null) {
                long jLongValue = l.longValue();
                enzjVar2.copyOnWrite();
                enzm enzmVar4 = (enzm) enzjVar2.instance;
                enzmVar4.b |= 32;
                enzmVar4.h = jLongValue;
            }
            ahwj ahwjVar = this.j;
            if (ahwjVar != null) {
                enzl enzlVar = enzl.a;
                enzk enzkVar = (enzk) enzlVar.createBuilder();
                enzkVar.getClass();
                ahwk ahwkVar = ahwjVar.a;
                enyz.e(ahwkVar.a / 10, enzkVar);
                enyz.b(ahwkVar.b / 10, enzkVar);
                enyz.c(ahwkVar.c / 100, enzkVar);
                enyz.d(ahwkVar.d / 100, enzkVar);
                enzl enzlVarA = enyz.a(enzkVar);
                enzjVar2.copyOnWrite();
                enzm enzmVar5 = (enzm) enzjVar2.instance;
                enzmVar5.i = enzlVarA;
                enzmVar5.b |= 64;
                enzk enzkVar2 = (enzk) enzlVar.createBuilder();
                enzkVar2.getClass();
                ahwk ahwkVar2 = ahwjVar.b;
                enyz.e(ahwkVar2.a / 10, enzkVar2);
                enyz.b(ahwkVar2.b / 10, enzkVar2);
                enyz.c(ahwkVar2.c / 100, enzkVar2);
                enyz.d(ahwkVar2.d / 100, enzkVar2);
                enzl enzlVarA2 = enyz.a(enzkVar2);
                enzjVar2.copyOnWrite();
                enzm enzmVar6 = (enzm) enzjVar2.instance;
                enzmVar6.j = enzlVarA2;
                enzmVar6.b |= 128;
                enzk enzkVar3 = (enzk) enzlVar.createBuilder();
                enzkVar3.getClass();
                ahwk ahwkVar3 = ahwjVar.c;
                enyz.e(ahwkVar3.a / 10, enzkVar3);
                enyz.b(ahwkVar3.b / 10, enzkVar3);
                enyz.c(ahwkVar3.c / 100, enzkVar3);
                enyz.d(ahwkVar3.d / 100, enzkVar3);
                enzl enzlVarA3 = enyz.a(enzkVar3);
                enzjVar2.copyOnWrite();
                enzm enzmVar7 = (enzm) enzjVar2.instance;
                enzmVar7.k = enzlVarA3;
                enzmVar7.b |= 512;
            }
            enzmVarA = enyy.a(enzjVar2);
        }
        enznVar2.copyOnWrite();
        enzq enzqVar2 = (enzq) enznVar2.instance;
        enzqVar2.g = enzmVarA;
        enzqVar2.b |= 4;
        aiba aibaVar = this.l;
        enznVar2.copyOnWrite();
        enzq enzqVar3 = (enzq) enznVar2.instance;
        enzqVar3.h = aibaVar.e;
        enzqVar3.b |= 8;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.RESTORE_WORKFLOW_EVENT, ellgVar);
        evsn evsnVarBuild2 = enznVar2.build();
        evsnVarBuild2.getClass();
        elgr.i((enzq) evsnVarBuild2, ellgVar);
        evsf builder2 = elgr.a(ellgVar).toBuilder();
        builder2.getClass();
        ailn ailnVarA = ((aimb) ahwoVar.a(z).b()).a();
        ailnVarA.d(emxt.RESTORE_WORKFLOW_EVENT);
        ailnVarA.j((ellg) builder2, aioj.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(i, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logCompleteEvent$1", "invokeSuspend", 169, "RestoreEventLogger.kt")).q("Logged restore complete event to clearcut");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, fcxyVar);
    }
}
