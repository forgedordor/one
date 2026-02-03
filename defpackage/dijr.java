package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dijr {
    public static final /* synthetic */ int a = 0;
    private static final Set b = fcwm.d(dijs.n, dijs.o, dijs.p, dijs.q);

    public static final ivy a(hox hoxVar) {
        return (ivy) hoxVar.a();
    }

    public static final jyi b(hox hoxVar) {
        return (jyi) hoxVar.a();
    }

    public static final Object c(isn isnVar, final jyi jyiVar, final ivy ivyVar, final List list, fcxy fcxyVar) {
        Object objA = dlqj.a(isnVar, new fdap() { // from class: diiz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdap fdapVarE;
                ihs ihsVar = (ihs) obj;
                int i = dijr.a;
                jyi jyiVar2 = jyiVar;
                boolean z = false;
                if (jyiVar2 != null) {
                    ivy ivyVar2 = ivyVar;
                    if (ivyVar2 == null) {
                        throw new IllegalStateException("layoutCoordinates should never be null!");
                    }
                    List list2 = list;
                    long j = ihsVar.a;
                    int iK = jyiVar2.k(j);
                    long jL = ivyVar2.l(j);
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        diip diipVar = (diip) it.next();
                        if (iK >= diipVar.b() && iK < diipVar.a() && (fdapVarE = diipVar.e()) != null && ((Boolean) fdapVarE.invoke(new ihs(jL))).booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }, false, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public static final List d(Context context, List list, final ivy ivyVar) {
        fcww fcwwVar = new fcww((byte[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final diip diipVar = (diip) it.next();
            if (diipVar.e() != null) {
                String strD = diipVar.d();
                if (strD == null) {
                    strD = context.getString(R.string.annotation_default_action);
                    strD.getClass();
                }
                fcwwVar.add(new jrr(strD, new fdae() { // from class: diiy
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i = dijr.a;
                        fdap fdapVarE = diipVar.e();
                        if (fdapVarE != null) {
                            ivy ivyVar2 = ivyVar;
                        }
                        return true;
                    }
                }));
            }
        }
        return fcva.a(fcwwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b9 A[PHI: r7 r13
      0x01b9: PHI (r7v9 long) = (r7v6 long), (r7v10 long) binds: [B:46:0x01b7, B:42:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r13v27 java.lang.Object) = (r13v7 java.lang.Object), (r13v28 java.lang.Object) binds: [B:46:0x01b7, B:42:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fcti e(java.lang.String r28, java.util.List r29, long r30, defpackage.hml r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dijr.e(java.lang.String, java.util.List, long, hml, int, int):fcti");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.dijt r31, defpackage.ics r32, defpackage.ics r33, long r34, defpackage.jyq r36, defpackage.khk r37, long r38, defpackage.fdap r40, boolean r41, java.util.Map r42, java.lang.String r43, java.lang.String r44, defpackage.fdat r45, defpackage.hml r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dijr.f(dijt, ics, ics, long, jyq, khk, long, fdap, boolean, java.util.Map, java.lang.String, java.lang.String, fdat, hml, int, int, int):void");
    }

    public static final void g(final String str, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2071795734);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            gvk.c(icsVar, glz.c(hmlVarC).a, glz.a(hmlVarC).p, 0L, 0.0f, 0.0f, null, hxe.d(-747277349, new dijp(str), hmlVarC), hmlVarC, 120);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dijg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    String str2 = str;
                    int iA = hpy.a(i4 | 1);
                    dijr.g(str2, icsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final edp edpVar, final diim diimVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(477427974);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(diimVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String str = diimVar.a;
            String str2 = diimVar.b;
            Uri uri = Uri.parse(str);
            iva ivaVar = iuz.d;
            ics icsVarA = iex.a(efy.i(egq.f(edp.a(ics.e, ibw.j), 48.0f, 400.0f), z ? 16.0f : 0.0f, 0.0f, 2), glz.c(hmlVarC).c);
            hmlVarC.v(5004770);
            int i4 = i2 & 112;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 32 || objS == hmk.a) {
                objS = new fdae() { // from class: diiw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i5 = dijr.a;
                        fdap fdapVar = diimVar.c;
                        if (fdapVar != null) {
                            fdapVar.invoke(new ihs(9205357640488583168L));
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            djrv.a(uri, str2, dli.e(icsVarA, false, null, (fdae) objS, 15), null, null, null, ivaVar, null, 0.0f, 500, 500, null, null, null, null, null, hmlVar2, 12582912, 432, 518008);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diix
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    int i5 = i;
                    diim diimVar2 = diimVar;
                    int iA = hpy.a(i5 | 1);
                    dijr.h(edpVar2, diimVar2, z, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r38, java.util.List r39, java.lang.String r40, final defpackage.ics r41, final long r42, final defpackage.jyq r44, final defpackage.khk r45, final long r46, final defpackage.fdap r48, final java.util.Map r49, final java.lang.String r50, final java.lang.String r51, defpackage.hml r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dijr.i(java.lang.String, java.util.List, java.lang.String, ics, long, jyq, khk, long, fdap, java.util.Map, java.lang.String, java.lang.String, hml, int, int):void");
    }

    private static final jvn j(fctc fctcVar) {
        return (jvn) fctcVar.a();
    }

    private static final jxx k(fctc fctcVar) {
        return (jxx) fctcVar.a();
    }

    private static final jxx l(fctc fctcVar) {
        return (jxx) fctcVar.a();
    }

    private static final List m(List list, int i, int i2) {
        fcww fcwwVar = new fcww((byte[]) null);
        int iA = ((diip) list.get(i)).a() + i2;
        for (diip diipVar : list.subList(i + 1, list.size())) {
            fcwwVar.add(diipVar.c(fddu.f(0, diipVar.b() - iA), diipVar.a() - iA));
        }
        return fcva.a(fcwwVar);
    }

    private static final fcti n(String str, List list) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (i < size) {
            diip diipVar = (diip) list.get(i);
            if ((diipVar instanceof diim) || (diipVar instanceof diil)) {
                String strSubstring = str.substring(diipVar.a());
                strSubstring.getClass();
                String string = fdgn.z(strSubstring).toString();
                fcti fctiVarN = n(string, m(list, i, strSubstring.length() - string.length()));
                Object obj3 = fctiVarN.a;
                Object obj4 = fctiVarN.b;
                String strSubstring2 = str.substring(0, diipVar.b());
                strSubstring2.getClass();
                String string2 = fdgn.y(strSubstring2).toString();
                fcww fcwwVar = new fcww((byte[]) null);
                boolean z = diipVar instanceof diil;
                if (z) {
                    int i2 = ((diil) diipVar).a;
                    String strSubstring3 = str.substring(0, i2);
                    strSubstring3.getClass();
                    fcwwVar.add(fdgn.y(strSubstring3).toString());
                    String strSubstring4 = str.substring(i2, r9.b - 1);
                    strSubstring4.getClass();
                    fcwwVar.add(strSubstring4);
                } else {
                    if (string2.length() > 0) {
                        fcwwVar.add(string2);
                    }
                    fcwwVar.add(null);
                }
                fcwwVar.addAll((Collection) obj3);
                List listA = fcva.a(fcwwVar);
                fcww fcwwVar2 = new fcww((byte[]) null);
                if (i != 0) {
                    fcwwVar2.add(list.subList(0, i));
                } else if (z || string2.length() > 0) {
                    fcwwVar2.add(fcvo.a);
                }
                fcwwVar2.add(fcva.b(diipVar));
                fcwwVar2.addAll((Collection) obj4);
                return new fcti(listA, fcva.a(fcwwVar2));
            }
            int i3 = i + 1;
            if (r(diipVar)) {
                diip diipVar2 = diipVar;
                do {
                    diip diipVar3 = (diip) fcva.Q(list, i3);
                    if (diipVar3 == null) {
                        break;
                    }
                    if (!r(diipVar3)) {
                        if (diipVar3.b() <= diipVar2.a()) {
                            break;
                            break;
                        }
                        break;
                    }
                    diipVar2 = diipVar3;
                    i3++;
                } while (i3 <= list.size());
                if (i3 == list.size()) {
                    obj2 = null;
                    obj = null;
                } else {
                    String strSubstring5 = str.substring(diipVar2.a());
                    strSubstring5.getClass();
                    String string3 = fdgn.z(strSubstring5).toString();
                    fcti fctiVarN2 = n(string3, m(list, i3 - 1, strSubstring5.length() - string3.length()));
                    obj = fctiVarN2.a;
                    obj2 = fctiVarN2.b;
                }
                fcww fcwwVar3 = new fcww((byte[]) null);
                if (diipVar.b() > 0) {
                    String strSubstring6 = str.substring(0, diipVar.b());
                    strSubstring6.getClass();
                    fcwwVar3.add(strSubstring6);
                }
                String strSubstring7 = str.substring(diipVar.b(), diipVar2.a());
                strSubstring7.getClass();
                fcwwVar3.add(strSubstring7);
                List list2 = (List) obj;
                if (list2 != null) {
                    fcwwVar3.addAll(list2);
                }
                List listA2 = fcva.a(fcwwVar3);
                fcww fcwwVar4 = new fcww((byte[]) null);
                if (diipVar.b() > 0) {
                    fcwwVar4.add(list.subList(0, i));
                }
                List<diip> listSubList = list.subList(i, i3);
                ArrayList arrayList = new ArrayList(fcva.p(listSubList, 10));
                for (diip diipVar4 : listSubList) {
                    arrayList.add(diipVar4.c(diipVar4.b() - diipVar.b(), diipVar4.a() - diipVar.b()));
                }
                fcwwVar4.add(arrayList);
                List list3 = (List) obj2;
                if (list3 != null) {
                    fcwwVar4.addAll(list3);
                }
                return new fcti(listA2, fcva.a(fcwwVar4));
            }
            i = i3;
        }
        if (str.length() == 0) {
            str = null;
        }
        return new fcti(fcva.b(str), fcva.b(list));
    }

    private static final void o(List list, int i, boolean z) {
        diip diipVar = (diip) list.get(i);
    }

    private static final boolean p(diip diipVar) {
        return (diipVar instanceof diin) && ((diin) diipVar).a == dijs.i;
    }

    private static final boolean q(List list) {
        return list.size() == 1 && (list.get(0) instanceof diim);
    }

    private static final boolean r(diip diipVar) {
        return (diipVar instanceof diin) && b.contains(((diin) diipVar).a);
    }
}
