package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.foundation.layout.OffsetPxElement;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejeg {
    public static final int a(int i, float f, float f2, float f3) {
        return (int) Math.max(0.0f, Math.min(f, (i - f2) - f3) - f2);
    }

    public static final long b(hox hoxVar) {
        return ((kjg) hoxVar.a()).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ejfj r18, defpackage.hml r19, final int r20) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejeg.c(ejfj, hml, int):void");
    }

    public static final void d(final ejfj ejfjVar, final fdvc fdvcVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1966170835);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(ejfjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdvcVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final hsf hsfVarA = hro.a(fdvcVar, hmlVarC);
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(ejfjVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: ejec
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        ejfj ejfjVar2 = ejfjVar;
                        ejft ejftVar = new ejft(context, ejfjVar2);
                        ejftVar.h = new ejdv(ejfjVar2);
                        return ejftVar;
                    }
                };
                hmwVar.af(objS);
            }
            fdap fdapVar = (fdap) objS;
            hmwVar.ab();
            ics icsVarL = egq.l(ics.e, ejfz.a(ejfjVar.n, hmlVarC));
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(hsfVarA);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: ejed
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        final ejft ejftVar = (ejft) obj;
                        ejftVar.getClass();
                        int iOrdinal = ((ejfe) hsfVarA.a()).ordinal();
                        if (iOrdinal != 0) {
                            ValueAnimator valueAnimator = null;
                            if (iOrdinal == 1) {
                                ((ekrd) ejftVar.b.h().h("com/google/chat/smartmessaging/penpal/ui/SegmentDisplayAndSelectionView", "highlightCroppedParts", 82, "SegmentDisplayAndSelectionView.kt")).q("highlightCroppedParts called");
                                ejftVar.e = ejfe.b;
                                if (!ejftVar.f) {
                                    ejfj ejfjVar2 = ejftVar.a;
                                    ejgh ejghVar = ejfjVar2.n;
                                    ejftVar.c = Bitmap.createBitmap(ejghVar.a, ejghVar.b, Bitmap.Config.ARGB_8888);
                                    Bitmap bitmap = ejftVar.c;
                                    bitmap.getClass();
                                    ejftVar.d = new Canvas(bitmap);
                                    float f = ejfjVar2.n.a;
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f + f);
                                    valueAnimatorOfFloat.setDuration(2500L);
                                    valueAnimatorOfFloat.setRepeatCount(-1);
                                    valueAnimatorOfFloat.setRepeatMode(1);
                                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ejfs
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            valueAnimator2.getClass();
                                            ejftVar.invalidate();
                                        }
                                    });
                                    ejftVar.g = valueAnimatorOfFloat;
                                    ValueAnimator valueAnimator2 = ejftVar.g;
                                    if (valueAnimator2 == null) {
                                        fdbq.c("shimmerAnimator");
                                    } else {
                                        valueAnimator = valueAnimator2;
                                    }
                                    valueAnimator.start();
                                    ejftVar.f = true;
                                }
                            } else {
                                if (iOrdinal != 2) {
                                    throw new fctg();
                                }
                                ejftVar.e = ejfe.c;
                                Bitmap bitmap2 = ejftVar.c;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                ejftVar.c = null;
                            }
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            kli.b(fdapVar, icsVarL, (fdap) objS2, hmlVarC, 0, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejee
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ejfj ejfjVar2 = ejfjVar;
                    int i4 = i;
                    ejeg.d(ejfjVar2, fdvcVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final hsf hsfVar, final long j, final ejgh ejghVar, final ejgh ejghVar2, final fdae fdaeVar, hml hmlVar, final int i) {
        hsf hsfVar2;
        int i2;
        hsfVar.getClass();
        ejghVar.getClass();
        fdaeVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1420767461);
        if (i3 == 0) {
            hsfVar2 = hsfVar;
            i2 = (true != hmlVarC.D(hsfVar2) ? 2 : 4) | i;
        } else {
            hsfVar2 = hsfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(ejghVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(ejghVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float fMax = Math.max(ejghVar.a / ejghVar2.a, ejghVar.b / ejghVar2.b);
            final fdcg fdcgVar = new fdcg();
            final fdcg fdcgVar2 = new fdcg();
            kjb kjbVar = (kjb) hsfVar2.a();
            hmlVarC.v(-442049001);
            if (kjbVar != null) {
                hpt hptVar = jmh.e;
                float fEn = ((kio) hmlVarC.e(hptVar)).en(24.0f);
                float fEn2 = ((kio) hmlVarC.e(hptVar)).en(16.0f);
                long j2 = kjbVar.a;
                fdcgVar.a = a((int) (j >> 32), kjb.a(j2) * fMax, fEn, fEn2);
                fdcgVar2.a = a((int) (j & 4294967295L), kjb.b(j2) * fMax, fEn, fEn2);
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(5004770);
            int i4 = 57344 & i2;
            Object objS = hmwVar.S();
            if (i4 == 16384 || objS == hmk.a) {
                objS = new fdae() { // from class: ejdy
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            fdae fdaeVar2 = (fdae) objS;
            hmwVar.ab();
            ics icsVarM = egq.m(dkl.a(new OffsetPxElement(new fdap() { // from class: ejdz
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((kio) obj).getClass();
                    return new kjb((fdcgVar.a << 32) | (fdcgVar2.a & 4294967295L));
                }
            }, false), glz.a(hmlVarC).p, evn.a), 48.0f, 48.0f);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == hmk.a) {
                objS2 = new fdap() { // from class: ejea
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.k(jtoVar, "send button");
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            gjz.b(fdaeVar2, jsh.c(icsVarM, false, (fdap) objS2), false, null, null, ejdg.a, hmlVarC, 1572864, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejeb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hsf hsfVar3 = hsfVar;
                    long j3 = j;
                    ejgh ejghVar3 = ejghVar;
                    ejgh ejghVar4 = ejghVar2;
                    ejeg.e(hsfVar3, j3, ejghVar3, ejghVar4, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
