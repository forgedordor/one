package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atck implements atcn {
    private final atcj a;
    private final String b;
    private final UrlRequest.Callback c;
    private final ekha d = new ekha();
    private final Optional e = Optional.empty();
    private final Optional f = Optional.empty();

    public atck(atcj atcjVar, String str, UrlRequest.Callback callback) {
        this.a = atcjVar;
        this.b = str;
        this.c = callback;
    }

    @Override // defpackage.atcn
    public final atcm a() {
        Optional optional = this.e;
        optional.isPresent();
        atbr atbrVar = (atbr) this.f.orElse(atbr.GET);
        atcj atcjVar = this.a;
        fcsu fcsuVar = atcjVar.a;
        ekhe ekheVarF = this.d.f();
        eosd eosdVar = (eosd) fcsuVar.b();
        eosdVar.getClass();
        atbrVar.getClass();
        return new atci(eosdVar, atcjVar.b, this.b, this.c, ekheVarF, optional, atbrVar);
    }

    @Override // defpackage.atcn
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.d.l("Range", str);
    }

    @Override // defpackage.atcn
    public final /* bridge */ /* synthetic */ void c(ekhe ekheVar) {
        this.d.i(ekheVar);
    }
}
