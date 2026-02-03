package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esnj implements esmw {
    public static final eksp a = eksp.c("xRPC");
    public static final AtomicInteger b = new AtomicInteger();
    public final Executor c;
    public final eooy d;
    private final ekhx e;

    public esnj(final esmx esmxVar) {
        this.c = esmxVar.a;
        final egpe egpeVar = new egpe(new eooy() { // from class: esna
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eksp ekspVar = esnj.a;
                return eork.i((CronetEngine) esmxVar.d.b());
            }
        }, esmxVar.c);
        this.d = new eooy() { // from class: esnb
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eksp ekspVar = esnj.a;
                return eork.j(egpeVar.c());
            }
        };
        this.e = esmxVar.e.g();
    }

    @Override // defpackage.esmw
    public final ListenableFuture a(final esnp esnpVar) {
        ListenableFuture listenableFutureH;
        eieu eieuVarK = eiiy.k("Http Request");
        try {
            ekhx ekhxVar = this.e;
            ekhx ekhxVar2 = esnpVar.i;
            if (ekhxVar2.isEmpty() && ekhxVar.isEmpty()) {
                listenableFutureH = eork.i(esnpVar);
            } else {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekqg ekqgVarListIterator = ekhxVar.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    ekfwVar.h(eork.n(((esns) ekqgVarListIterator.next()).a(), eoqg.a));
                }
                ekqg ekqgVarListIterator2 = ekhxVar2.listIterator();
                while (ekqgVarListIterator2.hasNext()) {
                    ekfwVar.h(eork.n(((esns) ekqgVarListIterator2.next()).a(), eoqg.a));
                }
                listenableFutureH = eijx.a(ekfwVar.g()).h(new ejvr() { // from class: esnt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        esnp esnpVar2 = esnpVar;
                        ekjo ekjoVar = esnpVar2.c;
                        String str = esnpVar2.a;
                        Uri uri = Uri.parse(str);
                        HashSet hashSet = new HashSet(ekjoVar.x());
                        HashSet hashSet2 = new HashSet(uri.getQueryParameterNames());
                        ekgc ekgcVar = new ekgc();
                        ekgcVar.c(ekjoVar);
                        Uri.Builder builderBuildUpon = uri.buildUpon();
                        for (esnq esnqVar : (List) obj) {
                            for (esnm esnmVar : esnqVar.a().x()) {
                                if (!hashSet.add(esnmVar)) {
                                    throw new esnr(String.format("Duplicate header key: %s", esnmVar.a()));
                                }
                            }
                            for (String str2 : esnqVar.b().x()) {
                                if (!hashSet2.add(str2)) {
                                    throw new esnr(String.format("Duplicate url parameter key: %s", str2));
                                }
                            }
                            ekgcVar.c(esnqVar.a());
                            ekqg ekqgVarListIterator3 = esnqVar.b().u().listIterator();
                            while (ekqgVarListIterator3.hasNext()) {
                                Map.Entry entry = (Map.Entry) ekqgVarListIterator3.next();
                                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        esnn esnnVar = new esnn();
                        esnnVar.b(ekjoVar);
                        int i2 = esnpVar2.f;
                        if (i2 != 0 && i2 != 1 && i2 != 2) {
                            i2 = 3;
                        }
                        ejwl.l(true);
                        esnnVar.e = i2;
                        esnnVar.d = esnpVar2.e;
                        ekhx ekhxVar3 = esnpVar2.i;
                        Set set = esnnVar.i;
                        set.addAll(ekhxVar3);
                        if (str != null) {
                            esnnVar.e(str);
                        }
                        String str3 = esnpVar2.g;
                        if (str3 != null) {
                            esnnVar.c(str3);
                        }
                        if (esnpVar2.b) {
                            esnnVar.g = true;
                        }
                        esno esnoVar = esnpVar2.d;
                        if (esnoVar != null) {
                            esnnVar.d(esnoVar.a, esnoVar.b);
                        }
                        Long l = esnpVar2.h;
                        if (l != null) {
                            l.longValue();
                            esnnVar.h = l;
                        }
                        Integer num = esnpVar2.j;
                        if (num != null) {
                            num.intValue();
                            esnnVar.j = num;
                        }
                        Integer num2 = esnpVar2.k;
                        if (num2 != null) {
                            num2.intValue();
                            esnnVar.k = num2;
                        }
                        set.clear();
                        esnnVar.b.q();
                        esnnVar.e(builderBuildUpon.build().toString());
                        esnnVar.b(ekgcVar.a());
                        return esnnVar.a();
                    }
                }, eoqg.a);
            }
            ListenableFuture listenableFutureG = eooq.g(listenableFutureH, eiid.d(new eooz() { // from class: esmz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final esnp esnpVar2 = (esnp) obj;
                    String scheme = Uri.parse(esnpVar2.a).getScheme();
                    if (!esnpVar2.b && !ejuf.e(scheme, "https")) {
                        ((eksl) ((eksl) esnj.a.i()).h("com/google/frameworks/client/data/android/HttpClientImpl", "makeRequest", 85, "HttpClientImpl.java")).q("Making plaintext http request");
                    }
                    final esnj esnjVar = this.a;
                    eooy eooyVar = esnjVar.d;
                    eoqg eoqgVar = eoqg.a;
                    return eooq.g(eork.n(eooyVar, eoqgVar), eiid.d(new eooz() { // from class: esmy
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            Executor executor = esnjVar.c;
                            esnp esnpVar3 = esnpVar2;
                            SettableFuture settableFutureCreate = SettableFuture.create();
                            esni esniVar = new esni(settableFutureCreate, executor, esnpVar3);
                            String str = esnpVar3.a;
                            eoqg eoqgVar2 = eoqg.a;
                            UrlRequest.Builder builderAllowDirectExecutor = ((CronetEngine) obj2).newUrlRequestBuilder(str, esniVar, eoqgVar2).allowDirectExecutor();
                            String str2 = esnpVar3.g;
                            if (str2 != null) {
                                builderAllowDirectExecutor.setHttpMethod(str2);
                            }
                            for (Map.Entry entry : esnpVar3.c.u()) {
                                builderAllowDirectExecutor.addHeader(((esnm) entry.getKey()).a(), (String) entry.getValue());
                            }
                            esno esnoVar = esnpVar3.d;
                            if (esnoVar != null) {
                                builderAllowDirectExecutor.addHeader(ffho.a, esnoVar.a);
                                builderAllowDirectExecutor.setUploadDataProvider(new esne(esnoVar), eoqgVar2);
                            }
                            if (builderAllowDirectExecutor instanceof ExperimentalUrlRequest.Builder) {
                                ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) builderAllowDirectExecutor;
                                Integer num = esnpVar3.j;
                                if (num != null) {
                                    builder.setTrafficStatsUid(num.intValue());
                                }
                                Integer num2 = esnpVar3.k;
                                if (num2 != null) {
                                    builder.setTrafficStatsTag(num2.intValue());
                                }
                                Long l = esnpVar3.h;
                                if (l != null) {
                                    builder.bindToNetwork(l.longValue());
                                }
                            }
                            builderAllowDirectExecutor.setPriority(esnpVar3.f);
                            int andIncrement = esnj.b.getAndIncrement();
                            UrlRequest urlRequestBuild = builderAllowDirectExecutor.build();
                            settableFutureCreate.b(new esnc(andIncrement, settableFutureCreate, urlRequestBuild), eoqgVar2);
                            ((eksl) esnj.a.n().h("com/google/frameworks/client/data/android/HttpClientImpl", "makeRequestImpl", 175, "HttpClientImpl.java")).w("[%d] Starting HTTP request to %s", andIncrement, str);
                            urlRequestBuild.start();
                            return settableFutureCreate;
                        }
                    }), eoqgVar);
                }
            }), eoqg.a);
            eieuVarK.b(listenableFutureG);
            eieuVarK.close();
            return listenableFutureG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
