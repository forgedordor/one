package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.Trace;
import defpackage.a;
import defpackage.evqs;
import defpackage.evub;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.ffyu;
import defpackage.fgak;
import defpackage.fgal;
import defpackage.fgam;
import defpackage.fgao;
import defpackage.fgaq;
import defpackage.fgay;
import defpackage.fgaz;
import defpackage.fgba;
import defpackage.fgct;
import defpackage.fggm;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetLibraryLoader {
    public static fgba d;
    public static fgct e;
    private static boolean g;
    private static final Object f = new Object();
    private static final String h = "cronet.".concat(ImplVersion.getCronetVersion());
    public static final String a = "CronetLibraryLoader";
    private static final HandlerThread i = new HandlerThread("CronetInit");
    public static final ConditionVariable b = new ConditionVariable();
    public static final ConditionVariable c = new ConditionVariable();

    public static fgba a() {
        if (d == null) {
            new ffyu("CronetLibraryLoader#getHttpFlags waiting for HTTP flags load");
            try {
                c.block();
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            c.block();
        }
        return d;
    }

    public static void b(Runnable runnable) {
        HandlerThread handlerThread = i;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handlerThread.getLooper()).post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000a, B:7:0x000f, B:10:0x0014, B:12:0x001e, B:14:0x0030, B:21:0x003d, B:20:0x003a, B:23:0x0040, B:28:0x005c, B:35:0x0069, B:34:0x0066, B:36:0x006a, B:38:0x0074, B:40:0x0089, B:43:0x0091, B:45:0x00a1, B:51:0x00c2, B:52:0x00c5, B:53:0x00cc, B:48:0x00b8, B:56:0x00d1, B:57:0x00e6, B:42:0x008f, B:63:0x00f0, B:62:0x00ed, B:24:0x0047, B:26:0x004d, B:27:0x0057, B:13:0x0025, B:31:0x0061, B:37:0x0071, B:17:0x0035, B:59:0x00e8), top: B:74:0x000a, outer: #3, inners: #0, #2, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000a, B:7:0x000f, B:10:0x0014, B:12:0x001e, B:14:0x0030, B:21:0x003d, B:20:0x003a, B:23:0x0040, B:28:0x005c, B:35:0x0069, B:34:0x0066, B:36:0x006a, B:38:0x0074, B:40:0x0089, B:43:0x0091, B:45:0x00a1, B:51:0x00c2, B:52:0x00c5, B:53:0x00cc, B:48:0x00b8, B:56:0x00d1, B:57:0x00e6, B:42:0x008f, B:63:0x00f0, B:62:0x00ed, B:24:0x0047, B:26:0x004d, B:27:0x0057, B:13:0x0025, B:31:0x0061, B:37:0x0071, B:17:0x0035, B:59:0x00e8), top: B:74:0x000a, outer: #3, inners: #0, #2, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[Catch: all -> 0x00f1, TryCatch #1 {, blocks: (B:5:0x000a, B:7:0x000f, B:10:0x0014, B:12:0x001e, B:14:0x0030, B:21:0x003d, B:20:0x003a, B:23:0x0040, B:28:0x005c, B:35:0x0069, B:34:0x0066, B:36:0x006a, B:38:0x0074, B:40:0x0089, B:43:0x0091, B:45:0x00a1, B:51:0x00c2, B:52:0x00c5, B:53:0x00cc, B:48:0x00b8, B:56:0x00d1, B:57:0x00e6, B:42:0x008f, B:63:0x00f0, B:62:0x00ed, B:24:0x0047, B:26:0x004d, B:27:0x0057, B:13:0x0025, B:31:0x0061, B:37:0x0071, B:17:0x0035, B:59:0x00e8), top: B:74:0x000a, outer: #3, inners: #0, #2, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[Catch: all -> 0x00f1, TryCatch #1 {, blocks: (B:5:0x000a, B:7:0x000f, B:10:0x0014, B:12:0x001e, B:14:0x0030, B:21:0x003d, B:20:0x003a, B:23:0x0040, B:28:0x005c, B:35:0x0069, B:34:0x0066, B:36:0x006a, B:38:0x0074, B:40:0x0089, B:43:0x0091, B:45:0x00a1, B:51:0x00c2, B:52:0x00c5, B:53:0x00cc, B:48:0x00b8, B:56:0x00d1, B:57:0x00e6, B:42:0x008f, B:63:0x00f0, B:62:0x00ed, B:24:0x0047, B:26:0x004d, B:27:0x0057, B:13:0x0025, B:31:0x0061, B:37:0x0071, B:17:0x0035, B:59:0x00e8), top: B:74:0x000a, outer: #3, inners: #0, #2, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[Catch: all -> 0x00f1, TRY_ENTER, TryCatch #1 {, blocks: (B:5:0x000a, B:7:0x000f, B:10:0x0014, B:12:0x001e, B:14:0x0030, B:21:0x003d, B:20:0x003a, B:23:0x0040, B:28:0x005c, B:35:0x0069, B:34:0x0066, B:36:0x006a, B:38:0x0074, B:40:0x0089, B:43:0x0091, B:45:0x00a1, B:51:0x00c2, B:52:0x00c5, B:53:0x00cc, B:48:0x00b8, B:56:0x00d1, B:57:0x00e6, B:42:0x008f, B:63:0x00f0, B:62:0x00ed, B:24:0x0047, B:26:0x004d, B:27:0x0057, B:13:0x0025, B:31:0x0061, B:37:0x0071, B:17:0x0035, B:59:0x00e8), top: B:74:0x000a, outer: #3, inners: #0, #2, #4, #5, #7, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r5, defpackage.fgcn r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetLibraryLoader.c(android.content.Context, fgcn, boolean):boolean");
    }

    private static void ensureInitializedFromNative() {
        c(ffxu.a, null, true);
    }

    private static byte[] getBaseFeatureOverrides() {
        fgak fgakVar;
        fgba fgbaVarA = a();
        HashMap map = new HashMap();
        for (Map.Entry entry : fgbaVarA.a().entrySet()) {
            try {
                String str = (String) entry.getKey();
                fgaz fgazVar = (fgaz) entry.getValue();
                if (str.startsWith("ChromiumBaseFeature_")) {
                    String strSubstring = str.substring(20);
                    fgak fgakVar2 = new fgak();
                    int iIndexOf = strSubstring.indexOf("_PARAM_");
                    if (iIndexOf < 0) {
                        fgakVar2.a = strSubstring;
                    } else {
                        fgakVar2.a = strSubstring.substring(0, iIndexOf);
                        fgakVar2.b = strSubstring.substring(iIndexOf + 7);
                    }
                    fgakVar = fgakVar2;
                } else {
                    fgakVar = null;
                }
                if (fgakVar != null) {
                    fgam fgamVar = (fgam) map.get(fgakVar.a);
                    if (fgamVar == null) {
                        fgamVar = (fgam) fgao.DEFAULT_INSTANCE.createBuilder();
                        map.put(fgakVar.a, fgamVar);
                    }
                    String str2 = fgakVar.b;
                    if (str2 == null) {
                        int iF = fgazVar.f();
                        if (iF != 1) {
                            throw new IllegalArgumentException("HTTP flag has type " + fgay.a(iF) + ", but only boolean flags are supported as base::Feature overrides");
                        }
                        boolean zE = fgazVar.e();
                        fgamVar.copyOnWrite();
                        fgao fgaoVar = (fgao) fgamVar.instance;
                        int i2 = fgao.ENABLED_FIELD_NUMBER;
                        fgaoVar.bitField0_ |= 1;
                        fgaoVar.enabled_ = zE;
                    } else {
                        int iF2 = fgazVar.f() - 1;
                        evqs evqsVarC = iF2 != 0 ? iF2 != 1 ? iF2 != 2 ? iF2 != 3 ? fgazVar.c() : evqs.y(fgazVar.d(), StandardCharsets.UTF_8) : evqs.y(Float.toString(fgazVar.a()), StandardCharsets.UTF_8) : evqs.y(Long.toString(fgazVar.b(), 10), StandardCharsets.UTF_8) : evqs.y(true != fgazVar.e() ? "false" : "true", StandardCharsets.UTF_8);
                        evqsVarC.getClass();
                        fgamVar.copyOnWrite();
                        fgao fgaoVar2 = (fgao) fgamVar.instance;
                        int i3 = fgao.ENABLED_FIELD_NUMBER;
                        evub<String, evqs> evubVar = fgaoVar2.params_;
                        if (!evubVar.b) {
                            fgaoVar2.params_ = evubVar.a();
                        }
                        fgaoVar2.params_.put(str2, evqsVarC);
                    }
                }
            } catch (RuntimeException e2) {
                throw new IllegalArgumentException("Could not parse HTTP flag `" + ((String) entry.getKey()) + "` as a base::Feature override", e2);
            }
        }
        fgal fgalVar = (fgal) fgaq.DEFAULT_INSTANCE.createBuilder();
        for (Map.Entry entry2 : map.entrySet()) {
            String str3 = (String) entry2.getKey();
            fgao fgaoVarBuild = ((fgam) entry2.getValue()).build();
            str3.getClass();
            fgaoVarBuild.getClass();
            fgalVar.copyOnWrite();
            fgaq fgaqVar = (fgaq) fgalVar.instance;
            evub<String, fgao> evubVar2 = fgaqVar.featureStates_;
            if (!evubVar2.b) {
                fgaqVar.featureStates_ = evubVar2.a();
            }
            fgaqVar.featureStates_.put(str3, fgaoVarBuild);
        }
        return fgalVar.build().toByteArray();
    }

    private static String getDefaultUserAgent() {
        return fggm.a(ffxu.a);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i2) throws SecurityException, IllegalArgumentException {
        ffyc.b(a, a.g(i2, "Setting network thread priority to "), new Object[0]);
        Process.setThreadPriority(i2);
    }
}
