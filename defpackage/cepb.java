package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager");
    public static final cczi b = cdag.g(cdag.b, "tachyon_ditto_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final cczi c = cdag.g(cdag.b, "tachyon_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final cczi d = cdag.g(cdag.b, "tachyon_spam_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final cczi e = cdag.f(cdag.b, "ditto_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(30));
    public static final cczi f = cdag.f(cdag.b, "ditto_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(10));
    public static final cczi g = cdag.f(cdag.b, "verified_sms_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(10));
    public static final cczi h = cdag.f(cdag.b, "verified_sms_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(15));
    public static final cczi i = cdag.g(cdag.b, "sticker_service_host_and_port", "sticker-pa.googleapis.com:443");
    static final ejxr j;
    private final eosc A;
    private final cgaj B;
    private final aghv C;
    public fbqm k;
    public fbqm m;
    public fbqm p;
    public fbqm r;
    public fbqm t;
    private final Context v;
    private final fcsu w;
    private final fcsu x;
    private fbqm y;
    public final Object l = new Object();
    public final Object n = new Object();
    public final Map o = new ConcurrentHashMap();
    private final Object z = new Object();
    public final Object q = new Object();
    public final Object s = new Object();
    public final Object u = new Object();
    private final SparseArray D = new SparseArray();
    private final Object E = new Object();

    static {
        cdag.g(cdag.b, "people_api_host_and_port", "people-pa.googleapis.com:443");
        cdag.f(cdag.b, "people_api_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(30L));
        cdag.f(cdag.b, "people_api_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(10L));
        j = cdag.v("enable_primes_interceptor");
    }

    public cepb(Context context, fcsu fcsuVar, eosc eoscVar, cgaj cgajVar, fcsu fcsuVar2, aghv aghvVar) {
        this.v = context;
        this.x = fcsuVar;
        this.A = eoscVar;
        this.B = cgajVar;
        this.w = fcsuVar2;
        this.C = aghvVar;
    }

    private final String h(int i2) {
        return "Bugle/" + cswl.a(this.v).b + " (" + (i2 != 2 ? i2 != 3 ? "ANDROID_CHANNEL_FALLBACK" : "ANDROID_CHANNEL" : "CRONET") + ")";
    }

    private final void i(int i2) {
        ((ains) this.w.b()).e("Bugle.Grpc.Channel.Creation.Count", i2 - 1);
    }

    public final fbqm a(String str, cgai cgaiVar) {
        return b(str, ((Long) e.e()).longValue(), ((Long) f.e()).longValue(), cgaiVar);
    }

    public final fbqm b(String str, long j2, long j3, cgai cgaiVar) {
        List listI = ejxk.b(':').i(str);
        String str2 = (String) listI.get(0);
        int i2 = listI.size() > 1 ? Integer.parseInt((String) listI.get(1)) : 0;
        aghv aghvVar = this.C;
        if (!aghvVar.a().isPresent() || (aghvVar.a().get() instanceof fgef)) {
            ekrg ekrgVar = a;
            ekrw ekrwVarJ = ekrgVar.j();
            ekrz ekrzVar = eksq.a;
            ekrwVarJ.X(ekrzVar, "BugleNetwork");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.W, str2);
            ekrdVar.X(cqnc.X, Integer.valueOf(i2));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createManagedChannel", 408, "GrpcChannelManager.java")).q("Unable to load CronetEngine - falling back to OkHttp AndroidChannelBuilder");
            ekrw ekrwVarE = ekrgVar.e();
            ekrwVarE.X(ekrzVar, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createAndroidChannel", 438, "GrpcChannelManager.java")).B("Creating gRPC Managed channel with AndroidChannelBuilder: %s:%d", str2, i2);
            i(4);
            fcox fcoxVar = new fcox(str2, i2);
            fcoxVar.n(j2, TimeUnit.MILLISECONDS);
            fcoxVar.o(j3, TimeUnit.MILLISECONDS);
            fcoxVar.p(cgaiVar);
            if (((Boolean) ((cczi) j.get()).e()).booleanValue()) {
                fcoxVar.i(drgt.b());
            }
            fbtt fbttVar = new fbtt(fcoxVar);
            fbttVar.a = this.v;
            fbttVar.l(h(4));
            return fbttVar.a();
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ekrd ekrdVar2 = (ekrd) ekrwVarH;
        ekrdVar2.X(cqnc.W, str2);
        ekrdVar2.X(cqnc.X, Integer.valueOf(i2));
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createManagedChannel", 392, "GrpcChannelManager.java")).q("Creating gRPC Managed channel with Cronet");
        i(2);
        fbxn fbxnVarM = fbxn.m(str2, i2, (CronetEngine) aghvVar.a().get());
        fbxnVarM.l(h(2));
        if (((Boolean) ((cczi) j.get()).e()).booleanValue()) {
            fbni[] fbniVarArr = new fbni[1];
            drgm drgmVar = drgm.a;
            if (drgmVar == null) {
                synchronized (drgm.class) {
                    drgmVar = drgm.a;
                    if (drgmVar == null) {
                        drgmVar = new drgm(drgt.b());
                        drgm.a = drgmVar;
                    }
                }
            }
            fbniVarArr[0] = drgmVar;
            fbxnVarM.i(fbniVarArr);
        }
        fbxnVarM.n(cgaiVar.a());
        return fbxnVarM.a();
    }

    public final fbqm c(String str) {
        return a(str, g(3));
    }

    public final fbqm d() {
        synchronized (this.z) {
            fbqm fbqmVar = this.y;
            if (fbqmVar != null) {
                return fbqmVar;
            }
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getDittoGrpcChannel", 221, "GrpcChannelManager.java")).q("Creating Ditto gRPC Channel");
            fbqm fbqmVarA = a((String) b.e(), g(2));
            this.y = fbqmVarA;
            return fbqmVarA;
        }
    }

    public final fbrg e() {
        fbrg fbrgVar = new fbrg();
        String strValueOf = String.valueOf(this.v.getPackageName());
        fbqx fbqxVar = fbrg.c;
        int i2 = fbrb.d;
        fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), "AIzaSyCB5sc4sgRVObMraVTM-ymBkANcjiQXcV0");
        fbrgVar.h(new fbqw("Sec-X-Google-Grpc", fbqxVar), "1");
        fbrgVar.h(new fbqw("Origin", fbqxVar), "android-app://".concat(strValueOf));
        return fbrgVar;
    }

    @Deprecated
    final String f() {
        Optional optionalV;
        Optional optionalL = ((dggz) this.x.b()).l();
        if (optionalL.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 556, "GrpcChannelManager.java")).q("Cannot use tachyon phone channel URL from ACS config because ACS Configuration does not exist for default SIM. Falling back to phenotype value.");
            optionalV = Optional.empty();
        } else {
            optionalV = ((dgiq) optionalL.get()).v();
            if (optionalV.isEmpty()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 564, "GrpcChannelManager.java")).q("Not using tachyon phone channel URL from ACS config because ACS parameter does not exist. Falling back to phenotype value.");
                optionalV = Optional.empty();
            } else if (TextUtils.isEmpty((CharSequence) optionalV.get())) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 570, "GrpcChannelManager.java")).q("Cannot use tachyon phone channel URL from ACS config because ACS parameter has an empty value. Falling back to phenotype value.");
                optionalV = Optional.empty();
            } else {
                ekrw ekrwVarH2 = a.h();
                ekrwVarH2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 575, "GrpcChannelManager.java")).t("Using tachyon phone channel URL from ACS config: %s", optionalV.get());
            }
        }
        final cczi ccziVar = ceog.a;
        ccziVar.getClass();
        return (String) optionalV.orElseGet(new Supplier() { // from class: cepa
            @Override // java.util.function.Supplier
            public final Object get() {
                return (String) ccziVar.e();
            }
        });
    }

    public final cgai g(int i2) {
        cgai cgaiVarA;
        synchronized (this.E) {
            SparseArray sparseArray = this.D;
            int i3 = i2 - 1;
            cgaiVarA = (cgai) sparseArray.get(i3);
            if (cgaiVarA == null) {
                cgaiVarA = this.B.a(i2, this.A);
                sparseArray.put(i3, cgaiVarA);
            }
        }
        return cgaiVarA;
    }
}
