package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djv extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dkd c;
    final /* synthetic */ long d;
    final /* synthetic */ ebk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djv(dkd dkdVar, long j, ebk ebkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dkdVar;
        this.d = j;
        this.e = ebkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            dkd dkdVar = this.c;
            final fdce fdceVar = new fdce();
            jgh.c(dkdVar, dxa.a, new fdap() { // from class: dle
                /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
                @Override // defpackage.fdap
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r4) {
                    /*
                        r3 = this;
                        fdce r0 = r1
                        jgg r4 = (defpackage.jgg) r4
                        boolean r1 = r0.a
                        r2 = 1
                        if (r1 != 0) goto L15
                        r4.getClass()
                        dxa r4 = (defpackage.dxa) r4
                        boolean r4 = r4.b
                        if (r4 == 0) goto L13
                        goto L15
                    L13:
                        r4 = 0
                        goto L16
                    L15:
                        r4 = r2
                    L16:
                        r0.a = r4
                        r4 = r4 ^ r2
                        java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dle.invoke(java.lang.Object):java.lang.Object");
                }
            });
            if (!fdceVar.a) {
                long j = dlm.a;
                ViewParent parent = jbh.a(dkdVar).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
            }
            long j2 = dlm.a;
            this.b = 1;
            if (fdkj.c(j2, this) != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            this.c.f = (ebm) obj2;
            return fctx.a;
        }
        fctl.b(obj);
        ebm ebmVar = new ebm(this.d);
        ebk ebkVar = this.e;
        this.a = ebmVar;
        this.b = 2;
        if (ebkVar.a(ebmVar, this) != fcylVar) {
            obj2 = ebmVar;
            this.c.f = (ebm) obj2;
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djv(this.c, this.d, this.e, fcxyVar);
    }
}
