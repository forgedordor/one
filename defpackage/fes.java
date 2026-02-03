package defpackage;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fes extends ffy {
    public fgf a;
    private fdlr c;
    private fdue d;

    private final void m(fdap fdapVar) {
        ffv ffvVar = this.b;
        if (ffvVar == null) {
            return;
        }
        this.c = ffvVar.C ? fdil.d(ffvVar.E(), null, fdjz.d, new ffu(ffvVar, new fer(fdapVar, this, ffvVar, null), null), 1) : null;
    }

    public final fdue a() {
        fdue fdueVar = this.d;
        if (fdueVar != null) {
            return fdueVar;
        }
        if (!fek.a) {
            return null;
        }
        fdue fdueVarE = fdun.e(1, 0, 3, 2);
        this.d = fdueVarE;
        return fdueVarE;
    }

    @Override // defpackage.ffy, defpackage.kep
    public final void b(ihu ihuVar) {
        Rect rect;
        fgf fgfVar = this.a;
        if (fgfVar != null) {
            fgfVar.k = new Rect(fdcu.b(ihuVar.b), fdcu.b(ihuVar.c), fdcu.b(ihuVar.d), fdcu.b(ihuVar.e));
            if (!fgfVar.i.isEmpty() || (rect = fgfVar.k) == null) {
                return;
            }
            fgfVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.ffy, defpackage.kep
    public final void c() {
        m(null);
    }

    @Override // defpackage.kep
    public final void d(final kew kewVar, final kdy kdyVar, final fdap fdapVar, final fdap fdapVar2) {
        m(new fdap() { // from class: fel
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fgf fgfVar = (fgf) obj;
                ffv ffvVar = this.b;
                fgfVar.g = kewVar;
                fgfVar.h = kdyVar;
                fgfVar.b = fdapVar;
                fgfVar.c = fdapVar2;
                fgfVar.d = ffvVar != null ? ffvVar.b : null;
                fgfVar.e = ffvVar != null ? ffvVar.c : null;
                fgfVar.f = ffvVar != null ? (jou) jbe.a(ffvVar, jmh.n) : null;
                return fctx.a;
            }
        });
    }

    @Override // defpackage.ffy
    public final void e() {
        fdue fdueVarA = a();
        if (fdueVarA != null) {
            fdueVarA.h(fctx.a);
        }
    }

    @Override // defpackage.kep
    public final void f() {
        fdlr fdlrVar = this.c;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.c = null;
        fdue fdueVarA = a();
        if (fdueVarA != null) {
            fdueVarA.e();
        }
    }

    @Override // defpackage.kep
    public final void g(kew kewVar, kew kewVar2) {
        fgf fgfVar = this.a;
        if (fgfVar != null) {
            boolean z = true;
            if (jyo.h(fgfVar.g.c, kewVar2.c) && fdbq.f(fgfVar.g.d, kewVar2.d)) {
                z = false;
            }
            fgfVar.g = kewVar2;
            List list = fgfVar.i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                fgh fghVar = (fgh) ((WeakReference) list.get(i)).get();
                if (fghVar != null) {
                    fghVar.a = kewVar2;
                }
            }
            ffx ffxVar = fgfVar.l;
            synchronized (ffxVar.a) {
                ffxVar.h = null;
                ffxVar.j = null;
                ffxVar.i = null;
                ffxVar.k = null;
                ffxVar.l = null;
            }
            if (fdbq.f(kewVar, kewVar2)) {
                if (z) {
                    fft fftVar = fgfVar.m;
                    long j = kewVar2.c;
                    int iD = jyo.d(j);
                    int iC = jyo.c(j);
                    jyo jyoVar = fgfVar.g.d;
                    int iD2 = jyoVar != null ? jyo.d(jyoVar.b) : -1;
                    jyo jyoVar2 = fgfVar.g.d;
                    fftVar.b(iD, iC, iD2, jyoVar2 != null ? jyo.c(jyoVar2.b) : -1);
                    return;
                }
                return;
            }
            if (kewVar != null && (!fdbq.f(kewVar.a(), kewVar2.a()) || (jyo.h(kewVar.c, kewVar2.c) && !fdbq.f(kewVar.d, kewVar2.d)))) {
                fft fftVar2 = fgfVar.m;
                fftVar2.a().restartInput(fftVar2.a);
                return;
            }
            List list2 = fgfVar.i;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                fgh fghVar2 = (fgh) ((WeakReference) list2.get(i2)).get();
                if (fghVar2 != null) {
                    kew kewVar3 = fgfVar.g;
                    fft fftVar3 = fgfVar.m;
                    if (fghVar2.d) {
                        fghVar2.a = kewVar3;
                        if (fghVar2.c) {
                            fftVar3.a().updateExtractedText(fftVar3.a, fghVar2.b, fgi.a(kewVar3));
                        }
                        jyo jyoVar3 = kewVar3.d;
                        int iD3 = jyoVar3 != null ? jyo.d(jyoVar3.b) : -1;
                        int iC2 = jyoVar3 != null ? jyo.c(jyoVar3.b) : -1;
                        long j2 = kewVar3.c;
                        fftVar3.b(jyo.d(j2), jyo.c(j2), iD3, iC2);
                    }
                }
            }
        }
    }

    @Override // defpackage.ffy, defpackage.kep
    public final void h(kew kewVar, kel kelVar, jyi jyiVar, fdap fdapVar, ihu ihuVar, ihu ihuVar2) {
        fgf fgfVar = this.a;
        if (fgfVar != null) {
            ffx ffxVar = fgfVar.l;
            synchronized (ffxVar.a) {
                ffxVar.h = kewVar;
                ffxVar.j = kelVar;
                ffxVar.i = jyiVar;
                ffxVar.k = ihuVar;
                ffxVar.l = ihuVar2;
                if (ffxVar.c || ffxVar.b) {
                    ffxVar.a();
                }
            }
        }
    }
}
