package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctod extends fcyz implements fdat {
    int a;
    final /* synthetic */ Optional b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctod(Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctod) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r1.fO(r4, r6) != r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r7)
            goto L49
        Le:
            java.lang.Object r1 = r6.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r7)
            goto L3a
        L16:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.c
            r1 = r7
            fdpm r1 = (defpackage.fdpm) r1
            int r7 = defpackage.agqq.a
            j$.util.Optional r7 = r6.b
            agqo r4 = defpackage.agqn.a
            boolean r5 = r7.isPresent()
            if (r5 == 0) goto L3d
            java.lang.Object r7 = r7.get()
            agqq r7 = (defpackage.agqq) r7
            r6.c = r1
            r6.a = r3
            java.lang.Object r7 = defpackage.agqm.a(r7, r2, r3, r6, r3)
            if (r7 == r0) goto L48
        L3a:
            r4 = r7
            agqo r4 = (defpackage.agqo) r4
        L3d:
            r6.c = r2
            r7 = 2
            r6.a = r7
            java.lang.Object r7 = r1.fO(r4, r6)
            if (r7 != r0) goto L49
        L48:
            return r0
        L49:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctod.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctod ctodVar = new ctod(this.b, fcxyVar);
        ctodVar.c = obj;
        return ctodVar;
    }
}
