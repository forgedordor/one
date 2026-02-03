package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddcu extends dddf {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long h;
    final /* synthetic */ GoogleHelp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddcu(dcfq dcfqVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(dcfqVar);
        this.a = bundle;
        this.h = j;
        this.i = googleHelp;
    }

    @Override // defpackage.ddde
    protected final void d(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.saveAsyncFeedbackPsd(this.a, this.h, this.i, new ddct(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            k(dddg.a);
        }
    }
}
