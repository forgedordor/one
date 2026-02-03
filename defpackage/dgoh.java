package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgoh extends fcyz implements fdat {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ dgom c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoh(Duration duration, dgom dgomVar, Object obj, Object obj2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = duration;
        this.c = dgomVar;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgoh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r5.i(r1, r2, r4) == r0) goto L13;
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
            if (r1 == r2) goto L17
            goto L27
        Ld:
            j$.time.Duration r5 = r4.b
            r4.a = r2
            java.lang.Object r5 = defpackage.febp.a(r5, r4)
            if (r5 == r0) goto L2a
        L17:
            dgom r5 = r4.c
            java.lang.Object r1 = r4.d
            java.lang.Object r2 = r4.e
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.i(r1, r2, r4)
            if (r5 != r0) goto L27
            goto L2a
        L27:
            fctx r5 = defpackage.fctx.a
            return r5
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgoh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dgoh(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
