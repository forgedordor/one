package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eydn implements eycv {
    public final eydj a;
    public final eydp b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final eyce f;
    private final CronetEngine g;
    private final ExecutorService h;

    public eydn(String str, String str2, eyce eyceVar, CronetEngine cronetEngine, ExecutorService executorService, eydj eydjVar, eydp eydpVar) {
        this.d = str;
        this.e = str2;
        this.f = eyceVar;
        this.g = cronetEngine;
        this.h = executorService;
        this.a = eydjVar;
        this.b = eydpVar;
    }

    @Override // defpackage.eycv
    public final long a() {
        return this.b.a.get();
    }

    @Override // defpackage.eycv
    public final ListenableFuture b() {
        CronetEngine cronetEngine = this.g;
        String str = this.d;
        eydj eydjVar = this.a;
        ExecutorService executorService = this.h;
        UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(str, eydjVar, executorService);
        builderNewUrlRequestBuilder.setHttpMethod(this.e);
        eyce eyceVar = this.f;
        for (String str2 : eyceVar.c()) {
            Iterator it = eyceVar.b(str2).iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(str2, (String) it.next());
            }
        }
        if (!eyceVar.f(ffho.a)) {
            builderNewUrlRequestBuilder.addHeader(ffho.a, eomm.b.toString());
        }
        eydp eydpVar = this.b;
        builderNewUrlRequestBuilder.addHeader("Content-Length", String.valueOf(eydpVar != null ? eydpVar.c : 0L));
        if (eydpVar != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(eydpVar, executorService);
        }
        if (builderNewUrlRequestBuilder instanceof ExperimentalUrlRequest.Builder) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) builderNewUrlRequestBuilder;
            builder.setTrafficStatsTag(-1);
            builder.setTrafficStatsUid(-1);
        }
        this.c = builderNewUrlRequestBuilder.build();
        executorService.execute(new Runnable() { // from class: eydm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.start();
            }
        });
        return eydjVar.a;
    }

    @Override // defpackage.eycv
    public final String d() {
        return this.d;
    }

    @Override // defpackage.eycv
    public final void e(final eycz eyczVar, final int i, final int i2) {
        this.h.execute(new Runnable() { // from class: eydl
            @Override // java.lang.Runnable
            public final void run() {
                eydn eydnVar = this.a;
                eydp eydpVar = eydnVar.b;
                if (eydpVar != null) {
                    int i3 = i2;
                    int i4 = i;
                    eycz eyczVar2 = eyczVar;
                    eydpVar.d = i4;
                    eydpVar.e = i3;
                    eydpVar.b = new eydo(eyczVar2, eydnVar);
                }
            }
        });
    }

    @Override // defpackage.eycv
    public final void f() {
        if (this.c != null) {
            this.h.execute(new Runnable() { // from class: eydk
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.cancel();
                }
            });
        }
    }
}
