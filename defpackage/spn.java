package defpackage;

import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.android.apps.aicore.client.api.internal.IgnoreCancellationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spn extends snq implements smp {
    public static final /* synthetic */ int h = 0;
    private static final String i = "spn";

    public spn(smj smjVar, smq smqVar, ejcr ejcrVar) {
        super(smjVar, smqVar, ejcrVar);
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ Object c(IAICoreService iAICoreService) {
        return iAICoreService.getSmartReplyService(this.c.e());
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ ICancellationCallback d(Object obj, Object obj2, sno snoVar) {
        return ((ISmartReplyService) obj).runCancellableInference(((spk) obj2).c(), new spm(snoVar));
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        ISmartReplyService iSmartReplyService = (ISmartReplyService) obj2;
        if (iSmartReplyService.getApiVersion() >= 4) {
            return iSmartReplyService.getTokenInfo(((spk) obj).c(), true, iTokenizationCallback);
        }
        Log.w(i, "Ignoring getTokenInfo because service is older than V5");
        iTokenizationCallback.onTokenizationFailure(16);
        return new IgnoreCancellationCallback();
    }
}
