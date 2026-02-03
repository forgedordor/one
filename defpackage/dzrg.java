package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzrg {
    public static final /* synthetic */ int b = 0;
    public final Context a;
    private final dzjt c;
    private final fcsu d;
    private final fcsu e;

    static {
        ejxx.a(new ejxr() { // from class: dzrd
            @Override // defpackage.ejxr
            public final Object get() {
                return dzrg.a();
            }
        });
    }

    public dzrg(final fcsu fcsuVar, Context context, fcsu fcsuVar2, final fcsu fcsuVar3, dzjt dzjtVar) {
        this.c = dzjtVar;
        fcsuVar.getClass();
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: dzrb
            @Override // defpackage.ejxr
            public final Object get() {
                return (dzqf) fcsuVar.b();
            }
        });
        this.d = new fcsu() { // from class: dzrc
            @Override // defpackage.fcsu
            public final Object b() {
                int i = dzrg.b;
                return (dzqf) (((Boolean) fcsuVar3.b()).booleanValue() ? ejxrVarA.get() : fcsuVar.b());
            }
        };
        this.a = context;
        this.e = fcsuVar2;
    }

    static /* synthetic */ ejwi a() {
        try {
            return ejwi.j(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return ejud.a;
        } catch (NoSuchMethodException e2) {
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.e()).g(e2)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'f', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) not found");
            return ejud.a;
        } catch (Exception e3) {
            e = e3;
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return ejud.a;
        }
    }

    private static Long d(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                ejyb.e(strGroup);
                return Long.valueOf(Long.parseLong(strGroup));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    final feep b(int i, int i2, String str, String str2, ejxr ejxrVar) {
        ActivityManager.MemoryInfo memoryInfo;
        Object objB = this.d.b();
        ecem.b();
        dzqf dzqfVar = (dzqf) objB;
        dzqfVar.i();
        dzrf dzrfVar = null;
        if (dzqfVar.e()) {
            memoryInfo = new ActivityManager.MemoryInfo();
            Context context = this.a;
            if (dzjr.a == null) {
                synchronized (dzjr.class) {
                    if (dzjr.a == null) {
                        Object systemService = context.getSystemService("activity");
                        systemService.getClass();
                        dzjr.a = (ActivityManager) systemService;
                    }
                }
            }
            dzjr.a.getMemoryInfo(memoryInfo);
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                File file = ((Boolean) this.e.b()).booleanValue() ? new File(a.e(i2, "/proc/", "/status")) : new File("/proc/self/status");
                Charset charsetDefaultCharset = Charset.defaultCharset();
                charsetDefaultCharset.getClass();
                String str3 = new String(eleg.a(file), charsetDefaultCharset);
                if (str3.isEmpty()) {
                    ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 252, "MemoryUsageCapture.java")).q("Null or empty proc status");
                } else {
                    dzrf dzrfVar2 = new dzrf();
                    dzrfVar2.f = d(dzrf.a, str3);
                    dzrfVar2.g = d(dzrf.b, str3);
                    dzrfVar2.h = d(dzrf.c, str3);
                    dzrfVar2.i = d(dzrf.d, str3);
                    dzrfVar2.j = d(dzrf.e, str3);
                    dzrfVar = dzrfVar2;
                }
            } catch (IOException e) {
                ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", 289, "MemoryUsageCapture.java")).q("Error reading proc status");
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            feen feenVar = (feen) feep.a.createBuilder();
            feel feelVar = (feel) feem.a.createBuilder();
            feeh feehVar = (feeh) feei.a.createBuilder();
            if (memoryInfo != null) {
                long j = memoryInfo.availMem >> 10;
                feehVar.copyOnWrite();
                feei feeiVar = (feei) feehVar.instance;
                feeiVar.b |= 131072;
                feeiVar.s = (int) j;
                long j2 = memoryInfo.totalMem >> 20;
                feehVar.copyOnWrite();
                feei feeiVar2 = (feei) feehVar.instance;
                feeiVar2.b |= 262144;
                feeiVar2.t = (int) j2;
            }
            if (dzrfVar != null) {
                Long l = dzrfVar.f;
                if (l != null) {
                    long jLongValue = l.longValue();
                    feehVar.copyOnWrite();
                    feei feeiVar3 = (feei) feehVar.instance;
                    feeiVar3.b |= 524288;
                    feeiVar3.u = jLongValue;
                }
                Long l2 = dzrfVar.g;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    feehVar.copyOnWrite();
                    feei feeiVar4 = (feei) feehVar.instance;
                    feeiVar4.b |= 1048576;
                    feeiVar4.v = jLongValue2;
                }
                Long l3 = dzrfVar.h;
                if (l3 != null) {
                    long jLongValue3 = l3.longValue();
                    feehVar.copyOnWrite();
                    feei feeiVar5 = (feei) feehVar.instance;
                    feeiVar5.b |= 2097152;
                    feeiVar5.w = jLongValue3;
                }
                Long l4 = dzrfVar.i;
                if (l4 != null) {
                    long jLongValue4 = l4.longValue();
                    feehVar.copyOnWrite();
                    feei feeiVar6 = (feei) feehVar.instance;
                    feeiVar6.b |= 4194304;
                    feeiVar6.x = jLongValue4;
                }
                Long l5 = dzrfVar.j;
                if (l5 != null) {
                    long jLongValue5 = l5.longValue();
                    feehVar.copyOnWrite();
                    feei feeiVar7 = (feei) feehVar.instance;
                    feeiVar7.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                    feeiVar7.y = jLongValue5;
                }
            }
            feei feeiVar8 = (feei) feehVar.build();
            feelVar.copyOnWrite();
            feem feemVar = (feem) feelVar.instance;
            feeiVar8.getClass();
            feemVar.c = feeiVar8;
            feemVar.b |= 1;
            feenVar.copyOnWrite();
            feep feepVar = (feep) feenVar.instance;
            feem feemVar2 = (feem) feelVar.build();
            feemVar2.getClass();
            feepVar.c = feemVar2;
            feepVar.b |= 1;
            feha fehaVar = (feha) fehb.a.createBuilder();
            fegz fegzVarB = dzjt.b(str, this.c.a.a(ejxrVar), (dzju) ejxrVar.get());
            fehaVar.copyOnWrite();
            fehb fehbVar = (fehb) fehaVar.instance;
            fegzVarB.getClass();
            fehbVar.c = fegzVarB;
            fehbVar.b |= 1;
            feenVar.copyOnWrite();
            feep feepVar2 = (feep) feenVar.instance;
            fehb fehbVar2 = (fehb) fehaVar.build();
            fehbVar2.getClass();
            feepVar2.d = fehbVar2;
            feepVar2.b |= 2;
            feej feejVar = (feej) feek.a.createBuilder();
            Context context2 = this.a;
            ActivityManager activityManager = dzjr.a;
            Object systemService2 = context2.getSystemService("power");
            systemService2.getClass();
            boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
            feejVar.copyOnWrite();
            feek feekVar = (feek) feejVar.instance;
            feekVar.b |= 1;
            feekVar.c = zIsInteractive;
            feenVar.copyOnWrite();
            feep feepVar3 = (feep) feenVar.instance;
            feek feekVar2 = (feek) feejVar.build();
            feekVar2.getClass();
            feepVar3.f = feekVar2;
            feepVar3.b |= 8;
            feenVar.copyOnWrite();
            feep feepVar4 = (feep) feenVar.instance;
            feepVar4.e = i - 1;
            feepVar4.b |= 4;
            if (str2 != null) {
                feenVar.copyOnWrite();
                feep feepVar5 = (feep) feenVar.instance;
                feepVar5.b |= 16;
                feepVar5.g = str2;
            }
            return (feep) feenVar.build();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    final feep c(int i, String str) {
        return b(i, Process.myPid(), null, str, ejxx.a(new ejxr() { // from class: dzre
            @Override // defpackage.ejxr
            public final Object get() {
                return dzjr.a(this.a.a, "getMemoryUsageMetric");
            }
        }));
    }
}
