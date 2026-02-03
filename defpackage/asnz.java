package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asnz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever");
    public static final cczv b = cdag.l(cdag.b, "rbm_business_info_retrieval_version_parameter", "1.5");
    public static final cczv c = cdag.e(cdag.b, "rbm_business_info_retrieval_short_code_http_timeout_millis", 5000);
    public static final Duration d;
    public final asoj e;
    public final aslf f;
    public final eosd g;
    public final cogw h;
    public final aqar i;
    public final LruCache j;
    public final ewto k;
    public volatile long l;
    private final eosc m;
    private final eosc n;

    static {
        cdag.h(cdag.b, "rbm_business_info_retrieval_enable_short_code_http_timeout", true);
        d = Duration.ofDays(7L);
    }

    public asnz(asoj asojVar, aslf aslfVar, eosd eosdVar, eosc eoscVar, eosc eoscVar2, cogw cogwVar, LruCache lruCache, aqar aqarVar, ewto ewtoVar) {
        this.e = asojVar;
        this.f = aslfVar;
        this.g = eosdVar;
        this.m = eoscVar;
        this.n = eoscVar2;
        this.h = cogwVar;
        this.j = lruCache;
        this.i = aqarVar;
        this.k = ewtoVar;
    }

    public static ekgb c(String str) {
        bswc bswcVarA = bswf.a();
        bswcVarA.t(bswf.c.b, 4);
        bswe bsweVar = new bswe();
        avbl avblVar = avbl.PROPERTY_X_GOOGLE_SHORT_CODE;
        bsweVar.ap(new dqty("rbm_business_info_properties.type", 1, Integer.valueOf(avblVar == null ? 0 : avblVar.ordinal())));
        bsweVar.ap(new dqpj("rbm_business_info_properties.property_value", 1, String.valueOf(str)));
        bswcVarA.k(new bswd(bsweVar));
        bswcVarA.A("getBusinessInfoDataSync-rbm_business_info_properties_by_short_code");
        Stream map = Collection.EL.stream(bswcVarA.b().z()).map(new Function() { // from class: asnw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = asnz.a;
                String[] strArr = bsyn.a;
                return (bswk) ((bsuv) obj).ax("rbm_business_info", bswk.class);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public final eiju a(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return eijx.d(new asoa("Retrieval requested for invalid bot ID", 2));
        }
        if ((Objects.equals(b.e(), "2") && this.i.a()) || this.e.b(str)) {
            LruCache lruCache = this.j;
            asnx asnxVar = (asnx) lruCache.get(str);
            if (asnxVar != null) {
                if (asnxVar.c > this.h.f().toEpochMilli()) {
                    return eijx.e(asnxVar);
                }
                lruCache.remove(str);
            }
        }
        Callable callable = new Callable() { // from class: asnt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekrg ekrgVar = asnz.a;
                return bsyn.a(str);
            }
        };
        eosc eoscVar = this.n;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: asnu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bswk bswkVar = (bswk) obj;
                final String strQ = null;
                if (bswkVar != null && z) {
                    strQ = bswkVar.q();
                }
                final String str2 = str;
                final asnz asnzVar = this.a;
                ekrw ekrwVarH = asnz.a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "retrieve", 175, "RbmBusinessInfoJsonRetriever.java")).D("Building HTTP request, Bot ID: %s, version: %s", str2, strQ);
                return eiju.g(kol.a(new koi() { // from class: asns
                    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
                    @Override // defpackage.koi
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(defpackage.kog r8) {
                        /*
                            Method dump skipped, instructions count: 422
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.asns.a(kog):java.lang.Object");
                    }
                }));
            }
        }, eoscVar).h(new ejvr() { // from class: asnv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                asnx asnxVar2 = (asnx) obj;
                boolean zEquals = Objects.equals(asnz.b.e(), "2");
                asnz asnzVar = this.a;
                String str2 = str;
                if ((zEquals && asnzVar.i.a()) || asnzVar.k.b.contains(str2)) {
                    asnzVar.j.put(str2, asnxVar2);
                }
                return asnxVar2;
            }
        }, this.m);
    }

    public final eiju b(String str, final Duration duration) {
        final String strA = aslf.a(str);
        if (TextUtils.isEmpty(strA)) {
            return eijx.d(new asoa("Invalid Short Code: ".concat(String.valueOf(strA)), 2));
        }
        Callable callable = new Callable() { // from class: asnq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return asnz.c(strA);
            }
        };
        eosc eoscVar = this.n;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: asnr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                int size = ekgbVar.size();
                final String str2 = strA;
                if (size > 1) {
                    ekrw ekrwVarJ = asnz.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 245, "RbmBusinessInfoJsonRetriever.java")).D("Multiple bots (%s) for short code: %s", Collection.EL.stream(ekgbVar).map(new Function() { // from class: asnn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((bswk) obj2).o();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.b), str2);
                }
                Duration duration2 = duration;
                final asnz asnzVar = this.a;
                Optional optionalFindFirst = Collection.EL.stream(ekgbVar).findFirst();
                String str3 = (String) optionalFindFirst.map(new Function() { // from class: asnn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bswk) obj2).o();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
                final String str4 = (String) optionalFindFirst.map(new Function() { // from class: asno
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bswk) obj2).q();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
                eiju eijuVarG = eiju.g(kol.a(new koi() { // from class: asnp
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        asnz asnzVar2 = asnzVar;
                        asny asnyVar = new asny(asnzVar2, kogVar);
                        String str5 = str2;
                        String strA2 = aslf.a(str5);
                        aslc aslcVar = aslf.b;
                        final Uri.Builder builderAuthority = new Uri.Builder().scheme("https").authority(aslcVar.a);
                        Optional optional = aslcVar.b;
                        builderAuthority.getClass();
                        optional.ifPresent(new Consumer() { // from class: asld
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                builderAuthority.path((String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Uri.Builder builderAppendQueryParameter = builderAuthority.appendPath("bot").appendQueryParameter("id", "tel:".concat(String.valueOf(strA2)));
                        aslf aslfVar = asnzVar2.f;
                        builderAppendQueryParameter.appendQueryParameter("hl", craf.c(aslfVar.f).getLanguage());
                        if (aslfVar.g.b.contains(strA2)) {
                            builderAuthority.appendQueryParameter("v", "2");
                        } else {
                            builderAuthority.appendQueryParameter("v", (String) asnz.b.e());
                        }
                        CronetEngine cronetEngine = aslfVar.c;
                        String str6 = str4;
                        aslfVar.e.h().ifPresent(new Consumer() { // from class: asle
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                ekrg ekrgVar = aslf.a;
                                builderAuthority.appendQueryParameter("ho", (String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        String string = builderAuthority.build().toString();
                        ekrw ekrwVarH = aslf.a.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH.X(ekrzVar, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoAndShortCodeUrlCreator", "createUrl", 159, "RbmBusinessInfoAndShortCodeUrlCreator.java")).t("Business Info URL successfully built: %s", string);
                        UrlRequest.Builder trafficStatsTag = cronetEngine.newUrlRequestBuilder(string, asnyVar, aslfVar.d).setTrafficStatsTag(8193);
                        if (!TextUtils.isEmpty(str6)) {
                            trafficStatsTag = trafficStatsTag.addHeader("If-None-Match", str6);
                        }
                        UrlRequest urlRequestBuild = trafficStatsTag.build();
                        ekrw ekrwVarH2 = asnz.a.h();
                        ekrwVarH2.X(ekrzVar, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 262, "RbmBusinessInfoJsonRetriever.java")).t("Starting HTTP request for %s...", str5);
                        urlRequestBuild.start();
                        return "HTTP request for ".concat(String.valueOf(str5));
                    }
                }));
                asnzVar.l = duration2.toMillis();
                ekrw ekrwVarH = asnz.a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 267, "RbmBusinessInfoJsonRetriever.java")).J("Short code: %s - %s, v: %s (timeout: %s)", str2, str3, str4, duration2);
                return eijuVarG.j(duration2.toMillis(), TimeUnit.MILLISECONDS, asnzVar.g);
            }
        }, eoscVar);
    }
}
