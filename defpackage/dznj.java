package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznj extends dzne implements dzlo, dzjg, dzix {
    public volatile dzfh a;
    public final eygg b;
    public final fcsu d;
    public final fcsu e;
    public final dzmw f;
    public final dznd g;
    public final dzoh h;
    private final Executor j;
    private final dzlm k;
    private final ejwi l;
    private final dzjh m;
    private final dzjd n;
    private final dzvq o;
    private final fcsu t;
    private final ejwi u;
    private final fcsu v;
    private final fcsu w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicInteger q = new AtomicInteger();
    private final AtomicInteger r = new AtomicInteger();
    private final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public dznj(dzln dzlnVar, Executor executor, eygg eyggVar, ejwi ejwiVar, dzjh dzjhVar, dzjd dzjdVar, dzvq dzvqVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dzmw dzmwVar, dznd dzndVar, ejwi ejwiVar2, fcsu fcsuVar4, fcsu fcsuVar5, dzoh dzohVar) {
        this.b = eyggVar;
        this.l = ejwiVar;
        this.m = dzjhVar;
        this.n = dzjdVar;
        this.o = dzvqVar;
        this.k = dzlnVar.a(eoqg.a, eyggVar, null);
        this.j = executor;
        this.t = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = dzmwVar;
        this.g = dzndVar;
        this.u = ejwiVar2;
        this.v = fcsuVar4;
        this.w = fcsuVar5;
        this.h = dzohVar;
    }

    private final void q(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        eork.n(new eooy() { // from class: dznf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return eorv.a;
                }
                int i2 = i;
                dznj dznjVar = this.a;
                return dznjVar.o(i2, (dzmt) dznjVar.b.b());
            }
        }, this.j);
    }

    @Override // defpackage.dzjg
    public final void a(Activity activity, Bundle bundle) {
        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 419, "CrashMetricServiceImpl.java")).q("onActivityCreated");
        if (this.s.getAndSet(true)) {
            return;
        }
        q(4, this.q);
    }

    @Override // defpackage.dzjg
    public final void d(Activity activity) {
        eork.n(new eooy() { // from class: dznh
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dznj dznjVar = this.a;
                if (dznjVar.m()) {
                    final dzmw dzmwVar = dznjVar.f;
                    if (dzmwVar.g.getAndSet(false)) {
                        eork.n(new eooy() { // from class: dzmv
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                dzmw dzmwVar2 = dzmwVar;
                                ejwi ejwiVar = (ejwi) dzmwVar2.b.get();
                                boolean zG = ejwiVar.g();
                                Object obj = dzmwVar2.c.get();
                                if (zG) {
                                    ejwi ejwiVar2 = (ejwi) obj;
                                    if (ejwiVar2.g()) {
                                        dzmu dzmuVar = new dzmu((File) ejwiVar.c(), (String) ejwiVar2.c());
                                        int iA = dzmuVar.a();
                                        dzmuVar.b().delete();
                                        dzmuVar.b = 0;
                                        dzmuVar.c = true;
                                        if (iA < ((dzmy) dzmwVar2.f.b()).c) {
                                            return eorv.a;
                                        }
                                        dzlm dzlmVar = dzmwVar2.e;
                                        dzle dzleVarN = dzlf.n();
                                        feiw feiwVar = (feiw) feix.a.createBuilder();
                                        feip feipVar = (feip) feit.a.createBuilder();
                                        feipVar.copyOnWrite();
                                        feit feitVar = (feit) feipVar.instance;
                                        feitVar.c = 6;
                                        feitVar.b = 1 | feitVar.b;
                                        feiwVar.copyOnWrite();
                                        feix feixVar = (feix) feiwVar.instance;
                                        feit feitVar2 = (feit) feipVar.build();
                                        feitVar2.getClass();
                                        feixVar.y = feitVar2;
                                        feixVar.b |= 16777216;
                                        dzleVarN.f((feix) feiwVar.build());
                                        return dzlmVar.b(dzleVarN.a());
                                    }
                                }
                                return eorv.a;
                            }
                        }, dzmwVar.d);
                    } else {
                        ListenableFuture listenableFuture = eorv.a;
                    }
                }
                return eorv.a;
            }
        }, this.j);
    }

    @Override // defpackage.dzjg
    public final void f(Activity activity) {
        this.a = dzfh.b(activity.getClass());
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        this.a = null;
    }

    @Override // defpackage.dzne
    public final void k() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new dzni(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:5|1d|15|(20:17|(1:19)(2:21|(1:23)(17:24|(4:26|(1:62)(2:29|(1:31)(2:32|(4:34|(8:102|35|100|36|105|37|118|56)|58|(1:60)(1:61))(3:57|58|(0)(0))))|63|(1:67))(0)|109|70|(1:72)(1:73)|74|114|(2:79|77)|113|80|(1:85)|116|(2:94|86)|115|(2:90|88)|117|(2:92|93)(1:121)))|20|63|(0)(1:67)|109|70|(0)(0)|74|114|(1:77)|113|80|(2:83|85)|116|(1:86)|115|(1:88)|117|(0)(0))(1:68)|69|109|70|(0)(0)|74|114|(1:77)|113|80|(0)|116|(1:86)|115|(1:88)|117|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0279, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f3 A[PHI: r4 r17
      0x01f3: PHI (r4v2 fehu) = (r4v1 fehu), (r4v24 fehu), (r4v24 fehu) binds: [B:68:0x01ef, B:64:0x01e7, B:66:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r17v1 boolean) = (r17v0 boolean), (r17v13 boolean), (r17v13 boolean) binds: [B:68:0x01ef, B:64:0x01e7, B:66:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb A[Catch: InterruptedException -> 0x0279, all -> 0x0280, TryCatch #10 {InterruptedException -> 0x0279, all -> 0x0280, blocks: (B:70:0x01f5, B:72:0x01fb, B:74:0x0210, B:73:0x0206), top: B:109:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206 A[Catch: InterruptedException -> 0x0279, all -> 0x0280, TryCatch #10 {InterruptedException -> 0x0279, all -> 0x0280, blocks: (B:70:0x01f5, B:72:0x01fb, B:74:0x0210, B:73:0x0206), top: B:109:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0288 A[LOOP:0: B:77:0x0280->B:79:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ba A[LOOP:2: B:88:0x02b2->B:90:0x02ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c4 A[LOOP:1: B:86:0x02aa->B:94:0x02c4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.fehu r26, defpackage.dzok r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dznj.l(fehu, dzok):void");
    }

    public final boolean m() {
        return ((dzmy) this.e.b()).b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fcsu, java.lang.Object] */
    @Override // defpackage.dzlo
    public final void n() {
        ((dznq) ((ejwt) this.l).a.b()).a(this);
        this.m.a(this);
        this.n.a(this);
        q(3, this.p);
        eork.n(new eooy() { // from class: dzng
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dznj dznjVar = this.a;
                return (!dznjVar.m() || dznjVar.c.getAndSet(true)) ? eorv.a : dznjVar.p(6, (dzmt) dznjVar.b.b(), ((dzmy) dznjVar.e.b()).f);
            }
        }, this.j);
    }

    public final ListenableFuture o(int i, dzmt dzmtVar) {
        return p(i, dzmtVar, dzmtVar.d() / 100.0f);
    }

    public final ListenableFuture p(int i, dzmt dzmtVar, float f) {
        if (!dzmtVar.c()) {
            return eorv.a;
        }
        if (!this.o.a(f).a()) {
            return eorv.a;
        }
        dzlm dzlmVar = this.k;
        dzle dzleVarN = dzlf.n();
        feiw feiwVar = (feiw) feix.a.createBuilder();
        feip feipVar = (feip) feit.a.createBuilder();
        float f2 = 1.0f / f;
        feipVar.copyOnWrite();
        feit feitVar = (feit) feipVar.instance;
        feitVar.b |= 2;
        feitVar.d = (int) f2;
        feipVar.copyOnWrite();
        feit feitVar2 = (feit) feipVar.instance;
        feitVar2.c = i - 1;
        feitVar2.b |= 1;
        feiwVar.copyOnWrite();
        feix feixVar = (feix) feiwVar.instance;
        feit feitVar3 = (feit) feipVar.build();
        feitVar3.getClass();
        feixVar.y = feitVar3;
        feixVar.b |= 16777216;
        dzleVarN.f((feix) feiwVar.build());
        return dzlmVar.b(dzleVarN.a());
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.dzix
    public final /* synthetic */ void j(dzfh dzfhVar) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
