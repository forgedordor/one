package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cliv extends fcyz implements fdat {
    final /* synthetic */ Intent a;
    final /* synthetic */ SatelliteConnectionChangeReceiver b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cliv(fcxy fcxyVar, Intent intent, SatelliteConnectionChangeReceiver satelliteConnectionChangeReceiver) {
        super(2, fcxyVar);
        this.a = intent;
        this.b = satelliteConnectionChangeReceiver;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cliv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.c
            fdjx r5 = (defpackage.fdjx) r5
            android.content.Intent r5 = r4.a
            java.lang.String r0 = r5.getAction()
            if (r0 == 0) goto L9d
            int r1 = r0.hashCode()
            r2 = -1956656081(0xffffffff8b5fcc2f, float:-4.3101848E-32)
            r3 = 0
            if (r1 == r2) goto L50
            r2 = 1354019195(0x50b4b17b, float:2.42522419E10)
            if (r1 == r2) goto L2e
            r2 = 1447318436(0x564453a4, float:5.3965878E13)
            if (r1 == r2) goto L25
            goto L9d
        L25:
            java.lang.String r1 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_WIFI_CONNECTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9d
            goto L59
        L2e:
            java.lang.String r5 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_NEW_SATELLITE_CONNECTION"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L9d
            com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver r5 = r4.b
            fcsu r5 = r5.m()
            java.lang.Object r5 = r5.b()
            egsh r5 = (defpackage.egsh) r5
            r0 = 1
            r1 = 6
            egsn r0 = defpackage.clim.a(r0, r3, r3, r1)
            com.google.common.util.concurrent.ListenableFuture r5 = r5.c(r0)
            defpackage.auvh.h(r5)
            goto L9d
        L50:
            java.lang.String r1 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_CELLULAR_CONNECTION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L9d
        L59:
            java.lang.String r0 = "MyIdentityToken"
            java.lang.String r5 = r5.getStringExtra(r0)
            if (r5 != 0) goto L84
            ekrg r5 = com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver.a
            ekrw r5 = r5.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleSatellite"
            r5.X(r0, r1)
            r0 = 68
            java.lang.String r1 = "SatelliteConnectionChangeReceiver.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionChangeReceiver$doInBackgroundAsync$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Could not process lost satellite connection due to missing myIdentityToken"
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L84:
            com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver r0 = r4.b
            fcsu r0 = r0.m()
            java.lang.Object r0 = r0.b()
            egsh r0 = (defpackage.egsh) r0
            r1 = 2
            r2 = 4
            egsn r5 = defpackage.clim.a(r1, r5, r3, r2)
            com.google.common.util.concurrent.ListenableFuture r5 = r0.c(r5)
            defpackage.auvh.h(r5)
        L9d:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cliv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cliv clivVar = new cliv(fcxyVar, this.a, this.b);
        clivVar.c = obj;
        return clivVar;
    }
}
