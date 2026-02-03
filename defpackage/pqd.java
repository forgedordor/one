package defpackage;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pqd extends WebMessagePort.WebMessageCallback {
    final /* synthetic */ ppl a;

    public pqd(ppl pplVar) {
        this.a = pplVar;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.a.a(new ppk(webMessage.getData(), pqr.f(webMessage.getPorts())));
    }
}
