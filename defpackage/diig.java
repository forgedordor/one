package defpackage;

import j$.util.List;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diig {
    /* JADX WARN: Removed duplicated region for block: B:102:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.Object r17, final defpackage.diih r18, defpackage.dap r19, defpackage.dar r20, java.lang.String r21, final defpackage.fdau r22, defpackage.hml r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diig.a(java.lang.Object, diih, dap, dar, java.lang.String, fdau, hml, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    public static final void b(final List list, final diih diihVar, final fdap fdapVar, final fdap fdapVar2, String str, final fdau fdauVar, hml hmlVar, final int i) {
        fdau fdauVar2;
        ?? arrayList;
        final String str2;
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(1852995754);
        int i2 = (i & 6) == 0 ? (true != hmlVarC.F(list) ? 2 : 4) | i : i;
        diih diihVar2 = diihVar;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(diihVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar2) ? 1024 : 2048;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            fdauVar2 = fdauVar;
            i3 |= true != hmlVarC.F(fdauVar2) ? 65536 : 131072;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            str2 = str;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new jfw();
                hmwVar.af(objS);
            }
            jfw jfwVar = (jfw) objS;
            hmwVar.ab();
            List list2 = (List) jfwVar.a;
            hmlVarC.v(-1682488105);
            int i4 = 0;
            if (list2 == null || list.size() >= list2.size()) {
                arrayList = list;
            } else if (list.isEmpty()) {
                int size = list2.size();
                arrayList = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(null);
                }
            } else {
                List listAq = fcva.aq(list2);
                final Set setAv = fcva.av(fcva.af(list2, fcva.av(list)));
                hmlVarC.v(5004770);
                boolean zF = hmlVarC.F(setAv);
                Object objS2 = hmwVar.S();
                if (zF || objS2 == obj) {
                    objS2 = new UnaryOperator() { // from class: diid
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            if (fcva.az(setAv, obj2)) {
                                return null;
                            }
                            return obj2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    };
                    hmwVar.af(objS2);
                }
                UnaryOperator unaryOperatorM181m = aky$$ExternalSyntheticApiModelOutline0.m181m(objS2);
                hmwVar.ab();
                List.EL.replaceAll(listAq, unaryOperatorM181m);
                arrayList = listAq;
            }
            hmwVar.ab();
            for (Object obj2 : arrayList) {
                int i6 = i4 + 1;
                Integer numValueOf = Integer.valueOf(i4);
                a(obj2, diihVar2, (dap) fdapVar.invoke(numValueOf), (dar) fdapVar2.invoke(numValueOf), "AnimatedListItemVisibilityAfterInitialComposition", fdauVar2, hmlVarC, 516208 & i3, 0);
                diihVar2 = diihVar;
                fdauVar2 = fdauVar;
                i4 = i6;
            }
            jfwVar.a = list;
            str2 = "AnimatedListItemVisibilityAfterInitialComposition";
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diie
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    java.util.List list3 = list;
                    diih diihVar3 = diihVar;
                    fdap fdapVar3 = fdapVar;
                    fdap fdapVar4 = fdapVar2;
                    String str3 = str2;
                    diig.b(list3, diihVar3, fdapVar3, fdapVar4, str3, fdauVar, (hml) obj3, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
