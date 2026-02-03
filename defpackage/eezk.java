package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezk extends eezj {
    public eezk(eezl eezlVar, defr defrVar) {
        super(eezlVar, new eeza("OnRequestInstallCallback"), defrVar);
    }

    @Override // defpackage.eezj, com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback
    public final void onGetLaunchReviewFlowInfo(Bundle bundle) {
        super.onGetLaunchReviewFlowInfo(bundle);
        this.b.d(new eezb((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
