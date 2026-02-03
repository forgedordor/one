package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clla extends fcyz implements fdat {
    int a;
    final /* synthetic */ clli b;
    final /* synthetic */ dbeu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clla(fcxy fcxyVar, clli clliVar, dbeu dbeuVar) {
        super(2, fcxyVar);
        this.b = clliVar;
        this.c = dbeuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clla) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                closeable = (Closeable) this.d;
                try {
                    fctl.b(obj);
                } catch (StatusException e2) {
                    e = e2;
                    ekrw ekrwVarJ = clli.a.j();
                    ekrwVarJ.X(eksq.a, "BugleSatellite");
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 149, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.sendDatagram failed");
                    Object objA = fctl.a(e);
                    fczl.a(closeable, null);
                    obj2 = objA;
                    return new fctk(obj2);
                }
            } else {
                fctl.b(obj);
                ekrw ekrwVarH = clli.a.h();
                ekrwVarH.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 140, "OutgoingSatelliteApiImpl.kt")).q("Calling SendDatagramService.sendDatagram");
                eieu eieuVarH = eiiy.h("SendDatagramService.SendDatagram");
                try {
                    dbfa dbfaVar = this.b.b;
                    dbeu dbeuVar = this.c;
                    this.d = eieuVarH;
                    this.a = 1;
                    Object objC = dbfaVar.c(dbeuVar, new fbrg(), this);
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
                    ((ekrd) ((ekrd) ekrwVarJ2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 149, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.sendDatagram failed");
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
            dbew dbewVar = (dbew) obj;
            fczl.a(closeable, null);
            ekrw ekrwVarH2 = clli.a.h();
            ekrwVarH2.X(eksq.a, "BugleSatellite");
            ekrd ekrdVar = (ekrd) ekrwVarH2;
            ekrdVar.X(cqnc.ac, new baro(dbewVar.b));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 158, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.sendDatagram succeeded");
            obj2 = dbewVar;
            return new fctk(obj2);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clla cllaVar = new clla(fcxyVar, this.b, this.c);
        cllaVar.d = obj;
        return cllaVar;
    }
}
