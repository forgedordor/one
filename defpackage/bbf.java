package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf extends bdr {
    public static final /* synthetic */ int i = 0;
    public final int a;
    public final AtomicReference b;
    public final int c;
    public int d;
    public Rational e;
    public brg f;
    bmd g;
    public bgk h;
    private bfl t;
    private bme u;
    private final baw v;

    static {
        bkp bkpVar = bay.a;
    }

    public bbf(bkp bkpVar) {
        super(bkpVar);
        this.b = new AtomicReference(null);
        this.d = -1;
        this.e = null;
        this.v = new baw(this);
        bkp bkpVar2 = (bkp) this.l;
        if (blz.g(bkpVar2, bkp.a)) {
            this.a = bkpVar2.D();
        } else {
            this.a = 1;
        }
        this.c = ((Integer) blz.c(bkpVar2, bkp.h, 0)).intValue();
        this.f = new brg((bbd) blz.c(bkpVar2, bkp.j, null));
    }

    private final void Y() {
        brg brgVar = this.f;
        brgVar.d();
        brgVar.c();
        bgk bgkVar = this.h;
        if (bgkVar != null) {
            bgkVar.a();
        }
    }

    private final void Z() {
        aa(this.f);
    }

    private final void aa(bbd bbdVar) {
        E().D(bbdVar);
    }

    private static boolean ab(List list, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    private final boolean ac() {
        return (F() == null || F().d().b() == null) ? false : true;
    }

    private static final boolean ad(Map map, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        return map.containsKey(numValueOf) && !((List) map.get(numValueOf)).isEmpty();
    }

    public static boolean u(bli bliVar) {
        return Objects.equals(bliVar.n(bkp.e, null), 2);
    }

    public static boolean v(bli bliVar) {
        return Objects.equals(bliVar.n(bkp.e, null), 3);
    }

    public static boolean w(bli bliVar) {
        return Objects.equals(bliVar.n(bkp.e, null), 1);
    }

    public final int a() {
        biu biuVarF = F();
        if (biuVarF != null) {
            return biuVarF.c().a();
        }
        return -1;
    }

    @Override // defpackage.bdr
    public final Set ag() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.bdr
    public final void ah() {
        lcg.j(F(), "Attached camera cannot be null");
        if (b() == 3 && a() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // defpackage.bdr
    public final void ai() {
        bbs.a("ImageCapture", "onCameraControlReady");
        t();
        Z();
    }

    public final int b() {
        int iIntValue;
        synchronized (this.b) {
            iIntValue = this.d;
            if (iIntValue == -1) {
                iIntValue = ((Integer) blz.c((bkp) this.l, bkp.b, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final int c() {
        Integer num = (Integer) this.l.n(bkp.e, 0);
        lcg.i(num);
        return num.intValue();
    }

    @Override // defpackage.bdr
    public final bms d(bjq bjqVar) {
        this.g.h(bjqVar);
        R(bas.a(this.g.b()));
        bmr bmrVarG = this.m.g();
        ((bhn) bmrVarG).b = bjqVar;
        return bmrVarG.a();
    }

    @Override // defpackage.bdr
    public final bnh e(bjq bjqVar) {
        return bax.a(bjqVar);
    }

    @Override // defpackage.bdr
    public final bni f(boolean z, bnm bnmVar) {
        bkp bkpVar = bay.a;
        bjq bjqVarA = bnmVar.a(bnf.g(bkpVar), this.a);
        if (z) {
            bjqVarA = bjn.a(bjqVarA, bkpVar);
        }
        if (bjqVarA == null) {
            return null;
        }
        return bax.a(bjqVarA).c();
    }

    @Override // defpackage.bdr
    protected final bni g(bir birVar, bnh bnhVar) {
        boolean z;
        if (birVar.h().d(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            bli bliVarF = bnhVar.f();
            bjo bjoVar = bkp.g;
            if (bool.equals(bliVarF.n(bjoVar, true))) {
                bbs.f("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                bbs.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bnhVar.f().c(bjoVar, true);
            }
        }
        bli bliVarF2 = bnhVar.f();
        Boolean bool2 = Boolean.TRUE;
        bjo bjoVar2 = bkp.g;
        int i2 = 0;
        if (bool2.equals(bliVarF2.n(bjoVar2, false))) {
            if (ac()) {
                bbs.f("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) bliVarF2.n(bkp.d, null);
            if (num != null && num.intValue() != 256) {
                bbs.f("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                bbs.f("ImageCapture", "Unable to support software JPEG. Disabling.");
                bliVarF2.c(bjoVar2, false);
            }
        } else {
            z = false;
        }
        Integer num2 = (Integer) bnhVar.f().n(bkp.d, null);
        if (num2 != null) {
            lcg.b(!ac() || num2.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bnhVar.f().c(bkr.D, Integer.valueOf(z ? 35 : num2.intValue()));
        } else if (u(bnhVar.f())) {
            bnhVar.f().c(bkr.D, 32);
        } else if (v(bnhVar.f())) {
            bnhVar.f().c(bkr.D, 32);
            bnhVar.f().c(bkr.E, 256);
        } else if (w(bnhVar.f())) {
            bnhVar.f().c(bkr.D, 4101);
            bnhVar.f().c(bkr.o, azv.a);
        } else if (z) {
            bnhVar.f().c(bkr.D, 35);
        } else {
            List list = (List) bnhVar.f().n(bkp.M, null);
            if (list == null || ab(list, 256)) {
                bnhVar.f().c(bkr.D, 256);
            } else if (ab(list, 35)) {
                bnhVar.f().c(bkr.D, 35);
            }
        }
        Set<bdy> set = this.k;
        if (set != null) {
            for (bdy bdyVar : set) {
                if (bdyVar instanceof beb) {
                    i2 = 1;
                }
            }
            bnhVar.f().c(bkr.D, Integer.valueOf(1 == i2 ? 4101 : 256));
            bnhVar.f().c(bkp.e, Integer.valueOf(i2));
        }
        return bnhVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /* JADX WARN: Type inference failed for: r0v20, types: [baa, bgk] */
    /* JADX WARN: Type inference failed for: r0v6, types: [azd, bir] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bmd h(java.lang.String r14, defpackage.bkp r15, defpackage.bms r16) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbf.h(java.lang.String, bkp, bms):bmd");
    }

    @Override // defpackage.bdr
    public final void j() {
        Y();
        m(false);
        aa(null);
    }

    public final void m(boolean z) {
        bgk bgkVar;
        Log.d("ImageCapture", "clearPipeline");
        box.b();
        bme bmeVar = this.u;
        if (bmeVar != null) {
            bmeVar.b();
            this.u = null;
        }
        bfl bflVar = this.t;
        if (bflVar != null) {
            bflVar.a();
            this.t = null;
        }
        if (!z && (bgkVar = this.h) != null) {
            bgkVar.a();
            this.h = null;
        }
        E().s();
    }

    @Override // defpackage.bdr
    protected final void p(bms bmsVar, bms bmsVar2) {
        bbs.a("ImageCapture", a.i(null, bmsVar, "onSuggestedStreamSpecUpdated: primaryStreamSpec = ", ", secondaryStreamSpec "));
        bmd bmdVarH = h(H(), (bkp) this.l, bmsVar);
        this.g = bmdVarH;
        R(bas.a(bmdVarH.b()));
        K();
    }

    @Override // defpackage.bdr
    public final void q() {
        Y();
    }

    public final void r(bbd bbdVar) {
        this.f = new brg(bbdVar);
        Z();
    }

    public final void s(final bbb bbbVar, final Executor executor, final bba bbaVar) {
        Rect rect;
        int iIntValue;
        int i2;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            bpn.a().execute(new Runnable() { // from class: bau
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.s(bbbVar, executor, bbaVar);
                }
            });
            return;
        }
        box.b();
        if (b() == 3 && this.f.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        biu biuVarF = F();
        Rect rect2 = null;
        if (biuVarF == null) {
            bbaVar.a(new bbg(a.h(this, "Not bound to a valid Camera [", "]"), null));
            return;
        }
        if (this.l.c() != 0) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        bgk bgkVar = this.h;
        bgkVar.getClass();
        Rect rect3 = this.n;
        Size sizeD = D();
        sizeD.getClass();
        if (rect3 == null) {
            int i3 = 0;
            if (bsc.c(this.e)) {
                biu biuVarF2 = F();
                biuVarF2.getClass();
                int iA = A(biuVarF2);
                Rational rational = new Rational(this.e.getDenominator(), this.e.getNumerator());
                if (!boy.n(iA)) {
                    rational = this.e;
                }
                if (bsc.c(rational)) {
                    int width = sizeD.getWidth();
                    int height = sizeD.getHeight();
                    float f = width;
                    float f2 = height;
                    float numerator = rational.getNumerator();
                    float denominator = rational.getDenominator();
                    if (rational.floatValue() > f / f2) {
                        int iRound = Math.round((f / numerator) * denominator);
                        i2 = (height - iRound) / 2;
                        height = iRound;
                    } else {
                        int iRound2 = Math.round((f2 / denominator) * numerator);
                        i3 = (width - iRound2) / 2;
                        width = iRound2;
                        i2 = 0;
                    }
                    rect2 = new Rect(i3, i2, width + i3, height + i2);
                } else {
                    bbs.f("ImageUtil", "Invalid view ratio.");
                }
                rect2.getClass();
                rect = rect2;
            } else {
                rect3 = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                rect = rect3;
            }
        } else {
            rect = rect3;
        }
        Matrix matrix = this.o;
        int iA2 = A(biuVarF);
        bkp bkpVar = (bkp) this.l;
        bjo bjoVar = bkp.i;
        if (blz.g(bkpVar, bjoVar)) {
            iIntValue = ((Integer) blz.b(bkpVar, bjoVar)).intValue();
        } else {
            int i4 = this.a;
            if (i4 == 0) {
                iIntValue = 100;
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException(a.e(i4, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i5 = iIntValue;
        int i6 = this.a;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.g.e);
        lcg.b(true, "onDiskCallback and outputFileOptions should be both null or both non-null.");
        lcg.b(true, "One and only one on-disk or in-memory callback should be present.");
        bem bemVar = new bem(executor, bbaVar, bbbVar, rect, matrix, iA2, i5, i6, listUnmodifiableList);
        box.b();
        bgp bgpVar = (bgp) bgkVar;
        bgpVar.a.offer(bemVar);
        bgpVar.b();
    }

    public final void t() {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            if (atomicReference.get() != null) {
                return;
            }
            E().A(b());
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(I());
    }
}
