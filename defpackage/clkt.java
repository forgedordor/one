package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkt extends fcyz implements fdat {
    int a;
    final /* synthetic */ clli b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkt(fcxy fcxyVar, clli clliVar) {
        super(2, fcxyVar);
        this.b = clliVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clkt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        StatusException e;
        Object obj2;
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
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 276, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.getDatagramCapabilities failed");
                    Object objA = fctl.a(e);
                    fczl.a(closeable, null);
                    obj2 = objA;
                    return new fctk(obj2);
                }
            } else {
                fctl.b(obj);
                ekrw ekrwVarH = clli.a.h();
                ekrwVarH.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 267, "OutgoingSatelliteApiImpl.kt")).q("Calling SendDatagramService.getDatagramCapabilities");
                eieu eieuVarH = eiiy.h("SendDatagramService.getDatagramCapabilities");
                try {
                    dbfa dbfaVar = this.b.b;
                    dbda dbdaVar = (dbda) dbdb.a.createBuilder();
                    dbdaVar.getClass();
                    evsn evsnVarBuild = dbdaVar.build();
                    evsnVarBuild.getClass();
                    this.c = eieuVarH;
                    this.a = 1;
                    Object objB = dbfaVar.b((dbdb) evsnVarBuild, new fbrg(), this);
                    if (objB == r0) {
                        return r0;
                    }
                    closeable = eieuVarH;
                    obj = objB;
                } catch (StatusException e3) {
                    closeable = eieuVarH;
                    e = e3;
                    ekrw ekrwVarJ2 = clli.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleSatellite");
                    ((ekrd) ((ekrd) ekrwVarJ2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 276, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.getDatagramCapabilities failed");
                    Object objA2 = fctl.a(e);
                    fczl.a(closeable, null);
                    obj2 = objA2;
                    return new fctk(obj2);
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
            dbdd dbddVar = (dbdd) obj;
            fczl.a(closeable, null);
            ekrw ekrwVarH2 = clli.a.h();
            ekrwVarH2.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 282, "OutgoingSatelliteApiImpl.kt")).r("Call SendDatagramService.getDatagramCapabilities succeeded, maxDatagramSize: [%d].", dbddVar.b);
            obj2 = dbddVar;
            return new fctk(obj2);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clkt clktVar = new clkt(fcxyVar, this.b);
        clktVar.c = obj;
        return clktVar;
    }
}
