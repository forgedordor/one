package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzru extends dzrp implements dzix, dzlo {
    public final Context a;
    public final eygg b;
    public final eygg d;
    public final fcsu e;
    public final dzjt h;
    private final dzlm i;
    private final eosd j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public dzru(dzln dzlnVar, Context context, dzjd dzjdVar, eosd eosdVar, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, Executor executor, dzjt dzjtVar) {
        this.h = dzjtVar;
        this.i = dzlnVar.a(executor, eyggVar, fcsuVar);
        this.a = context;
        this.j = eosdVar;
        this.b = eyggVar;
        this.d = eyggVar2;
        this.e = fcsuVar;
        dzjdVar.a(this);
    }

    @Override // defpackage.dzrp
    public final void a(final dzrm dzrmVar) {
        String strGroup;
        String str;
        int i;
        if (dzrmVar.b <= 0 && dzrmVar.c <= 0 && dzrmVar.d <= 0 && dzrmVar.e <= 0 && dzrmVar.q <= 0 && (i = dzrmVar.w) != 3 && i != 4 && dzrmVar.s <= 0) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).q("skip logging NetworkEvent due to empty bandwidth/latency data");
            ListenableFuture listenableFuture = eorv.a;
            return;
        }
        dzlm dzlmVar = this.i;
        String str2 = dzrmVar.g;
        if (str2 == null || !dzrmVar.h) {
            strGroup = dzrmVar.f;
        } else {
            strGroup = str2 + "/" + dzrmVar.f;
        }
        String str3 = dzrmVar.k;
        Pattern pattern = dzrn.a;
        if (ejwk.c(strGroup)) {
            strGroup = "";
        } else {
            Matcher matcher = dzrn.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = dzrn.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    Matcher matcher3 = dzrn.b.matcher(strGroup);
                    if (matcher3.find() && str3 != null && !str3.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = dzrmVar.u;
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str = "NONE";
                    break;
                case 2:
                    str = "MOBILE";
                    break;
                case 3:
                    str = "WIFI";
                    break;
                case 4:
                    str = "MOBILE_MMS";
                    break;
                case 5:
                    str = "MOBILE_SUPL";
                    break;
                case 6:
                    str = "MOBILE_DUN";
                    break;
                case 7:
                    str = "MOBILE_HIPRI";
                    break;
                case 8:
                    str = "WIMAX";
                    break;
                case 9:
                    str = "BLUETOOTH";
                    break;
                case 10:
                    str = "DUMMY";
                    break;
                case 11:
                    str = "ETHERNET";
                    break;
                case 12:
                    str = "MOBILE_FOTA";
                    break;
                case 13:
                    str = "MOBILE_IMS";
                    break;
                case 14:
                    str = "MOBILE_CBS";
                    break;
                case 15:
                    str = "WIFI_P2P";
                    break;
                case 16:
                    str = "MOBILE_IA";
                    break;
                case 17:
                    str = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str = "PROXY";
                    break;
                default:
                    str = "VPN";
                    break;
            }
        } else {
            str = null;
        }
        ejwc ejwcVar = new ejwc(":");
        final long jA = dzlmVar.a(new ejvy(ejwcVar, ejwcVar).g(strGroup, dzrmVar.k, str, dzrmVar.i));
        if (jA == -1) {
            ListenableFuture listenableFuture2 = eorv.a;
        } else {
            this.g.incrementAndGet();
            eork.n(new eooy() { // from class: dzrr
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    ArrayList arrayList;
                    NetworkInfo activeNetworkInfo;
                    dzru dzruVar = this.a;
                    long j = jA;
                    try {
                        int iA = fehe.a(((fehf) dzruVar.e.b()).d);
                        dzrm dzrmVar2 = dzrmVar;
                        if (iA != 0 && iA == 5) {
                            dzrmVar2.t = ejwi.j(Long.valueOf(j));
                        }
                        Context context = dzruVar.a;
                        dzrmVar2.l = dzruVar.h.a();
                        int type = -1;
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                type = activeNetworkInfo.getType();
                            }
                        } catch (SecurityException e) {
                            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).q("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                        }
                        int iA2 = feeu.a(type);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        dzrmVar2.u = iA2;
                        int iD = ((dzrl) dzruVar.b.b()).d();
                        synchronized (dzruVar.c) {
                            dzruVar.f.ensureCapacity(iD);
                            dzruVar.f.add(dzrmVar2);
                            if (dzruVar.f.size() >= iD) {
                                arrayList = dzruVar.f;
                                dzruVar.f = new ArrayList(0);
                            } else {
                                arrayList = null;
                            }
                        }
                        return arrayList == null ? eorv.a : dzruVar.b(((dzrn) dzruVar.d.b()).c(arrayList));
                    } finally {
                        dzruVar.g.decrementAndGet();
                    }
                }
            }, this.j);
        }
    }

    public final ListenableFuture b(feix feixVar) {
        feeg feegVar;
        try {
            feegVar = (feeg) ((dzro) ((dzrl) this.b.b()).e().e(new dzro() { // from class: dzrq
                @Override // defpackage.dzro
                public final ejwi a() {
                    return ejud.a;
                }
            })).a().f();
        } catch (Exception e) {
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 191, "NetworkMetricServiceImpl.java")).q("Exception while getting network metric extension!");
            feegVar = null;
        }
        dzlm dzlmVar = this.i;
        dzle dzleVarN = dzlf.n();
        dzleVarN.f(feixVar);
        ((dzkw) dzleVarN).b = feegVar;
        return dzlmVar.b(dzleVarN.a());
    }

    public final ListenableFuture c() {
        if (this.g.get() > 0) {
            return eork.k(new eooy() { // from class: dzrs
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return this.a.c();
                }
            }, 1L, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return eorv.a;
            }
            final ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return eork.n(new eooy() { // from class: dzrt
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    dzru dzruVar = this.a;
                    return dzruVar.b(((dzrn) dzruVar.d.b()).c(arrayList));
                }
            }, this.j);
        }
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        c();
    }

    @Override // defpackage.dzlo
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.dzix
    public final /* synthetic */ void j(dzfh dzfhVar) {
    }
}
