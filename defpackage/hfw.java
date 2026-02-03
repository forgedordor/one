package defpackage;

import androidx.compose.material3.internal.DraggableAnchorsElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfw {
    public static final ics a(ics icsVar, hgn hgnVar, dwm dwmVar, fdat fdatVar) {
        return icsVar.a(new DraggableAnchorsElement(hgnVar, fdatVar, dwmVar));
    }

    public static final Object b(hgn hgnVar, Object obj, float f, fcxy fcxyVar) {
        Object objF = hgnVar.f(obj, dod.a, new hfq(hgnVar, f, null), fcxyVar);
        return objF == fcyl.a ? objF : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.fdae r4, defpackage.fdat r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.hfr
            if (r0 == 0) goto L13
            r0 = r6
            hfr r0 = (defpackage.hfr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            hfr r0 = new hfr
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)     // Catch: defpackage.hfk -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.fctl.b(r6)
            hfv r6 = new hfv     // Catch: defpackage.hfk -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: defpackage.hfk -> L41
            r0.b = r3     // Catch: defpackage.hfk -> L41
            java.lang.Object r4 = defpackage.fdjy.a(r6, r0)     // Catch: defpackage.hfk -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfw.c(fdae, fdat, fcxy):java.lang.Object");
    }

    public static final hjj d(fdap fdapVar) {
        hif hifVar = new hif();
        fdapVar.invoke(hifVar);
        return new hjj(hifVar.a);
    }
}
