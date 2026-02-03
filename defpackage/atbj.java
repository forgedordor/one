package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atbj implements atco {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public atbj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    @Override // defpackage.atco
    public final /* bridge */ /* synthetic */ atcn a(String str, UrlRequest.Callback callback) {
        eosc eoscVar = (eosc) this.a.b();
        eoscVar.getClass();
        ((atbg) this.c.b()).getClass();
        str.getClass();
        callback.getClass();
        return new atbi(eoscVar, this.b, str, callback);
    }
}
