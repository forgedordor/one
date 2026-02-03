package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgoo implements cgjn {
    final /* synthetic */ fcsu a;
    final /* synthetic */ cgqd b;
    final /* synthetic */ fcsu c;

    public cgoo(fcsu fcsuVar, cgqd cgqdVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = cgqdVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.cgjn
    public final eiju a(List list) {
        if (list.isEmpty()) {
            ((eksl) ((eksl) cgop.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$5", "onNotificationCanceled", 223, "IncomingMessageCallbacksModule.java")).q("No notification data when trying to cancel notification");
            return eijx.e(null);
        }
        ((cgfk) this.c.b()).a(cgfj.a);
        cgqd cgqdVar = this.b;
        ((cgkd) list.get(0)).b();
        return cgqdVar.a();
    }

    @Override // defpackage.cgjn
    public final eiju b(List list) {
        if (list.isEmpty()) {
            ((eksl) ((eksl) cgop.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$5", "onNotificationPosted", 263, "IncomingMessageCallbacksModule.java")).q("No notification data when trying to post notification");
            return eijx.e(null);
        }
        cgqd cgqdVar = this.b;
        ((cgkd) list.get(0)).b();
        return cgqdVar.a();
    }

    @Override // defpackage.cgjn
    public final eiju c(cgkd cgkdVar) {
        ((cgdh) this.a.b()).e(5, Duration.ZERO);
        return this.b.a();
    }

    @Override // defpackage.cgjn
    public final eiju d(cgkd cgkdVar) {
        return this.b.a();
    }

    @Override // defpackage.cgjn
    public final eiju e(cgkd cgkdVar) {
        ((cgdh) this.a.b()).e(5, Duration.ZERO);
        return this.b.a();
    }

    @Override // defpackage.cgjn
    public final eiju f(cgkd cgkdVar) {
        ((cgfk) this.c.b()).a(cgfj.a);
        return this.b.a();
    }
}
