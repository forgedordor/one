package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzpc implements Window$OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private dzpo d;
    private final ArrayMap e;
    private final ejxr f;
    private final fcsu g;

    public dzpc(final Context context, ArrayMap arrayMap, fcsu fcsuVar) {
        this.f = ejxx.a(new ejxr() { // from class: dzpb
            @Override // defpackage.ejxr
            public final Object get() {
                int i = dzpc.a;
                long jCeil = dzoy.a;
                Context context2 = context;
                if (jCeil == 0) {
                    synchronized (dzoy.class) {
                        jCeil = dzoy.a;
                        if (jCeil == 0) {
                            float f = 60.0f;
                            float fFloatValue = ((Float) dzoy.a(context2).e(Float.valueOf(60.0f))).floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                            jCeil = (long) Math.ceil(1.0E9d / f);
                            dzoy.a = jCeil;
                        }
                    }
                }
                return Long.valueOf(jCeil);
            }
        });
        this.e = arrayMap;
        this.g = fcsuVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2;
        long j;
        char c;
        int i3;
        int i4 = 1;
        if (!this.b) {
            this.b = true;
            this.d = dzpo.b() ? new dzpo() : null;
            fcsu fcsuVar = this.g;
            if (fcsuVar.b() == null || !((Boolean) fcsuVar.b()).booleanValue()) {
                this.c = ((Long) this.f.get()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        if (frameMetrics.getMetric(9) == 1) {
            dzpo dzpoVar = this.d;
            if (dzpoVar != null) {
                dzpoVar.a(frameMetrics, this.c);
                return;
            }
            return;
        }
        long metric = frameMetrics.getMetric(8);
        dzpo dzpoVar2 = this.d;
        long jA = dzpoVar2 != null ? dzpoVar2.a(frameMetrics, this.c) : this.c;
        long metric2 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i5 = 0;
            while (i5 < size) {
                dzpe dzpeVar = (dzpe) arrayMap.valueAt(i5);
                int i6 = i5;
                int i7 = (int) (metric / 1000000);
                int i8 = i4;
                if (i7 < 0) {
                    ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 104, "FrameTimeHistogram.java")).s("Invalid frame time: %d", metric);
                    dzpeVar.j += i8;
                    j = metric;
                    i2 = i8;
                    c = '\b';
                } else {
                    dzpeVar.i += i8;
                    boolean z = dzpeVar.p;
                    i2 = i8;
                    if (metric2 > 0) {
                        j = metric;
                        int i9 = (int) ((metric - metric2) / 1000000);
                        if (dzpeVar.o < i9) {
                            dzpeVar.o = i9;
                        }
                        int[] iArr = dzpeVar.f;
                        int i10 = i9 < 20 ? i9 >= -20 ? ((i9 + 20) >> 1) + 12 : i9 >= -30 ? ((i9 + 30) / 5) + 10 : i9 >= -100 ? ((i9 + 100) / 10) + 3 : i9 >= -200 ? ((i9 + BasePaymentResult.ERROR_REQUEST_FAILED) / 50) + 1 : 0 : i9 < 30 ? ((i9 - 20) / 5) + 32 : i9 < 100 ? ((i9 - 30) / 10) + 34 : i9 < 200 ? ((i9 - 50) / 100) + 41 : i9 < 1000 ? ((i9 + NetError.ERR_CERT_COMMON_NAME_INVALID) / 100) + 43 : 51;
                        iArr[i10] = iArr[i10] + 1;
                        if (j > metric2) {
                            dzpeVar.g++;
                            dzpeVar.l += i7;
                        }
                        if (j > jA) {
                            dzpeVar.h++;
                            dzpeVar.m += i7;
                        }
                    } else {
                        j = metric;
                        if (j > jA) {
                            dzpeVar.g++;
                            dzpeVar.l += i7;
                        }
                    }
                    int[] iArr2 = dzpeVar.e;
                    if (i7 <= 20) {
                        c = '\b';
                        i3 = i7 >= 8 ? (i7 >> 1) - 2 : i7 / 4;
                    } else {
                        c = '\b';
                        i3 = i7 <= 30 ? (i7 / 5) + 4 : i7 <= 100 ? (i7 / 10) + 7 : i7 <= 200 ? (i7 / 50) + 15 : i7 <= 1000 ? (i7 / 100) + 17 : i7 < 5000 ? 27 : 28;
                    }
                    iArr2[i3] = iArr2[i3] + 1;
                    dzpeVar.j += i;
                    if (dzpeVar.k < i7) {
                        dzpeVar.k = i7;
                    }
                    dzpeVar.n += i7;
                }
                i5 = i6 + 1;
                i4 = i2;
                metric = j;
            }
        }
    }
}
