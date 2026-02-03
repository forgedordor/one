package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atci implements atcm {
    public static final eksp a = eksp.c("BugleFileTransfer");
    static final cczi b = cdag.e(cdag.b, "ft_http_request_connect_timeout_millis", 15000);
    static final cczi c = cdag.e(cdag.b, "ft_http_request_read_timeout_millis", 10000);
    private final eosd d;
    private final UrlRequest e;
    private ScheduledFuture f;

    public atci(final eosd eosdVar, fcsu fcsuVar, String str, UrlRequest.Callback callback, ekhe ekheVar, Optional optional, atbr atbrVar) {
        this.d = eosdVar;
        final UrlRequest.Builder trafficStatsTag = ((CronetEngine) fcsuVar.b()).newUrlRequestBuilder(str, new atch(this, callback), eosdVar).setHttpMethod(atbrVar.toString()).setTrafficStatsTag(8194);
        ekqg ekqgVarListIterator = ekheVar.u().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            trafficStatsTag.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        optional.ifPresent(new Consumer() { // from class: atcg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = atci.a;
                trafficStatsTag.setUploadDataProvider((UploadDataProvider) obj, eosdVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.e = trafficStatsTag.build();
    }

    private final void e(int i) {
        this.f = this.d.schedule(new Runnable() { // from class: atcf
            @Override // java.lang.Runnable
            public final void run() {
                ((eksl) ((eksl) atci.a.i()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest", "startTimer", 99, "MonitoredUrlRequest.java")).q("HTTP transaction timed out. Canceling file transfer.");
                this.a.a();
            }
        }, i, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.atcm
    public final void a() {
        this.e.cancel();
    }

    @Override // defpackage.atcm
    public final void b() {
        eksl ekslVar = (eksl) a.o().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 81, "MonitoredUrlRequest.java");
        cczi ccziVar = b;
        ekslVar.t("HTTP request starting, starting connection timer (%d millis)", ccziVar.e());
        e(((Integer) ccziVar.e()).intValue());
        this.e.start();
    }

    public final void c() {
        ScheduledFuture scheduledFuture = this.f;
        scheduledFuture.getClass();
        scheduledFuture.cancel(false);
    }

    public final void d(int i) {
        c();
        e(i);
    }
}
