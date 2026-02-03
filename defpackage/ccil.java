package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccil {
    public final cmfo a;
    public final int b;
    private final String c;

    public ccil(cmgk cmgkVar, String str, int i) {
        cmgkVar.getClass();
        str.getClass();
        this.c = str;
        this.b = i;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.MLS_STATE);
        cmggVarC.g(str);
        cmggVarC.b(true);
        cmggVarC.f(cchw.a);
        this.a = cmgkVar.a(cmggVarC.a());
    }

    public static final String m(int i, int i2) {
        return ccin.a(i) + "_" + cccs.a(i2);
    }

    public final Object a(fcxy fcxyVar) {
        return h(3, fcxyVar);
    }

    public final Object b(fcxy fcxyVar) {
        return i(3, fcxyVar);
    }

    public final Object c(fcxy fcxyVar) {
        return j(3, fcxyVar);
    }

    public final Object d(fcxy fcxyVar) {
        return k(3, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ccij
            if (r0 == 0) goto L13
            r0 = r5
            ccij r0 = (defpackage.ccij) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccij r0 = new ccij
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            switch(r2) {
                case 0: goto L42;
                case 1: goto L3e;
                case 2: goto L3a;
                case 3: goto L36;
                case 4: goto L32;
                case 5: goto L2e;
                case 6: goto L2a;
                default: goto L22;
            }
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2a:
            defpackage.fctl.b(r5)
            return r5
        L2e:
            defpackage.fctl.b(r5)
            goto L81
        L32:
            defpackage.fctl.b(r5)
            goto L6e
        L36:
            defpackage.fctl.b(r5)
            goto L63
        L3a:
            defpackage.fctl.b(r5)
            goto L58
        L3e:
            defpackage.fctl.b(r5)
            goto L4d
        L42:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 == r1) goto L9f
        L4d:
            if (r5 == 0) goto L99
            r5 = 2
            r0.c = r5
            java.lang.Object r5 = r4.d(r0)
            if (r5 == r1) goto L9f
        L58:
            if (r5 == 0) goto L99
            r5 = 3
            r0.c = r5
            java.lang.Object r5 = r4.a(r0)
            if (r5 == r1) goto L9f
        L63:
            if (r5 == 0) goto L99
            r5 = 4
            r0.c = r5
            java.lang.Object r5 = r4.a(r0)
            if (r5 == r1) goto L9f
        L6e:
            r5.getClass()
            cccq r5 = (defpackage.cccq) r5
            int r5 = r5.b
            r5 = r5 & r3
            if (r5 == 0) goto L99
            r5 = 5
            r0.c = r5
            java.lang.Object r5 = r4.a(r0)
            if (r5 == r1) goto L9f
        L81:
            r5.getClass()
            cccq r5 = (defpackage.cccq) r5
            evtg r5 = r5.d
            int r5 = r5.size()
            if (r5 <= 0) goto L99
            r5 = 6
            r0.c = r5
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L98
            goto L9f
        L98:
            return r5
        L99:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccil.e(fcxy):java.lang.Object");
    }

    public final Object f(fcxy fcxyVar) {
        return l(3, fcxyVar);
    }

    public final Object g(final ccio ccioVar, fcxy fcxyVar) {
        final String strM = m(3, this.b);
        Object objD = this.a.d(new fdap() { // from class: cchz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cchw cchwVar = (cchw) obj;
                cchwVar.getClass();
                cchr cchrVar = (cchr) cchwVar.toBuilder();
                cchrVar.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cchw) cchrVar.instance).b)).getClass();
                ccht cchtVar = ccht.a;
                evub evubVar = cchwVar.b;
                String str = strM;
                if (evubVar.containsKey(str)) {
                    cchtVar = (ccht) evubVar.get(str);
                }
                ccio ccioVar2 = ccioVar;
                cchtVar.getClass();
                cchs cchsVar = (cchs) cchtVar.toBuilder();
                cchsVar.getClass();
                cchsVar.copyOnWrite();
                ((ccht) cchsVar.instance).d = ccioVar2.a;
                cchsVar.copyOnWrite();
                ((ccht) cchsVar.instance).e = ccioVar2.b;
                cchy.b(str, cchx.a(cchsVar), cchrVar);
                return cchy.a(cchrVar);
            }
        }, fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objD != fcylVar) {
            objD = fctx.a;
        }
        return objD == fcylVar ? objD : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccif
            if (r0 == 0) goto L13
            r0 = r6
            ccif r0 = (defpackage.ccif) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccif r0 = new ccif
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = m(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L5f
        L46:
            cchw r6 = (defpackage.cchw) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            ccht r5 = (defpackage.ccht) r5
            if (r5 != 0) goto L58
            r5 = 0
            return r5
        L58:
            cccq r5 = r5.h
            if (r5 != 0) goto L5e
            cccq r5 = defpackage.cccq.a
        L5e:
            return r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccil.h(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccig
            if (r0 == 0) goto L13
            r0 = r6
            ccig r0 = (defpackage.ccig) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccig r0 = new ccig
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = m(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L63
        L46:
            cchw r6 = (defpackage.cchw) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            ccht r5 = (defpackage.ccht) r5
            if (r5 != 0) goto L58
            r5 = 0
            return r5
        L58:
            cccv r6 = new cccv
            java.lang.String r5 = r5.i
            r5.getClass()
            r6.<init>(r5)
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccil.i(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccih
            if (r0 == 0) goto L13
            r0 = r6
            ccih r0 = (defpackage.ccih) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccih r0 = new ccih
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = m(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L68
        L46:
            cchw r6 = (defpackage.cchw) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            ccht r5 = (defpackage.ccht) r5
            if (r5 != 0) goto L58
            r5 = 0
            return r5
        L58:
            ccio r6 = new ccio
            evqs r0 = r5.f
            r0.getClass()
            evqs r5 = r5.g
            r5.getClass()
            r6.<init>(r0, r5)
            return r6
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccil.j(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccii
            if (r0 == 0) goto L13
            r0 = r6
            ccii r0 = (defpackage.ccii) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccii r0 = new ccii
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = m(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L68
        L46:
            cchw r6 = (defpackage.cchw) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            ccht r5 = (defpackage.ccht) r5
            if (r5 != 0) goto L58
            r5 = 0
            return r5
        L58:
            ccio r6 = new ccio
            evqs r0 = r5.d
            r0.getClass()
            evqs r5 = r5.e
            r5.getClass()
            r6.<init>(r0, r5)
            return r6
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccil.k(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccik
            if (r0 == 0) goto L13
            r0 = r6
            ccik r0 = (defpackage.ccik) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccik r0 = new ccik
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = m(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L79
        L46:
            cchw r6 = (defpackage.cchw) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            ccht r5 = (defpackage.ccht) r5
            if (r5 == 0) goto L63
            int r6 = r5.c
            int r6 = defpackage.cchv.a(r6)
            if (r6 != 0) goto L5f
            goto L63
        L5f:
            r0 = 3
            if (r6 != r0) goto L63
            goto L74
        L63:
            r6 = 0
            if (r5 == 0) goto L73
            int r5 = r5.c
            int r5 = defpackage.cchv.a(r5)
            if (r5 != 0) goto L6f
            goto L73
        L6f:
            r0 = 4
            if (r5 != r0) goto L73
            goto L74
        L73:
            r3 = r6
        L74:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccil.l(int, fcxy):java.lang.Object");
    }
}
