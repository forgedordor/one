package defpackage;

import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IMagicRewriteService;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.android.apps.aicore.client.api.internal.IgnoreCancellationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spb extends snq implements smp {
    public static final /* synthetic */ int h = 0;
    private static final String i = "spb";

    public spb(smj smjVar, smq smqVar, ejcr ejcrVar) {
        super(smjVar, smqVar, ejcrVar);
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ Object c(IAICoreService iAICoreService) {
        return iAICoreService.getMagicRewriteService(this.c.e());
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ ICancellationCallback d(Object obj, Object obj2, sno snoVar) {
        return ((IMagicRewriteService) obj).runCancellableInference(((soy) obj2).g(), new spa(snoVar));
    }

    @Override // defpackage.snq
    protected final /* bridge */ /* synthetic */ ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        soy soyVar = (soy) obj;
        IMagicRewriteService iMagicRewriteService = (IMagicRewriteService) obj2;
        if (iMagicRewriteService.getApiVersion() >= 2) {
            return iMagicRewriteService.getTokenInfo(soyVar.g(), true, iTokenizationCallback);
        }
        Log.w(i, "Ignoring getTokenInfo because service is older than 2");
        iTokenizationCallback.onTokenizationFailure(16);
        return new IgnoreCancellationCallback();
    }
}
