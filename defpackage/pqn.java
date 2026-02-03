package defpackage;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqn implements WebMessageBoundaryInterface {
    private static final String[] a = {"WEB_MESSAGE_ARRAY_BUFFER"};
    private final ppk b;

    public pqn(ppk ppkVar) {
        this.b = ppkVar;
    }

    public static ppk a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        ppm[] ppmVarArr = new ppm[ports.length];
        for (int i = 0; i < ports.length; i++) {
            ppmVarArr[i] = new pqr(ports[i]);
        }
        if (!pqx.b.d()) {
            return new ppk(webMessageBoundaryInterface.getData(), ppmVarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) fgho.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new ppk(webMessagePayloadBoundaryInterface.getAsString(), ppmVarArr);
        }
        if (type != 1) {
            return null;
        }
        return new ppk(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), ppmVarArr);
    }

    public static boolean b() {
        return pqx.b.d();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public final String getData() {
        return this.b.a();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        pqq pqqVar;
        ppk ppkVar = this.b;
        if (ppkVar.c != 0) {
            ppkVar.b(1);
            byte[] bArr = ppkVar.b;
            bArr.getClass();
            bArr.getClass();
            pqqVar = new pqq(bArr);
        } else {
            pqqVar = new pqq(ppkVar.a());
        }
        return new fghn(pqqVar);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        ppm[] ppmVarArr = this.b.a;
        if (ppmVarArr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[ppmVarArr.length];
        for (int i = 0; i < ppmVarArr.length; i++) {
            invocationHandlerArr[i] = ppmVarArr[i].b();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return a;
    }
}
