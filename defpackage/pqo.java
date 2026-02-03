package defpackage;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqo implements WebMessageCallbackBoundaryInterface {
    private final ppl a;

    public pqo(ppl pplVar) {
        this.a = pplVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public final void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        ppk ppkVarA = pqn.a((WebMessageBoundaryInterface) fgho.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (ppkVarA != null) {
            ppl pplVar = this.a;
            new pqr(invocationHandler);
            pplVar.a(ppkVarA);
        }
    }
}
