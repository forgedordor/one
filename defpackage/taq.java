package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class taq extends fcyz implements fdap {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ dbws c;
    final /* synthetic */ fcsf d;
    final /* synthetic */ Duration e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taq(tbe tbeVar, dbws dbwsVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = tbeVar;
        this.c = dbwsVar;
        this.d = fcsfVar;
        this.e = duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r1.b(r2, r5, r4) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L3b
        Ld:
            tbe r5 = r4.b
            dbws r1 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.b(r1, r4)
            if (r5 == r0) goto L3e
        L19:
            tbe r1 = r4.b
            fcsf r2 = r4.d
            taf r5 = (defpackage.taf) r5
            tab r3 = r5.d
            defpackage.tbe.g(r2, r3)
            fcsu r1 = r1.h
            java.lang.Object r1 = r1.b()
            tbn r1 = (defpackage.tbn) r1
            j$.time.Duration r2 = r4.e
            r2.getClass()
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.b(r2, r5, r4)
            if (r5 != r0) goto L3b
            goto L3e
        L3b:
            fctx r5 = defpackage.fctx.a
            return r5
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.taq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new taq(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
