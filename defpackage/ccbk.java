package defpackage;

import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccbk implements ccaq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/core/ZinniaMlsRcsMessageProcessor");
    public final fcyh b;
    private final dqsn c;
    private final cbun d;
    private final Map e;

    public ccbk(fcyh fcyhVar, dqsn dqsnVar, cbun cbunVar, Map map) {
        fcyhVar.getClass();
        dqsnVar.getClass();
        cbunVar.getClass();
        this.b = fcyhVar;
        this.c = dqsnVar;
        this.d = cbunVar;
        this.e = map;
    }

    private final ccbo k(epun epunVar) {
        ccbo ccboVar;
        int i = epunVar.c;
        if (i == 2) {
            ccboVar = (ccbo) this.e.get(((eprr) epunVar.d).getClass());
        } else if (i == 3) {
            ccboVar = (ccbo) this.e.get(((epte) epunVar.d).getClass());
        } else if (i == 4) {
            ccboVar = (ccbo) this.e.get(((epuc) epunVar.d).getClass());
        } else if (i == 5) {
            ccboVar = (ccbo) this.e.get(((eput) epunVar.d).getClass());
        } else if (i == 6) {
            ccboVar = (ccbo) this.e.get(((epuf) epunVar.d).getClass());
        } else if (i == 7) {
            ccboVar = (ccbo) this.e.get(((epsn) epunVar.d).getClass());
        } else {
            if (i != 8) {
                throw new IllegalStateException("Invalid process message result");
            }
            ccboVar = (ccbo) this.e.get(((epty) epunVar.d).getClass());
        }
        if (ccboVar != null) {
            return ccboVar;
        }
        throw new IllegalStateException("Cannot find zinnia result processor.");
    }

    private static final void l(cbwd cbwdVar, String str, ccbo ccboVar) {
        if (ccboVar.b()) {
            return;
        }
        final aubq aubqVar = (cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).h;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubqVar.getClass();
        final basd basdVarA = basd.a((cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).j);
        String[] strArr = ccmf.a;
        ccly cclyVar = new ccly();
        cclyVar.f("deleteZinniaProcessedResult");
        cclyVar.b = new ccmd((ccme) new Function() { // from class: ccbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ccme ccmeVar = (ccme) obj;
                ccmeVar.c(aubqVar.d);
                ccmeVar.b(basdVarA);
                ccmeVar.d(ccnk.b);
                return ccmeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new ccme()));
        int iD = cclyVar.d();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/core/ZinniaMlsRcsMessageProcessor", "removeCacheEntry", 410, "ZinniaMlsRcsMessageProcessor.kt")).B("Cached MLS result (%s) is removed: %d.", str, iD);
    }

    @Override // defpackage.ccaq
    public final Object a(ccpl ccplVar, cbwd cbwdVar, epun epunVar, fcxy fcxyVar) {
        char c;
        String str;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/core/ZinniaMlsRcsMessageProcessor", "postProcess", 84, "ZinniaMlsRcsMessageProcessor.kt");
        String str2 = cbwdVar.e;
        int i = epunVar.c;
        if (i == 0) {
            c = 1;
        } else if (i == 10) {
            c = 11;
        } else if (i != 13) {
            switch (i) {
                case 2:
                    c = 3;
                    break;
                case 3:
                    c = 4;
                    break;
                case 4:
                    c = 5;
                    break;
                case 5:
                    c = 6;
                    break;
                case 6:
                    c = 7;
                    break;
                case 7:
                    c = '\b';
                    break;
                case 8:
                    c = '\t';
                    break;
                default:
                    c = 0;
                    break;
            }
        } else {
            c = 14;
        }
        if (c == 1) {
            str = "INNER_NOT_SET";
        } else if (c == 11) {
            str = "SIGNED_MESSAGE";
        } else if (c != 14) {
            switch (c) {
                case 3:
                    str = "DECRYPTED_MESSAGE";
                    break;
                case 4:
                    str = "JOINED_GROUP";
                    break;
                case 5:
                    str = "MESSAGE_TO_SEND";
                    break;
                case 6:
                    str = "RECEIVED_COMMIT";
                    break;
                case 7:
                    str = "PENDING_MESSAGE";
                    break;
                case '\b':
                    str = "FAILED_MESSAGE";
                    break;
                case '\t':
                    str = "NO_OP";
                    break;
                default:
                    str = "null";
                    break;
            }
        } else {
            str = "GROUP_SUBJECT_ICON_KEYS";
        }
        if (c == 0) {
            throw null;
        }
        ekrdVar.D("Postprocessing MLS message for contextId: %s, result contains type: %s", str2, str);
        return f(cbun.a(this.d, ccplVar, false, 6), cbwdVar, epunVar, k(epunVar), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r14 != r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cbwd r11, defpackage.cbum r12, defpackage.evqs r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.b(cbwd, cbum, evqs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008b -> B:21:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cbum r11, java.util.List r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ccbb
            if (r0 == 0) goto L13
            r0 = r13
            ccbb r0 = (defpackage.ccbb) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ccbb r0 = new ccbb
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.e
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r11 = r0.d
            java.lang.String r12 = r0.i
            cbwd r2 = r0.h
            java.lang.Object r4 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r13)
            r9 = r0
            r0 = r13
            r13 = r5
            r5 = r6
            goto L8f
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            defpackage.fctl.b(r13)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
            r5 = r11
            r9 = r0
        L4d:
            boolean r11 = r12.hasNext()
            if (r11 == 0) goto L99
            java.lang.Object r11 = r12.next()
            r7 = r11
            epun r7 = (defpackage.epun) r7
            evqs r11 = r7.e
            evrr r0 = defpackage.evrr.a()
            cbwd r2 = defpackage.cbwd.a
            evsn r11 = defpackage.evsn.parseFrom(r2, r11, r0)
            r6 = r11
            cbwd r6 = (defpackage.cbwd) r6
            r6.getClass()
            java.lang.String r11 = r6.e
            r11.getClass()
            ccbo r8 = r10.k(r7)
            r9.a = r5
            r9.b = r13
            r9.c = r12
            r9.h = r6
            r9.i = r11
            r9.d = r8
            r9.g = r3
            r4 = r10
            java.lang.Object r0 = r4.f(r5, r6, r7, r8, r9)
            if (r0 != r1) goto L8b
            return r1
        L8b:
            r4 = r12
            r2 = r6
            r12 = r11
            r11 = r8
        L8f:
            ccan r0 = (defpackage.ccan) r0
            r13.put(r12, r0)
            l(r2, r12, r11)
            r12 = r4
            goto L4d
        L99:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.c(cbum, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        if (r4 == r9) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cbwd r19, defpackage.cbum r20, defpackage.eyyc r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.d(cbwd, cbum, eyyc, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ccpl r6, defpackage.cbwd r7, defpackage.epuq r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.ccbd
            if (r0 == 0) goto L13
            r0 = r9
            ccbd r0 = (defpackage.ccbd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccbd r0 = new ccbd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cbwd r7 = r0.d
            defpackage.fctl.b(r9)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r9)
            cbun r9 = r5.d
            r2 = 0
            r4 = 6
            cbum r6 = defpackage.cbun.a(r9, r6, r2, r4)
            evtg r8 = r8.b
            r8.getClass()
            r0.d = r7
            r0.c = r3
            java.lang.Object r9 = r5.c(r6, r8, r0)
            if (r9 == r1) goto L5f
        L4b:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r6 = r7.e
            java.lang.Object r6 = r9.get(r6)
            ccan r6 = (defpackage.ccan) r6
            if (r6 != 0) goto L5e
            ccag r6 = new ccag
            ccam r8 = defpackage.ccam.a
            r6.<init>(r7, r8)
        L5e:
            return r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.e(ccpl, cbwd, epuq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (r2 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r2 != r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        if (r2 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015c, code lost:
    
        if (r2 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cbum r17, defpackage.cbwd r18, defpackage.epun r19, defpackage.ccbo r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.f(cbum, cbwd, epun, ccbo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cbum r8, defpackage.cbwd r9, byte[] r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.ccbg
            if (r0 == 0) goto L13
            r0 = r11
            ccbg r0 = (defpackage.ccbg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ccbg r0 = new ccbg
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.a
            cbwd r9 = r6.e
            defpackage.fctl.b(r11)
            goto L5d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.fctl.b(r11)
            evrr r11 = defpackage.evrr.a()
            epun r1 = defpackage.epun.a
            evsn r10 = defpackage.evsn.parseFrom(r1, r10, r11)
            r4 = r10
            epun r4 = (defpackage.epun) r4
            r4.getClass()
            ccbo r5 = r7.k(r4)
            r6.e = r9
            r6.a = r5
            r6.d = r2
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.f(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L5b
            return r0
        L5b:
            r9 = r3
            r8 = r5
        L5d:
            ccan r11 = (defpackage.ccan) r11
            java.lang.String r10 = r9.e
            r10.getClass()
            l(r9, r10, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.g(cbum, cbwd, byte[], fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.aubt r10, defpackage.cbum r11, defpackage.cbwd r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.h(aubt, cbum, cbwd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0168, code lost:
    
        if (r2 != r4) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ccpl r19, defpackage.cbwd r20, defpackage.aubt r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.i(ccpl, cbwd, aubt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r10 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ccpl r7, defpackage.cbwd r8, defpackage.aubt r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ccbj
            if (r0 == 0) goto L13
            r0 = r10
            ccbj r0 = (defpackage.ccbj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccbj r0 = new ccbj
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            cbwd r8 = r0.d
            defpackage.fctl.b(r10)
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            cbwd r8 = r0.d
            defpackage.fctl.b(r10)
            goto L64
        L3a:
            defpackage.fctl.b(r10)
            evqs r9 = r9.d
            evrr r10 = defpackage.evrr.a()
            eyyc r2 = defpackage.eyyc.a
            evsn r9 = defpackage.evsn.parseFrom(r2, r9, r10)
            eyyc r9 = (defpackage.eyyc) r9
            r9.getClass()
            cbun r10 = r6.d
            r2 = 0
            r5 = 6
            cbum r7 = defpackage.cbun.a(r10, r7, r2, r5)
            int r10 = r9.b
            if (r10 != r3) goto L67
            r0.d = r8
            r0.c = r4
            java.lang.Object r10 = r6.d(r8, r7, r9, r0)
            if (r10 == r1) goto L7d
        L64:
            ccan r10 = (defpackage.ccan) r10
            goto La1
        L67:
            if (r10 != r4) goto L7e
            java.lang.Object r9 = r9.c
            evqs r9 = (defpackage.evqs) r9
            r9.getClass()
            r0.d = r8
            r0.c = r3
            java.lang.Object r10 = r6.b(r8, r7, r9, r0)
            if (r10 == r1) goto L7d
        L7a:
            ccan r10 = (defpackage.ccan) r10
            goto La1
        L7d:
            return r1
        L7e:
            ekrg r7 = defpackage.ccbk.a
            ekrw r7 = r7.h()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r10 = "BugleE2eeMls"
            r7.X(r9, r10)
            r9 = 182(0xb6, float:2.55E-43)
            java.lang.String r10 = "ZinniaMlsRcsMessageProcessor.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/e2ee/mls/core/ZinniaMlsRcsMessageProcessor"
            java.lang.String r1 = "processMlsRcsServerMessage"
            ekrw r7 = r7.h(r0, r1, r9, r10)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r9 = r8.e
            java.lang.String r10 = "Empty mls-rcs message. %s"
            r7.t(r10, r9)
            r10 = 0
        La1:
            if (r10 != 0) goto Lab
            ccag r7 = new ccag
            ccam r9 = defpackage.ccam.a
            r7.<init>(r8, r9)
            return r7
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbk.j(ccpl, cbwd, aubt, fcxy):java.lang.Object");
    }
}
