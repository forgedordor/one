package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atcl implements atco {
    private final fcsu a;

    public atcl(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.atco
    public final /* bridge */ /* synthetic */ atcn a(String str, UrlRequest.Callback callback) {
        atcj atcjVar = (atcj) this.a.b();
        atcjVar.getClass();
        str.getClass();
        callback.getClass();
        return new atck(atcjVar, str, callback);
    }
}
