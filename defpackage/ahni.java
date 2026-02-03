package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahni implements drzg {
    private final ahkn a;

    public ahni(ahkn ahknVar) {
        this.a = ahknVar;
    }

    @Override // defpackage.drzg
    public final /* synthetic */ void a(BroadcastReceiver broadcastReceiver) {
        ahkn ahknVar = this.a;
        TestingToolsBroadcastReceiver testingToolsBroadcastReceiver = (TestingToolsBroadcastReceiver) broadcastReceiver;
        testingToolsBroadcastReceiver.b = (dxgg) ahknVar.gP.b();
        testingToolsBroadcastReceiver.c = (dski) ahknVar.hP.b();
        testingToolsBroadcastReceiver.d = (dxgg) ahknVar.gY.b();
        testingToolsBroadcastReceiver.e = (dskf) ahknVar.gR.b();
        testingToolsBroadcastReceiver.f = (dskm) ahknVar.gT.b();
        ahnh ahnhVar = ahknVar.a;
        testingToolsBroadcastReceiver.g = (drzl) ahnhVar.vt.b();
        testingToolsBroadcastReceiver.h = (eosc) ahknVar.gL.b();
        testingToolsBroadcastReceiver.i = eyie.a(ahnhVar.vN);
        testingToolsBroadcastReceiver.j = ahknVar.dP();
        testingToolsBroadcastReceiver.k = (eosc) ahknVar.hF.b();
        testingToolsBroadcastReceiver.l = (Context) ahknVar.t.b();
        testingToolsBroadcastReceiver.m = (ListenableFuture) ahknVar.hd.b();
        testingToolsBroadcastReceiver.n = ahnhVar.rl();
        testingToolsBroadcastReceiver.o = ahnhVar.qS();
        testingToolsBroadcastReceiver.p = (dxgg) ahknVar.ha.b();
        ahnh ahnhVar2 = ahknVar.b.a.a;
        testingToolsBroadcastReceiver.q = ejwi.j(new dxno((dxnl) ahnhVar2.vJ.b(), (fdjx) ahnhVar2.m.b()));
        testingToolsBroadcastReceiver.r = ahknVar.hz;
    }
}
