package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzkh extends dzkf implements dzjg, dzix, dzlo {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final dzjh c;
    private final Executor d;
    private final dzkt e;
    private final fcsu f;
    private final dzlm g;
    private final AtomicBoolean h;
    private final dzjd i;

    /* JADX WARN: Multi-variable type inference failed */
    public dzkh(dzln dzlnVar, Context context, dzjh dzjhVar, dzjd dzjdVar, eosd eosdVar, eygg<dzkd> eyggVar, dzkt dzktVar, fcsu<dzka> fcsuVar, fcsu<fehf> fcsuVar2, Executor executor) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = dzjdVar;
        this.g = dzlnVar.a(executor, eyggVar, fcsuVar2);
        this.b = context;
        this.c = dzjhVar;
        this.d = Build.VERSION.SDK_INT < 31 ? executor : eosdVar;
        this.e = dzktVar;
        this.f = fcsuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[Catch: all -> 0x05ca, TryCatch #3 {, blocks: (B:8:0x0014, B:14:0x0043, B:17:0x0047, B:20:0x004d, B:27:0x0084, B:72:0x011d, B:30:0x008b, B:32:0x0091, B:34:0x0099, B:37:0x00a0, B:39:0x00a6, B:40:0x00a8, B:42:0x00af, B:44:0x00ba, B:46:0x00c0, B:48:0x00cb, B:50:0x00d1, B:52:0x00dc, B:54:0x00e2, B:56:0x00ed, B:58:0x00f3, B:60:0x00fa, B:62:0x00fe, B:64:0x0102, B:67:0x0109, B:69:0x010f, B:71:0x011a, B:24:0x0058, B:25:0x006a, B:11:0x002e), top: B:221:0x0014, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture k(defpackage.dzkh r24, defpackage.fecr r25, defpackage.dzfh r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzkh.k(dzkh, fecr, dzfh):com.google.common.util.concurrent.ListenableFuture");
    }

    private final ListenableFuture o(final fecr fecrVar) {
        return eork.n(new eooy() { // from class: dzkg
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return dzkh.k(this.a, fecrVar, null);
            }
        }, this.d);
    }

    @Override // defpackage.dzjg
    public void a(Activity activity, Bundle bundle) {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.dzix
    public void i(dzfh dzfhVar) {
        l();
    }

    @Override // defpackage.dzix
    public void j(dzfh dzfhVar) {
        if (this.a.get()) {
            return;
        }
        m();
    }

    public ListenableFuture<Void> l() {
        if (!dqyw.h(this.b)) {
            return eorv.a;
        }
        try {
            ejwl.l(this.a.getAndSet(false));
            return o(fecr.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return eork.h(e);
        }
    }

    public ListenableFuture<Void> m() {
        if (!dqyw.h(this.b)) {
            return eorv.a;
        }
        if (!this.a.getAndSet(true)) {
            return o(fecr.BACKGROUND_TO_FOREGROUND);
        }
        ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 141, "BatteryMetricServiceImpl.java")).q("App is already in the foreground.");
        return eork.g();
    }

    @Override // defpackage.dzlo
    public void n() {
        this.i.a(this);
        this.c.a(this);
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
