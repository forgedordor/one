package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivq extends lfs implements Runnable, View.OnAttachStateChangeListener, ldn {
    private boolean a;
    private int d;
    private lgt e;
    private final cvo f;
    private final cuu g;
    private final iac h;
    private final hri i;

    public ivq() {
        super(1);
        cuz cuzVar = new cuz(9);
        iud iudVar = ivr.a;
        cuzVar.e(ivr.a, new izt());
        cuzVar.e(ivr.b, new izt());
        cuzVar.e(ivr.c, new izt());
        cuzVar.e(ivr.d, new izt());
        cuzVar.e(ivr.e, new izt());
        cuzVar.e(ivr.f, new izt());
        cuzVar.e(ivr.g, new izt());
        cuzVar.e(ivr.h, new izt());
        cuzVar.e(ivr.i, new izt());
        this.f = cuzVar;
        this.i = new hph(0);
        this.g = new cuu(4);
        this.h = new iac();
    }

    private final void f(lgt lgtVar) {
        long j;
        long j2;
        char c;
        char c2;
        char c3;
        char c4;
        long j3;
        char c5;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        long j4;
        hri hriVar = this.i;
        hriVar.i(hriVar.c() + 1);
        ctj ctjVar = ivs.a;
        int[] iArr3 = ctjVar.b;
        Object[] objArr = ctjVar.c;
        long[] jArr3 = ctjVar.a;
        int length = jArr3.length - 2;
        long j5 = -9187201950435737472L;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j2 = 255;
            while (true) {
                long j6 = jArr3[i3];
                c = 7;
                c2 = 16;
                if ((((~j6) << 7) & j6 & j5) != j5) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j6 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr3[i6];
                            iyo iyoVar = (iyo) objArr[i6];
                            j4 = j5;
                            long j7 = r12.b << 48;
                            i = i2;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j8 = r12.c << 32;
                            long j9 = r12.d << 16;
                            int i8 = lgtVar.f(i7).e;
                            Object objF = this.f.f(iyoVar);
                            objF.getClass();
                            ((izt) objF).c = j9 | j7 | j8 | i8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i = i2;
                            j4 = j5;
                        }
                        j6 >>= i;
                        i5++;
                        i2 = i;
                        j5 = j4;
                        iArr3 = iArr2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    j = j5;
                    c3 = ' ';
                    c4 = '0';
                    if (i4 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    j = j5;
                    c3 = ' ';
                    c4 = '0';
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                j5 = j;
                iArr3 = iArr;
                jArr3 = jArr;
                i2 = 8;
            }
        } else {
            j = -9187201950435737472L;
            j2 = 255;
            c = 7;
            c2 = 16;
            c3 = ' ';
            c4 = '0';
        }
        cuh cuhVar = ivs.b;
        int[] iArr4 = cuhVar.b;
        Object[] objArr2 = cuhVar.c;
        long[] jArr4 = cuhVar.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j10 = jArr4[i9];
                if ((((~j10) << c) & j10 & j) != j) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j10 & j2) < 128) {
                            int i12 = (i9 << 3) + i11;
                            int i13 = iArr4[i12];
                            Object objF2 = this.f.f((iud) objArr2[i12]);
                            objF2.getClass();
                            izt iztVar = (izt) objF2;
                            c5 = '\b';
                            if (i13 != 8) {
                                lgtVar.g(i13);
                            }
                            iztVar.a.b(Boolean.valueOf(lgtVar.v(i13)));
                        } else {
                            c5 = '\b';
                        }
                        j10 >>= c5;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length2) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        lcz lczVarJ = lgtVar.j();
        if (lczVarJ == null) {
            j3 = 0;
        } else {
            kzc kzcVarE = lczVarJ.e();
            j3 = (kzcVarE.b << c4) | (kzcVarE.c << c3) | (kzcVarE.d << c2) | kzcVarE.e;
        }
        cvo cvoVar = this.f;
        iud iudVar = ivr.a;
        Object objF3 = cvoVar.f(ivr.i);
        objF3.getClass();
        ((izt) objF3).c = j3;
        long jB = lczVarJ != null ? (lczVarJ.b() << c4) | (lczVarJ.d() << c3) | (lczVarJ.c() << c2) | lczVarJ.a() : 0L;
        Object objF4 = cvoVar.f(ivr.b);
        objF4.getClass();
        ((izt) objF4).c = jB;
        if (lczVarJ == null) {
            cuu cuuVar = this.g;
            if (cuuVar.c > 0) {
                cuuVar.c();
                this.h.clear();
            }
        } else {
            List boundingRects = Build.VERSION.SDK_INT >= 28 ? lczVarJ.a.getBoundingRects() : Collections.EMPTY_LIST;
            cuu cuuVar2 = this.g;
            if (boundingRects.size() < cuuVar2.c) {
                cuuVar2.d(boundingRects.size(), cuuVar2.c);
                iac iacVar = this.h;
                iacVar.h(boundingRects.size(), iacVar.a());
            } else {
                int size = boundingRects.size() - cuuVar2.c;
                for (int i14 = 0; i14 < size; i14++) {
                    cuuVar2.h(new hpl(boundingRects.get(cuuVar2.c), hsi.a));
                    this.h.add(new iyp("display cutout rect " + cuuVar2.c));
                }
            }
            int size2 = boundingRects.size();
            for (int i15 = 0; i15 < size2; i15++) {
                ((hox) cuuVar2.l(i15)).b((Rect) boundingRects.get(i15));
            }
        }
        hzf.f();
    }

    private static final void g(izt iztVar, lgb lgbVar) {
        iztVar.f(lgbVar.a.m());
        iztVar.d(lgbVar.a.i());
        iztVar.a(lgbVar.a.h());
        iztVar.e(lgbVar.a());
        iztVar.c(lgbVar.c());
    }

    @Override // defpackage.lfs
    public final lfr b(lgb lgbVar, lfr lfrVar) {
        lgt lgtVar = this.e;
        this.a = false;
        this.e = null;
        if (lgbVar.c() > 0 && lgtVar != null) {
            int iB = lgbVar.b();
            this.d |= iB;
            iud iudVar = (iud) ivs.b.a(iB);
            if (iudVar != null) {
                Object objF = this.f.f(iudVar);
                objF.getClass();
                izt iztVar = (izt) objF;
                kzc kzcVarF = lgtVar.f(iB);
                int i = kzcVarF.b;
                int i2 = kzcVarF.c;
                long j = i2;
                if ((kzcVarF.e | (kzcVarF.d << 16) | (i << 48) | (j << 32)) != iztVar.c) {
                    iztVar.b(true);
                    g(iztVar, lgbVar);
                    hri hriVar = this.i;
                    hriVar.i(hriVar.c() + 1);
                    hzf.f();
                }
            }
        }
        return lfrVar;
    }

    @Override // defpackage.lfs
    public final lgt c(lgt lgtVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lgb lgbVar = (lgb) list.get(i);
            int iB = lgbVar.b();
            iud iudVar = (iud) ivs.b.a(iB);
            if (iudVar != null) {
                Object objF = this.f.f(iudVar);
                objF.getClass();
                izt iztVar = (izt) objF;
                if (((Boolean) iztVar.b.a()).booleanValue()) {
                    g(iztVar, lgbVar);
                    kzc kzcVarF = lgtVar.f(iB);
                    int i2 = kzcVarF.b;
                    long j = kzcVarF.c;
                    iztVar.c = kzcVarF.e | (kzcVarF.d << 16) | (i2 << 48) | (j << 32);
                }
            }
        }
        f(lgtVar);
        return lgtVar;
    }

    @Override // defpackage.lfs
    public final void d(lgb lgbVar) {
        this.a = false;
        int iB = lgbVar.b();
        this.d = (~iB) & this.d;
        this.e = null;
        iud iudVar = (iud) ivs.b.a(iB);
        if (iudVar != null) {
            Object objF = this.f.f(iudVar);
            objF.getClass();
            izt iztVar = (izt) objF;
            iztVar.f(null);
            iztVar.d(0.0f);
            iztVar.e(0.0f);
            iztVar.a(1.0f);
            iztVar.c(0L);
            iztVar.d(0.0f);
            iztVar.e(0.0f);
            iztVar.f(null);
            iztVar.b(false);
            hri hriVar = this.i;
            hriVar.i(hriVar.c() + 1);
            hzf.f();
        }
    }

    @Override // defpackage.lfs
    public final void e() {
        this.a = true;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        if (this.a) {
            this.e = lgtVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return lgtVar;
            }
        } else if (this.d == 0) {
            f(lgtVar);
        }
        return lgtVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = ley.a;
        len.k(view, this);
        lgb.d(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = ley.a;
        len.k(view, null);
        lgb.d(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.d = 0;
            this.a = false;
            lgt lgtVar = this.e;
            if (lgtVar != null) {
                f(lgtVar);
                this.e = null;
            }
        }
    }
}
