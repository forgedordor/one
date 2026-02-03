package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgi extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ Duration c;
    final /* synthetic */ ddp d;
    final /* synthetic */ ddp e;
    final /* synthetic */ ddp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgi(ddp ddpVar, Duration duration, ddp ddpVar2, ddp ddpVar3, ddp ddpVar4, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = duration;
        this.d = ddpVar2;
        this.e = ddpVar3;
        this.f = ddpVar4;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (defpackage.fdjy.a(r4, r5) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 0
            r3 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L1f
            goto L34
        Le:
            ddp r6 = r5.b
            j$.time.Duration r1 = r5.c
            dmgd r4 = new dmgd
            r4.<init>(r6, r1, r2)
            r5.a = r3
            java.lang.Object r6 = defpackage.fdjy.a(r4, r5)
            if (r6 == r0) goto L37
        L1f:
            ddp r6 = r5.d
            ddp r1 = r5.e
            ddp r3 = r5.f
            dmgh r4 = new dmgh
            r4.<init>(r6, r1, r3, r2)
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.fdjy.a(r4, r5)
            if (r6 != r0) goto L34
            goto L37
        L34:
            fctx r6 = defpackage.fctx.a
            return r6
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmgi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmgi(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
