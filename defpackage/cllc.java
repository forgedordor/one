package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllc extends fcyz implements fdat {
    int a;
    final /* synthetic */ clli b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllc(fcxy fcxyVar, clli clliVar) {
        super(2, fcxyVar);
        this.b = clliVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cllc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        StatusException e;
        Object objA;
        ?? r0 = fcyl.a;
        try {
            if (this.a != 0) {
                closeable = (Closeable) this.c;
                try {
                    fctl.b(obj);
                } catch (StatusException e2) {
                    e = e2;
                    ekrw ekrwVarJ = clli.a.j();
                    ekrwVarJ.X(eksq.a, "BugleSatellite");
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 365, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.startSatelliteSession failed");
                    objA = fctl.a(e);
                    fczl.a(closeable, null);
                    return new fctk(objA);
                }
            } else {
                fctl.b(obj);
                ekrw ekrwVarH = clli.a.h();
                ekrwVarH.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 354, "OutgoingSatelliteApiImpl.kt")).q("Calling SatelliteSessionStateService.startSatelliteSession");
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieu eieuVarH = eiiy.h("SatelliteSessionStateService.startSatelliteSession");
                try {
                    dber dberVar = this.b.d;
                    dbfb dbfbVar = (dbfb) dbfc.a.createBuilder();
                    dbfbVar.getClass();
                    dbfbVar.copyOnWrite();
                    dbfc dbfcVar = (dbfc) dbfbVar.instance;
                    dbfcVar.c = 1;
                    dbfcVar.b |= 1;
                    evsn evsnVarBuild = dbfbVar.build();
                    evsnVarBuild.getClass();
                    this.c = eieuVarH;
                    this.a = 1;
                    Object objC = dberVar.c((dbfc) evsnVarBuild, new fbrg(), this);
                    if (objC == r0) {
                        return r0;
                    }
                    closeable = eieuVarH;
                    obj = objC;
                } catch (StatusException e3) {
                    closeable = eieuVarH;
                    e = e3;
                    ekrw ekrwVarJ2 = clli.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleSatellite");
                    ((ekrd) ((ekrd) ekrwVarJ2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 365, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.startSatelliteSession failed");
                    objA = fctl.a(e);
                    fczl.a(closeable, null);
                    return new fctk(objA);
                } catch (Throwable th) {
                    r0 = eieuVarH;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(r0, th);
                        throw th2;
                    }
                }
            }
            objA = (dbfe) obj;
            fczl.a(closeable, null);
            ekrw ekrwVarH2 = clli.a.h();
            ekrwVarH2.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 369, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.startSatelliteSession succeeded.");
            return new fctk(objA);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cllc cllcVar = new cllc(fcxyVar, this.b);
        cllcVar.c = obj;
        return cllcVar;
    }
}
