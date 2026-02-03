package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eexz extends ResultReceiver {
    final /* synthetic */ defr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eexz(Handler handler, defr defrVar) {
        super(handler);
        this.a = defrVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.a.d(-1);
        } else if (i != 2) {
            this.a.d(1);
        } else {
            this.a.d(0);
        }
    }
}
