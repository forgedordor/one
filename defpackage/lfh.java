package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfh extends fcyy implements fdat {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfh(View view, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lfh) c((fdex) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r4 == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)
            goto L4b
        Ld:
            java.lang.Object r1 = r3.c
            fdex r1 = (defpackage.fdex) r1
            defpackage.fctl.b(r4)
            goto L29
        L15:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            fdex r1 = (defpackage.fdex) r1
            android.view.View r4 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 == r0) goto L4e
        L29:
            android.view.View r4 = r3.b
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            lfg r2 = new lfg
            r2.<init>(r4)
            r4 = 0
            r3.c = r4
            r4 = 2
            r3.a = r4
            java.util.Iterator r4 = r2.a()
            java.lang.Object r4 = r1.b(r4, r3)
            if (r4 == r0) goto L48
            fctx r4 = defpackage.fctx.a
        L48:
            if (r4 != r0) goto L4b
            goto L4e
        L4b:
            fctx r4 = defpackage.fctx.a
            return r4
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lfh lfhVar = new lfh(this.b, fcxyVar);
        lfhVar.c = obj;
        return lfhVar;
    }
}
