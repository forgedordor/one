package defpackage;

import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextService;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.android.apps.aicore.client.api.internal.IgnoreCancellationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spr extends snq {
    private static final String h = "spr";

    public spr(smj smjVar, smq smqVar, ejcr ejcrVar) {
        super(smjVar, smqVar, ejcrVar);
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ Object c(IAICoreService iAICoreService) {
        return iAICoreService.getSuggestedTextService(this.c.e());
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ ICancellationCallback d(Object obj, Object obj2, sno snoVar) {
        return ((ISuggestedTextService) obj).runCancellableInference(((spk) obj2).d(), new spq(snoVar));
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        ISuggestedTextService iSuggestedTextService = (ISuggestedTextService) obj2;
        if (iSuggestedTextService.getApiVersion() >= 2) {
            return iSuggestedTextService.getTokenInfo(((spk) obj).d(), true, iTokenizationCallback);
        }
        Log.w(h, "Ignoring getTokenInfo because service is older than V3");
        iTokenizationCallback.onTokenizationFailure(16);
        return new IgnoreCancellationCallback();
    }
}
