package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dosv extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnuy b;
    final /* synthetic */ dota c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dosv(dnuy dnuyVar, dota dotaVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnuyVar;
        this.c = dotaVar;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dosv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r6 == r0) goto L28;
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
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2b
        Ld:
            dnuy r6 = r5.b
            r5.a = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L8a
        L17:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L87
            dnuy r6 = r5.b
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L2b
            goto L8a
        L2b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            dota r0 = r5.c
            dpcl r1 = r0.f()
            if (r1 == 0) goto L87
            java.util.List r3 = r5.d
            dpxe r4 = defpackage.dpxe.i
            boolean r3 = r3.contains(r4)
            r4 = 0
            if (r2 == r3) goto L45
            r1 = r4
        L45:
            if (r1 == 0) goto L87
            dotc r2 = r0.b
            if (r2 != 0) goto L51
            java.lang.String r2 = "views"
            defpackage.fdbq.c(r2)
            goto L52
        L51:
            r4 = r2
        L52:
            androidx.compose.ui.platform.ComposeView r2 = r4.i
            if (r2 == 0) goto L87
            r3 = 0
            r2.setVisibility(r3)
            dote r3 = defpackage.dota.e(r0)
            float r3 = r3.j
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r3)
            doss r3 = new doss
            r3.<init>()
            r1.c(r4, r3)
            dote r3 = defpackage.dota.e(r0)
            boolean r3 = r3.k
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            dost r4 = new dost
            r4.<init>()
            r1.c(r3, r4)
            dosu r3 = new dosu
            r3.<init>()
            r1.b(r2, r6, r3)
        L87:
            fctx r6 = defpackage.fctx.a
            return r6
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dosv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dosv(this.b, this.c, this.d, fcxyVar);
    }
}
