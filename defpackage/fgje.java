package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgje implements fglr, fgmc {
    public fgme a;
    private final List b;
    private final Map c;
    private final List d;
    private final BitSet e;
    private final BitSet f;
    private Map g;
    private boolean h;
    private int i;
    private fgij j;
    private fgih k;
    private final fgiw l;

    public fgje(fgiw fgiwVar) {
        this.l = fgiwVar;
        ArrayList arrayList = new ArrayList(fgiwVar.a);
        arrayList.add(new fgjs());
        arrayList.add(new fgju());
        arrayList.add(new fgjy());
        arrayList.add(new fgjq());
        arrayList.add(new fgka());
        this.b = arrayList;
        List list = fgiwVar.b;
        HashMap map = new HashMap();
        e(fgix.a(new Object[]{new fgjp(), new fgke()}), map);
        e(list, map);
        this.c = map;
        ArrayList arrayList2 = new ArrayList(fgiwVar.c);
        arrayList2.add(new fgjw());
        this.d = arrayList2;
        Set set = fgiwVar.d;
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f = bitSet;
        Set setKeySet = this.c.keySet();
        List list2 = this.b;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((fgmb) it3.next()).a().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.e = bitSet2;
    }

    private final fgle b() {
        char cA;
        fgmd fgmdVarF = this.a.f();
        this.a.h();
        while (true) {
            cA = this.a.a();
            if (cA == 0 || this.e.get(cA)) {
                break;
            }
            this.a.h();
        }
        fgme fgmeVar = this.a;
        fglz fglzVarE = fgmeVar.e(fgmdVarF, fgmeVar.f());
        String strA = fglzVarE.a();
        int i = -1;
        if (cA == '\n') {
            int length = strA.length() - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (strA.charAt(length) != ' ') {
                    i = length;
                    break;
                }
                length--;
            }
            int i2 = i + 1;
            this.i = strA.length() - i2;
            strA = strA.substring(0, i2);
        } else if (cA == 0) {
            strA = strA.substring(0, fgmp.d(strA, strA.length() - 1, 0) + 1);
        }
        fglo fgloVar = new fglo(strA);
        fgloVar.j(fglzVarE.b());
        return fgloVar;
    }

    private final void c(fgih fgihVar) {
        fgih fgihVar2 = this.k;
        if (fgihVar2 != null) {
            fgihVar2.i = true;
        }
        this.k = fgihVar;
    }

    private static void d(char c, fgmm fgmmVar, Map map) {
        if (((fgmm) map.put(Character.valueOf(c), fgmmVar)) != null) {
            throw new IllegalArgumentException(a.K(c, "Delimiter processor conflict with delimiter char '", "'"));
        }
    }

    private static void e(Iterable iterable, Map map) {
        fgjm fgjmVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fgmm fgmmVar = (fgmm) it.next();
            char cB = fgmmVar.b();
            char cA = fgmmVar.a();
            if (cB == cA) {
                Character chValueOf = Character.valueOf(cB);
                fgmm fgmmVar2 = (fgmm) map.get(chValueOf);
                if (fgmmVar2 == null || fgmmVar2.b() != fgmmVar2.a()) {
                    d(cB, fgmmVar, map);
                } else {
                    if (fgmmVar2 instanceof fgjm) {
                        fgjmVar = (fgjm) fgmmVar2;
                    } else {
                        fgjm fgjmVar2 = new fgjm(cB);
                        fgjmVar2.e(fgmmVar2);
                        fgjmVar = fgjmVar2;
                    }
                    fgjmVar.e(fgmmVar);
                    map.put(chValueOf, fgjmVar);
                }
            } else {
                d(cB, fgmmVar, map);
                d(cA, fgmmVar, map);
            }
        }
    }

    private final void f(fgle fgleVar) {
        fgle fgleVar2 = fgleVar.f;
        if (fgleVar2 != null) {
            fgle fgleVar3 = fgleVar.g;
            int length = 0;
            fglo fgloVar = null;
            fglo fgloVar2 = null;
            while (fgleVar2 != null) {
                if (fgleVar2 instanceof fglo) {
                    fgloVar2 = fgleVar2;
                    if (fgloVar == null) {
                        fgloVar = fgloVar2;
                    }
                    length += fgloVar2.a.length();
                } else {
                    g(fgloVar, fgloVar2, length);
                    f(fgleVar2);
                    length = 0;
                    fgloVar = null;
                    fgloVar2 = null;
                }
                if (fgleVar2 == fgleVar3) {
                    break;
                } else {
                    fgleVar2 = fgleVar2.i;
                }
            }
            g(fgloVar, fgloVar2, length);
        }
    }

    private final void g(fglo fgloVar, fglo fgloVar2, int i) {
        fglm fglmVar;
        if (fgloVar == null || fgloVar2 == null || fgloVar == fgloVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(fgloVar.a);
        if (this.h) {
            fglmVar = new fglm();
            fglmVar.b(fgloVar.f());
        } else {
            fglmVar = null;
        }
        fgle fgleVar = fgloVar.i;
        fgle fgleVar2 = fgloVar2.i;
        while (fgleVar != fgleVar2) {
            sb.append(((fglo) fgleVar).a);
            if (fglmVar != null) {
                fglmVar.b(fgleVar.f());
            }
            fgle fgleVar3 = fgleVar.i;
            fgleVar.k();
            fgleVar = fgleVar3;
        }
        fgloVar.a = sb.toString();
        if (fglmVar != null) {
            fgloVar.j(fglmVar.a());
        }
    }

    private final void h(fgij fgijVar) {
        boolean z;
        HashMap map = new HashMap();
        fgij fgijVar2 = this.j;
        while (fgijVar2 != null) {
            fgij fgijVar3 = fgijVar2.f;
            if (fgijVar3 == fgijVar) {
                break;
            } else {
                fgijVar2 = fgijVar3;
            }
        }
        while (fgijVar2 != null) {
            Map map2 = this.c;
            char c = fgijVar2.b;
            fgmm fgmmVar = (fgmm) map2.get(Character.valueOf(c));
            if (!fgijVar2.e || fgmmVar == null) {
                fgijVar2 = fgijVar2.g;
            } else {
                char cB = fgmmVar.b();
                fgij fgijVar4 = fgijVar2.f;
                boolean z2 = false;
                int iD = 0;
                while (fgijVar4 != null && fgijVar4 != fgijVar && fgijVar4 != map.get(Character.valueOf(c))) {
                    if (fgijVar4.d && fgijVar4.b == cB) {
                        iD = fgmmVar.d(fgijVar4, fgijVar2);
                        z2 = true;
                        if (iD > 0) {
                            z = true;
                            break;
                        }
                    }
                    fgijVar4 = fgijVar4.f;
                }
                z = z2;
                z2 = false;
                if (z2) {
                    for (int i = 0; i < iD; i++) {
                        ((fglo) fgijVar4.a.remove(r3.size() - 1)).k();
                    }
                    for (int i2 = 0; i2 < iD; i2++) {
                        ((fglo) fgijVar2.a.remove(0)).k();
                    }
                    fgij fgijVar5 = fgijVar2.f;
                    while (fgijVar5 != null && fgijVar5 != fgijVar4) {
                        fgij fgijVar6 = fgijVar5.f;
                        i(fgijVar5);
                        fgijVar5 = fgijVar6;
                    }
                    if (fgijVar4.a() == 0) {
                        i(fgijVar4);
                    }
                    if (fgijVar2.a() == 0) {
                        fgij fgijVar7 = fgijVar2.g;
                        i(fgijVar2);
                        fgijVar2 = fgijVar7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), fgijVar2.f);
                        if (!fgijVar2.d) {
                            i(fgijVar2);
                        }
                    }
                    fgijVar2 = fgijVar2.g;
                }
            }
        }
        while (true) {
            fgij fgijVar8 = this.j;
            if (fgijVar8 == null || fgijVar8 == fgijVar) {
                return;
            } else {
                i(fgijVar8);
            }
        }
    }

    private final void i(fgij fgijVar) {
        fgij fgijVar2 = fgijVar.f;
        if (fgijVar2 != null) {
            fgijVar2.g = fgijVar.g;
        }
        fgij fgijVar3 = fgijVar.g;
        if (fgijVar3 == null) {
            this.j = fgijVar2;
        } else {
            fgijVar3.f = fgijVar2;
        }
    }

    private final void j() {
        this.k = this.k.f;
    }

    private static final fglo k(fglz fglzVar) {
        fglo fgloVar = new fglo(fglzVar.a());
        fgloVar.j(fglzVar.b());
        return fgloVar;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0280 A[PHI: r7
      0x0280: PHI (r7v54 boolean) = (r7v49 boolean), (r7v55 boolean), (r7v55 boolean) binds: [B:135:0x027e, B:125:0x0268, B:126:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0282 A[PHI: r7
      0x0282: PHI (r7v52 boolean) = (r7v49 boolean), (r7v49 boolean), (r7v55 boolean), (r7v55 boolean) binds: [B:133:0x0278, B:135:0x027e, B:124:0x0266, B:126:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0367 A[PHI: r7
      0x0367: PHI (r7v6 char) = (r7v5 char), (r7v9 char), (r7v10 char) binds: [B:173:0x035d, B:175:0x0361, B:178:0x0366] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [int] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v61, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v70, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v76, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [fgjc] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v79 */
    @Override // defpackage.fglr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.fglz r20, defpackage.fgle r21) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgje.a(fglz, fgle):void");
    }
}
