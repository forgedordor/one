package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daoc extends ResultReceiver {
    final /* synthetic */ daoe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daoc(daoe daoeVar) {
        super(null);
        this.a = daoeVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 2 || i == 0) {
            cqdq.b(new Runnable() { // from class: daoa
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.d(true);
                }
            });
            return;
        }
        if (i == 3 || i == 1) {
            cqdq.b(new Runnable() { // from class: daob
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.d(false);
                }
            });
            return;
        }
        cqbd cqbdVarB = daoe.a.b();
        cqbdVarB.I("Received unexpected IME operation result:");
        cqbdVarB.G(i);
        cqbdVarB.r();
    }
}
