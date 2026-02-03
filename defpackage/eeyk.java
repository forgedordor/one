package defpackage;

import android.os.Bundle;
import com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eeyk extends IAppUpdateServiceCallback.Stub {
    final eeza a;
    final defr b;
    final /* synthetic */ eeyn c;

    public eeyk(eeyn eeynVar, eeza eezaVar, defr defrVar) {
        this.c = eeynVar;
        this.a = eezaVar;
        this.b = defrVar;
    }

    @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public void onCompleteUpdate(Bundle bundle) {
        this.c.b.e(this.b);
        this.a.d("onCompleteUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public void onRequestInfo(Bundle bundle) {
        this.c.b.e(this.b);
        this.a.d("onRequestInfo", new Object[0]);
    }
}
