package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpg implements Runnable {
    final /* synthetic */ fcpj a;

    public fcpg(fcpj fcpjVar) {
        this.a = fcpjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcpj fcpjVar = this.a;
        fcpjVar.o.execute(fcpjVar.q);
        synchronized (fcpjVar.m) {
            fcpjVar.z = Alert.DURATION_SHOW_INDEFINITELY;
            fcpjVar.r();
        }
    }
}
