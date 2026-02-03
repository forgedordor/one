package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evul implements evuz {
    private final evuh a;
    private final evvs b;
    private final boolean c;
    private final evrs d;

    public evul(evvs evvsVar, evrs evrsVar, evuh evuhVar) {
        this.b = evvsVar;
        this.c = evuhVar instanceof evsi;
        this.d = evrsVar;
        this.a = evuhVar;
    }

    @Override // defpackage.evuz
    public final int a(Object obj) {
        evvt evvtVarK = evvu.k(obj);
        int iV = evvtVarK.e;
        if (iV == -1) {
            iV = 0;
            for (int i = 0; i < evvtVarK.b; i++) {
                int iA = evwj.a(evvtVarK.c[i]);
                evqs evqsVar = (evqs) evvtVarK.d[i];
                int iU = evrf.U(1);
                iV += iU + iU + evrf.V(2, iA) + evrf.B(3, evqsVar);
            }
            evvtVarK.e = iV;
        }
        if (!this.c) {
            return iV;
        }
        evry evryVarA = this.d.a(obj);
        evvf evvfVar = evryVarA.b;
        int i2 = evvfVar.b;
        int iC = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iC += evryVarA.c(evvfVar.d(i3));
        }
        Iterator it = evvfVar.a().iterator();
        while (it.hasNext()) {
            iC += evryVarA.c((Map.Entry) it.next());
        }
        return iV + iC;
    }

    @Override // defpackage.evuz
    public final int b(Object obj) {
        int iHashCode = evvu.k(obj).hashCode();
        return this.c ? (iHashCode * 53) + this.d.a(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.evuz
    public final Object e() {
        evuh evuhVar = this.a;
        return evuhVar instanceof evsn ? ((evsn) evuhVar).newMutableInstance() : evuhVar.newBuilderForType().buildPartial();
    }

    @Override // defpackage.evuz
    public final void g(Object obj) {
        this.b.h(obj);
        this.d.c(obj);
    }

    @Override // defpackage.evuz
    public final void h(Object obj, Object obj2) {
        evva.J(obj, obj2);
        if (this.c) {
            evva.n(this.d, obj, obj2);
        }
    }

    @Override // defpackage.evuz
    public final void i(Object obj, evut evutVar, evrr evrrVar) {
        boolean zP;
        evrs evrsVar = this.d;
        evvs evvsVar = this.b;
        Object objA = evvsVar.a(obj);
        evry evryVarB = evrsVar.b(obj);
        while (evutVar.c() != Integer.MAX_VALUE) {
            try {
                int i = ((evra) evutVar).b;
                if (i != evwj.a) {
                    if (evwj.b(i) == 2) {
                        evsl evslVarB = evrrVar.b(this.a, evwj.a(i));
                        if (evslVarB != null) {
                            evrsVar.d(evutVar, evslVarB, evrrVar, evryVarB);
                        } else {
                            zP = evvsVar.i(objA, evutVar, 0);
                        }
                    } else {
                        zP = evutVar.P();
                    }
                    if (!zP) {
                        break;
                    }
                } else {
                    evsl evslVarB2 = null;
                    evqs evqsVarO = null;
                    int i2 = 0;
                    while (evutVar.c() != Integer.MAX_VALUE) {
                        int i3 = ((evra) evutVar).b;
                        if (i3 == evwj.c) {
                            i2 = evutVar.i();
                            evslVarB2 = evrrVar.b(this.a, i2);
                        } else if (i3 == evwj.d) {
                            if (evslVarB2 != null) {
                                evrsVar.d(evutVar, evslVarB2, evrrVar, evryVarB);
                            } else {
                                evqsVarO = evutVar.o();
                            }
                        } else if (i3 == evwj.b || !evutVar.P()) {
                            break;
                        }
                    }
                    if (((evra) evutVar).b != evwj.b) {
                        throw new evtj("Protocol message end-group tag did not match expected tag.");
                    }
                    if (evqsVarO != null) {
                        if (evslVarB2 != null) {
                            evug evugVarNewBuilderForType = evslVarB2.c.newBuilderForType();
                            evqz evqzVarL = evqsVarO.l();
                            evugVarNewBuilderForType.mergeFrom(evqzVarL, evrrVar);
                            evryVarB.n(evslVarB2.d, evugVarNewBuilderForType.buildPartial());
                            evqzVarL.z(0);
                        } else {
                            evvsVar.f(objA, i2, evqsVarO);
                        }
                    }
                }
            } finally {
                evvu.l(obj, (evvt) objA);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[EDGE_INSN: B:61:0x00bb->B:33:0x00bb BREAK  A[LOOP:1: B:17:0x0065->B:64:0x0065], SYNTHETIC] */
    @Override // defpackage.evuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.evqf r15) throws defpackage.evtj {
        /*
            r10 = this;
            r0 = r11
            evsn r0 = (defpackage.evsn) r0
            evvt r1 = r0.unknownFields
            evvt r2 = defpackage.evvt.a
            if (r1 != r2) goto L10
            evvt r1 = new evvt
            r1.<init>()
            r0.unknownFields = r1
        L10:
            r6 = r1
            evsi r11 = (defpackage.evsi) r11
            evry r11 = r11.a()
            r0 = 0
            r1 = r0
        L19:
            if (r13 >= r14) goto Lc9
            int r4 = defpackage.evqg.t(r12, r13, r15)
            int r2 = r15.a
            int r13 = defpackage.evwj.a
            r3 = 2
            if (r2 == r13) goto L61
            int r13 = defpackage.evwj.b(r2)
            if (r13 != r3) goto L5a
            evrr r13 = r15.d
            evuh r1 = r10.a
            int r3 = defpackage.evwj.a(r2)
            evsl r1 = r13.b(r1, r3)
            if (r1 == 0) goto L52
            evuh r13 = r1.c
            evuq r2 = defpackage.evuq.a
            java.lang.Class r13 = r13.getClass()
            evuz r13 = r2.a(r13)
            int r13 = defpackage.evqg.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            evsk r3 = r1.d
            r11.n(r3, r2)
            goto L19
        L52:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.evqg.s(r2, r3, r4, r5, r6, r7)
            goto L19
        L5a:
            r5 = r14
            r7 = r15
            int r13 = defpackage.evqg.z(r2, r12, r4, r5, r7)
            goto L19
        L61:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L65:
            if (r4 >= r5) goto Lba
            int r15 = defpackage.evqg.t(r12, r4, r7)
            int r2 = r7.a
            int r4 = defpackage.evwj.a(r2)
            int r8 = defpackage.evwj.b(r2)
            if (r4 == r3) goto La0
            r9 = 3
            if (r4 == r9) goto L7b
            goto Lb1
        L7b:
            if (r1 == 0) goto L95
            evuh r2 = r1.c
            evuq r4 = defpackage.evuq.a
            java.lang.Class r2 = r2.getClass()
            evuz r2 = r4.a(r2)
            int r4 = defpackage.evqg.f(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.c
            evsk r2 = r1.d
            r11.n(r2, r15)
            goto L65
        L95:
            if (r8 != r3) goto Lb1
            int r4 = defpackage.evqg.c(r12, r15, r7)
            java.lang.Object r14 = r7.c
            evqs r14 = (defpackage.evqs) r14
            goto L65
        La0:
            if (r8 != 0) goto Lb1
            int r4 = defpackage.evqg.t(r12, r15, r7)
            int r13 = r7.a
            evrr r15 = r7.d
            evuh r1 = r10.a
            evsl r1 = r15.b(r1, r13)
            goto L65
        Lb1:
            int r4 = defpackage.evwj.b
            if (r2 == r4) goto Lbb
            int r4 = defpackage.evqg.z(r2, r12, r15, r5, r7)
            goto L65
        Lba:
            r15 = r4
        Lbb:
            if (r14 == 0) goto Lc4
            int r13 = defpackage.evwj.c(r13, r3)
            r6.f(r13, r14)
        Lc4:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L19
        Lc9:
            r5 = r14
            if (r13 != r5) goto Lcd
            return
        Lcd:
            evtj r11 = new evtj
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evul.j(java.lang.Object, byte[], int, int, evqf):void");
    }

    @Override // defpackage.evuz
    public final boolean k(Object obj, Object obj2) {
        if (!evvu.k(obj).equals(evvu.k(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        evrs evrsVar = this.d;
        return evrsVar.a(obj).equals(evrsVar.a(obj2));
    }

    @Override // defpackage.evuz
    public final boolean l(Object obj) {
        return this.d.a(obj).j();
    }

    @Override // defpackage.evuz
    public final void m(Object obj, evrg evrgVar) {
        Iterator itE = this.d.a(obj).e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            evsk evskVar = (evsk) entry.getKey();
            if (evskVar.a() != evwi.MESSAGE || evskVar.d || evskVar.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof evtm) {
                evrgVar.l(evskVar.b, ((evto) ((evtm) entry).a.getValue()).a());
            } else {
                evrgVar.l(evskVar.b, entry.getValue());
            }
        }
        evvt evvtVarK = evvu.k(obj);
        for (int i = 0; i < evvtVarK.b; i++) {
            evrgVar.l(evwj.a(evvtVarK.c[i]), evvtVarK.d[i]);
        }
    }
}
