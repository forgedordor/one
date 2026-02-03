package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atbi implements atcn {
    public final UrlRequest.Builder a;
    private final Optional b = Optional.empty();

    public atbi(eosc eoscVar, fcsu fcsuVar, String str, UrlRequest.Callback callback) {
        this.a = ((cojh) fcsuVar.b()).a().newUrlRequestBuilder(str, callback, eoscVar).setTrafficStatsTag(8194);
    }

    @Override // defpackage.atcn
    public final atcm a() {
        String string = ((atbr) this.b.orElse(atbr.GET)).toString();
        UrlRequest.Builder builder = this.a;
        builder.setHttpMethod(string);
        UrlRequest urlRequestBuild = builder.build();
        urlRequestBuild.getClass();
        return new atbf(urlRequestBuild);
    }

    @Override // defpackage.atcn
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.a.addHeader("Range", str);
    }

    @Override // defpackage.atcn
    public final /* bridge */ /* synthetic */ void c(ekhe ekheVar) {
        Iterable$EL.forEach(ekheVar.u(), new Consumer() { // from class: atbh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                this.a.a.addHeader((String) entry.getKey(), (String) entry.getValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
