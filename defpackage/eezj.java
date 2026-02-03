package defpackage;

import android.os.Bundle;
import com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eezj extends IInAppReviewServiceCallback.Stub {
    final eeza a;
    final defr b;
    final /* synthetic */ eezl c;

    public eezj(eezl eezlVar, eeza eezaVar, defr defrVar) {
        this.c = eezlVar;
        this.a = eezaVar;
        this.b = defrVar;
    }

    @Override // com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback
    public void onGetLaunchReviewFlowInfo(Bundle bundle) {
        eezy eezyVar = this.c.b;
        if (eezyVar != null) {
            eezyVar.e(this.b);
        }
        this.a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
