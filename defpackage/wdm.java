package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wdm extends fcyy implements fdat {
    int a;
    final /* synthetic */ dpir b;
    final /* synthetic */ View c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdm(dpir dpirVar, View view, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = dpirVar;
        this.c = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wdm) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0021 -> B:9:0x0024). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            if (r1 == 0) goto Le
            java.lang.Object r1 = r3.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r4)
            goto L24
        Le:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.d
            ire r4 = (defpackage.ire) r4
            r1 = r4
        L16:
            iru r4 = defpackage.iru.a
            r3.d = r1
            r2 = 1
            r3.a = r2
            java.lang.Object r4 = r1.r(r4, r3)
            if (r4 != r0) goto L24
            return r0
        L24:
            irs r4 = (defpackage.irs) r4
            java.util.List r4 = r4.a
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L16
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r4.next()
            ise r2 = (defpackage.ise) r2
            boolean r2 = defpackage.irt.f(r2)
            if (r2 == 0) goto L32
            dpir r4 = r3.b
            if (r4 == 0) goto L16
            android.view.View r2 = r3.c
            defpackage.dpiq.a(r4, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wdm wdmVar = new wdm(this.b, this.c, fcxyVar);
        wdmVar.d = obj;
        return wdmVar;
    }
}
