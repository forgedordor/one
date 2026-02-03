package defpackage;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import j$.util.Collection;
import java.util.List;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absx extends WebChromeClient implements lun {
    public static final /* synthetic */ int d = 0;
    private static final cqce e = cqce.g("Bugle", "DittoWebChromeClient");
    final adq a;
    ValueCallback b;
    adj c;
    private final adx f = new aeb();

    public absx(adq adqVar) {
        this.a = adqVar;
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        this.c = this.a.c("DittoWebChromeClient_onShowFileChooser", lvjVar, this.f, new adi() { // from class: absv
            @Override // defpackage.adi
            public final void a(Object obj) {
                List list = (List) obj;
                ValueCallback valueCallback = this.a.b;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue((Uri[]) Collection.EL.stream(list).toArray(new IntFunction() { // from class: absw
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            int i2 = absx.d;
                            return new Uri[i];
                        }
                    }));
                }
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        cqbd cqbdVarA = e.a();
        cqbdVarA.I("Console");
        cqbdVarA.y("lineNumber", consoleMessage.lineNumber());
        cqbdVarA.A("sourceId", consoleMessage.sourceId());
        cqbdVarA.A("message", consoleMessage.message());
        cqbdVarA.r();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.b = valueCallback;
        this.c.c("*/*");
        return true;
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
