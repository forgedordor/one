package defpackage;

import android.content.Context;
import android.webkit.WebView;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsk {
    public static final WebView a(hox hoxVar) {
        return (WebView) hoxVar.a();
    }

    public static final void b(final dlsq dlsqVar, final List list, final ics icsVar, boolean z, dlsp dlspVar, fdap fdapVar, fdap fdapVar2, dlru dlruVar, dlrp dlrpVar, fdap fdapVar3, hml hmlVar, final int i) {
        int i2;
        fdap fdapVar4;
        fdap fdapVar5;
        dlrp dlrpVar2;
        dlsp dlspVar2;
        fdap fdapVar6;
        dlru dlruVar2;
        boolean z2;
        fdap fdapVar7;
        hml hmlVar2;
        final fdap fdapVar8;
        final fdap fdapVar9;
        final dlrp dlrpVar3;
        final dlru dlruVar3;
        final dlsp dlspVar3;
        final boolean z3;
        final fdap fdapVar10;
        dlsqVar.getClass();
        list.getClass();
        hml hmlVarC = hmlVar.c(-1546687207);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dlsqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        int i4 = 1769472 | i3;
        if ((12582912 & i) == 0) {
            i4 = i3 | 5963776;
        }
        if ((100663296 & i) == 0) {
            i4 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        int i5 = 805306368 | i4;
        if ((306783379 & i5) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
            dlspVar3 = dlspVar;
            fdapVar9 = fdapVar;
            fdapVar10 = fdapVar2;
            dlruVar3 = dlruVar;
            dlrpVar3 = dlrpVar;
            hmlVar2 = hmlVarC;
            fdapVar8 = fdapVar3;
        } else {
            int i6 = i5 & (-264298497);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmlVarC.v(2062471267);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                Object obj = hmk.a;
                if (objS == obj) {
                    objS = hob.a(fcyi.a, hmlVarC);
                    hmwVar.af(objS);
                }
                fdjx fdjxVar = (fdjx) objS;
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(fdjxVar);
                Object objS2 = hmwVar.S();
                if (zD || objS2 == obj) {
                    objS2 = new dlsp(fdjxVar);
                    hmwVar.af(objS2);
                }
                dlsp dlspVar4 = (dlsp) objS2;
                hmwVar.ab();
                hmwVar.ab();
                hmlVarC.v(1849434622);
                Object objS3 = hmwVar.S();
                if (objS3 == obj) {
                    objS3 = new fdap() { // from class: dlrz
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            ((WebView) obj2).getClass();
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS3);
                }
                fdap fdapVar11 = (fdap) objS3;
                hmwVar.ab();
                hmlVarC.v(1849434622);
                Object objS4 = hmwVar.S();
                if (objS4 == obj) {
                    objS4 = new fdap() { // from class: dlsa
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            ((WebView) obj2).getClass();
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS4);
                }
                fdap fdapVar12 = (fdap) objS4;
                hmwVar.ab();
                hmlVarC.v(1849434622);
                Object objS5 = hmwVar.S();
                if (objS5 == obj) {
                    objS5 = new dlru(new ebsg(list));
                    hmwVar.af(objS5);
                }
                dlru dlruVar4 = (dlru) objS5;
                hmwVar.ab();
                hmlVarC.v(1849434622);
                Object objS6 = hmwVar.S();
                if (objS6 == obj) {
                    objS6 = new dlrp();
                    hmwVar.af(objS6);
                }
                dlrp dlrpVar4 = (dlrp) objS6;
                hmwVar.ab();
                hmlVarC.v(1849434622);
                Object objS7 = hmwVar.S();
                if (objS7 == obj) {
                    objS7 = new fdap() { // from class: dlsb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            Context context = (Context) obj2;
                            context.getClass();
                            return new WebView(context);
                        }
                    };
                    hmwVar.af(objS7);
                }
                hmwVar.ab();
                fdapVar4 = (fdap) objS7;
                fdapVar5 = fdapVar11;
                dlrpVar2 = dlrpVar4;
                dlspVar2 = dlspVar4;
                fdapVar6 = fdapVar12;
                dlruVar2 = dlruVar4;
                z2 = true;
            } else {
                hmlVarC.s();
                z2 = z;
                dlspVar2 = dlspVar;
                fdapVar5 = fdapVar;
                fdapVar6 = fdapVar2;
                dlruVar2 = dlruVar;
                dlrpVar2 = dlrpVar;
                fdapVar4 = fdapVar3;
            }
            hmlVarC.l();
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS8 = hmwVar2.S();
            Object obj2 = hmk.a;
            fdap fdapVar13 = fdapVar5;
            if (objS8 == obj2) {
                fdapVar7 = fdapVar4;
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar2.af(hplVar);
                objS8 = hplVar;
            } else {
                fdapVar7 = fdapVar4;
            }
            final hox hoxVar = (hox) objS8;
            hmwVar2.ab();
            boolean z4 = z2 && ((Boolean) dlspVar2.b.a()).booleanValue();
            hmlVarC.v(5004770);
            Object objS9 = hmwVar2.S();
            if (objS9 == obj2) {
                objS9 = new fdae() { // from class: dlsc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        WebView webViewA = dlsk.a(hoxVar);
                        if (webViewA != null) {
                            webViewA.goBack();
                        }
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS9);
            }
            hmwVar2.ab();
            acx.a(z4, (fdae) objS9, hmlVarC, 48, 0);
            WebView webViewA = a(hoxVar);
            hmlVarC.v(-1633490746);
            boolean zD2 = hmlVarC.D(dlspVar2);
            Object objS10 = hmwVar2.S();
            if (zD2 || objS10 == obj2) {
                objS10 = new dlsf(dlspVar2, hoxVar, null);
                hmwVar2.af(objS10);
            }
            hmwVar2.ab();
            hob.f(webViewA, dlspVar2, (fdat) objS10, hmlVarC);
            final hsf hsfVarA = hsc.a(fdapVar6, hmlVarC);
            final WebView webViewA2 = a(hoxVar);
            hmlVarC.v(-307692926);
            if (webViewA2 != null) {
                hmlVarC.v(-1633490746);
                boolean zD3 = hmlVarC.D(hsfVarA) | hmlVarC.F(webViewA2);
                Object objS11 = hmwVar2.S();
                if (zD3 || objS11 == obj2) {
                    objS11 = new fdap() { // from class: dlsd
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            ((hny) obj3).getClass();
                            return new dlsj(webViewA2, hsfVarA);
                        }
                    };
                    hmwVar2.af(objS11);
                }
                hmwVar2.ab();
                hob.c(webViewA2, (fdap) objS11, hmlVarC);
            }
            hmwVar2.ab();
            dlruVar2.a = dlsqVar;
            dlspVar2.getClass();
            dlruVar2.b = dlspVar2;
            dlrpVar2.a = dlsqVar;
            dlrp dlrpVar5 = dlrpVar2;
            fdap fdapVar14 = fdapVar7;
            edj.a(icsVar, null, hxe.d(360397423, new dlsi(fdapVar14, fdapVar13, dlrpVar5, dlruVar2, ((Boolean) hmlVarC.e(jnj.a)).booleanValue(), dlsqVar, dlspVar2, hoxVar), hmlVarC), hmlVarC, ((i6 >> 6) & 14) | 3072, 6);
            hmlVar2 = hmlVarC;
            fdapVar8 = fdapVar14;
            fdapVar9 = fdapVar13;
            dlrpVar3 = dlrpVar5;
            dlruVar3 = dlruVar2;
            dlspVar3 = dlspVar2;
            z3 = z2;
            fdapVar10 = fdapVar6;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlse
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dlsq dlsqVar2 = dlsqVar;
                    List list2 = list;
                    ics icsVar2 = icsVar;
                    boolean z5 = z3;
                    dlsp dlspVar5 = dlspVar3;
                    fdap fdapVar15 = fdapVar9;
                    fdap fdapVar16 = fdapVar10;
                    dlru dlruVar5 = dlruVar3;
                    dlrp dlrpVar6 = dlrpVar3;
                    dlsk.b(dlsqVar2, list2, icsVar2, z5, dlspVar5, fdapVar15, fdapVar16, dlruVar5, dlrpVar6, fdapVar8, (hml) obj3, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
