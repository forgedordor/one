package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irq extends irr {
    public final icr a;
    private ivy g;
    private irs h;
    private boolean i;
    public final itq b = new itq();
    private final ctz f = new ctz(2);
    public boolean c = true;
    private boolean j = true;

    public irq(icr icrVar) {
        this.a = icrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [hum] */
    public final void a() {
        hum humVar = this.d;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((irq) objArr[i2]).a();
        }
        jbi jbiVarA = this.a;
        ?? humVar2 = 0;
        while (jbiVarA != 0) {
            if (jbiVarA instanceof jfv) {
                ((jfv) jbiVarA).dV();
            } else if ((jbiVarA.t & 16) != 0 && (jbiVarA instanceof jbi)) {
                icr icrVar = jbiVarA.E;
                int i3 = 0;
                jbiVarA = jbiVarA;
                humVar2 = humVar2;
                while (icrVar != null) {
                    if ((icrVar.t & 16) != 0) {
                        i3++;
                        humVar2 = humVar2;
                        if (i3 == 1) {
                            jbiVarA = icrVar;
                        } else {
                            if (humVar2 == 0) {
                                humVar2 = new hum(new icr[16]);
                            }
                            if (jbiVarA != 0) {
                                humVar2.n(jbiVarA);
                            }
                            humVar2.n(icrVar);
                            jbiVarA = 0;
                        }
                    }
                    icrVar = icrVar.w;
                    jbiVarA = jbiVarA;
                    humVar2 = humVar2;
                }
                if (i3 != 1) {
                }
            }
            jbiVarA = jbg.a(humVar2);
        }
    }

    public final void b(long j, cuu cuuVar) {
        itq itqVar = this.b;
        if (itqVar.a(j) && !cuuVar.n(this)) {
            itqVar.c(j);
            this.f.i(j);
        }
        hum humVar = this.d;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((irq) objArr[i2]).b(j, cuuVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ea  */
    /* JADX WARN: Type inference failed for: r5v0, types: [icr] */
    /* JADX WARN: Type inference failed for: r5v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [icr] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.irr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.ctz r51, defpackage.ivy r52, defpackage.irn r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irq.c(ctz, ivy, irn, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.irn r15) {
        /*
            r14 = this;
            ctz r0 = r14.f
            boolean r1 = r0.k()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto Ld
        La:
            r9 = r3
            goto L84
        Ld:
            icr r1 = r14.a
            boolean r4 = r1.C
            if (r4 != 0) goto L14
            goto La
        L14:
            irs r4 = r14.h
            r4.getClass()
            ivy r5 = r14.g
            r5.getClass()
            long r5 = r5.g()
            r7 = r1
            r8 = r2
        L24:
            r9 = 1
            if (r7 == 0) goto L6d
            boolean r10 = r7 instanceof defpackage.jfv
            if (r10 == 0) goto L33
            jfv r7 = (defpackage.jfv) r7
            iru r9 = defpackage.iru.c
            r7.dW(r4, r9, r5)
            goto L68
        L33:
            int r10 = r7.t
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L68
            boolean r10 = r7 instanceof defpackage.jbi
            if (r10 == 0) goto L68
            r10 = r7
            jbi r10 = (defpackage.jbi) r10
            icr r10 = r10.E
            r12 = r3
        L44:
            if (r10 == 0) goto L66
            int r13 = r10.t
            r13 = r13 & r11
            if (r13 == 0) goto L63
            int r12 = r12 + 1
            if (r12 != r9) goto L51
            r7 = r10
            goto L63
        L51:
            if (r8 != 0) goto L5a
            hum r8 = new hum
            icr[] r13 = new defpackage.icr[r11]
            r8.<init>(r13)
        L5a:
            if (r7 == 0) goto L5f
            r8.n(r7)
        L5f:
            r8.n(r10)
            r7 = r2
        L63:
            icr r10 = r10.w
            goto L44
        L66:
            if (r12 == r9) goto L24
        L68:
            icr r7 = defpackage.jbg.a(r8)
            goto L24
        L6d:
            boolean r1 = r1.C
            if (r1 == 0) goto L84
            hum r1 = r14.d
            java.lang.Object[] r4 = r1.a
            int r1 = r1.b
            r5 = r3
        L78:
            if (r5 >= r1) goto L84
            r6 = r4[r5]
            irq r6 = (defpackage.irq) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L78
        L84:
            super.f()
            irs r1 = r14.h
            if (r1 != 0) goto L8c
            goto Lc2
        L8c:
            boolean r4 = r14.c
            r14.i = r4
            java.util.List r4 = r1.a
            int r5 = r4.size()
            r6 = r3
        L97:
            if (r6 >= r5) goto Lb7
            java.lang.Object r7 = r4.get(r6)
            ise r7 = (defpackage.ise) r7
            boolean r8 = r7.d
            long r10 = r7.a
            boolean r7 = r15.a(r10)
            boolean r12 = r14.c
            if (r8 != 0) goto Lb4
            if (r7 == 0) goto Laf
            if (r12 != 0) goto Lb4
        Laf:
            itq r7 = r14.b
            r7.c(r10)
        Lb4:
            int r6 = r6 + 1
            goto L97
        Lb7:
            r14.c = r3
            int r15 = r1.e
            r1 = 5
            boolean r15 = defpackage.irw.a(r15, r1)
            r14.j = r15
        Lc2:
            r0.g()
            r14.g = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irq.d(irn):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [hum] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [hum] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [hum] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(irn irnVar, boolean z) {
        if (this.f.k()) {
            return false;
        }
        jbi jbiVarA = this.a;
        if (!jbiVarA.C) {
            return false;
        }
        irs irsVar = this.h;
        irsVar.getClass();
        ivy ivyVar = this.g;
        ivyVar.getClass();
        long jG = ivyVar.g();
        jbi jbiVarA2 = jbiVarA;
        ?? humVar = 0;
        while (jbiVarA2 != 0) {
            if (jbiVarA2 instanceof jfv) {
                ((jfv) jbiVarA2).dW(irsVar, iru.a, jG);
            } else if ((jbiVarA2.t & 16) != 0 && (jbiVarA2 instanceof jbi)) {
                icr icrVar = jbiVarA2.E;
                int i = 0;
                jbiVarA2 = jbiVarA2;
                humVar = humVar;
                while (icrVar != null) {
                    if ((icrVar.t & 16) != 0) {
                        i++;
                        humVar = humVar;
                        if (i == 1) {
                            jbiVarA2 = icrVar;
                        } else {
                            if (humVar == 0) {
                                humVar = new hum(new icr[16]);
                            }
                            if (jbiVarA2 != 0) {
                                humVar.n(jbiVarA2);
                            }
                            humVar.n(icrVar);
                            jbiVarA2 = 0;
                        }
                    }
                    icrVar = icrVar.w;
                    jbiVarA2 = jbiVarA2;
                    humVar = humVar;
                }
                if (i != 1) {
                }
            }
            jbiVarA2 = jbg.a(humVar);
        }
        if (jbiVarA.C) {
            hum humVar2 = this.d;
            Object[] objArr = humVar2.a;
            int i2 = humVar2.b;
            for (int i3 = 0; i3 < i2; i3++) {
                irq irqVar = (irq) objArr[i3];
                this.g.getClass();
                irqVar.e(irnVar, z);
            }
        }
        if (jbiVarA.C) {
            ?? humVar3 = 0;
            while (jbiVarA != 0) {
                if (jbiVarA instanceof jfv) {
                    ((jfv) jbiVarA).dW(irsVar, iru.b, jG);
                } else if ((jbiVarA.t & 16) != 0 && (jbiVarA instanceof jbi)) {
                    icr icrVar2 = jbiVarA.E;
                    int i4 = 0;
                    jbiVarA = jbiVarA;
                    humVar3 = humVar3;
                    while (icrVar2 != null) {
                        if ((icrVar2.t & 16) != 0) {
                            i4++;
                            humVar3 = humVar3;
                            if (i4 == 1) {
                                jbiVarA = icrVar2;
                            } else {
                                if (humVar3 == 0) {
                                    humVar3 = new hum(new icr[16]);
                                }
                                if (jbiVarA != 0) {
                                    humVar3.n(jbiVarA);
                                }
                                humVar3.n(icrVar2);
                                jbiVarA = 0;
                            }
                        }
                        icrVar2 = icrVar2.w;
                        jbiVarA = jbiVarA;
                        humVar3 = humVar3;
                    }
                    if (i4 != 1) {
                    }
                }
                jbiVarA = jbg.a(humVar3);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.b + ')';
    }
}
