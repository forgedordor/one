package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfa implements Runnable {
    final /* synthetic */ fcfb a;

    public fcfa(fcfb fcfbVar) {
        this.a = fcfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfb fcfbVar = this.a;
        fcfd fcfdVar = fcfbVar.c;
        Collection collection = fcfdVar.n;
        collection.remove(fcfbVar.a);
        if (fcfdVar.r.a == fbnv.SHUTDOWN && collection.isEmpty()) {
            fcfdVar.e();
        }
    }
}
