package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cami extends fcyz implements fdat {
    final /* synthetic */ cams a;
    final /* synthetic */ calt b;
    final /* synthetic */ ejxm c;
    final /* synthetic */ cang d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cami(fcxy fcxyVar, cams camsVar, calt caltVar, ejxm ejxmVar, cang cangVar) {
        super(2, fcxyVar);
        this.a = camsVar;
        this.b = caltVar;
        this.c = ejxmVar;
        this.d = cangVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cami) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [cmfo, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final Duration durationD = this.c.d();
        cams camsVar = this.a;
        final Instant instantOfEpochMilli = Instant.ofEpochMilli(camsVar.d.f().toEpochMilli());
        cang cangVar = this.d;
        final boolean z = false;
        if (camt.a(cangVar)) {
            cank cankVarB = cank.b(cangVar.e);
            if (cankVarB == null) {
                cankVarB = cank.NONE;
            }
            if (cankVarB == cank.BACKUP_KEY) {
                z = true;
            }
        }
        calt caltVar = this.b;
        final aurx aurxVar = camsVar.c;
        ecem.b();
        final Instant instantMinus = instantOfEpochMilli.minus(durationD);
        final String str = caltVar.n;
        aurxVar.e.get().m(new ejvr() { // from class: aupm
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aurx aurxVar2 = aurxVar;
                aumq aumqVarBuild = (aumq) obj2;
                if (z) {
                    ausg ausgVar = aumqVarBuild.G;
                    if (ausgVar == null) {
                        ausgVar = ausg.a;
                    }
                    if (!ausgVar.equals(ausg.a)) {
                        ekrw ekrwVarH = aurx.b.h();
                        ekrwVarH.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "setInitialRestorePageWorkerTimingStats", 1971, "CmsSettingsDataService.java")).q("Resetting uncleared InitialRestoreExecutionTime.");
                        aumg builder = aumqVarBuild.toBuilder();
                        builder.copyOnWrite();
                        aumq aumqVar = (aumq) builder.instance;
                        aumqVar.G = null;
                        aumqVar.c &= -5;
                        aumqVarBuild = builder.build();
                        aurxVar2.i.a(false);
                    }
                }
                ausg ausgVar2 = aumqVarBuild.G;
                if (ausgVar2 == null) {
                    ausgVar2 = ausg.a;
                }
                ausf ausfVar = (ausf) ausgVar2.toBuilder();
                aush aushVar = aurxVar2.i;
                if (aushVar.a.get()) {
                    Instant instant = instantMinus;
                    ausg ausgVar3 = (ausg) ausfVar.instance;
                    long j = ausgVar3.g;
                    long j2 = ausgVar3.f;
                    ejwl.b(j2 != 0, "The last scheduled time should be set before computing duration.");
                    if (instant.toEpochMilli() >= j2) {
                        long epochMilli = j + instant.minusMillis(j2).toEpochMilli();
                        ausfVar.copyOnWrite();
                        ausg ausgVar4 = (ausg) ausfVar.instance;
                        ausgVar4.b |= 16;
                        ausgVar4.g = epochMilli;
                    } else {
                        ekrw ekrwVarJ = aurx.b.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "setInitialRestorePageWorkerTimingStats", 1996, "CmsSettingsDataService.java")).q("The start time should not be less than end time.");
                    }
                } else {
                    aushVar.a(true);
                    ausfVar.copyOnWrite();
                    ausg ausgVar5 = (ausg) ausfVar.instance;
                    ausgVar5.b |= 8;
                    ausgVar5.f = 0L;
                }
                Duration duration = durationD;
                String str2 = str;
                if (str2.equals("Participants")) {
                    long millis = ((ausg) ausfVar.instance).c + duration.toMillis();
                    ausfVar.copyOnWrite();
                    ausg ausgVar6 = (ausg) ausfVar.instance;
                    ausgVar6.b |= 1;
                    ausgVar6.c = millis;
                }
                if (str2.equals("Conversations")) {
                    long millis2 = ((ausg) ausfVar.instance).d + duration.toMillis();
                    ausfVar.copyOnWrite();
                    ausg ausgVar7 = (ausg) ausfVar.instance;
                    ausgVar7.b |= 2;
                    ausgVar7.d = millis2;
                }
                if (str2.equals("Messages")) {
                    long millis3 = ((ausg) ausfVar.instance).e + duration.toMillis();
                    ausfVar.copyOnWrite();
                    ausg ausgVar8 = (ausg) ausfVar.instance;
                    ausgVar8.b |= 4;
                    ausgVar8.e = millis3;
                }
                long epochMilli2 = instantOfEpochMilli.toEpochMilli();
                ausfVar.copyOnWrite();
                ausg ausgVar9 = (ausg) ausfVar.instance;
                ausgVar9.b |= 8;
                ausgVar9.f = epochMilli2;
                aumg builder2 = aumqVarBuild.toBuilder();
                ausg ausgVar10 = (ausg) ausfVar.build();
                builder2.copyOnWrite();
                aumq aumqVar2 = (aumq) builder2.instance;
                ausgVar10.getClass();
                aumqVar2.G = ausgVar10;
                aumqVar2.c |= 4;
                return builder2.build();
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cami camiVar = new cami(fcxyVar, this.a, this.b, this.c, this.d);
        camiVar.e = obj;
        return camiVar;
    }
}
