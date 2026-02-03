package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clky extends fcyz implements fdat {
    int a;
    final /* synthetic */ clli b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clky(fcxy fcxyVar, clli clliVar) {
        super(2, fcxyVar);
        this.b = clliVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clky) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            try {
                if (r1 != 0) {
                    Closeable closeable = (Closeable) this.c;
                    fctl.b(obj);
                    r1 = closeable;
                } else {
                    fctl.b(obj);
                    ekrw ekrwVarH = clli.a.h();
                    ekrwVarH.X(eksq.a, "BugleSatellite");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callRetrieveEmergencyQuestionnaire-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 189, "OutgoingSatelliteApiImpl.kt")).q("Calling QuestionnaireService.retrieveEmergencyQuestionnaire");
                    eieu eieuVarH = eiiy.h("QuestionnaireService.GetQuestionnaire");
                    dbeh dbehVar = this.b.c;
                    dbde dbdeVar = (dbde) dbdf.a.createBuilder();
                    dbdeVar.getClass();
                    evsn evsnVarBuild = dbdeVar.build();
                    evsnVarBuild.getClass();
                    this.c = eieuVarH;
                    this.a = 1;
                    obj = dbehVar.b((dbdf) evsnVarBuild, new fbrg(), this);
                    r1 = eieuVarH;
                    if (obj == fcylVar) {
                        return fcylVar;
                    }
                }
                dbdh dbdhVar = (dbdh) obj;
                fczl.a(r1, null);
                ekrw ekrwVarH2 = clli.a.h();
                ekrwVarH2.X(eksq.a, "BugleSatellite");
                ekrd ekrdVar = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callRetrieveEmergencyQuestionnaire-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 204, "OutgoingSatelliteApiImpl.kt");
                evtg evtgVar = dbdhVar.b;
                evtgVar.getClass();
                ekrdVar.t("Call QuestionnaireService.retrieveEmergencyQuestionnaire succeeded, datagramIds:[%s]", fcva.aF(evtgVar, null, null, null, clkx.a, 31));
                obj2 = dbdhVar;
            } catch (StatusException e) {
                ekrw ekrwVarJ = clli.a.j();
                ekrwVarJ.X(eksq.a, "BugleSatellite");
                ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callRetrieveEmergencyQuestionnaire-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 198, "OutgoingSatelliteApiImpl.kt")).q("Call QuestionnaireService.retrieveEmergencyQuestionnaire failed");
                Object objA = fctl.a(e);
                fczl.a(r1, null);
                obj2 = objA;
            }
            return new fctk(obj2);
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clky clkyVar = new clky(fcxyVar, this.b);
        clkyVar.c = obj;
        return clkyVar;
    }
}
