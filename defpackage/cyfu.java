package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfu implements cyeh {
    public static final cqce a = cqce.g("BugleCms", "KeyRetrievalClientPage");
    public final cyda b;
    public final Activity c;
    public adj d;
    private final Context e;
    private final String f;

    public cyfu(cyda cydaVar, Context context) {
        context.getClass();
        this.b = cydaVar;
        this.e = context;
        this.f = "KeyRetrievalClient";
        this.c = (Activity) context;
    }

    public static final void f(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final boolean g(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    @Override // defpackage.cyeh
    public final String a() {
        return this.f;
    }

    public final void b(List list, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        ioi ioiVar;
        final hox hoxVar;
        final List list2;
        fdapVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1592285038);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.F(list) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            list2 = list;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar2 = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hpl hplVar2 = new hpl("", hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            }
            final hox hoxVar3 = (hox) objS2;
            hmwVar.ab();
            if (g(hoxVar2)) {
                ioiVar = fwd.a;
                if (ioiVar == null) {
                    iog iogVar = new iog("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    List list3 = ipr.a;
                    ikt iktVar = new ikt(ije.a);
                    ArrayList arrayList = new ArrayList(32);
                    ioj.i(7.41f, 15.41f, arrayList);
                    ioj.g(12.0f, 10.83f, arrayList);
                    ioj.h(4.59f, 4.58f, arrayList);
                    ioj.g(18.0f, 14.0f, arrayList);
                    ioj.h(-6.0f, -6.0f, arrayList);
                    ioj.h(-6.0f, 6.0f, arrayList);
                    ioj.b(arrayList);
                    iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                    fwd.a = iogVar.a();
                    ioiVar = fwd.a;
                    ioiVar.getClass();
                }
            } else {
                ioiVar = fwc.a;
                if (ioiVar == null) {
                    iog iogVar2 = new iog("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    List list4 = ipr.a;
                    ikt iktVar2 = new ikt(ije.a);
                    ArrayList arrayList2 = new ArrayList(32);
                    ioj.i(7.41f, 8.59f, arrayList2);
                    ioj.g(12.0f, 13.17f, arrayList2);
                    ioj.h(4.59f, -4.58f, arrayList2);
                    ioj.g(18.0f, 10.0f, arrayList2);
                    ioj.h(-6.0f, 6.0f, arrayList2);
                    ioj.h(-6.0f, -6.0f, arrayList2);
                    ioj.h(1.41f, -1.41f, arrayList2);
                    ioj.b(arrayList2);
                    iogVar2.c(arrayList2, 0, "", iktVar2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                    fwc.a = iogVar2.a();
                    ioiVar = fwc.a;
                    ioiVar.getClass();
                }
            }
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = cyei.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            String str = (String) hoxVar3.a();
            hmlVarC.v(5004770);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new fdap() { // from class: cyer
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        String str2 = (String) obj2;
                        str2.getClass();
                        hoxVar3.b(str2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            frk.c(str, (fdap) objS3, null, false, null, cyed.m, hxe.d(2111539407, new cyfb(ioiVar, hoxVar2), hmlVarC), null, null, null, 0, 0, null, null, hmlVarC, 806879280, 0);
            hmlVarC = hmlVarC;
            boolean zG = g(hoxVar2);
            hmlVarC.v(5004770);
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                hoxVar = hoxVar2;
                objS4 = new fdae() { // from class: cyes
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cyfu.f(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            } else {
                hoxVar = hoxVar2;
            }
            hmwVar.ab();
            list2 = list;
            fob.a(zG, (fdae) objS4, joj.a(icoVar, "accountDropdownMenu"), 0L, null, null, hxe.d(-777556405, new cyfe(list2, fdapVar, hoxVar), hmlVarC), hmlVarC, 1573296);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyet
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cyfu cyfuVar = this.a;
                    List list5 = list2;
                    int i4 = i;
                    cyfuVar.b(list5, fdapVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e4  */
    @Override // defpackage.cyeh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.hox r57, defpackage.hml r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyfu.c(hox, hml, int):void");
    }

    @Override // defpackage.cyeh
    public final /* synthetic */ void d(hml hmlVar) {
        cyee.a(this, hmlVar);
    }

    @Override // defpackage.cyeh
    public final /* synthetic */ void e(String str, hml hmlVar) {
        cyee.b(str, hmlVar);
    }
}
