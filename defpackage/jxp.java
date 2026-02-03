package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxp {
    public static final hyr a = new hyu(new fdat() { // from class: jvu
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            juo juoVar = (juo) obj2;
            return fcva.f(juoVar.b, jxp.a(juoVar.a, jxp.b, (hya) obj));
        }
    }, new fdap() { // from class: jvw
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(1);
            List list2 = (fdbq.f(obj2, false) || obj2 == null) ? null : (List) jxp.b.a(obj2);
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            str.getClass();
            return new juo(list2, str);
        }
    });
    public static final hyr b = new hyu(new fdat() { // from class: jwi
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            List list = (List) obj2;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(jxp.a((jum) list.get(i2), jxp.c, hyaVar));
            }
            return arrayList;
        }
    }, new fdap() { // from class: jwu
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                hyr hyrVar = jxp.c;
                jum jumVar = null;
                if (!fdbq.f(obj2, false) && obj2 != null) {
                    jumVar = (jum) hyrVar.a(obj2);
                }
                jumVar.getClass();
                arrayList.add(jumVar);
            }
            return arrayList;
        }
    });
    public static final hyr c = new hyu(new fdat() { // from class: jwz
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            jus jusVar;
            Object objA;
            hya hyaVar = (hya) obj;
            jum jumVar = (jum) obj2;
            Object obj3 = jumVar.a;
            if (obj3 instanceof jvn) {
                jusVar = jus.a;
            } else if (obj3 instanceof jxx) {
                jusVar = jus.b;
            } else if (obj3 instanceof jyu) {
                jusVar = jus.c;
            } else if (obj3 instanceof jyt) {
                jusVar = jus.d;
            } else if (obj3 instanceof jux) {
                jusVar = jus.e;
            } else if (obj3 instanceof juw) {
                jusVar = jus.f;
            } else {
                if (!(obj3 instanceof jya)) {
                    throw new UnsupportedOperationException();
                }
                jusVar = jus.g;
            }
            switch (jusVar.ordinal()) {
                case 0:
                    obj3.getClass();
                    objA = jxp.a((jvn) obj3, jxp.h, hyaVar);
                    break;
                case 1:
                    obj3.getClass();
                    objA = jxp.a((jxx) obj3, jxp.i, hyaVar);
                    break;
                case 2:
                    obj3.getClass();
                    objA = jxp.a((jyu) obj3, jxp.d, hyaVar);
                    break;
                case 3:
                    obj3.getClass();
                    objA = jxp.a((jyt) obj3, jxp.e, hyaVar);
                    break;
                case 4:
                    obj3.getClass();
                    objA = jxp.a((jux) obj3, jxp.f, hyaVar);
                    break;
                case 5:
                    obj3.getClass();
                    objA = jxp.a((juw) obj3, jxp.g, hyaVar);
                    break;
                case 6:
                    obj3.getClass();
                    objA = ((jya) obj3).a;
                    break;
                default:
                    throw new fctg();
            }
            return fcva.f(jusVar, objA, Integer.valueOf(jumVar.b), Integer.valueOf(jumVar.c), jumVar.d);
        }
    }, new fdap() { // from class: jxa
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            jvn jvnVar = null;
            juwVar = null;
            juw juwVar = null;
            juxVar = null;
            jux juxVar = null;
            jytVar = null;
            jyt jytVar = null;
            jyuVar = null;
            jyu jyuVar = null;
            jxxVar = null;
            jxx jxxVar = null;
            jvnVar = null;
            jus jusVar = obj2 != null ? (jus) obj2 : null;
            jusVar.getClass();
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            num.getClass();
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            num2.getClass();
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            str.getClass();
            switch (jusVar.ordinal()) {
                case 0:
                    Object obj6 = list.get(1);
                    hyr hyrVar = jxp.h;
                    if (!fdbq.f(obj6, false) && obj6 != null) {
                        jvnVar = (jvn) hyrVar.a(obj6);
                    }
                    jvnVar.getClass();
                    return new jum(jvnVar, iIntValue, iIntValue2, str);
                case 1:
                    Object obj7 = list.get(1);
                    hyr hyrVar2 = jxp.i;
                    if (!fdbq.f(obj7, false) && obj7 != null) {
                        jxxVar = (jxx) hyrVar2.a(obj7);
                    }
                    jxxVar.getClass();
                    return new jum(jxxVar, iIntValue, iIntValue2, str);
                case 2:
                    Object obj8 = list.get(1);
                    hyr hyrVar3 = jxp.d;
                    if (!fdbq.f(obj8, false) && obj8 != null) {
                        jyuVar = (jyu) hyrVar3.a(obj8);
                    }
                    jyuVar.getClass();
                    return new jum(jyuVar, iIntValue, iIntValue2, str);
                case 3:
                    Object obj9 = list.get(1);
                    hyr hyrVar4 = jxp.e;
                    if (!fdbq.f(obj9, false) && obj9 != null) {
                        jytVar = (jyt) hyrVar4.a(obj9);
                    }
                    jytVar.getClass();
                    return new jum(jytVar, iIntValue, iIntValue2, str);
                case 4:
                    Object obj10 = list.get(1);
                    hyr hyrVar5 = jxp.f;
                    if (!fdbq.f(obj10, false) && obj10 != null) {
                        juxVar = (jux) hyrVar5.a(obj10);
                    }
                    juxVar.getClass();
                    return new jum(juxVar, iIntValue, iIntValue2, str);
                case 5:
                    Object obj11 = list.get(1);
                    hyr hyrVar6 = jxp.g;
                    if (!fdbq.f(obj11, false) && obj11 != null) {
                        juwVar = (juw) hyrVar6.a(obj11);
                    }
                    juwVar.getClass();
                    return new jum(juwVar, iIntValue, iIntValue2, str);
                case 6:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    str2.getClass();
                    return new jum(new jya(str2), iIntValue, iIntValue2, str);
                default:
                    throw new fctg();
            }
        }
    });
    public static final hyr d = new hyu(new fdat() { // from class: jxc
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return ((jyu) obj2).a;
        }
    }, new fdap() { // from class: jxd
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            str.getClass();
            return new jyu(str);
        }
    });
    public static final hyr e = new hyu(new fdat() { // from class: jxe
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return ((jyt) obj2).a;
        }
    }, new fdap() { // from class: jxf
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            str.getClass();
            return new jyt(str);
        }
    });
    public static final hyr f = new hyu(new fdat() { // from class: jwf
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            jux juxVar = (jux) obj2;
            return fcva.f(juxVar.a, jxp.a(juxVar.b, jxp.j, (hya) obj));
        }
    }, new fdap() { // from class: jwq
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            jyj jyjVar = null;
            String str = obj2 != null ? (String) obj2 : null;
            str.getClass();
            Object obj3 = list.get(1);
            hyr hyrVar = jxp.j;
            if (!fdbq.f(obj3, false) && obj3 != null) {
                jyjVar = (jyj) hyrVar.a(obj3);
            }
            return new jux(str, jyjVar);
        }
    });
    public static final hyr g = new hyu(new fdat() { // from class: jxb
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            juw juwVar = (juw) obj2;
            return fcva.f(juwVar.a, jxp.a(juwVar.b, jxp.j, (hya) obj));
        }
    }, new fdap() { // from class: jxg
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            jyj jyjVar = null;
            String str = obj2 != null ? (String) obj2 : null;
            str.getClass();
            Object obj3 = list.get(1);
            hyr hyrVar = jxp.j;
            if (!fdbq.f(obj3, false) && obj3 != null) {
                jyjVar = (jyj) hyrVar.a(obj3);
            }
            return new juw(str, jyjVar);
        }
    });
    public static final hyr h = new hyu(new fdat() { // from class: jxh
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            jvn jvnVar = (jvn) obj2;
            khk khkVar = new khk(jvnVar.a);
            khm khmVar = new khm(jvnVar.b);
            Object objA = jxp.a(new kjl(jvnVar.c), jxp.v, hyaVar);
            khu khuVar = jvnVar.d;
            khu khuVar2 = khu.a;
            Object objA2 = jxp.a(khuVar, jxp.m, hyaVar);
            Object objA3 = jxp.a(jvnVar.e, jxw.a, hyaVar);
            khi khiVar = jvnVar.f;
            khi khiVar2 = khi.a;
            return fcva.f(khkVar, khmVar, objA, objA2, objA3, jxp.a(khiVar, jxp.t, hyaVar), jxp.a(new khd(jvnVar.g), jxw.b, hyaVar), new kgz(jvnVar.h), jxp.a(jvnVar.i, jxw.c, hyaVar));
        }
    }, new fdap() { // from class: jxi
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            khw khwVar = null;
            khk khkVar = obj2 != null ? (khk) obj2 : null;
            khkVar.getClass();
            Object obj3 = list.get(1);
            khm khmVar = obj3 != null ? (khm) obj3 : null;
            khmVar.getClass();
            Object obj4 = list.get(2);
            long j2 = kjl.a;
            jxo jxoVar = jxp.v;
            fdbq.f(obj4, false);
            kjl kjlVar = obj4 != null ? (kjl) jxoVar.a(obj4) : null;
            kjlVar.getClass();
            Object obj5 = list.get(3);
            khu khuVar = khu.a;
            khu khuVar2 = (fdbq.f(obj5, false) || obj5 == null) ? null : (khu) jxp.m.a(obj5);
            Object obj6 = list.get(4);
            jvr jvrVar = (fdbq.f(obj6, false) || obj6 == null) ? null : (jvr) jxw.a.a(obj6);
            Object obj7 = list.get(5);
            khi khiVar = khi.a;
            khi khiVar2 = (fdbq.f(obj7, false) || obj7 == null) ? null : (khi) jxp.t.a(obj7);
            Object obj8 = list.get(6);
            khd khdVar = (fdbq.f(obj8, false) || obj8 == null) ? null : (khd) jxw.b.a(obj8);
            khdVar.getClass();
            Object obj9 = list.get(7);
            kgz kgzVar = obj9 != null ? (kgz) obj9 : null;
            kgzVar.getClass();
            Object obj10 = list.get(8);
            hyr hyrVar = jxw.c;
            if (!fdbq.f(obj10, false) && obj10 != null) {
                khwVar = (khw) hyrVar.a(obj10);
            }
            int i2 = kgzVar.a;
            int i3 = khdVar.a;
            return new jvn(khkVar.a, khmVar.a, kjlVar.b, khuVar2, jvrVar, khiVar2, i3, i2, khwVar);
        }
    });
    public static final hyr i = new hyu(new fdat() { // from class: jxj
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            jxx jxxVar = (jxx) obj2;
            ije ijeVar = new ije(jxxVar.b());
            jxo jxoVar = jxp.u;
            Object objA = jxp.a(ijeVar, jxoVar, hyaVar);
            kjl kjlVar = new kjl(jxxVar.b);
            jxo jxoVar2 = jxp.v;
            Object objA2 = jxp.a(kjlVar, jxoVar2, hyaVar);
            kcc kccVar = jxxVar.c;
            kcc kccVar2 = kcc.a;
            Object objA3 = jxp.a(kccVar, jxp.n, hyaVar);
            kbw kbwVar = jxxVar.d;
            kbx kbxVar = jxxVar.e;
            String str = jxxVar.g;
            Object objA4 = jxp.a(new kjl(jxxVar.h), jxoVar2, hyaVar);
            Object objA5 = jxp.a(jxxVar.i, jxp.o, hyaVar);
            Object objA6 = jxp.a(jxxVar.j, jxp.l, hyaVar);
            kfu kfuVar = jxxVar.k;
            kfu kfuVar2 = kfu.a;
            Object objA7 = jxp.a(kfuVar, jxp.r, hyaVar);
            Object objA8 = jxp.a(new ije(jxxVar.l), jxoVar, hyaVar);
            Object objA9 = jxp.a(jxxVar.m, jxp.k, hyaVar);
            iko ikoVar = jxxVar.n;
            iko ikoVar2 = iko.a;
            return fcva.f(objA, objA2, objA3, kbwVar, kbxVar, -1, str, objA4, objA5, objA6, objA7, objA8, objA9, jxp.a(ikoVar, jxp.q, hyaVar));
        }
    }, new fdap() { // from class: jxk
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            long j2 = ije.a;
            jxo jxoVar = jxp.u;
            fdbq.f(obj2, false);
            ije ijeVar = obj2 != null ? (ije) jxoVar.a(obj2) : null;
            ijeVar.getClass();
            Object obj3 = list.get(1);
            long j3 = kjl.a;
            jxo jxoVar2 = jxp.v;
            fdbq.f(obj3, false);
            kjl kjlVar = obj3 != null ? (kjl) jxoVar2.a(obj3) : null;
            kjlVar.getClass();
            Object obj4 = list.get(2);
            kcc kccVar = kcc.a;
            kcc kccVar2 = (fdbq.f(obj4, false) || obj4 == null) ? null : (kcc) jxp.n.a(obj4);
            Object obj5 = list.get(3);
            kbw kbwVar = obj5 != null ? (kbw) obj5 : null;
            Object obj6 = list.get(4);
            kbx kbxVar = obj6 != null ? (kbx) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            fdbq.f(obj8, false);
            kjl kjlVar2 = obj8 != null ? (kjl) jxoVar2.a(obj8) : null;
            kjlVar2.getClass();
            Object obj9 = list.get(8);
            kgw kgwVar = (fdbq.f(obj9, false) || obj9 == null) ? null : (kgw) jxp.o.a(obj9);
            Object obj10 = list.get(9);
            kht khtVar = (fdbq.f(obj10, false) || obj10 == null) ? null : (kht) jxp.l.a(obj10);
            Object obj11 = list.get(10);
            kfu kfuVar = kfu.a;
            kfu kfuVar2 = (fdbq.f(obj11, false) || obj11 == null) ? null : (kfu) jxp.r.a(obj11);
            Object obj12 = list.get(11);
            fdbq.f(obj12, false);
            ije ijeVar2 = obj12 != null ? (ije) jxoVar.a(obj12) : null;
            ijeVar2.getClass();
            Object obj13 = list.get(12);
            khl khlVar = (fdbq.f(obj13, false) || obj13 == null) ? null : (khl) jxp.k.a(obj13);
            Object obj14 = list.get(13);
            iko ikoVar = iko.a;
            iko ikoVar2 = (fdbq.f(obj14, false) || obj14 == null) ? null : (iko) jxp.q.a(obj14);
            long j4 = ijeVar2.i;
            return new jxx(ijeVar.i, kjlVar.b, kccVar2, kbwVar, kbxVar, null, str, kjlVar2.b, kgwVar, khtVar, kfuVar2, j4, khlVar, ikoVar2, 49184);
        }
    });
    public static final hyr j = new hyu(new fdat() { // from class: jxl
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            jyj jyjVar = (jyj) obj2;
            jxx jxxVar = jyjVar.a;
            hyr hyrVar = jxp.i;
            return fcva.f(jxp.a(jxxVar, hyrVar, hyaVar), jxp.a(jyjVar.b, hyrVar, hyaVar), jxp.a(jyjVar.c, hyrVar, hyaVar), jxp.a(jyjVar.d, hyrVar, hyaVar));
        }
    }, new fdap() { // from class: jvv
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            hyr hyrVar = jxp.i;
            jxx jxxVar = null;
            jxx jxxVar2 = (fdbq.f(obj2, false) || obj2 == null) ? null : (jxx) hyrVar.a(obj2);
            Object obj3 = list.get(1);
            jxx jxxVar3 = (fdbq.f(obj3, false) || obj3 == null) ? null : (jxx) hyrVar.a(obj3);
            Object obj4 = list.get(2);
            jxx jxxVar4 = (fdbq.f(obj4, false) || obj4 == null) ? null : (jxx) hyrVar.a(obj4);
            Object obj5 = list.get(3);
            if (!fdbq.f(obj5, false) && obj5 != null) {
                jxxVar = (jxx) hyrVar.a(obj5);
            }
            return new jyj(jxxVar2, jxxVar3, jxxVar4, jxxVar);
        }
    });
    public static final hyr k = new hyu(new fdat() { // from class: jvx
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Integer.valueOf(((khl) obj2).d);
        }
    }, new fdap() { // from class: jvy
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            return new khl(((Integer) obj).intValue());
        }
    });
    public static final hyr l = new hyu(new fdat() { // from class: jvz
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            kht khtVar = (kht) obj2;
            return fcva.f(Float.valueOf(khtVar.b), Float.valueOf(khtVar.c));
        }
    }, new fdap() { // from class: jwa
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            return new kht(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    public static final hyr m = new hyu(new fdat() { // from class: jwb
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            khu khuVar = (khu) obj2;
            kjl kjlVar = new kjl(khuVar.b);
            jxo jxoVar = jxp.v;
            return fcva.f(jxp.a(kjlVar, jxoVar, hyaVar), jxp.a(new kjl(khuVar.c), jxoVar, hyaVar));
        }
    }, new fdap() { // from class: jwc
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            long j2 = kjl.a;
            jxo jxoVar = jxp.v;
            fdbq.f(obj2, false);
            kjl kjlVar = obj2 != null ? (kjl) jxoVar.a(obj2) : null;
            kjlVar.getClass();
            Object obj3 = list.get(1);
            fdbq.f(obj3, false);
            kjl kjlVar2 = obj3 != null ? (kjl) jxoVar.a(obj3) : null;
            kjlVar2.getClass();
            return new khu(kjlVar.b, kjlVar2.b);
        }
    });
    public static final hyr n = new hyu(new fdat() { // from class: jwd
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Integer.valueOf(((kcc) obj2).i);
        }
    }, new fdap() { // from class: jwe
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            return new kcc(((Integer) obj).intValue());
        }
    });
    public static final hyr o = new hyu(new fdat() { // from class: jwg
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Float.valueOf(((kgw) obj2).a);
        }
    }, new fdap() { // from class: jwh
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            return new kgw(((Float) obj).floatValue());
        }
    });
    public static final hyr p = new hyu(new fdat() { // from class: jwj
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            long j2 = ((jyo) obj2).b;
            return fcva.f(Integer.valueOf(jyo.e(j2)), Integer.valueOf(jyo.a(j2)));
        }
    }, new fdap() { // from class: jwk
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            num.getClass();
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            num2.getClass();
            return new jyo(jyp.a(iIntValue, num2.intValue()));
        }
    });
    public static final hyr q = new hyu(new fdat() { // from class: jwl
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            iko ikoVar = (iko) obj2;
            return fcva.f(jxp.a(new ije(ikoVar.b), jxp.u, hyaVar), jxp.a(new ihs(ikoVar.c), jxp.w, hyaVar), Float.valueOf(ikoVar.d));
        }
    }, new fdap() { // from class: jwm
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            long j2 = ije.a;
            jxo jxoVar = jxp.u;
            fdbq.f(obj2, false);
            ije ijeVar = obj2 != null ? (ije) jxoVar.a(obj2) : null;
            ijeVar.getClass();
            Object obj3 = list.get(1);
            jxo jxoVar2 = jxp.w;
            fdbq.f(obj3, false);
            ihs ihsVar = obj3 != null ? (ihs) jxoVar2.a(obj3) : null;
            ihsVar.getClass();
            Object obj4 = list.get(2);
            Float f2 = obj4 != null ? (Float) obj4 : null;
            f2.getClass();
            return new iko(ijeVar.i, ihsVar.a, f2.floatValue());
        }
    });
    public static final jxo u = new jxo(jxm.a, jxn.a);
    public static final jxo v = new jxo(new fdat() { // from class: jwn
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            kjl kjlVar = (kjl) obj2;
            long j2 = kjl.a;
            if (kjlVar != null && kjl.e(kjlVar.b, j2)) {
                return false;
            }
            long j3 = kjlVar.b;
            return fcva.f(Float.valueOf(kjl.a(j3)), new kjn(kjl.c(j3)));
        }
    }, new fdap() { // from class: jwo
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            if (fdbq.f(obj, false)) {
                return new kjl(kjl.a);
            }
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f2 = obj2 != null ? (Float) obj2 : null;
            f2.getClass();
            float fFloatValue = f2.floatValue();
            Object obj3 = list.get(1);
            kjn kjnVar = obj3 != null ? (kjn) obj3 : null;
            kjnVar.getClass();
            return new kjl(kjm.d(kjnVar.a, fFloatValue));
        }
    });
    public static final jxo w = new jxo(new fdat() { // from class: jwp
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ihs ihsVar = (ihs) obj2;
            if (ihsVar != null && ihs.h(ihsVar.a, 9205357640488583168L)) {
                return false;
            }
            long j2 = ihsVar.a;
            return fcva.f(Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        }
    }, new fdap() { // from class: jwr
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            if (fdbq.f(obj, false)) {
                return new ihs(9205357640488583168L);
            }
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f2 = obj2 != null ? (Float) obj2 : null;
            f2.getClass();
            float fFloatValue = f2.floatValue();
            Object obj3 = list.get(1);
            (obj3 != null ? (Float) obj3 : null).getClass();
            return new ihs((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L));
        }
    });
    public static final hyr r = new hyu(new fdat() { // from class: jws
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            List list = ((kfu) obj2).b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(jxp.a((kfs) list.get(i2), jxp.s, hyaVar));
            }
            return arrayList;
        }
    }, new fdap() { // from class: jwt
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                hyr hyrVar = jxp.s;
                kfs kfsVar = null;
                if (!fdbq.f(obj2, false) && obj2 != null) {
                    kfsVar = (kfs) hyrVar.a(obj2);
                }
                kfsVar.getClass();
                arrayList.add(kfsVar);
            }
            return new kfu(arrayList);
        }
    });
    public static final hyr s = new hyu(new fdat() { // from class: jwv
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return ((kfs) obj2).a();
        }
    }, new fdap() { // from class: jww
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            String str = (String) obj;
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            if (fdbq.f(localeForLanguageTag.toLanguageTag(), "und")) {
                Log.e("Locale", a.a(str, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
            }
            return new kfs(localeForLanguageTag);
        }
    });
    public static final hyr t = new hyu(new fdat() { // from class: jwx
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            khi khiVar = (khi) obj2;
            return fcva.f(new khf(khiVar.b), new khh(khiVar.c), new khg(khiVar.d));
        }
    }, new fdap() { // from class: jwy
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            khf khfVar = obj2 != null ? (khf) obj2 : null;
            khfVar.getClass();
            Object obj3 = list.get(1);
            khh khhVar = obj3 != null ? (khh) obj3 : null;
            khhVar.getClass();
            Object obj4 = list.get(2);
            khg khgVar = obj4 != null ? (khg) obj4 : null;
            khgVar.getClass();
            return new khi(khfVar.c, khhVar.a, khgVar.a);
        }
    });

    public static final Object a(Object obj, hyr hyrVar, hya hyaVar) {
        Object objB;
        if (obj == null || (objB = hyrVar.b(hyaVar, obj)) == null) {
            return false;
        }
        return objB;
    }
}
