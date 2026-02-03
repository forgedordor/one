package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqz {
    public static final /* synthetic */ int a = 0;
    private static final koc b = new koc(true, false, 14);
    private static final dqb c;

    static {
        long j = ije.d;
        long j2 = ije.a;
        long jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.38f, ije.f(j2));
        long j3 = ije.a;
        c = new dqb(j, j2, j2, jF, ijg.f(ije.d(j3), ije.c(j3), ije.b(j3), 0.38f, ije.f(j3)));
    }

    public static final void a(final dqb dqbVar, final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(621449936);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dqbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        int i4 = i2;
        if (hmlVarC.J((i4 & 147) != 146, i4 & 1)) {
            long j = dqk.a;
            ics icsVarC = dpc.c(efy.i(efm.b(dkl.a(ifl.a(icsVar, 3.0f, evn.b(4.0f), 0L, 0L, 28), dqbVar.a, ikj.a), 2), 0.0f, 8.0f, 1), dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            int i5 = (i4 << 3) & 7168;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = dqq.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(edp.a, hmlVarC, Integer.valueOf(((i5 >> 6) & 112) | 6));
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dqb dqbVar2 = dqbVar;
                    int i6 = i;
                    ics icsVar2 = icsVar;
                    int iA2 = hpy.a(i6 | 1);
                    dqz.a(dqbVar2, icsVar2, fdauVar, (hml) obj, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(koa koaVar, fdae fdaeVar, final ics icsVar, final dqb dqbVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar2;
        final koa koaVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1447189339);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(koaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dqbVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if (hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            fdaeVar2 = fdaeVar;
            kna.b(koaVar, fdaeVar2, b, hxe.d(795909757, new dqy(icsVar, dqbVar, fdapVar), hmlVarC), hmlVarC, (i2 & 14) | 3456 | (i2 & 112), 0);
            koaVar2 = koaVar;
        } else {
            fdaeVar2 = fdaeVar;
            koaVar2 = koaVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final fdae fdaeVar3 = fdaeVar2;
            hpxVarL.d = new fdat() { // from class: dqt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    koa koaVar3 = koaVar2;
                    fdae fdaeVar4 = fdaeVar3;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dqz.b(koaVar3, fdaeVar4, icsVar2, dqbVar, fdapVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final koa koaVar, final fdae fdaeVar, final ics icsVar, final fdap fdapVar, hml hmlVar, final int i) throws Resources.NotFoundException {
        koa koaVar2;
        int i2;
        fdae fdaeVar2;
        ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(712057293);
        if (i3 == 0) {
            koaVar2 = koaVar;
            i2 = (true != hmlVarC.D(koaVar2) ? 2 : 4) | i;
        } else {
            koaVar2 = koaVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 384) == 0) {
            icsVar2 = icsVar;
            i2 |= true != hmlVarC.D(icsVar2) ? 128 : 256;
        } else {
            icsVar2 = icsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            boolean zD = hmlVarC.D((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)) | hmlVarC.D(context);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                dqb dqbVar = c;
                long jC = dqbVar.a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iB = ijg.b(jC);
                int color = typedArrayObtainStyledAttributes.getColor(0, iB);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iB) {
                    jC = ijg.c(color);
                }
                long j = jC;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jC2 = dqbVar.b;
                int iB2 = ijg.b(jC2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iB2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iB2) {
                    jC2 = ijg.c(numValueOf.intValue());
                }
                long j2 = jC2;
                long jC3 = dqbVar.d;
                int iB3 = ijg.b(jC3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iB3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iB3) {
                    jC3 = ijg.c(numValueOf2.intValue());
                }
                long j3 = jC3;
                dqb dqbVar2 = new dqb(j, j2, j2, j3, j3);
                hmwVar.af(dqbVar2);
                objS = dqbVar2;
            }
            b(koaVar2, fdaeVar2, icsVar2, (dqb) objS, fdapVar, hmlVarC, (i2 & 1022) | ((i2 << 3) & 57344));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    koa koaVar3 = koaVar;
                    fdae fdaeVar3 = fdaeVar;
                    int i4 = i;
                    dqz.c(koaVar3, fdaeVar3, icsVar, fdapVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ics icsVar, final dqb dqbVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1430784946);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dqbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            a(dqbVar, icsVar, hxe.d(860259975, new dqx(fdapVar, dqbVar), hmlVarC), hmlVarC, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 384);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i3 = i;
                    dqb dqbVar2 = dqbVar;
                    int iA = hpy.a(i3 | 1);
                    dqz.d(icsVar2, dqbVar2, fdapVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final String str, final dqb dqbVar, final ics icsVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1027365588);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(true) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dqbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            long j = dqk.a;
            int i3 = i2 & 112;
            icc iccVar = dqk.e;
            ecj ecjVarG = ecr.g(12.0f);
            boolean z = i3 == 32;
            boolean z2 = (458752 & i2) == 131072;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new fdae() { // from class: dqv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i4 = dqz.a;
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarI = efy.i(egq.n(egq.d(dli.e(icsVar, true, str, (fdae) objS, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), 12.0f, 0.0f, 2);
            ixm ixmVarA = egk.a(ecjVarG, iccVar, hmlVarC, 54);
            int iA = dqq.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egp egpVar = egp.a;
            hmlVarC.v(-1483499797);
            hmwVar.ab();
            exb.c(str, egpVar.a(ics.e, 1.0f, true), new jyq(dqbVar.b, dqk.a, dqk.b, null, dqk.d, 5, dqk.c, 16613240), null, 0, false, 1, 0, null, hmlVarC, (i2 & 14) | 1572864, 952);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    dqb dqbVar2 = dqbVar;
                    int i4 = i;
                    dqz.e(str2, dqbVar2, icsVar, fdaeVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
