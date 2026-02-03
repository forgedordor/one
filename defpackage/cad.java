package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cad extends bdr {
    public static final /* synthetic */ int h = 0;
    bjz a;
    bzj b;
    bmd c;
    ListenableFuture d;
    public bdp e;
    public boolean f;
    int g;
    private btv i;
    private bug t;
    private Rect u;
    private int v;
    private cac w;
    private bme x;
    private final bll y;

    static {
        cay cayVar = cab.a;
    }

    public cad(cay cayVar) {
        super(cayVar);
        this.b = bzj.a;
        this.c = new bmd();
        this.d = null;
        this.g = 3;
        this.f = false;
        Map map = Collections.EMPTY_MAP;
        this.y = new bzv(this);
    }

    private final bxh Y() {
        return (bxh) ab(a().a(), null);
    }

    private final bzl Z(azd azdVar, int i) {
        return a().f(azdVar, i);
    }

    private static cgt aa(cgs cgsVar, cbg cbgVar, bxh bxhVar, azv azvVar) {
        cgt cgtVarA = cgsVar.a(((cdf) cdk.c(bxhVar, azvVar, cbgVar)).a);
        if (cgtVarA != null) {
            return che.j(cgtVarA, cbgVar != null ? cbgVar.f().k() : null);
        }
        bbs.f("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private static Object ab(blm blmVar, Object obj) {
        ListenableFuture listenableFutureB = blmVar.b();
        if (!listenableFutureB.isDone()) {
            return obj;
        }
        try {
            return listenableFutureB.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void ac(Set set, int i, int i2, Size size, cgt cgtVar) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i, ((Integer) cgtVar.e(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            bbs.g("VideoCapture", a.g(i, "No supportedHeights for width: "), e);
        }
        try {
            set.add(new Size(((Integer) cgtVar.g(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            bbs.g("VideoCapture", a.g(i2, "No supportedWidths for height: "), e2);
        }
    }

    private final boolean ad(biu biuVar, cay cayVar, Rect rect, Size size, azv azvVar) {
        if (this.p != null) {
            return true;
        }
        if (biuVar.H()) {
            Boolean bool = (Boolean) blz.c(cayVar, cay.c, false);
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        if (biuVar.H() && (bru.a(ccu.a) || bru.a(biuVar.f().h()))) {
            return true;
        }
        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) ccu.a(HdrRepeatingRequestFailureQuirk.class);
        if (biuVar.H() && hdrRepeatingRequestFailureQuirk != null) {
            azv azvVar2 = azv.b;
            if (HdrRepeatingRequestFailureQuirk.a() && azvVar != azvVar2) {
                return true;
            }
        }
        return size.getWidth() != rect.width() || size.getHeight() != rect.height() || af(biuVar) || ae();
    }

    private final boolean ae() {
        return this.b.b() != null;
    }

    private final boolean af(biu biuVar) {
        return biuVar.H() && U(biuVar);
    }

    private static int s(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    private static int t(int i, int i2, Range range) {
        return s(true, i, i2, range);
    }

    private static int u(int i, int i2, Range range) {
        return s(false, i, i2, range);
    }

    private final int v(biu biuVar) {
        boolean zU = U(biuVar);
        int iB = B(biuVar, zU);
        if (!ae()) {
            return iB;
        }
        bdn bdnVarB = this.b.b();
        bdnVarB.getClass();
        ayu ayuVar = (ayu) bdnVarB;
        boolean z = ayuVar.f;
        int i = ayuVar.b;
        if (zU != z) {
            i = -i;
        }
        return boy.b(iB - i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v8 */
    private final bmd w(final cay cayVar, bms bmsVar) {
        boolean z;
        boolean z2;
        Rect rectF;
        Size size;
        bug bugVar;
        final boolean z3;
        final cad cadVar = this;
        box.b();
        final biu biuVarF = cadVar.F();
        lcg.i(biuVarF);
        Size sizeD = bmsVar.d();
        Runnable runnable = new Runnable() { // from class: bzn
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L();
            }
        };
        Range rangeB = bmsVar.b();
        if (Objects.equals(rangeB, bms.h)) {
            rangeB = cab.b;
        }
        Range range = rangeB;
        bxh bxhVarY = cadVar.Y();
        bxhVarY.getClass();
        bzl bzlVarZ = cadVar.Z(biuVarF.c(), bmsVar.a());
        azv azvVarE = bmsVar.e();
        cgt cgtVarAa = aa(cayVar.H(), bzlVarZ.b(sizeD, azvVarE), bxhVarY, azvVarE);
        cadVar.v = cadVar.v(biuVarF);
        final Rect rect = cadVar.n;
        if (rect == null) {
            rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
        }
        if (cgtVarAa == null || cgtVarAa.i(rect.width(), rect.height())) {
            z = false;
            z2 = true;
        } else {
            z2 = true;
            bbs.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", boy.l(rect), Integer.valueOf(cgtVarAa.b()), Integer.valueOf(cgtVarAa.a()), cgtVarAa.f(), cgtVarAa.d()));
            cgt cgnVar = (!(cgtVarAa.f().contains((Range) Integer.valueOf(rect.width())) && cgtVarAa.d().contains((Range) Integer.valueOf(rect.height()))) && cgtVarAa.d().contains((Range) Integer.valueOf(rect.width())) && cgtVarAa.f().contains((Range) Integer.valueOf(rect.height()))) ? new cgn(cgtVarAa) : cgtVarAa;
            int iB = cgnVar.b();
            int iA = cgnVar.a();
            Range rangeF = cgnVar.f();
            Range rangeD = cgnVar.d();
            int iT = t(rect.width(), iB, rangeF);
            int iU = u(rect.width(), iB, rangeF);
            int iT2 = t(rect.height(), iA, rangeD);
            int iU2 = u(rect.height(), iA, rangeD);
            HashSet hashSet = new HashSet();
            ac(hashSet, iT, iT2, sizeD, cgnVar);
            ac(hashSet, iT, iU2, sizeD, cgnVar);
            ac(hashSet, iU, iT2, sizeD, cgnVar);
            ac(hashSet, iU, iU2, sizeD, cgnVar);
            if (hashSet.isEmpty()) {
                bbs.f("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                arrayList.toString();
                bbs.a("VideoCapture", "candidatesList = ".concat(arrayList.toString()));
                Collections.sort(arrayList, new Comparator() { // from class: bzs
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size2 = (Size) obj;
                        Size size3 = (Size) obj2;
                        int i = cad.h;
                        int width = size2.getWidth();
                        Rect rect2 = rect;
                        return (Math.abs(width - rect2.width()) + Math.abs(size2.getHeight() - rect2.height())) - (Math.abs(size3.getWidth() - rect2.width()) + Math.abs(size3.getHeight() - rect2.height()));
                    }
                });
                arrayList.toString();
                bbs.a("VideoCapture", "sorted candidatesList = ".concat(arrayList.toString()));
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    bbs.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    lcg.c(width % 2 == 0 && height % 2 == 0 && width <= sizeD.getWidth() && height <= sizeD.getHeight());
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        rect2.left = Math.max(0, rect.centerX() - (width / 2));
                        rect2.right = rect2.left + width;
                        if (rect2.right > sizeD.getWidth()) {
                            rect2.right = sizeD.getWidth();
                            rect2.left = rect2.right - width;
                        }
                    }
                    if (height != rect.height()) {
                        rect2.top = Math.max(0, rect.centerY() - (height / 2));
                        rect2.bottom = rect2.top + height;
                        if (rect2.bottom > sizeD.getHeight()) {
                            rect2.bottom = sizeD.getHeight();
                            rect2.top = rect2.bottom - height;
                        }
                    }
                    z = false;
                    bbs.a("VideoCapture", String.format("Adjust cropRect from %s to %s", boy.l(rect), boy.l(rect2)));
                    rect = rect2;
                }
            }
            z = false;
        }
        int i = cadVar.v;
        if (cadVar.ae()) {
            bdn bdnVarB = cadVar.b.b();
            lcg.i(bdnVarB);
            rectF = boy.f(boy.h(((ayu) bdnVarB).a, i));
        } else {
            rectF = rect;
        }
        cadVar.u = rectF;
        if (!cadVar.ae() || rectF.equals(rect)) {
            size = sizeD;
        } else {
            float fHeight = rectF.height() / rect.height();
            size = new Size((int) Math.ceil(sizeD.getWidth() * fHeight), (int) Math.ceil(sizeD.getHeight() * fHeight));
        }
        boolean z4 = z2;
        if (cadVar.ae()) {
            cadVar.f = z4;
        }
        Rect rect3 = cadVar.u;
        int i2 = cadVar.v;
        boolean zAd = cadVar.ad(biuVarF, cayVar, rect3, sizeD, azvVarE);
        ?? r12 = i2;
        if (((SizeCannotEncodeVideoQuirk) ccu.a(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (z4 != zAd) {
                r12 = z;
            }
            Size sizeK = boy.k(boy.i(rect3), r12);
            if ((SizeCannotEncodeVideoQuirk.a() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeK)) {
                int iA2 = cgtVarAa != null ? cgtVarAa.a() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == sizeK.getHeight()) {
                    rect4.left += iA2;
                    rect4.right -= iA2;
                } else {
                    rect4.top += iA2;
                    rect4.bottom -= iA2;
                }
                rect3 = rect4;
            }
        }
        cadVar.u = rect3;
        if (cadVar.ad(biuVarF, cayVar, rect3, sizeD, azvVarE)) {
            bbs.a("VideoCapture", "Surface processing is enabled.");
            biu biuVarF2 = cadVar.F();
            biuVarF2.getClass();
            ayy ayyVar = cadVar.p;
            bugVar = new bug(biuVarF2, ayyVar != null ? new buj(ayyVar) : bsy.a(azvVarE));
        } else {
            bugVar = null;
        }
        cadVar.t = bugVar;
        boolean z5 = (biuVarF.H() && cadVar.t == null) ? z : z4;
        final int iX = (cadVar.t == null && biuVarF.H()) ? z4 : biuVarF.f().x();
        bbs.a("VideoCapture", "camera timebase = " + ((Object) bmy.a(biuVarF.f().x())) + ", processing timebase = " + ((Object) bmy.a(iX)));
        bmr bmrVarG = bmsVar.g();
        bmrVarG.d(size);
        bmrVarG.b(range);
        bms bmsVarA = bmrVarG.a();
        lcg.c(cadVar.i == null ? z4 : z);
        btv btvVar = new btv(2, 34, bmsVarA, cadVar.o, biuVarF.H(), cadVar.u, cadVar.v, cadVar.x(), cadVar.af(biuVarF));
        cadVar.i = btvVar;
        btvVar.e(runnable);
        if (cadVar.t != null) {
            buy buyVarI = buy.i(cadVar.i);
            final btv btvVar2 = (btv) cadVar.t.a(new bsh(cadVar.i, Collections.singletonList(buyVarI))).get(buyVarI);
            btvVar2.getClass();
            z3 = z5;
            cadVar = this;
            btvVar2.e(new Runnable() { // from class: bzo
                @Override // java.lang.Runnable
                public final void run() {
                    biu biuVar = biuVarF;
                    cad cadVar2 = this.a;
                    if (biuVar == cadVar2.F()) {
                        boolean z6 = z3;
                        int i3 = iX;
                        cay cayVar2 = cayVar;
                        cadVar2.e = btvVar2.a(biuVar);
                        cayVar2.D().D(cadVar2.e, i3, z6);
                        cadVar2.m();
                    }
                }
            });
            cadVar.e = btvVar2.a(biuVarF);
            final bjz bjzVarC = cadVar.i.c();
            cadVar.a = bjzVarC;
            bjzVarC.c().b(new Runnable() { // from class: bzp
                @Override // java.lang.Runnable
                public final void run() {
                    bjz bjzVar = bjzVarC;
                    cad cadVar2 = this.a;
                    if (bjzVar == cadVar2.a) {
                        cadVar2.c();
                    }
                }
            }, bpn.a());
        } else {
            z3 = z5;
            bdp bdpVarA = cadVar.i.a(biuVarF);
            cadVar.e = bdpVarA;
            cadVar.a = bdpVarA.j;
        }
        cayVar.D().D(cadVar.e, iX, z3);
        cadVar.m();
        cadVar.a.n = MediaCodec.class;
        bmd bmdVarA = bmd.a(cayVar, bmsVar.d());
        bmdVarA.h = bmsVar.a();
        cadVar.J(bmdVarA, bmsVar);
        bmdVarA.u(bnf.b(cayVar));
        bme bmeVar = cadVar.x;
        if (bmeVar != null) {
            bmeVar.b();
        }
        bme bmeVar2 = new bme(new bmf() { // from class: bzq
            @Override // defpackage.bmf
            public final void a(bml bmlVar) {
                this.a.h();
            }
        });
        cadVar.x = bmeVar2;
        bmdVarA.f = bmeVar2;
        if (bmsVar.f() != null) {
            bmdVarA.h(bmsVar.f());
        }
        return bmdVarA;
    }

    @Override // defpackage.bdr
    public final void N() {
        bbs.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = ".concat(H()));
        bms bmsVar = this.m;
        if (bmsVar == null || this.e != null) {
            return;
        }
        this.b = (bzj) ab(a().b(), bzj.a);
        bmd bmdVarW = w((cay) this.l, bmsVar);
        this.c = bmdVarW;
        b(bmdVarW, this.b, bmsVar);
        R(bzm.a(this.c.b()));
        K();
        a().b().c(bpn.a(), this.y);
        cac cacVar = this.w;
        if (cacVar != null) {
            cacVar.c();
        }
        this.w = new cac(E());
        a().c().c(bpn.a(), this.w);
        r(2);
    }

    public final cap a() {
        return ((cay) this.l).D();
    }

    @Override // defpackage.bdr
    public final Set ag() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    final void b(final bmd bmdVar, bzj bzjVar, bms bmsVar) {
        bjz bjzVar;
        int iA = bzjVar.a();
        boolean z = bzjVar.c() == 1;
        boolean z2 = iA == -1;
        if (z2 && z) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bmdVar.a.clear();
        bmdVar.b.i();
        azv azvVarE = bmsVar.e();
        if (!z2 && (bjzVar = this.a) != null) {
            if (z) {
                bmdVar.n(bjzVar, azvVarE, -1);
            } else {
                bmdVar.j(bjzVar, azvVarE);
            }
        }
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            bbs.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        ListenableFuture listenableFutureA = kol.a(new koi() { // from class: bzt
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                Integer numValueOf = Integer.valueOf(kogVar.hashCode());
                final bmd bmdVar2 = bmdVar;
                bmdVar2.o("androidx.camera.video.VideoCapture.streamUpdate", numValueOf);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final bzx bzxVar = new bzx(atomicBoolean, kogVar, bmdVar2);
                kogVar.a(new Runnable() { // from class: bzr
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = cad.h;
                        lcg.d(box.d(), "Surface update cancellation should only occur on main thread.");
                        atomicBoolean.set(true);
                        bmdVar2.p(bzxVar);
                    }
                }, bpc.a());
                bmdVar2.k(bzxVar);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(kogVar.hashCode()));
            }
        });
        this.d = listenableFutureA;
        bqk.i(listenableFutureA, new bzy(this, listenableFutureA, z), bpn.a());
    }

    public final void c() {
        box.b();
        bme bmeVar = this.x;
        if (bmeVar != null) {
            bmeVar.b();
            this.x = null;
        }
        bjz bjzVar = this.a;
        if (bjzVar != null) {
            bjzVar.d();
            this.a = null;
        }
        bug bugVar = this.t;
        if (bugVar != null) {
            bugVar.c();
            this.t = null;
        }
        btv btvVar = this.i;
        if (btvVar != null) {
            btvVar.g();
            this.i = null;
        }
        this.u = null;
        this.e = null;
        this.b = bzj.a;
        this.v = 0;
        this.f = false;
    }

    @Override // defpackage.bdr
    public final bms d(bjq bjqVar) {
        this.c.h(bjqVar);
        R(bzm.a(this.c.b()));
        bms bmsVar = this.m;
        bmsVar.getClass();
        bmr bmrVarG = bmsVar.g();
        ((bhn) bmrVarG).b = bjqVar;
        return bmrVarG.a();
    }

    @Override // defpackage.bdr
    public final bnh e(bjq bjqVar) {
        return bzz.a(bjqVar);
    }

    @Override // defpackage.bdr
    public final bni f(boolean z, bnm bnmVar) {
        cay cayVar = cab.a;
        bjq bjqVarA = bnmVar.a(bnf.g(cayVar), 1);
        if (z) {
            bjqVarA = bjn.a(bjqVarA, cayVar);
        }
        if (bjqVarA == null) {
            return null;
        }
        return bzz.a(bjqVarA).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    @Override // defpackage.bdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.bni g(defpackage.bir r25, defpackage.bnh r26) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cad.g(bir, bnh):bni");
    }

    final void h() {
        if (F() == null) {
            return;
        }
        c();
        cay cayVar = (cay) this.l;
        bms bmsVar = this.m;
        lcg.i(bmsVar);
        bmd bmdVarW = w(cayVar, bmsVar);
        this.c = bmdVarW;
        b(bmdVarW, this.b, this.m);
        R(bzm.a(this.c.b()));
        L();
    }

    @Override // defpackage.bdr
    public final void l(Rect rect) {
        this.n = rect;
        m();
    }

    public final void m() {
        biu biuVarF = F();
        btv btvVar = this.i;
        if (biuVarF == null || btvVar == null) {
            return;
        }
        int iV = v(biuVarF);
        this.v = iV;
        btvVar.k(iV, x());
    }

    @Override // defpackage.bdr
    protected final void p(bms bmsVar, bms bmsVar2) {
        bbs.a("VideoCapture", a.i(null, bmsVar, "onSuggestedStreamSpecUpdated: primaryStreamSpec = ", ", secondaryStreamSpec "));
        List listG = bks.g((cay) this.l);
        if (listG == null || listG.contains(bmsVar.d())) {
            return;
        }
        bbs.f("VideoCapture", "suggested resolution " + bmsVar.d() + " is not in custom ordered resolutions " + listG);
    }

    @Override // defpackage.bdr
    public final void q() {
        bbs.a("VideoCapture", "VideoCapture#onStateDetached");
        lcg.d(box.d(), "VideoCapture can only be detached on the main thread.");
        if (this.w != null) {
            a().c().d(this.w);
            this.w.c();
            this.w = null;
        }
        r(3);
        a().b().d(this.y);
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            bbs.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        c();
    }

    final void r(int i) {
        if (i != this.g) {
            this.g = i;
            a().C(i);
        }
    }

    public final String toString() {
        return "VideoCapture:".concat(I());
    }
}
