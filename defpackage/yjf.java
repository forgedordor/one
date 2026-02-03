package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.BidiFormatter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjf {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiKt");

    public static final void a(final yis yisVar, boolean z, ddp ddpVar, hml hmlVar, final int i, final int i2) {
        int i3;
        boolean z2 = z;
        ddp ddpVarA = ddpVar;
        yisVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1010612268);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(yisVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? hmlVarC.D(ddpVarA) : hmlVarC.F(ddpVarA)) {
                    i6 = 256;
                }
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i7 = i2 & 4;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                z2 &= z3;
                if (i7 != 0) {
                    i3 &= -897;
                    ddpVarA = ddq.a(0.0f);
                }
            } else {
                hmlVarC.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            ddp ddpVar2 = ddpVarA;
            hmlVarC.l();
            if (yisVar instanceof zjs) {
                hmlVarC.v(570903582);
                zjv.a((zjs) yisVar, z2, d(hmlVarC), ddpVar2, hmlVarC, (i3 & 112) | 4096 | ((i3 << 3) & 7168));
                ddpVarA = ddpVar2;
                ((hmw) hmlVarC).ab();
            } else {
                ddpVarA = ddpVar2;
                if (yisVar instanceof yki) {
                    hmlVarC.v(571146808);
                    yki ykiVar = (yki) yisVar;
                    int i8 = (i3 & 896) | (i3 & 112) | 512;
                    if (ykiVar.e.a && (ykiVar.b instanceof dlhm)) {
                        hmlVarC.v(571224773);
                        c(ykiVar, z2, ddpVarA, hmlVarC, i8);
                        ((hmw) hmlVarC).ab();
                    } else {
                        hmlVarC.v(571303265);
                        b(ykiVar, z2, ddpVarA, hmlVarC, i8);
                        ((hmw) hmlVarC).ab();
                    }
                    ((hmw) hmlVarC).ab();
                } else if (yisVar instanceof zkm) {
                    hmlVarC.v(-535756564);
                    zkp.a((zkm) yisVar, hmlVarC, 0);
                    ((hmw) hmlVarC).ab();
                } else {
                    if (yisVar instanceof zma) {
                        hmlVarC.v(571497356);
                        throw null;
                    }
                    if (yisVar instanceof zmb) {
                        hmlVarC.v(571594479);
                        zmb zmbVar = (zmb) yisVar;
                        cwui cwuiVar = zmbVar.a;
                        if (cwuiVar != null) {
                            cwux.c(cwuiVar, zmbVar.b, zmbVar.c, null, hmlVarC, 0);
                        }
                        ((hmw) hmlVarC).ab();
                    } else if (yisVar instanceof ziu) {
                        hmlVarC.v(-535744985);
                        ziw.a((ziu) yisVar, hmlVarC, 0);
                        ((hmw) hmlVarC).ab();
                    } else if (yisVar instanceof zjp) {
                        hmlVarC.v(-535743381);
                        zjr.a((zjp) yisVar, hmlVarC, 0);
                        ((hmw) hmlVarC).ab();
                    } else {
                        hmlVarC.v(-535742190);
                        Class<?> cls = yisVar.getClass();
                        int i9 = fdcj.a;
                        dthx.b("<message type not handled yet " + new fdbi(cls) + ">", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVarC, 0, 0, 131070);
                        hmlVarC = hmlVarC;
                        ((hmw) hmlVarC).ab();
                    }
                }
            }
        }
        final ddp ddpVar3 = ddpVarA;
        final boolean z4 = z2;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yiy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yis yisVar2 = yisVar;
                    boolean z5 = z4;
                    yjf.a(yisVar2, z5, ddpVar3, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final yki ykiVar, final boolean z, final ddp ddpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1676248823);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ykiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2;
            dkkr dkkrVar = ykiVar.a;
            dklt dkltVarD = d(hmlVarC);
            ico icoVar = ics.e;
            ics icsVarA = !cqbe.d() ? icoVar : iwl.a(icoVar, new yjb());
            ykf ykfVar = ykiVar.d;
            if (ykfVar != null) {
                String str = ykiVar.f;
                icoVar.getClass();
                icsVarA = icsVarA.a(icoVar.a(new ick("com.google.android.libraries.communications.ux.components.message.animation.sendingAnimation", str, new dkfq(str, ykfVar.c, ykfVar.d, ykfVar.a, ykfVar.b))));
            }
            int i5 = i4 << 3;
            dkke.c(dkkrVar, icsVarA, z, ddpVar, dkltVarD, hxe.d(641294063, new yjc(ykiVar), hmlVarC), hmlVarC, (i5 & 7168) | (i5 & 896) | 200704, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yiu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yki ykiVar2 = ykiVar;
                    boolean z2 = z;
                    int i6 = i;
                    yjf.b(ykiVar2, z2, ddpVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final yki ykiVar, final boolean z, final ddp ddpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-713207599);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ykiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dlhm dlhmVar = (dlhm) ykiVar.b;
            String str = dlhmVar.a;
            hmlVarC.v(1802273288);
            if (str.length() <= ykiVar.e.b) {
                b(ykiVar, z, ddpVar, hmlVarC, (i2 & 126) | 512 | (i2 & 896));
                ((hmw) hmlVarC).ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: yiv
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            yki ykiVar2 = ykiVar;
                            boolean z2 = z;
                            int i4 = i;
                            yjf.c(ykiVar2, z2, ddpVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            long j = jyk.a(jyl.a(hmlVarC), str, dlig.g(dlhmVar, hmlVarC), 0, 0, 0L, 1020).c;
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            dkkr dkkrVar = ykiVar.a;
            int iEp = kioVar.ep(dkks.c(dkkrVar)) + kioVar.ep(dkks.a(dkkrVar, false));
            hmlVarC.v(1802288677);
            int i4 = ((int) (j & 4294967295L)) + iEp;
            if (i4 < 262143) {
                b(ykiVar, z, ddpVar, hmlVarC, (i2 & 126) | 512 | (i2 & 896));
                hmwVar.ab();
                hpx hpxVarL2 = hmlVarC.L();
                if (hpxVarL2 != null) {
                    hpxVarL2.d = new fdat() { // from class: yiw
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            yki ykiVar2 = ykiVar;
                            boolean z2 = z;
                            int i5 = i;
                            yjf.c(ykiVar2, z2, ddpVar, (hml) obj, hpy.a(i5 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmwVar.ab();
            int i5 = i4 / 262143;
            int i6 = i5 + 1;
            int length = str.length() / i6;
            ((ekrd) a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiKt", "SplitTextBubble", 132, "BugleMessageUi.kt")).I("Splitting text bubble with height %s into %d bubbles. textLength is %d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(length));
            int i7 = i5;
            while (i7 >= 0) {
                String strSubstring = str.substring(i7 * length, Math.min((i7 + 1) * length, str.length()));
                strSubstring.getClass();
                b(yki.c(ykiVar, null, dlhm.l(dlhmVar, strSubstring, null, null, null, null, false, false, 4194302), 125), z, ddpVar, hmlVarC, (i2 & 112) | 512 | (i2 & 896));
                i7--;
                str = str;
                i2 = i2;
            }
        }
        hpx hpxVarL3 = hmlVarC.L();
        if (hpxVarL3 != null) {
            hpxVarL3.d = new fdat() { // from class: yix
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yki ykiVar2 = ykiVar;
                    boolean z2 = z;
                    int i8 = i;
                    yjf.c(ykiVar2, z2, ddpVar, (hml) obj, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final dklt d(hml hmlVar) {
        hmlVar.v(505373486);
        final Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        final jyk jykVarA = jyl.a(hmlVar);
        hmlVar.v(1849434622);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (objS == hmk.a) {
            objS = new dklt(yjd.a, yje.a, new fdau() { // from class: yiz
                @Override // defpackage.fdau
                public final Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    String str = (String) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    jyq jyqVar = (jyq) obj3;
                    str.getClass();
                    jyqVar.getClass();
                    boolean zA = aqbw.a();
                    jyk jykVar = jykVarA;
                    jykVar.getClass();
                    Context context2 = context;
                    context2.getClass();
                    if (str.length() == 0 || yvr.a(str, jykVar, jyqVar, iIntValue)) {
                        return str;
                    }
                    List<String> listS = fdgn.S(str, new String[]{", "}, 0, 6);
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    Resources resources = context2.getResources();
                    BidiFormatter bidiFormatter = BidiFormatter.getInstance(resources.getConfiguration().getLocales().get(0));
                    int i = 0;
                    for (String str2 : listS) {
                        int i2 = i + 1;
                        if (zA) {
                            sb.append(str2);
                        } else {
                            sb.append(bidiFormatter.unicodeWrap(str2));
                        }
                        if (i != fcva.e(listS)) {
                            sb.append(", ");
                        }
                        arrayList.add(Integer.valueOf(sb.length()));
                        i = i2;
                    }
                    for (int iE = fcva.e(listS); iE >= 0; iE--) {
                        sb.delete(((Number) arrayList.get(iE)).intValue(), sb.length());
                        int size = (listS.size() - iE) - 1;
                        if (size > 0) {
                            String quantityString = resources.getQuantityString(R.plurals.plus_n_plural, size, Integer.valueOf(size));
                            quantityString.getClass();
                            sb.append(bidiFormatter.unicodeWrap(quantityString));
                        }
                        String string = sb.toString();
                        if (yvr.a(string, jykVar, jyqVar, iIntValue)) {
                            return string;
                        }
                    }
                    return "";
                }
            });
            hmwVar.af(objS);
        }
        dklt dkltVar = (dklt) objS;
        hmwVar.ab();
        hmwVar.ab();
        return dkltVar;
    }
}
