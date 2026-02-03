package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tak extends fcyz implements fdap {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ dbwo c;
    final /* synthetic */ fbog d;
    final /* synthetic */ fcsf e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tak(tbe tbeVar, dbwo dbwoVar, fbog fbogVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = tbeVar;
        this.c = dbwoVar;
        this.d = fbogVar;
        this.e = fcsfVar;
        this.f = duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r1.a(r2, r5, r4) == r0) goto L13;
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
            if (r1 == r2) goto L1e
            goto L40
        Ld:
            tbe r5 = r4.b
            dbwo r1 = r4.c
            fbog r3 = r4.d
            r3.getClass()
            r4.a = r2
            java.lang.Object r5 = r5.a(r1, r3, r4)
            if (r5 == r0) goto L43
        L1e:
            tbe r1 = r4.b
            fcsf r2 = r4.e
            tad r5 = (defpackage.tad) r5
            tab r3 = r5.d
            defpackage.tbe.g(r2, r3)
            fcsu r1 = r1.h
            java.lang.Object r1 = r1.b()
            tbn r1 = (defpackage.tbn) r1
            j$.time.Duration r2 = r4.f
            r2.getClass()
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.a(r2, r5, r4)
            if (r5 != r0) goto L40
            goto L43
        L40:
            fctx r5 = defpackage.fctx.a
            return r5
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tak.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new tak(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
