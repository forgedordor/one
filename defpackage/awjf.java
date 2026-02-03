package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes6.dex */
public final class awjf {
    private final awjb a;
    private final fcsu b;

    public awjf(awjb awjbVar, fcsu fcsuVar, fdjx fdjxVar) {
        awjbVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = awjbVar;
        this.b = fcsuVar;
    }

    @fcsv
    public final Object a(fcxy fcxyVar) {
        awjb awjbVar = this.a;
        int iOrdinal = awjbVar.b.ordinal();
        if (iOrdinal == 0) {
            aubn aubnVar = (aubn) aubq.a.createBuilder();
            aubnVar.getClass();
            aubr.b(awjbVar.c, aubnVar);
            aubr.c(aubp.PHONE, aubnVar);
            return aubr.a(aubnVar);
        }
        if (iOrdinal == 1) {
            aubn aubnVar2 = (aubn) aubq.a.createBuilder();
            aubnVar2.getClass();
            aubr.b(awjbVar.c, aubnVar2);
            aubr.c(aubp.BOT, aubnVar2);
            return aubr.a(aubnVar2);
        }
        if (iOrdinal == 2) {
            return b(fcxyVar);
        }
        if (iOrdinal != 3) {
            throw new fctg();
        }
        aubn aubnVar3 = (aubn) aubq.a.createBuilder();
        aubnVar3.getClass();
        aubr.b(awjbVar.c, aubnVar3);
        aubr.c(aubp.EMERGENCY, aubnVar3);
        return aubr.a(aubnVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.awje
            if (r0 == 0) goto L13
            r0 = r6
            awje r0 = (defpackage.awje) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awje r0 = new awje
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L4d
        L36:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.b
            java.lang.Object r6 = r6.b()
            awnf r6 = (defpackage.awnf) r6
            awjb r2 = r5.a
            r0.c = r4
            awjl r2 = r2.a
            java.lang.Object r6 = r6.k(r2, r0)
            if (r6 == r1) goto L6f
        L4d:
            fcsu r2 = r5.b
            awpx r6 = (defpackage.awpx) r6
            java.lang.Object r2 = r2.b()
            awnf r2 = (defpackage.awnf) r2
            r0.c = r3
            java.lang.Object r6 = r2.h(r6, r0)
            if (r6 == r1) goto L6f
        L5f:
            awmp r6 = (defpackage.awmp) r6
            audu r6 = r6.a()
            aubq r6 = r6.d
            if (r6 != 0) goto L6b
            aubq r6 = defpackage.aubq.a
        L6b:
            r6.getClass()
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awjf.b(fcxy):java.lang.Object");
    }
}
