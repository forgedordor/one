package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eezf extends ResultReceiver {
    final /* synthetic */ defr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eezf(Handler handler, defr defrVar) {
        super(handler);
        this.a = defrVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.a.d(null);
    }
}
