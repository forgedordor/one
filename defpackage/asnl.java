package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.businessinfo.json.CombinedBusinessInfoAndVerifierInfoJson;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asnl {
    public static final cqce a = cqce.g("Bugle", "RbmBusinessInfoDownloadHelper");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper");
    public static final esyd c;
    static final cczv d;
    static final cczv e;
    public final asnz f;
    public final eosc g;
    public final eosc h;
    public final fcsu i;
    public final eygg j;
    public final eygg k;
    public final Context l;
    public final aslv m;
    public final cogw n;
    public final aspz o;
    public final aipo p;
    public final asof q;
    public final eosd r;
    public final fcsu s;

    static {
        esye esyeVar = new esye();
        esyeVar.b();
        c = esyeVar.a();
        d = cdag.g(cdag.b, "rbm_domain_regex_for_default_hero_image_eligibility", "@.+[.]vodafone[.]com$");
        e = cdag.g(cdag.b, "rbm_default_hero_image_url", "https://storage.googleapis.com/agent-logos/default_hero_image.png");
    }

    public asnl(asnz asnzVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, eygg eyggVar, eygg eyggVar2, Context context, aslv aslvVar, cogw cogwVar, aspz aspzVar, aipo aipoVar, asof asofVar, eosd eosdVar, fcsu fcsuVar2) {
        this.f = asnzVar;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.i = fcsuVar;
        this.j = eyggVar;
        this.k = eyggVar2;
        this.l = context;
        this.m = aslvVar;
        this.n = cogwVar;
        this.o = aspzVar;
        this.p = aipoVar;
        this.q = asofVar;
        new bxlm();
        this.r = eosdVar;
        this.s = fcsuVar2;
    }

    public static aslx a() {
        aslw aslwVar = (aslw) aslx.a.createBuilder();
        aslwVar.copyOnWrite();
        ((aslx) aslwVar.instance).b = false;
        aslwVar.copyOnWrite();
        ((aslx) aslwVar.instance).c = false;
        return (aslx) aslwVar.build();
    }

    public static aslx b(boolean z, String str, String str2, String str3) {
        aslw aslwVar = (aslw) aslx.a.createBuilder();
        aslwVar.copyOnWrite();
        ((aslx) aslwVar.instance).b = true;
        aslwVar.copyOnWrite();
        ((aslx) aslwVar.instance).c = z;
        aslwVar.copyOnWrite();
        aslx aslxVar = (aslx) aslwVar.instance;
        str.getClass();
        aslxVar.d = str;
        aslwVar.copyOnWrite();
        aslx aslxVar2 = (aslx) aslwVar.instance;
        str2.getClass();
        aslxVar2.e = str2;
        aslwVar.copyOnWrite();
        aslx aslxVar3 = (aslx) aslwVar.instance;
        str3.getClass();
        aslxVar3.f = str3;
        return (aslx) aslwVar.build();
    }

    static cbcw c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("botId", str);
        caxp caxpVar = new caxp(cbcw.i());
        caxpVar.c = bundle;
        return caxpVar.a();
    }

    public final eiju d(final String str) {
        return eijx.g(new Callable() { // from class: asmf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqbd cqbdVarA = asnl.a.a();
                cqbdVarA.I("Checking for pre-existing business info...");
                final String str2 = str;
                cqbdVarA.A("RBM bot id", str2);
                cqbdVarA.r();
                return (Boolean) bsyn.e(str2, new Function() { // from class: asmj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cqce cqceVar = asnl.a;
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: asmu
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cqbd cqbdVarC = asnl.a.c();
                        cqbdVarC.I("Business info does not exist in database");
                        cqbdVarC.A("RBM bot id", str2);
                        cqbdVarC.r();
                        return false;
                    }
                });
            }
        }, this.h);
    }

    public final eiju e(final String str, final Optional optional) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "downloadBusinessInfoByShortCodeIfMissingOrExpired", 240, "RbmBusinessInfoDownloadHelper.java")).t("Checking missing/expired bot, short code: %s...", cqcv.b(str));
        return eijx.g(new Callable() { // from class: asms
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = asnl.a;
                return asnz.c(str);
            }
        }, this.h).i(new eooz() { // from class: asni
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                ekhx ekhxVar = (ekhx) Collection.EL.stream(ekgbVar).map(new asmb()).collect(ekcv.b);
                int size = ekgbVar.size();
                asnl asnlVar = this.a;
                String str2 = str;
                if (size > 1) {
                    ekrw ekrwVarJ = asnl.b.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 279, "RbmBusinessInfoDownloadHelper.java")).D("Many bots for short code %s: %s", cqcv.b(str2), ekhxVar);
                } else if (ekgbVar.isEmpty()) {
                    ekrw ekrwVarH2 = asnl.b.h();
                    ekrwVarH2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 283, "RbmBusinessInfoDownloadHelper.java")).t("No bots for short code: %s", cqcv.b(str2));
                } else {
                    bswk bswkVar = (bswk) Collection.EL.stream(ekgbVar).findFirst().get();
                    String strO = bswkVar.o();
                    long jK = bswkVar.k();
                    if (jK >= asnlVar.n.f().toEpochMilli()) {
                        ekrw ekrwVarH3 = asnl.b.h();
                        ekrwVarH3.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 293, "RbmBusinessInfoDownloadHelper.java")).I("Bot %s (code: %s) is not expired: %s", strO, cqcv.b(str2), Long.valueOf(jK));
                        return eijx.e(asnl.c(((bswk) ekgbVar.get(0)).o()));
                    }
                    ekrw ekrwVarH4 = asnl.b.h();
                    ekrwVarH4.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 290, "RbmBusinessInfoDownloadHelper.java")).C("Bot %s expired: %s", strO, jK);
                }
                Optional optional2 = optional;
                Optional optionalFindFirst = Collection.EL.stream(ekgbVar).findFirst();
                ekrw ekrwVarH5 = asnl.b.h();
                ekrwVarH5.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "retrieveAndStoreBusinessInfoByShortCode", 302, "RbmBusinessInfoDownloadHelper.java")).t("Downloading bot by short code: %s", cqcv.b(str2));
                asnm asnmVar = new asnm("", 4, null, "tel:".concat(String.valueOf(aslf.a(str2))));
                asnlVar.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return asnlVar.h(optional2.isPresent() ? asnlVar.f.b(str2, (Duration) optional2.get()) : asnlVar.f.b(str2, Duration.ofMillis(((Integer) asnz.c.e()).intValue())), asnmVar, optionalFindFirst);
            }
        }, this.g);
    }

    public final eiju f(final asnm asnmVar) {
        final String str = asnmVar.a;
        cqce cqceVar = a;
        cqceVar.p("Request made for ".concat(str));
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Initiating business info retrieval handler...");
        cqbdVarC.A("RBM bot id", str);
        cqbdVarC.r();
        eiju eijuVarD = d(str);
        eooz eoozVar = new eooz() { // from class: asne
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    asnm asnmVar2 = asnmVar;
                    asnl asnlVar = this.a;
                    asnlVar.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                    return asnlVar.j(asnmVar2);
                }
                String str2 = str;
                cqbd cqbdVarC2 = asnl.a.c();
                cqbdVarC2.I("Business info already exists, and operation mode downloads only if info is unavailable. Skipping download of business info.");
                cqbdVarC2.A("RBM bot id", str2);
                cqbdVarC2.r();
                return eijx.e(asnl.c(str2));
            }
        };
        eosc eoscVar = this.g;
        return eijuVarD.i(eoozVar, eoscVar).h(new ejvr() { // from class: asnf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                this.a.p.k("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return cbcwVar;
            }
        }, eoscVar);
    }

    public final eiju g(final String str, final String str2) {
        Callable callable = new Callable() { // from class: asnk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqbd cqbdVarC = asnl.a.c();
                cqbdVarC.I("Beginning download for ".concat(str2));
                cqbdVarC.A("url", str);
                cqbdVarC.r();
                return true;
            }
        };
        eosc eoscVar = this.g;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: aslz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) ((cczi) ateo.a.get()).e()).booleanValue();
                asnl asnlVar = this.a;
                final String str3 = str2;
                final String str4 = str;
                if (zBooleanValue) {
                    return ((aten) asnlVar.k.b()).a(str4, Alert.DURATION_SHOW_INDEFINITELY, UUID.randomUUID().toString(), Optional.empty(), Optional.empty()).i(new eooz() { // from class: asnj
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            atef atefVar = (atef) obj2;
                            cqce cqceVar = asnl.a;
                            int iB = atefVar.b();
                            String str5 = str3;
                            String str6 = str4;
                            if (iB == 1) {
                                cqbd cqbdVarC = asnl.a.c();
                                cqbdVarC.I("Download succeeded for ".concat(str5));
                                cqbdVarC.M("url", str6);
                                cqbdVarC.r();
                                return eijx.e(atefVar.c());
                            }
                            cqbd cqbdVarE = asnl.a.e();
                            cqbdVarE.I("File transfer download failed for ".concat(str5));
                            cqbdVarE.M("url", str6);
                            cqbdVarE.A("failureReason", atefVar.a());
                            cqbdVarE.r();
                            return cond.a("File transfer download failed");
                        }
                    }, asnlVar.g);
                }
                final comx comxVar = (comx) asnlVar.j.b();
                final String string = UUID.randomUUID().toString();
                return eijx.h(new eooy() { // from class: comw
                    @Override // defpackage.eooy
                    public final ListenableFuture a() throws cond {
                        final Optional optionalEmpty = Optional.empty();
                        Optional.empty().isPresent();
                        final comx comxVar2 = comxVar;
                        final String str5 = string;
                        String strConcat = "file_".concat(String.valueOf(str5));
                        Context context = comxVar2.d;
                        final Uri uriD = bxlf.d(strConcat, context);
                        File fileH = bxlf.h(uriD, context);
                        optionalEmpty.isPresent();
                        final AtomicReference atomicReference = new AtomicReference();
                        try {
                            final FileOutputStream fileOutputStream = new FileOutputStream(fileH, false);
                            String str6 = str4;
                            eiju eijuVarG = eiju.g(kol.a(new koi() { // from class: comt
                                @Override // defpackage.koi
                                public final Object a(kog kogVar) {
                                    eksp ekspVar = comx.a;
                                    comz comzVar = new comz(str5, fileOutputStream, cojd.a(), kogVar, optionalEmpty);
                                    AtomicReference atomicReference2 = atomicReference;
                                    atomicReference2.set(comzVar);
                                    return atomicReference2;
                                }
                            }));
                            atcm atcmVarA = ((atco) comxVar2.b.b()).a(str6, (UrlRequest.Callback) atomicReference.get()).a();
                            atcmVarA.b();
                            eksl ekslVar = (eksl) comx.a.h();
                            ekslVar.X(coie.a, str5);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/CronetFileDownloader", "downloadInternal", 191, "CronetFileDownloader.java")).q("File download request is started.");
                            comxVar2.e.put(str5, atcmVarA);
                            if (!optionalEmpty.isEmpty()) {
                                eieu eieuVarK = eiiy.k("CronetFileDownloader-TG::download");
                                try {
                                    eieuVarK.b(eijuVarG);
                                    eieuVarK.close();
                                } catch (Throwable th) {
                                    try {
                                        eieuVarK.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            eooz eoozVar = new eooz() { // from class: comu
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) throws IOException {
                                    UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj2;
                                    if (urlResponseInfo == null) {
                                        return eijx.d(new cond(true, coid.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY, "Download failed with empty server response."));
                                    }
                                    if (urlResponseInfo.getHttpStatusCode() != 200 && urlResponseInfo.getHttpStatusCode() != 206) {
                                        boolean zContains = true ^ comz.a.contains(Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
                                        urlResponseInfo.getHttpStatusCode();
                                        return eijx.d(new cond(zContains, "Download failed with invalid server response.", (byte[]) null));
                                    }
                                    Uri uri = uriD;
                                    FileOutputStream fileOutputStream2 = fileOutputStream;
                                    comxVar2.a(str5, fileOutputStream2);
                                    return eijx.e(uri);
                                }
                            };
                            eosc eoscVar2 = comxVar2.c;
                            return eijuVarG.i(eoozVar, eoscVar2).f(Throwable.class, new eooz() { // from class: comv
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    Throwable th3 = (Throwable) obj2;
                                    try {
                                        comxVar2.a(str5, fileOutputStream);
                                    } catch (IOException e2) {
                                        th3.addSuppressed(e2);
                                    }
                                    return eijx.d(th3);
                                }
                            }, eoscVar2);
                        } catch (FileNotFoundException e2) {
                            throw new cond(false, "Failed to open a new output stream.", coid.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED, (Throwable) e2);
                        }
                    }
                }, comxVar.c).h(new ejvr() { // from class: asnd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Uri uri = (Uri) obj2;
                        cqbd cqbdVarC = asnl.a.c();
                        cqbdVarC.I("Download finished for ".concat(str3));
                        cqbdVarC.A("url", str4);
                        cqbdVarC.r();
                        return uri;
                    }
                }, asnlVar.g);
            }
        }, this.h).f(Throwable.class, new eooz() { // from class: asma
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cqbd cqbdVarE = asnl.a.e();
                cqbdVarE.I("Download failed for ".concat(str2));
                cqbdVarE.A("url", str);
                cqbdVarE.r();
                return eijx.d((Throwable) obj);
            }
        }, eoscVar);
    }

    public final eiju h(eiju eijuVar, final asnm asnmVar, Optional optional) {
        final String str = (String) optional.map(new asmb()).orElseGet(new Supplier() { // from class: asmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return asnmVar.a;
            }
        });
        eooz eoozVar = new eooz() { // from class: asmp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final asnl asnlVar = this.a;
                aipo aipoVar = asnlVar.p;
                final asnx asnxVar = (asnx) obj;
                aipoVar.k("Bugle.Rbm.BusinessInfo.BotMetadataDownloadLatency");
                ekhx ekhxVarR = ekhx.r(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 304);
                int i = asnxVar.a;
                boolean zContains = ekhxVarR.contains(Integer.valueOf(i));
                final asnm asnmVar2 = asnmVar;
                if (!zContains) {
                    cqbd cqbdVarE = asnl.a.e();
                    cqbdVarE.I("Did not retrieve business info.");
                    cqbdVarE.y("response code", i);
                    cqbdVarE.r();
                    return asnlVar.i(i != 400 ? i != 500 ? i != 403 ? i != 404 ? (i <= 400 || i >= 500) ? (i <= 500 || i >= 600) ? new asoa(a.g(i, "Business Info HTTP code was unknown error. Code: "), 6) : new asoa(a.g(i, "Business Info HTTP code was unknown 500 error. Code: "), 14) : new asoa(a.g(i, "Business Info HTTP code was unknown 400 error. Code: "), 12) : new asoa(asoa.a(404), 11) : new asoa(asoa.a(403), 10) : new asoa(asoa.a(500), 13) : new asoa(asoa.a(400), 9), asnmVar2);
                }
                final String strB = str;
                cqce cqceVar = asnl.a;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.y("Response code", i);
                Optional optional2 = asnxVar.b;
                cqbdVarC.A("E-tag", optional2);
                cqbdVarC.z("Expiry", asnxVar.c);
                cqbdVarC.r();
                BusinessInfoData businessInfoData = null;
                if (i == 304) {
                    aipoVar.e("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                    final aslv aslvVar = asnlVar.m;
                    final String str2 = (String) optional2.orElse(null);
                    final long j = asnxVar.c;
                    return eijx.f(new Runnable() { // from class: asll
                        @Override // java.lang.Runnable
                        public final void run() {
                            final String str3 = strB;
                            final String str4 = str2;
                            final long j2 = j;
                            aslvVar.c.d("update_business_info_metadata", new Runnable() { // from class: aslu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqbd cqbdVarC2 = aslv.a.c();
                                    cqbdVarC2.I("Updating business info metadata");
                                    String str5 = str3;
                                    cqbdVarC2.A("bot id", cqcv.b(str5));
                                    String str6 = str4;
                                    cqbdVarC2.A(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str6);
                                    long j3 = j2;
                                    cqbdVarC2.z("expiry ms", j3);
                                    cqbdVarC2.r();
                                    String[] strArr = bsyn.a;
                                    bsyk bsykVar = new bsyk();
                                    bsykVar.ap("updateBusinessInfoMetadata");
                                    bsykVar.d(str6);
                                    bsykVar.c(j3);
                                    bsym bsymVar = new bsym();
                                    bsymVar.b(str5);
                                    bsykVar.aj(new bsyl(bsymVar), "rbm_business_info-buildAndUpdateForRbmBotId");
                                }
                            });
                        }
                    }, aslvVar.b).h(new ejvr() { // from class: asml
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqce cqceVar2 = asnl.a;
                            return asnl.c(strB);
                        }
                    }, eoqg.a);
                }
                cqceVar.q(asnxVar.a());
                String strA = asnxVar.a();
                ekrg ekrgVar = asnl.b;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "parse", 827, "RbmBusinessInfoDownloadHelper.java")).t("Attempting to parse json for '%s'...", strB);
                try {
                    CombinedBusinessInfoAndVerifierInfoJson combinedBusinessInfoAndVerifierInfoJson = (CombinedBusinessInfoAndVerifierInfoJson) asnl.c.i(strA, CombinedBusinessInfoAndVerifierInfoJson.class);
                    if (TextUtils.isEmpty(strB) && combinedBusinessInfoAndVerifierInfoJson != null) {
                        strB = ejwk.b(combinedBusinessInfoAndVerifierInfoJson.getBotId());
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "parse", 836, "RbmBusinessInfoDownloadHelper.java")).t("Using bot id '%s' from JSON body.", strB);
                    }
                    ekrw ekrwVarH3 = ekrgVar.h();
                    ekrwVarH3.X(ekrzVar, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "parse", 838, "RbmBusinessInfoDownloadHelper.java")).t("Done parsing json for '%s'", strB);
                    if (combinedBusinessInfoAndVerifierInfoJson == null) {
                        ekrw ekrwVarI = ekrgVar.i();
                        ekrwVarI.X(ekrzVar, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "parse", 840, "RbmBusinessInfoDownloadHelper.java")).t("Received null json object when parsing info for '%s'", strB);
                    } else {
                        BusinessInfoData businessInfoDataBuildBusinessInfoData = combinedBusinessInfoAndVerifierInfoJson.buildBusinessInfoData(strB, (crmx) asnlVar.i.b());
                        if (businessInfoDataBuildBusinessInfoData == null) {
                            cqceVar.n(a.v(strB, "Could not create BusinessInfoData even though json was successfully marshalled for botId "));
                        }
                        businessInfoData = businessInfoDataBuildBusinessInfoData;
                    }
                } catch (esyr e2) {
                    asnl.a.n("Unable to parse business info due to invalid JSON for botId " + strB + ": " + e2.getMessage());
                }
                if (businessInfoData == null) {
                    return asnlVar.i(new asoa("Business Info JSON error", 4), asnmVar2);
                }
                final BusinessInfoData businessInfoData2 = businessInfoData;
                final String rbmBotId = businessInfoData2.getRbmBotId();
                ekrw ekrwVarH4 = asnl.b.h();
                ekrwVarH4.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "handleBotInfoResponse", 571, "RbmBusinessInfoDownloadHelper.java")).t("BotInfo parsed: id '%s'", rbmBotId);
                String logoImageRemoteUrl = businessInfoData2.getLogoImageRemoteUrl();
                String heroImageRemoteUrl = businessInfoData2.getHeroImageRemoteUrl();
                String verifierLogoImageRemoteUrl = businessInfoData2.getVerifierLogoImageRemoteUrl();
                final String verifierId = businessInfoData2.getVerifierId();
                if (TextUtils.isEmpty(heroImageRemoteUrl) && Pattern.compile((String) asnl.d.e()).matcher(rbmBotId).find()) {
                    cqbd cqbdVarC2 = asnl.a.c();
                    cqbdVarC2.I("adding default hero image url for eligible bot");
                    cqbdVarC2.A("bot id", rbmBotId);
                    cqbdVarC2.r();
                    heroImageRemoteUrl = (String) asnl.e.e();
                    businessInfoData2.setHeroImageUrl(heroImageRemoteUrl);
                }
                if (!TextUtils.isEmpty(logoImageRemoteUrl) && !TextUtils.isEmpty(heroImageRemoteUrl) && !TextUtils.isEmpty(verifierLogoImageRemoteUrl) && !TextUtils.isEmpty(verifierId)) {
                    final eiju eijuVarG = asnlVar.g(logoImageRemoteUrl, "business logo");
                    final eiju eijuVarG2 = asnlVar.g(heroImageRemoteUrl, "hero image");
                    final eiju eijuVarG3 = asnlVar.g(verifierLogoImageRemoteUrl, "verifier logo");
                    return eijx.m(eijuVarG, eijuVarG2, eijuVarG3).b(new eooy() { // from class: asmm
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            Uri uri = (Uri) eork.q(eijuVarG);
                            Uri uri2 = (Uri) eork.q(eijuVarG2);
                            Uri uri3 = (Uri) eork.q(eijuVarG3);
                            final asnl asnlVar2 = asnlVar;
                            asnm asnmVar3 = asnmVar2;
                            if (uri == null || uri2 == null || uri3 == null) {
                                cqbd cqbdVarE2 = asnl.a.e();
                                cqbdVarE2.I("Empty URI returned when downloading.");
                                cqbdVarE2.B("business logo uri present", uri == null);
                                cqbdVarE2.B("hero image uri present", uri2 == null);
                                cqbdVarE2.B("verifier logo uri present", uri3 == null);
                                cqbdVarE2.r();
                                return asnlVar2.i(new asoa("No URI after downloading media", 17), asnmVar3);
                            }
                            String str3 = verifierId;
                            final String str4 = rbmBotId;
                            cqce cqceVar2 = asnl.a;
                            cqceVar2.p("Download successful for business logo + hero image + verifier logo.");
                            Context context = asnlVar2.l;
                            Optional optionalE = bxlm.e(context, str4, bxll.BUSINESS_LOGO, uri);
                            Optional optionalE2 = bxlm.e(context, str4, bxll.BUSINESS_HERO_IMAGE, uri2);
                            Optional optionalE3 = bxlm.e(context, str3, bxll.VERIFIER_LOGO, uri3);
                            if (Stream.CC.of((Object[]) new Optional[]{optionalE, optionalE2, optionalE3}).anyMatch(new Predicate() { // from class: asmy
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    return ((Optional) obj2).isEmpty();
                                }
                            })) {
                                cqbd cqbdVarE3 = cqceVar2.e();
                                cqbdVarE3.I("Could not create URI");
                                cqbdVarE3.B("business logo copied", optionalE.isPresent());
                                cqbdVarE3.B("hero image copied", optionalE2.isPresent());
                                cqbdVarE3.B("verifier logo copied", optionalE3.isPresent());
                                cqbdVarE3.r();
                                return asnlVar2.i(new asoa("Could not save media image locally", 18), asnmVar3);
                            }
                            final BusinessInfoData businessInfoData3 = businessInfoData2;
                            businessInfoData3.setLogoImageLocalUri(((Uri) optionalE.get()).toString());
                            businessInfoData3.setHeroImageLocalUri(((Uri) optionalE2.get()).toString());
                            businessInfoData3.setVerifierLogoImageLocalUri(((Uri) optionalE3.get()).toString());
                            asof asofVar = asnlVar2.q;
                            String rbmBotId2 = businessInfoData3.getRbmBotId();
                            fcsu fcsuVar = asofVar.g;
                            ParticipantsTable.BindData bindDataC = ((bbca) fcsuVar.b()).c(rbmBotId2);
                            if (bindDataC == null) {
                                ekrw ekrwVarH5 = asof.b.h();
                                ekrwVarH5.X(eksq.a, "BugleNotifications");
                                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper", "createParticipantForBotIfDoesntExist", 119, "RbmBusinessInfoUpdateHelper.java")).t("Creating bot participant for: %s...", rbmBotId2);
                                bindDataC = bbbd.a(rbmBotId2, businessInfoData3.getName(), businessInfoData3.getColor());
                                ((bbca) fcsuVar.b()).i(bindDataC);
                            }
                            asnx asnxVar2 = asnxVar;
                            ekrw ekrwVarH6 = asof.b.h();
                            ekrwVarH6.X(eksq.a, "BugleNotifications");
                            ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper", "createParticipantForBotIfDoesntExist", 123, "RbmBusinessInfoUpdateHelper.java")).D("Bot participant: %s -> %s", rbmBotId2, bindDataC.R());
                            final aslv aslvVar2 = asnlVar2.m;
                            final String str5 = (String) asnxVar2.b.orElse(null);
                            final long j2 = asnxVar2.c;
                            return eijx.f(new Runnable() { // from class: asls
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqce cqceVar3 = aslv.a;
                                    cqbd cqbdVarC3 = cqceVar3.c();
                                    cqbdVarC3.I("Beginning validation of all business info data fields...");
                                    final BusinessInfoData businessInfoData4 = businessInfoData3;
                                    cqbdVarC3.A("RBM bot id", cqcv.b(businessInfoData4.getRbmBotId()));
                                    final String str6 = str5;
                                    cqbdVarC3.A("RBM bot info version", str6);
                                    final long j3 = j2;
                                    cqbdVarC3.z("RBM bot info expiry milliseconds", j3);
                                    cqbdVarC3.r();
                                    aslv.b(businessInfoData4, j3);
                                    aslv.c(businessInfoData4);
                                    cqbd cqbdVarC4 = cqceVar3.c();
                                    cqbdVarC4.I("Beginning storage of all business info data fields...");
                                    cqbdVarC4.A("RBM bot id", cqcv.b(businessInfoData4.getRbmBotId()));
                                    cqbdVarC4.r();
                                    final aslv aslvVar3 = aslvVar2;
                                    aslvVar3.c.d("RbmBusinessInfoDataService#insertOrReplaceRbmBusinessInfoData", new Runnable() { // from class: aslj
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cqce cqceVar4 = aslv.a;
                                            cqceVar4.p("Attempting storage of RBM business info...");
                                            final BusinessInfoData businessInfoData5 = businessInfoData4;
                                            final String str7 = str6;
                                            final long j4 = j3;
                                            Runnable runnable = new Runnable() { // from class: aslh
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String[] strArr = bsyn.a;
                                                    bswn bswnVar = new bswn();
                                                    final BusinessInfoData businessInfoData6 = businessInfoData5;
                                                    bswnVar.k(businessInfoData6.getRbmBotId());
                                                    String name = businessInfoData6.getName();
                                                    name.getClass();
                                                    bswnVar.e(name);
                                                    String logoImageRemoteUrl2 = businessInfoData6.getLogoImageRemoteUrl();
                                                    logoImageRemoteUrl2.getClass();
                                                    bswnVar.j(logoImageRemoteUrl2);
                                                    String logoImageLocalUri = businessInfoData6.getLogoImageLocalUri();
                                                    logoImageLocalUri.getClass();
                                                    bswnVar.i(logoImageLocalUri);
                                                    String description = businessInfoData6.getDescription();
                                                    description.getClass();
                                                    bswnVar.d(description);
                                                    bswnVar.c(businessInfoData6.getColor());
                                                    String heroImageRemoteUrl2 = businessInfoData6.getHeroImageRemoteUrl();
                                                    heroImageRemoteUrl2.getClass();
                                                    bswnVar.h(heroImageRemoteUrl2);
                                                    String heroImageLocalUri = businessInfoData6.getHeroImageLocalUri();
                                                    heroImageLocalUri.getClass();
                                                    bswnVar.g(heroImageLocalUri);
                                                    bswnVar.l(businessInfoData6.getVerifierId());
                                                    bswnVar.m(str7);
                                                    bswnVar.f(j4);
                                                    bswnVar.b(businessInfoData6.getAgentUseCase());
                                                    final bswk bswkVarA = bswnVar.a();
                                                    final bsyl bsylVar = new bsyl((bsym) new Function() { // from class: aslo
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj2) {
                                                            bsym bsymVar = (bsym) obj2;
                                                            bsymVar.b(businessInfoData6.getRbmBotId());
                                                            return bsymVar;
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }.apply(new bsym()));
                                                    final dqsy dqsyVarC = bsyn.c();
                                                    if (((Boolean) dqsyVarC.o(new ejxr() { // from class: bswj
                                                        @Override // defpackage.ejxr
                                                        public final Object get() {
                                                            String[] strArr2 = bsyn.a;
                                                            bsyk bsykVar = new bsyk();
                                                            ContentValues contentValues = bsykVar.a;
                                                            bswk bswkVar = bswkVarA;
                                                            dqru.v(contentValues, "rbm_bot_id", bswkVar.o());
                                                            dqru.v(contentValues, "display_name", bswkVar.n());
                                                            bswkVar.aA(2, "logo_image_remote_url");
                                                            dqru.v(contentValues, "logo_image_remote_url", bswkVar.c);
                                                            bswkVar.aA(3, "logo_image_local_uri");
                                                            dqru.v(contentValues, "logo_image_local_uri", bswkVar.d);
                                                            bswkVar.aA(4, "description");
                                                            dqru.v(contentValues, "description", bswkVar.e);
                                                            dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, bswkVar.m());
                                                            bswkVar.aA(6, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
                                                            dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, bswkVar.g);
                                                            bswkVar.aA(7, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
                                                            dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, bswkVar.h);
                                                            dqru.v(contentValues, "verifier_id", bswkVar.p());
                                                            bsykVar.d(bswkVar.q());
                                                            bsykVar.c(bswkVar.k());
                                                            bswkVar.aA(11, "agent_use_case_category");
                                                            AgentUseCase agentUseCase = bswkVar.l;
                                                            int iIntValue = bsyn.d().intValue();
                                                            int iIntValue2 = bsyn.d().intValue();
                                                            if (iIntValue2 < 59140) {
                                                                dqru.x("agent_use_case_category", iIntValue2);
                                                            }
                                                            if (iIntValue >= 59140) {
                                                                if (agentUseCase == null) {
                                                                    contentValues.putNull("agent_use_case_category");
                                                                } else {
                                                                    contentValues.put("agent_use_case_category", Integer.valueOf(agentUseCase.ordinal()));
                                                                }
                                                            }
                                                            bsyl bsylVar2 = bsylVar;
                                                            bsykVar.al();
                                                            bsykVar.af(bsylVar2);
                                                            bsykVar.an(new dqsb("rbm_business_info", "-updateOrInsert-update"));
                                                            if (bsykVar.a().e() != 0) {
                                                                return true;
                                                            }
                                                            final dqsy dqsyVar = dqsyVarC;
                                                            return Boolean.valueOf(dqru.b(bsyn.c(), "rbm_business_info", bswkVar, new Function() { // from class: bswh
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj2) {
                                                                    return Long.valueOf(dqsyVar.O("rbm_business_info", (dqst) obj2));
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            }, new Consumer() { // from class: bswi
                                                                @Override // java.util.function.Consumer
                                                                /* renamed from: accept */
                                                                public final void z(Object obj2) {
                                                                }

                                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                                }
                                                            }) != -1);
                                                        }
                                                    })).booleanValue()) {
                                                        return;
                                                    }
                                                    cqbd cqbdVarB = aslv.a.b();
                                                    cqbdVarB.I("Failed to insert core RBM business info into table.");
                                                    cqbdVarB.A("RBM core business info bind data", bswkVarA);
                                                    cqbdVarB.r();
                                                    throw new asoa("Failed to insert core RBM business info into table.", 19);
                                                }
                                            };
                                            dqsn dqsnVar = aslvVar3.c;
                                            dqsnVar.d("RbmBusinessInfoDataService#insertOrReplaceCoreRbmBusinessInfoData", runnable);
                                            cqceVar4.p("Successful storage of RBM business info...");
                                            cqceVar4.p("Attempting storage of RBM business verifier info...");
                                            dqsnVar.d("RbmBusinessInfoDataService#insertOrReplaceRbmBusinessVerifierInfoData", new Runnable() { // from class: asln
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String[] strArr = bszx.a;
                                                    bsyv bsyvVar = new bsyv();
                                                    BusinessInfoData businessInfoData6 = businessInfoData5;
                                                    String verifierId2 = businessInfoData6.getVerifierId();
                                                    verifierId2.getClass();
                                                    bsyvVar.b(verifierId2);
                                                    String verifierName = businessInfoData6.getVerifierName();
                                                    verifierName.getClass();
                                                    bsyvVar.e(verifierName);
                                                    String verifierLogoImageRemoteUrl2 = businessInfoData6.getVerifierLogoImageRemoteUrl();
                                                    verifierLogoImageRemoteUrl2.getClass();
                                                    bsyvVar.d(verifierLogoImageRemoteUrl2);
                                                    String verifierLogoImageLocalUri = businessInfoData6.getVerifierLogoImageLocalUri();
                                                    verifierLogoImageLocalUri.getClass();
                                                    bsyvVar.c(verifierLogoImageLocalUri);
                                                    final bsys bsysVarA = bsyvVar.a();
                                                    bszw bszwVar = new bszw();
                                                    String verifierId3 = businessInfoData6.getVerifierId();
                                                    verifierId3.getClass();
                                                    bszwVar.ap(new dqpj("rbm_business_verifier_info.verifier_id", 1, verifierId3));
                                                    final bszv bszvVar = new bszv(bszwVar);
                                                    final dqsy dqsyVarA = bszx.a();
                                                    if (((Boolean) dqsyVarA.o(new ejxr() { // from class: bsyr
                                                        @Override // defpackage.ejxr
                                                        public final Object get() {
                                                            String[] strArr2 = bszx.a;
                                                            bszu bszuVar = new bszu();
                                                            bsys bsysVar = bsysVarA;
                                                            bsysVar.aA(0, "verifier_id");
                                                            ContentValues contentValues = bszuVar.a;
                                                            dqru.v(contentValues, "verifier_id", bsysVar.a);
                                                            bsysVar.aA(1, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
                                                            dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, bsysVar.b);
                                                            bsysVar.aA(2, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
                                                            dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, bsysVar.c);
                                                            bsysVar.aA(3, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
                                                            dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI, bsysVar.d);
                                                            bszuVar.al();
                                                            bszuVar.af(bszvVar);
                                                            bszuVar.an(new dqsb("rbm_business_verifier_info", "-updateOrInsert-update"));
                                                            if (bszuVar.b().e() != 0) {
                                                                return true;
                                                            }
                                                            final dqsy dqsyVar = dqsyVarA;
                                                            return Boolean.valueOf(dqru.b(bszx.a(), "rbm_business_verifier_info", bsysVar, new Function() { // from class: bsyp
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj2) {
                                                                    return Long.valueOf(dqsyVar.O("rbm_business_verifier_info", (dqst) obj2));
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            }, new Consumer() { // from class: bsyq
                                                                @Override // java.util.function.Consumer
                                                                /* renamed from: accept */
                                                                public final void z(Object obj2) {
                                                                }

                                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                                }
                                                            }) != -1);
                                                        }
                                                    })).booleanValue()) {
                                                        return;
                                                    }
                                                    cqbd cqbdVarB = aslv.a.b();
                                                    cqbdVarB.I("Failed to insert RBM business verifier info into table.");
                                                    cqbdVarB.A("RBM business verifier info bind data", bsysVarA);
                                                    cqbdVarB.r();
                                                    throw new asoa("Failed to insert RBM business verifier info into table.", 19);
                                                }
                                            });
                                            cqceVar4.p("Successful storage of RBM business verifier info...");
                                            cqbd cqbdVarC5 = cqceVar4.c();
                                            cqbdVarC5.I("Removing RBM business info properties for rbmBotId...");
                                            cqbdVarC5.A("RBM bot id", cqcv.b(businessInfoData5.getRbmBotId()));
                                            cqbdVarC5.r();
                                            final String rbmBotId3 = businessInfoData5.getRbmBotId();
                                            dqsnVar.d("RbmBusinessInfoDataService#removeAllRbmBusinessInfoPropertiesForBotId", new Runnable() { // from class: aslk
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String[] strArr = bswf.a;
                                                    bsvx bsvxVar = new bsvx();
                                                    bsvxVar.f("removeAllRbmBusinessInfoPropertiesForBotId");
                                                    final String str8 = rbmBotId3;
                                                    bsvxVar.b = new bswd((bswe) new Function() { // from class: aslp
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj2) {
                                                            bswe bsweVar = (bswe) obj2;
                                                            bsweVar.b(str8);
                                                            return bsweVar;
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }.apply(new bswe()));
                                                    int iD = bsvxVar.d();
                                                    cqbd cqbdVarC6 = aslv.a.c();
                                                    cqbdVarC6.I("Processed deletion of RBM business info properties.");
                                                    cqbdVarC6.A("RBM bot id", cqcv.b(str8));
                                                    cqbdVarC6.y("Number of deleted properties", iD);
                                                    cqbdVarC6.r();
                                                }
                                            });
                                            cqbd cqbdVarC6 = cqceVar4.c();
                                            cqbdVarC6.I("Removed RBM business info properties for rbmBotId...");
                                            cqbdVarC6.A("RBM bot id", cqcv.b(businessInfoData5.getRbmBotId()));
                                            cqbdVarC6.r();
                                            ekgb<BusinessInfoProperty> properties = businessInfoData5.getProperties();
                                            if (properties.isEmpty()) {
                                                cqceVar4.p("Skipping storage of nonexistent RBM business info properties...");
                                                return;
                                            }
                                            cqbd cqbdVarC7 = cqceVar4.c();
                                            cqbdVarC7.I("Attempting storage of RBM business info properties...");
                                            cqbdVarC7.y("amount", properties.size());
                                            cqbdVarC7.r();
                                            int size = properties.size();
                                            for (int i2 = 0; i2 < size; i2++) {
                                                final BusinessInfoProperty businessInfoProperty = properties.get(i2);
                                                final String rbmBotId4 = businessInfoData5.getRbmBotId();
                                                dqsnVar.d("RbmBusinessInfoDataService#insertRbmBusinessInfoProperty", new Runnable() { // from class: aslt
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        String[] strArr = bswf.a;
                                                        bsuy bsuyVar = new bsuy();
                                                        bsuyVar.d(rbmBotId4);
                                                        BusinessInfoProperty businessInfoProperty2 = businessInfoProperty;
                                                        bsuyVar.f(BusinessInfoData.getPropertyTypeFromLegacyType(businessInfoProperty2));
                                                        bsuyVar.b(businessInfoProperty2.getHeader());
                                                        bsuyVar.e(businessInfoProperty2.getSubHeader());
                                                        bsuyVar.c(businessInfoProperty2.getValue());
                                                        final bsuv bsuvVarA = bsuyVar.a();
                                                        final dqsy dqsyVarB = bswf.b();
                                                        long jB = dqru.b(bswf.b(), "rbm_business_info_properties", bsuvVarA, new Function() { // from class: bsut
                                                            @Override // java.util.function.Function
                                                            /* renamed from: andThen */
                                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                                return Function$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.Function
                                                            public final Object apply(Object obj2) {
                                                                return Long.valueOf(dqsyVarB.O("rbm_business_info_properties", (dqst) obj2));
                                                            }

                                                            public final /* synthetic */ Function compose(Function function) {
                                                                return Function$CC.$default$compose(this, function);
                                                            }
                                                        }, new Consumer() { // from class: bsuu
                                                            @Override // java.util.function.Consumer
                                                            /* renamed from: accept */
                                                            public final void z(Object obj2) {
                                                                Long l = (Long) obj2;
                                                                if (l.longValue() >= 0) {
                                                                    bsuv bsuvVar = bsuvVarA;
                                                                    bsuvVar.a = String.valueOf(l);
                                                                    bsuvVar.fN(0);
                                                                }
                                                            }

                                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                return Consumer$CC.$default$andThen(this, consumer);
                                                            }
                                                        });
                                                        Long.valueOf(jB).getClass();
                                                        if (jB >= 0) {
                                                            return;
                                                        }
                                                        cqbd cqbdVarB = aslv.a.b();
                                                        cqbdVarB.I("Failed to insert RBM business info property into table.");
                                                        cqbdVarB.A("RBM business verifier info bind data", bsuvVarA);
                                                        cqbdVarB.r();
                                                        throw new asoa("Failed to insert RBM business info property into table.", 19);
                                                    }
                                                });
                                            }
                                            cqceVar4.p("Successful storage of RBM business info properties...");
                                        }
                                    });
                                }
                            }, aslvVar2.b).i(new eooz() { // from class: asmz
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final asof asofVar2 = asnlVar2.q;
                                    byeq byeqVar = (byeq) asofVar2.d.b();
                                    final String str6 = str4;
                                    final BusinessInfoData businessInfoData4 = businessInfoData3;
                                    return byeqVar.b("UpdateRbmBusinessInfoAuxiliaryData", new Runnable() { // from class: asob
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Optional optionalEmpty;
                                            final asof asofVar3 = asofVar2;
                                            final String str7 = str6;
                                            final BusinessInfoData businessInfoData5 = businessInfoData4;
                                            try {
                                                botb botbVarE = botm.e();
                                                botbVarE.A("+getTelephonyRecipientIdByBotId");
                                                botbVarE.f(new Function() { // from class: asod
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj3) {
                                                        bopp boppVar = (bopp) obj3;
                                                        return new bopq[]{boppVar.a, boppVar.b};
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                botbVarE.i(new Function() { // from class: asoe
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj3) {
                                                        botl botlVar = (botl) obj3;
                                                        botlVar.ap(new dqpm("conversations.participant_normalized_destination", 3, botl.au(str7), false));
                                                        return botlVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                botbVarE.e(new bosy(botm.c.r, false));
                                                botbVarE.y(1);
                                                bopr boprVar = (bopr) botbVarE.b().p();
                                                try {
                                                    cnqj cnqjVarK = boprVar.moveToFirst() ? boprVar.k() : null;
                                                    boprVar.close();
                                                    if (cnqjVarK == null) {
                                                        asof.a.p("No conversation exists for this bot");
                                                        optionalEmpty = Optional.empty();
                                                    } else {
                                                        try {
                                                            String strD = ((cmqj) asofVar3.i.b()).D(cnqjVarK);
                                                            if (TextUtils.isEmpty(strD)) {
                                                                ((ajhd) asofVar3.e.b()).al(12, str7);
                                                                asof.b(str7, "Cannot find recipient ID for thread ID");
                                                                optionalEmpty = Optional.empty();
                                                            } else {
                                                                String[] strArrSplit = TextUtils.split(strD, " ");
                                                                int length = strArrSplit.length;
                                                                if (length == 0) {
                                                                    ((ajhd) asofVar3.e.b()).al(12, str7);
                                                                    asof.b(str7, "No recipients for thread ID.");
                                                                    optionalEmpty = Optional.empty();
                                                                } else if (length > 1) {
                                                                    ((ajhd) asofVar3.e.b()).al(13, str7);
                                                                    asof.b(str7, "Multiple recipients for thread ID");
                                                                    optionalEmpty = Optional.empty();
                                                                } else {
                                                                    optionalEmpty = Optional.of(strArrSplit[0]);
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            ((ajhd) asofVar3.e.b()).al(12, str7);
                                                            cqbd cqbdVarB = asof.a.b();
                                                            cqbdVarB.I("Getting recipient ID string from telephony threw");
                                                            cqbdVarB.A("botId", str7);
                                                            cqbdVarB.A("exception", th.getMessage());
                                                            cqbdVarB.r();
                                                            optionalEmpty = Optional.empty();
                                                        }
                                                    }
                                                    optionalEmpty.ifPresent(new Consumer() { // from class: asoc
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void z(Object obj3) {
                                                            BusinessInfoData businessInfoData6 = businessInfoData5;
                                                            String str8 = (String) obj3;
                                                            asof asofVar4 = asofVar3;
                                                            String rbmBotId3 = businessInfoData6.getRbmBotId();
                                                            String strC = ((chwl) asofVar4.f.b()).c(rbmBotId3, businessInfoData6.getName(), businessInfoData6.getColor());
                                                            try {
                                                                fcsu fcsuVar2 = asofVar4.i;
                                                                List listU = ((cmqj) fcsuVar2.b()).U(str8);
                                                                if (listU.size() != 1) {
                                                                    asofVar4.a(rbmBotId3, listU, "No canonical address for specified recipient id");
                                                                    return;
                                                                }
                                                                int i2 = 0;
                                                                alqm alqmVar = (alqm) listU.get(0);
                                                                cczv cczvVar = alvx.a;
                                                                String strP = alqmVar.p(((Boolean) new alvr().get()).booleanValue());
                                                                if (strP != null && !strP.endsWith("@bot.rcs.google.com")) {
                                                                    asofVar4.a(rbmBotId3, listU, "Bot suffix did not match canonical address");
                                                                    return;
                                                                }
                                                                int iC = ((cmqj) fcsuVar2.b()).c(asofVar4.c, str8, strC);
                                                                if (iC == 0) {
                                                                    ((ajhd) asofVar4.e.b()).al(14, rbmBotId3);
                                                                    cqbd cqbdVarC3 = asof.a.c();
                                                                    cqbdVarC3.I("No entries updated in telephony");
                                                                    cqbdVarC3.A("botId", rbmBotId3);
                                                                    cqbdVarC3.M("recipientId", str8);
                                                                    cqbdVarC3.r();
                                                                } else {
                                                                    i2 = iC;
                                                                }
                                                                cqbd cqbdVarC4 = asof.a.c();
                                                                cqbdVarC4.I("updated telephony rows for rbm bot");
                                                                cqbdVarC4.y("number of rows", i2);
                                                                cqbdVarC4.r();
                                                            } catch (Throwable th2) {
                                                                ((ajhd) asofVar4.e.b()).al(15, rbmBotId3);
                                                                cqbd cqbdVarB2 = asof.a.b();
                                                                cqbdVarB2.I("Error updating canonical address in Telephony");
                                                                cqbdVarB2.A("botId", rbmBotId3);
                                                                cqbdVarB2.A("exception", th2.getMessage());
                                                                cqbdVarB2.r();
                                                            }
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                } finally {
                                                }
                                            } catch (Throwable unused) {
                                                ((ajhd) asofVar3.e.b()).al(15, str7);
                                                cqbd cqbdVarB2 = asof.a.b();
                                                cqbdVarB2.I("Error updating canonical address in Telephony");
                                                cqbdVarB2.A("botId", str7);
                                                cqbdVarB2.r();
                                            }
                                            ParticipantsTable.BindData bindDataC2 = ((bbca) asofVar3.g.b()).c(businessInfoData5.getRbmBotId());
                                            if (bindDataC2 == null) {
                                                asof.a.p("No existing participants for bot");
                                                return;
                                            }
                                            asofVar3.c(bindDataC2.R(), businessInfoData5.getRbmBotId(), businessInfoData5, null);
                                            ((egzh) asofVar3.h.b()).b(eijx.e(null), BusinessInfoDatabaseConstants.BusinessInfoTableConstants.TABLE_NAME);
                                            ekrw ekrwVarH7 = asof.b.h();
                                            ekrwVarH7.X(eksq.a, "BugleNotifications");
                                            ((ekrd) ((ekrd) ekrwVarH7).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper", "updateParticipantAndConversations", 188, "RbmBusinessInfoUpdateHelper.java")).q("Creating notification from RbmBusinessInfoUpdateHelper");
                                            ((cgpi) asofVar3.j.b()).c();
                                        }
                                    });
                                }
                            }, asnlVar2.h).h(new ejvr() { // from class: asna
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    cqce cqceVar3 = asnl.a;
                                    return asnl.c(str4);
                                }
                            }, eoqg.a);
                        }
                    }, asnlVar.h).f(cond.class, new eooz() { // from class: asmn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            asnl.a.s("Download failed for a business info media", (cond) obj2);
                            return asnlVar.i(new asoa("Could not download business info media", 16), asnmVar2);
                        }
                    }, asnlVar.g);
                }
                cqbd cqbdVarB = asnl.a.b();
                cqbdVarB.I("One of the media URLs was missing");
                cqbdVarB.A("business logo url", logoImageRemoteUrl);
                cqbdVarB.A("hero image url", heroImageRemoteUrl);
                cqbdVarB.A("verifier logo url", verifierLogoImageRemoteUrl);
                cqbdVarB.A("verifier id", verifierId);
                cqbdVarB.r();
                return asnlVar.i(new asoa("Media URL missing", 15), asnmVar2);
            }
        };
        eosc eoscVar = this.g;
        return eijuVar.i(eoozVar, eoscVar).f(Throwable.class, new eooz() { // from class: asmq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof asoa;
                asnl asnlVar = this.a;
                asnm asnmVar2 = asnmVar;
                if (z) {
                    return asnlVar.i((asoa) th, asnmVar2);
                }
                asnl.a.s("Business Info retrieval error with unknown reason", th);
                return asnlVar.i(new asoa("Error reason unknown", 1), asnmVar2);
            }
        }, eoscVar).h(new ejvr() { // from class: asmr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                if (cbcwVar != null && cbcwVar.e()) {
                    asnm asnmVar2 = asnmVar;
                    aill aillVar = (aill) this.a.o.b.b();
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.RBM_EVENT;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b |= 1;
                    enfb enfbVar = (enfb) enfc.a.createBuilder();
                    enea eneaVar = (enea) eneb.a.createBuilder();
                    eneaVar.copyOnWrite();
                    eneb enebVar = (eneb) eneaVar.instance;
                    enebVar.c = asnmVar2.c - 1;
                    enebVar.b |= 1;
                    enfbVar.copyOnWrite();
                    enfc enfcVar = (enfc) enfbVar.instance;
                    eneb enebVar2 = (eneb) eneaVar.build();
                    enebVar2.getClass();
                    enfcVar.d = enebVar2;
                    enfcVar.c = 5;
                    String strA = aspz.a(asnmVar2.a);
                    enfbVar.copyOnWrite();
                    enfc enfcVar2 = (enfc) enfbVar.instance;
                    strA.getClass();
                    enfcVar2.b |= 1;
                    enfcVar2.e = strA;
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    enfc enfcVar3 = (enfc) enfbVar.build();
                    enfcVar3.getClass();
                    ellhVar2.aI = enfcVar3;
                    ellhVar2.e |= 2048;
                    aillVar.j(ellgVar);
                }
                return cbcwVar;
            }
        }, this.h);
    }

    public final eiju i(final asoa asoaVar, final asnm asnmVar) {
        return eijx.g(new Callable() { // from class: asmx
            /* JADX WARN: Code restructure failed: missing block: B:39:0x013c, code lost:
            
                if (((java.lang.Boolean) ((defpackage.cczi) defpackage.asow.a.get()).e()).booleanValue() != false) goto L40;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 414
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.asmx.call():java.lang.Object");
            }
        }, this.g);
    }

    public final eiju j(asnm asnmVar) {
        this.p.b("Bugle.Rbm.BusinessInfo.BotMetadataDownloadLatency");
        return h(this.f.a(asnmVar.a, true), asnmVar, Optional.empty());
    }
}
