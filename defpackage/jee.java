package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jee {
    public final jcr a;
    public final jed b;
    public final jbx c;
    public jer d;
    public final icr e;
    public icr f;
    public hum g;
    public hum h;
    public final hum i;
    private jec j;

    public jee(jcr jcrVar) {
        this.a = jcrVar;
        jed jedVar = new jed();
        jedVar.u = -1;
        this.b = jedVar;
        jbx jbxVar = new jbx(jcrVar);
        this.c = jbxVar;
        this.d = jbxVar;
        jgc jgcVar = jbxVar.f;
        this.e = jgcVar;
        this.f = jgcVar;
        this.i = new hum(new ics[16]);
    }

    public static final icr k(icq icqVar, icr icrVar) {
        icr japVar;
        if (icqVar instanceof jdy) {
            japVar = ((jdy) icqVar).d();
            japVar.t = jet.c(japVar);
        } else {
            japVar = new jap(icqVar);
        }
        if (japVar.C) {
            itw.d("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        japVar.z = true;
        icr icrVar2 = icrVar.w;
        if (icrVar2 != null) {
            icrVar2.v = japVar;
            japVar.w = icrVar2;
        }
        icrVar.w = japVar;
        japVar.v = icrVar;
        return japVar;
    }

    public static final icr l(icr icrVar) {
        if (icrVar.C) {
            jet.f(icrVar);
            icrVar.J();
            icrVar.G();
        }
        icr icrVar2 = icrVar.w;
        icr icrVar3 = icrVar.v;
        if (icrVar2 != null) {
            icrVar2.v = icrVar3;
            icrVar.w = null;
        }
        if (icrVar3 != null) {
            icrVar3.w = icrVar2;
            icrVar.v = null;
        }
        icrVar3.getClass();
        return icrVar3;
    }

    public static final void m(icq icqVar, icq icqVar2, icr icrVar) {
        if ((icqVar instanceof jdy) && (icqVar2 instanceof jdy)) {
            icrVar.getClass();
            ((jdy) icqVar2).e(icrVar);
            if (icrVar.C) {
                jet.g(icrVar);
                return;
            } else {
                icrVar.A = true;
                return;
            }
        }
        if (!(icrVar instanceof jap)) {
            itw.d("Unknown Modifier.Node type");
            return;
        }
        jap japVar = (jap) icrVar;
        if (japVar.C) {
            japVar.x();
        }
        japVar.a = icqVar2;
        japVar.t = jet.a(icqVar2);
        if (japVar.C) {
            japVar.w(false);
        }
        if (icrVar.C) {
            jet.g(icrVar);
        } else {
            icrVar.A = true;
        }
    }

    public final int a() {
        return this.f.u;
    }

    public final void b() {
        for (icr icrVar = this.f; icrVar != null; icrVar = icrVar.w) {
            icrVar.F();
        }
    }

    public final void c() {
        for (icr icrVar = this.e; icrVar != null; icrVar = icrVar.v) {
            if (icrVar.C) {
                icrVar.G();
            }
        }
    }

    public final void d(icr icrVar, jer jerVar) {
        for (icr icrVar2 = icrVar.v; icrVar2 != null; icrVar2 = icrVar2.v) {
            if (icrVar2 == this.b) {
                jcr jcrVarS = this.a.s();
                jerVar.x = jcrVarS != null ? jcrVarS.w() : null;
                this.d = jerVar;
                return;
            } else {
                if ((icrVar2.t & 2) != 0) {
                    return;
                }
                icrVar2.L(jerVar);
            }
        }
    }

    public final void e() {
        jbx jbxVar;
        jer jerVar = this.d;
        while (true) {
            jbxVar = this.c;
            if (jerVar == jbxVar) {
                break;
            }
            jerVar.an();
            jerVar = jerVar.w;
            jerVar.getClass();
        }
        jbxVar.an();
        for (icr icrVar = this.f; icrVar != null; icrVar = icrVar.w) {
            icrVar.I();
            if (icrVar.z) {
                jet.d(icrVar);
            }
            if (icrVar.A) {
                jet.g(icrVar);
            }
            icrVar.z = false;
            icrVar.A = false;
        }
    }

    public final void f() {
        for (icr icrVar = this.e; icrVar != null; icrVar = icrVar.v) {
            if (icrVar.C) {
                icrVar.J();
            }
        }
        jer jerVar = this.c;
        jer jerVar2 = this.d;
        while (jerVar != jerVar2) {
            jerVar.ap();
            jerVar = jerVar.x;
            jerVar.getClass();
        }
        jerVar2.ap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        r1 = r12;
        r20 = r13;
        r13 = r15;
        r12 = r11;
        r11 = r14;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        if (r15 > r5) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r15 == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r14 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r15 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        if (defpackage.jav.a(r3, r15 + 1) >= defpackage.jav.a(r3, r14)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
    
        r12 = defpackage.jav.a(r3, r14);
        r13 = r12 - 1;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        r13 = defpackage.jav.a(r3, r15 + 1);
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r12 = r1 - ((r19 - r13) - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r5 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        r21 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r21 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        if (r13 != r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        r22 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0177, code lost:
    
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        if (r13 <= r6) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (r12 <= r11) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
    
        r24 = r12;
        r12 = r13 - 1;
        r25 = r14;
        r14 = r24 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        if (r0.a(r12, r14) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r13 = r12;
        r12 = r14;
        r14 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r24 = r12;
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r12 = (r18 & 1) ^ 1;
        defpackage.jav.b(r3, r15, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        if (r12 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
    
        r12 = r18 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        if (r12 < r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        if (r12 > r5) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
    
        if (defpackage.jav.a(r10, r12) < r13) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
    
        r17 = r32;
        r5 = r19;
        r9 = 3;
        defpackage.jeb.a(r13, r24, r25, r12 + (r21 & r22), true, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0217, code lost:
    
        r12 = r32;
        r13 = r19;
        r15 = r15 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        r5 = r5 + 1;
        r9 = r31;
        r14 = r11;
        r11 = r12;
        r15 = r13;
        r13 = r20;
        r12 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r28, defpackage.hum r29, defpackage.hum r30, defpackage.icr r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jee.g(int, hum, hum, icr, boolean):void");
    }

    public final void h() {
        int i = 0;
        for (icr icrVar = this.e.v; icrVar != null && icrVar != this.b; icrVar = icrVar.v) {
            i |= icrVar.t;
            icrVar.u = i;
        }
    }

    public final void i() {
        jer jerVar;
        jer jerVar2 = this.c;
        for (icr icrVar = this.e.v; icrVar != null; icrVar = icrVar.v) {
            jcd jcdVarC = jbg.c(icrVar);
            if (jcdVarC != null) {
                jer jerVar3 = icrVar.y;
                if (jerVar3 != null) {
                    jcg jcgVar = (jcg) jerVar3;
                    jcd jcdVar = jcgVar.f;
                    jcgVar.H(jcdVarC);
                    jerVar = jcgVar;
                    if (jcdVar != icrVar) {
                        jcgVar.aq();
                        jerVar = jcgVar;
                    }
                } else {
                    jer jcgVar2 = new jcg(this.a, jcdVarC);
                    icrVar.L(jcgVar2);
                    jerVar = jcgVar2;
                }
                jerVar2.x = jerVar;
                jerVar.w = jerVar2;
                jerVar2 = jerVar;
            } else {
                icrVar.L(jerVar2);
            }
        }
        jcr jcrVarS = this.a.s();
        jerVar2.x = jcrVarS != null ? jcrVarS.w() : null;
        this.d = jerVar2;
    }

    public final boolean j(int i) {
        return (i & a()) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        icr icrVar = this.f;
        icr icrVar2 = this.e;
        if (icrVar == icrVar2) {
            sb.append("]");
        } else {
            while (true) {
                if (icrVar == null || icrVar == icrVar2) {
                    break;
                }
                sb.append(icrVar.toString());
                if (icrVar.w == icrVar2) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                icrVar = icrVar.w;
            }
        }
        return sb.toString();
    }
}
