package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeyl extends eeyk {
    public eeyl(eeyn eeynVar, defr defrVar) {
        super(eeynVar, new eeza("OnCompleteUpdateCallback"), defrVar);
    }

    @Override // defpackage.eeyk, com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public final void onCompleteUpdate(Bundle bundle) {
        super.onCompleteUpdate(bundle);
        if (eeyn.a(bundle) != 0) {
            this.b.c(new eeyv(eeyn.a(bundle)));
        } else {
            this.b.d(null);
        }
    }
}
