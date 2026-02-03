package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amb implements bin {
    private long A;
    private final anb B;
    final alz a;
    final Executor b;
    public final auy c;
    public final ark d;
    public final atq e;
    public final atg f;
    final ats g;
    public final apj h;
    public final atj i;
    public bbd j;
    public volatile boolean k;
    public final alx l;
    private final Object n = new Object();
    private final bmd o;
    private final ars p;
    private final aqu q;
    private final ayd r;
    private int s;
    private volatile int t;
    private volatile int u;
    private volatile int v;
    private final aww w;
    private final AtomicLong x;
    private volatile ListenableFuture y;
    private int z;

    public amb(auy auyVar, ScheduledExecutorService scheduledExecutorService, Executor executor, anb anbVar, bly blyVar) {
        bmd bmdVar = new bmd();
        this.o = bmdVar;
        this.s = 0;
        this.t = 0;
        this.k = false;
        this.v = 2;
        this.x = new AtomicLong(0L);
        this.y = bqk.b(null);
        this.z = 1;
        this.A = 0L;
        alx alxVar = new alx();
        this.l = alxVar;
        this.c = auyVar;
        this.B = anbVar;
        this.b = executor;
        this.i = new atj(executor);
        alz alzVar = new alz(executor);
        this.a = alzVar;
        bmdVar.t(this.z);
        bmdVar.k(new aqb(alzVar));
        bmdVar.k(alxVar);
        this.q = new aqu();
        this.d = new ark(this, scheduledExecutorService, executor, blyVar);
        this.e = new atq(this, auyVar, executor);
        this.f = new atg(this, auyVar, executor);
        this.u = auyVar.a();
        this.p = new ars(this, auyVar);
        this.g = new atz(auyVar, executor);
        this.w = new aww(blyVar);
        this.r = new ayd(this, executor);
        this.h = new apj(this, auyVar, blyVar, executor, scheduledExecutorService);
    }

    static boolean H(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof bmx) && (l = (Long) ((bmx) tag).c("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    private final boolean K() {
        int i;
        synchronized (this.n) {
            i = this.s;
        }
        return i > 0;
    }

    private static boolean L(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static int b(auy auyVar, int i) {
        int[] iArr = (int[]) auyVar.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return L(i, iArr) ? i : L(1, iArr) ? 1 : 0;
    }

    @Override // defpackage.bin
    public final void A(int i) {
        if (!K()) {
            bbs.f("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.v = i;
        bbs.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.v);
        ats atsVar = this.g;
        boolean z = true;
        if (this.v != 1 && this.v != 0) {
            z = false;
        }
        ((atz) atsVar).e = z;
        this.y = m();
    }

    public final void B(boolean z) {
        ars arsVar = this.p;
        synchronized (arsVar.a) {
            arsVar.b = z;
            if (z) {
            }
        }
    }

    public final void C(Rational rational) {
        this.d.f = rational;
    }

    @Override // defpackage.bin
    public final void D(bbd bbdVar) {
        this.j = bbdVar;
    }

    final void E(int i) {
        this.z = i;
        this.d.n = i;
        this.h.b = this.z;
    }

    public final void F(boolean z) {
        atz atzVar = (atz) this.g;
        if (atzVar.d != z && z) {
            atzVar.c();
        }
        atzVar.d = z;
    }

    final void G(List list) {
        bib bibVar;
        lcg.i(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            anb anbVar = this.B;
            boolean zHasNext = it.hasNext();
            anm anmVar = anbVar.a;
            if (!zHasNext) {
                anmVar.q("Issue capture request");
                anmVar.j.h(arrayList);
                return;
            }
            bjl bjlVar = (bjl) it.next();
            bjj bjjVar = new bjj(bjlVar);
            if (bjlVar.f == 5 && (bibVar = bjlVar.k) != null) {
                bjjVar.f = bibVar;
            }
            if (bjlVar.e().isEmpty() && bjlVar.i) {
                Set set = bjjVar.a;
                if (set.isEmpty()) {
                    Iterator it2 = DesugarCollections.unmodifiableCollection(anmVar.a.e(new bnc() { // from class: bnb
                        @Override // defpackage.bnc
                        public final boolean a(bnd bndVar) {
                            return bndVar.f && bndVar.e;
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        bjl bjlVar2 = ((bml) it2.next()).g;
                        List listE = bjlVar2.e();
                        if (!listE.isEmpty()) {
                            if (bjlVar2.b() != 0) {
                                bjjVar.l(bjlVar2.b());
                            }
                            if (bjlVar2.c() != 0) {
                                bjjVar.m(bjlVar2.c());
                            }
                            Iterator it3 = listE.iterator();
                            while (it3.hasNext()) {
                                bjjVar.g((bjz) it3.next());
                            }
                        }
                    }
                    if (set.isEmpty()) {
                        bbs.f("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    bbs.f("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            arrayList.add(bjjVar.b());
        }
    }

    final boolean I() {
        return this.t != 0;
    }

    @Override // defpackage.bin
    public final ListenableFuture J(final int i) {
        if (K()) {
            final int i2 = this.v;
            return bqk.g(bpw.a(bqk.d(this.y)), new bpr() { // from class: alq
                @Override // defpackage.bpr
                public final ListenableFuture a(Object obj) {
                    apj apjVar = this.a.h;
                    int i3 = i;
                    Executor executor = apjVar.a;
                    int i4 = i2;
                    return bqk.b(new anz(apjVar.a(i3, i4, 1), executor, i4));
                }
            }, this.b);
        }
        bbs.f("Camera2CameraControlImp", "Camera is not active.");
        return new bql(new ayw("Camera is not active."));
    }

    final int a(int i) {
        return b(this.c, i);
    }

    final int c(int i) {
        int[] iArr = (int[]) this.c.c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (L(i, iArr)) {
            return i;
        }
        if (L(4, iArr)) {
            return 4;
        }
        return L(1, iArr) ? 1 : 0;
    }

    final long d() {
        this.A = this.x.getAndIncrement();
        this.B.a.E();
        return this.A;
    }

    final Rect e() {
        return this.e.e.c();
    }

    @Override // defpackage.bin
    public final bjq f() {
        ale aleVarA;
        ayd aydVar = this.r;
        synchronized (aydVar.d) {
            aleVarA = aydVar.e.a();
        }
        return aleVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bml g() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amb.g():bml");
    }

    @Override // defpackage.ayx
    public final ListenableFuture h(final boolean z) {
        ListenableFuture listenableFutureA;
        if (!K()) {
            return new bql(new ayw("Camera is not active."));
        }
        final atg atgVar = this.f;
        if (atgVar.d) {
            atgVar.b(z ? 1 : 0);
            final int i = z ? 1 : 0;
            listenableFutureA = kol.a(new koi() { // from class: atc
                @Override // defpackage.koi
                public final Object a(final kog kogVar) {
                    final atg atgVar2 = atgVar;
                    final int i2 = i;
                    atgVar2.e.execute(new Runnable() { // from class: atd
                        @Override // java.lang.Runnable
                        public final void run() {
                            atgVar2.a(kogVar, i2);
                        }
                    });
                    return "enableTorch: " + z;
                }
            });
        } else {
            bbs.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            listenableFutureA = new bql(new IllegalStateException("No flash unit"));
        }
        return bqk.d(listenableFutureA);
    }

    @Override // defpackage.ayx
    public final ListenableFuture i(float f) {
        ListenableFuture bqlVar;
        final bdv bdvVarE;
        if (!K()) {
            return new bql(new ayw("Camera is not active."));
        }
        final atq atqVar = this.e;
        atr atrVar = atqVar.c;
        synchronized (atrVar) {
            try {
                if (f > 1.0f || f < 0.0f) {
                    throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
                }
                atrVar.d = f;
                atrVar.a = bgy.y(f, atrVar.c, atrVar.b);
                bdvVarE = brd.e(atrVar);
            } catch (IllegalArgumentException e) {
                bqlVar = new bql(e);
            }
        }
        atqVar.c(bdvVarE);
        bqlVar = kol.a(new koi() { // from class: atn
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final atq atqVar2 = atqVar;
                final bdv bdvVar = bdvVarE;
                atqVar2.b.execute(new Runnable() { // from class: atm
                    @Override // java.lang.Runnable
                    public final void run() {
                        atqVar2.b(kogVar, bdvVar);
                    }
                });
                return "setLinearZoom";
            }
        });
        return bqk.d(bqlVar);
    }

    @Override // defpackage.ayx
    public final ListenableFuture j(float f) {
        ListenableFuture bqlVar;
        final bdv bdvVarE;
        if (!K()) {
            return new bql(new ayw("Camera is not active."));
        }
        final atq atqVar = this.e;
        atr atrVar = atqVar.c;
        synchronized (atrVar) {
            try {
                atrVar.d(f);
                bdvVarE = brd.e(atrVar);
            } catch (IllegalArgumentException e) {
                bqlVar = new bql(e);
            }
        }
        atqVar.c(bdvVarE);
        bqlVar = kol.a(new koi() { // from class: atk
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final atq atqVar2 = atqVar;
                final bdv bdvVar = bdvVarE;
                atqVar2.b.execute(new Runnable() { // from class: atl
                    @Override // java.lang.Runnable
                    public final void run() {
                        atqVar2.b(kogVar, bdvVar);
                    }
                });
                return "setZoomRatio";
            }
        });
        return bqk.d(bqlVar);
    }

    @Override // defpackage.ayx
    public final ListenableFuture k(final azy azyVar) {
        if (!K()) {
            return new bql(new ayw("Camera is not active."));
        }
        final ark arkVar = this.d;
        return bqk.d(kol.a(new koi() { // from class: arc
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ark arkVar2 = arkVar;
                final azy azyVar2 = azyVar;
                arkVar2.c.execute(new Runnable() { // from class: arb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Rational rational;
                        final long jD;
                        final ark arkVar3 = arkVar2;
                        kog kogVar2 = kogVar;
                        if (!arkVar3.e) {
                            kogVar2.c(new ayw("Camera is not active."));
                            return;
                        }
                        amb ambVar = arkVar3.b;
                        Rect rectE = ambVar.e();
                        if (arkVar3.f != null) {
                            rational = arkVar3.f;
                        } else {
                            Rect rectE2 = ambVar.e();
                            rational = new Rational(rectE2.width(), rectE2.height());
                        }
                        azy azyVar3 = azyVar2;
                        auy auyVar = ambVar.c;
                        Integer num = (Integer) auyVar.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                        List listC = arkVar3.c(azyVar3.a, num == null ? 0 : num.intValue(), rational, rectE, 1);
                        List list = azyVar3.b;
                        Integer num2 = (Integer) auyVar.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                        List listC2 = arkVar3.c(list, num2 == null ? 0 : num2.intValue(), rational, rectE, 2);
                        List list2 = azyVar3.c;
                        Integer num3 = (Integer) auyVar.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                        List listC3 = arkVar3.c(list2, num3 == null ? 0 : num3.intValue(), rational, rectE, 4);
                        if (listC.isEmpty() && listC2.isEmpty() && listC3.isEmpty()) {
                            kogVar2.c(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                            return;
                        }
                        arkVar3.i("Cancelled by another startFocusAndMetering()");
                        arkVar3.l();
                        arkVar3.h();
                        arkVar3.s = kogVar2;
                        MeteringRectangle[] meteringRectangleArr = ark.a;
                        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listC.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listC2.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listC3.toArray(meteringRectangleArr);
                        ambVar.y(arkVar3.o);
                        arkVar3.h();
                        arkVar3.f();
                        arkVar3.p = meteringRectangleArr2;
                        arkVar3.q = meteringRectangleArr3;
                        arkVar3.r = meteringRectangleArr4;
                        if (arkVar3.k()) {
                            arkVar3.g = true;
                            arkVar3.l = false;
                            arkVar3.m = false;
                            jD = ambVar.d();
                            arkVar3.m(true);
                        } else {
                            arkVar3.g = false;
                            arkVar3.l = true;
                            arkVar3.m = false;
                            jD = ambVar.d();
                        }
                        arkVar3.h = 0;
                        final boolean z = ambVar.c(1) == 1;
                        arkVar3.o = new ama() { // from class: arf
                            @Override // defpackage.ama
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                ark arkVar4 = arkVar3;
                                if (arkVar4.k()) {
                                    if (!z || num4 == null) {
                                        arkVar4.m = true;
                                        arkVar4.l = true;
                                    } else if (arkVar4.h.intValue() == 3) {
                                        if (num4.intValue() == 4) {
                                            arkVar4.m = true;
                                            arkVar4.l = true;
                                        } else if (num4.intValue() == 5) {
                                            arkVar4.m = false;
                                            arkVar4.l = true;
                                        }
                                    }
                                }
                                if (arkVar4.l && amb.H(totalCaptureResult, jD)) {
                                    arkVar4.g(arkVar4.m);
                                    return true;
                                }
                                if (arkVar4.h.equals(num4) || num4 == null) {
                                    return false;
                                }
                                arkVar4.h = num4;
                                return false;
                            }
                        };
                        ambVar.n(arkVar3.o);
                        final long j = arkVar3.k + 1;
                        arkVar3.k = j;
                        Runnable runnable = new Runnable() { // from class: arg
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ark arkVar4 = arkVar3;
                                final long j2 = j;
                                arkVar4.c.execute(new Runnable() { // from class: ara
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        long j3 = j2;
                                        ark arkVar5 = arkVar4;
                                        if (j3 == arkVar5.k) {
                                            arkVar5.m = false;
                                            arkVar5.g(false);
                                        }
                                    }
                                });
                            }
                        };
                        ScheduledExecutorService scheduledExecutorService = arkVar3.d;
                        arkVar3.j = scheduledExecutorService.schedule(runnable, 5000L, TimeUnit.MILLISECONDS);
                        long j2 = azyVar3.d;
                        if (j2 > 0) {
                            arkVar3.i = scheduledExecutorService.schedule(new Runnable() { // from class: arh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final ark arkVar4 = arkVar3;
                                    final long j3 = j;
                                    arkVar4.c.execute(new Runnable() { // from class: aqw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            long j4 = j3;
                                            ark arkVar5 = arkVar4;
                                            if (j4 == arkVar5.k) {
                                                arkVar5.e();
                                            }
                                        }
                                    });
                                }
                            }, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                });
                return "startFocusAndMetering";
            }
        }));
    }

    @Override // defpackage.bin
    public final ListenableFuture l(final List list, final int i, final int i2) {
        if (K()) {
            final int i3 = this.v;
            return bqk.g(bpw.a(bqk.d(this.y)), new bpr() { // from class: aln
                @Override // defpackage.bpr
                public final ListenableFuture a(Object obj) {
                    apj apjVar = this.a.h;
                    int i4 = i;
                    final int i5 = i3;
                    final aoj aojVarA = apjVar.a(i4, i5, i2);
                    bpw bpwVarA = bpw.a(aojVarA.a(i5));
                    final List list2 = list;
                    bpr bprVar = new bpr() { // from class: aob
                        /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
                        @Override // defpackage.bpr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r13) {
                            /*
                                Method dump skipped, instructions count: 263
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.aob.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                        }
                    };
                    Executor executor = aojVarA.c;
                    ListenableFuture listenableFutureG = bqk.g(bpwVarA, bprVar, executor);
                    listenableFutureG.b(new Runnable() { // from class: aoc
                        @Override // java.lang.Runnable
                        public final void run() {
                            aojVarA.c();
                        }
                    }, executor);
                    return bqk.d(listenableFutureG);
                }
            }, this.b);
        }
        bbs.f("Camera2CameraControlImp", "Camera is not active.");
        return new bql(new ayw("Camera is not active."));
    }

    public final ListenableFuture m() {
        return bqk.d(kol.a(new koi() { // from class: alt
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final amb ambVar = this.a;
                ambVar.b.execute(new Runnable() { // from class: alm
                    @Override // java.lang.Runnable
                    public final void run() {
                        final amb ambVar2 = ambVar;
                        final long jD = ambVar2.d();
                        bqk.j(kol.a(new koi() { // from class: alr
                            @Override // defpackage.koi
                            public final Object a(final kog kogVar2) {
                                final long j = jD;
                                ambVar2.n(new ama() { // from class: alk
                                    @Override // defpackage.ama
                                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                                        if (!amb.H(totalCaptureResult, j)) {
                                            return false;
                                        }
                                        kogVar2.b(null);
                                        return true;
                                    }
                                });
                                return "waitForSessionUpdateId:" + j;
                            }
                        }), kogVar);
                    }
                });
                return "updateSessionConfigAsync";
            }
        }));
    }

    final void n(ama amaVar) {
        this.a.a.add(amaVar);
    }

    @Override // defpackage.bin
    public final void o(bjq bjqVar) {
        ayh ayhVarB = ayg.a(bjqVar).b();
        final ayd aydVar = this.r;
        synchronized (aydVar.d) {
            aydVar.e.b(ayhVarB);
        }
        bqk.d(kol.a(new koi() { // from class: axy
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ayd aydVar2 = aydVar;
                aydVar2.c.execute(new Runnable() { // from class: ayc
                    @Override // java.lang.Runnable
                    public final void run() {
                        aydVar2.b(kogVar);
                    }
                });
                return "addCaptureRequestOptions";
            }
        })).b(new Runnable() { // from class: alp
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, bpc.a());
    }

    final void p(final Executor executor, final bhr bhrVar) {
        this.b.execute(new Runnable() { // from class: alo
            @Override // java.lang.Runnable
            public final void run() {
                alx alxVar = this.a.l;
                Set set = alxVar.a;
                bhr bhrVar2 = bhrVar;
                set.add(bhrVar2);
                alxVar.b.put(bhrVar2, executor);
            }
        });
    }

    @Override // defpackage.bin
    public final void q(bmd bmdVar) {
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        final atz atzVar = (atz) this.g;
        atzVar.b();
        if (atzVar.d) {
            bmdVar.t(1);
            return;
        }
        if (atzVar.g) {
            bmdVar.t(1);
            return;
        }
        auy auyVar = atzVar.a;
        Map mapD = atz.d(auyVar);
        if (atzVar.f && !mapD.isEmpty() && mapD.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) auyVar.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i : validOutputFormatsForInput) {
                if (i == 256) {
                    Size size = (Size) mapD.get(34);
                    bbw bbwVar = new bbw(size.getWidth(), size.getHeight(), 34, 9);
                    final bco bcoVar = new bco(bbwVar);
                    Surface surfaceE = bcoVar.e();
                    surfaceE.getClass();
                    bkx bkxVar = new bkx(surfaceE, new Size(bcoVar.d(), bcoVar.a()), 34);
                    Executor executor = atzVar.b;
                    final aty atyVar = new aty(executor);
                    atzVar.h = bcoVar;
                    atzVar.i = bkxVar;
                    atzVar.j = atyVar;
                    bcoVar.j(new bkv() { // from class: att
                        @Override // defpackage.bkv
                        public final void a(bkw bkwVar) {
                            atz atzVar2 = atzVar;
                            try {
                                bbm bbmVarF = bkwVar.f();
                                if (bbmVarF != null) {
                                    atzVar2.c.d(bbmVarF);
                                }
                            } catch (IllegalStateException e) {
                                bbs.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = ".concat(String.valueOf(e.getMessage())));
                            }
                        }
                    }, bpm.a());
                    bkxVar.c().b(new Runnable() { // from class: atu
                        @Override // java.lang.Runnable
                        public final void run() {
                            bcoVar.k();
                            aty atyVar2 = atyVar;
                            atyVar2.a();
                            ImageWriter imageWriter = atyVar2.a;
                            if (imageWriter != null) {
                                imageWriter.close();
                            }
                        }
                    }, executor);
                    bmdVar.m(bkxVar);
                    bmdVar.f(bbwVar.b);
                    bmdVar.l(new atw(atyVar));
                    bmdVar.g = new InputConfiguration(bcoVar.d(), bcoVar.a(), bcoVar.b());
                    return;
                }
            }
        }
        bmdVar.t(1);
    }

    @Override // defpackage.bin
    public final void r() {
        final ayd aydVar = this.r;
        synchronized (aydVar.d) {
            aydVar.e = new ald();
        }
        bqk.d(kol.a(new koi() { // from class: ayb
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ayd aydVar2 = aydVar;
                aydVar2.c.execute(new Runnable() { // from class: axx
                    @Override // java.lang.Runnable
                    public final void run() {
                        aydVar2.b(kogVar);
                    }
                });
                return "clearCaptureRequestOptions";
            }
        })).b(new Runnable() { // from class: all
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, bpc.a());
    }

    @Override // defpackage.bin
    public final void s() {
        ((atz) this.g).b();
    }

    final void t() {
        synchronized (this.n) {
            int i = this.s;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.s = i - 1;
        }
    }

    @Override // defpackage.bin
    public final void u() {
        final atj atjVar = this.i;
        atjVar.a.execute(new Runnable() { // from class: ath
            @Override // java.lang.Runnable
            public final void run() {
                int iDecrementAndGet = atjVar.b.decrementAndGet();
                if (iDecrementAndGet < 0) {
                    bbs.f("VideoUsageControl", a.e(iDecrementAndGet, "decrementUsage: mVideoUsage = ", ", which is less than 0!"));
                } else {
                    bbs.a("VideoUsageControl", a.g(iDecrementAndGet, "decrementUsage: mVideoUsage = "));
                }
            }
        });
    }

    final void v(int i) {
        this.t = i;
        if (i == 0) {
            bjj bjjVar = new bjj();
            bjjVar.b = this.z;
            bjjVar.n();
            ald aldVar = new ald();
            aldVar.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(a(1)));
            aldVar.d(CaptureRequest.FLASH_MODE, 0);
            bjjVar.f(aldVar.a());
            G(Collections.singletonList(bjjVar.b()));
        }
        d();
    }

    final void w() {
        synchronized (this.n) {
            this.s++;
        }
    }

    @Override // defpackage.bin
    public final void x() {
        final atj atjVar = this.i;
        atjVar.a.execute(new Runnable() { // from class: ati
            @Override // java.lang.Runnable
            public final void run() {
                bbs.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + atjVar.b.incrementAndGet());
            }
        });
    }

    final void y(ama amaVar) {
        this.a.a.remove(amaVar);
    }

    final void z(final boolean z) {
        bdv bdvVarE;
        bbs.a("Camera2CameraControlImp", a.r(z, "setActive: isActive = "));
        ark arkVar = this.d;
        if (z != arkVar.e) {
            arkVar.e = z;
            if (!arkVar.e) {
                arkVar.e();
            }
        }
        atq atqVar = this.e;
        if (atqVar.f != z) {
            atqVar.f = z;
            if (!z) {
                atr atrVar = atqVar.c;
                synchronized (atrVar) {
                    atrVar.d(1.0f);
                    bdvVarE = brd.e(atrVar);
                }
                atqVar.c(bdvVarE);
                atqVar.e.f();
                atqVar.a.d();
            }
        }
        ars arsVar = this.p;
        if (arsVar.c != z) {
            arsVar.c = z;
        }
        atg atgVar = this.f;
        if (atgVar.f != z) {
            atgVar.f = z;
            if (!z) {
                if (atgVar.i) {
                    atgVar.i = false;
                    atgVar.a.v(0);
                    atgVar.b(0);
                    atg.c(atgVar.c, Integer.valueOf(atgVar.g));
                }
                kog kogVar = atgVar.h;
                if (kogVar != null) {
                    kogVar.c(new ayw("Camera is not active."));
                    atgVar.h = null;
                }
            }
        }
        aqu aquVar = this.q;
        if (z != aquVar.b) {
            aquVar.b = z;
            if (!z) {
                synchronized (aquVar.a.a) {
                }
            }
        }
        final ayd aydVar = this.r;
        aydVar.c.execute(new Runnable() { // from class: aya
            @Override // java.lang.Runnable
            public final void run() {
                ayd aydVar2 = aydVar;
                boolean z2 = aydVar2.a;
                boolean z3 = z;
                if (z2 == z3) {
                    return;
                }
                aydVar2.a = z3;
                if (!z3) {
                    aydVar2.a(new ayw("The camera control has became inactive."));
                } else if (aydVar2.b) {
                    aydVar2.c();
                }
            }
        });
        if (z) {
            return;
        }
        this.j = null;
        this.i.b.set(0);
        bbs.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
