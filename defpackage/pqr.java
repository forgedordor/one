package defpackage;

import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqr extends ppm {
    private WebMessagePort a;
    private WebMessagePortBoundaryInterface b;

    public pqr(WebMessagePort webMessagePort) {
        this.a = webMessagePort;
    }

    public static ppm[] f(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        ppm[] ppmVarArr = new ppm[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            ppmVarArr[i] = new pqr(webMessagePortArr[i]);
        }
        return ppmVarArr;
    }

    private final WebMessagePort g() throws IllegalArgumentException {
        if (this.a == null) {
            prd prdVar = pqy.a;
            this.a = (WebMessagePort) prdVar.a.convertWebMessagePort(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    private final WebMessagePortBoundaryInterface h() {
        if (this.b == null) {
            prd prdVar = pqy.a;
            this.b = (WebMessagePortBoundaryInterface) fgho.a(WebMessagePortBoundaryInterface.class, prdVar.a.convertWebMessagePort(this.a));
        }
        return this.b;
    }

    @Override // defpackage.ppm
    public final WebMessagePort a() {
        return g();
    }

    @Override // defpackage.ppm
    public final InvocationHandler b() {
        return Proxy.getInvocationHandler(h());
    }

    @Override // defpackage.ppm
    public final void c() {
        ppu ppuVar = pqx.a;
        g().close();
    }

    @Override // defpackage.ppm
    public final void d(ppk ppkVar) {
        int i = ppkVar.c;
        ppu ppuVar = pqx.a;
        if (i == 0) {
            g().postMessage(pqe.a(ppkVar));
        } else {
            if (!ppuVar.d() || !pqn.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            h().postMessage(new fghn(new pqn(ppkVar)));
        }
    }

    @Override // defpackage.ppm
    public final void e(ppl pplVar) {
        if (pqx.c.d()) {
            h().setWebMessageCallback(new fghn(new pqo(pplVar)));
        } else {
            g().setWebMessageCallback(new pqd(pplVar));
        }
    }

    public pqr(InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface) fgho.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
