package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwm extends fcyz implements fdat {
    int a;
    final /* synthetic */ Optional b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwm(Optional optional, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = optional;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uwm) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r7)
            goto L4c
        Le:
            java.lang.Object r1 = r6.d
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r7)
            goto L3d
        L16:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.d
            r1 = r7
            fdpm r1 = (defpackage.fdpm) r1
            int r7 = defpackage.agqq.a
            j$.util.Optional r7 = r6.b
            agqo r4 = defpackage.agqn.a
            boolean r5 = r7.isPresent()
            if (r5 == 0) goto L40
            java.lang.Object r7 = r7.get()
            agqq r7 = (defpackage.agqq) r7
            java.util.List r4 = r6.c
            r6.d = r1
            r6.a = r3
            r3 = 0
            java.lang.Object r7 = defpackage.agqm.a(r7, r4, r3, r6, r2)
            if (r7 == r0) goto L4b
        L3d:
            r4 = r7
            agqo r4 = (defpackage.agqo) r4
        L40:
            r7 = 0
            r6.d = r7
            r6.a = r2
            java.lang.Object r7 = r1.fO(r4, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uwm uwmVar = new uwm(this.b, this.c, fcxyVar);
        uwmVar.d = obj;
        return uwmVar;
    }
}
