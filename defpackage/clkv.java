package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkv extends fcyz implements fdat {
    int a;
    final /* synthetic */ clli b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkv(fcxy fcxyVar, clli clliVar) {
        super(2, fcxyVar);
        this.b = clliVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clkv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        Throwable th;
        StatusException e;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
            try {
                try {
                    fctl.b(obj);
                } catch (StatusException e2) {
                    e = e2;
                    ekrw ekrwVarJ = clli.a.j();
                    ekrwVarJ.X(eksq.a, "BugleSatellite");
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 329, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.getSatelliteSessionState failed");
                    Object objA = fctl.a(e);
                    fczl.a(closeable, null);
                    obj2 = objA;
                    return new fctk(obj2);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    fczl.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            fctl.b(obj);
            ekrw ekrwVarH = clli.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 320, "OutgoingSatelliteApiImpl.kt")).q("Calling SatelliteSessionStateService.getSatelliteSessionState");
            eieu eieuVarH = eiiy.h("SatelliteSessionStateService.getSatelliteSessionState");
            try {
                dber dberVar = this.b.d;
                dbdi dbdiVar = (dbdi) dbdj.a.createBuilder();
                dbdiVar.getClass();
                evsn evsnVarBuild = dbdiVar.build();
                evsnVarBuild.getClass();
                this.c = eieuVarH;
                this.a = 1;
                Object objB = dberVar.b((dbdj) evsnVarBuild, new fbrg(), this);
                if (objB == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
                obj = objB;
            } catch (StatusException e3) {
                closeable = eieuVarH;
                e = e3;
                ekrw ekrwVarJ2 = clli.a.j();
                ekrwVarJ2.X(eksq.a, "BugleSatellite");
                ((ekrd) ((ekrd) ekrwVarJ2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 329, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.getSatelliteSessionState failed");
                Object objA2 = fctl.a(e);
                fczl.a(closeable, null);
                obj2 = objA2;
                return new fctk(obj2);
            } catch (Throwable th4) {
                closeable = eieuVarH;
                th = th4;
                throw th;
            }
        }
        dbdl dbdlVar = (dbdl) obj;
        fczl.a(closeable, null);
        ekrw ekrwVarH2 = clli.a.h();
        ekrwVarH2.X(eksq.a, "BugleSatellite");
        ekrd ekrdVar = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 335, "OutgoingSatelliteApiImpl.kt");
        int iB = dbes.b(dbdlVar.b);
        ekrdVar.t("Call SatelliteSessionStateService.getSatelliteSessionState succeeded, session status: [%s].", dbes.a(iB != 0 ? iB : 1));
        obj2 = dbdlVar;
        return new fctk(obj2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clkv clkvVar = new clkv(fcxyVar, this.b);
        clkvVar.c = obj;
        return clkvVar;
    }
}
