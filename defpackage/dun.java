package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dun extends fcyz implements fdat {
    int a;
    final /* synthetic */ duu b;
    final /* synthetic */ isn c;
    final /* synthetic */ fdau d;
    final /* synthetic */ fdap e;
    final /* synthetic */ fdae f;
    final /* synthetic */ fdae g;
    final /* synthetic */ fdat h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dun(duu duuVar, isn isnVar, fdau fdauVar, fdap fdapVar, fdae fdaeVar, fdae fdaeVar2, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = duuVar;
        this.c = isnVar;
        this.d = fdauVar;
        this.e = fdapVar;
        this.f = fdaeVar;
        this.g = fdaeVar2;
        this.h = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            if (r1 == 0) goto L14
            java.lang.Object r0 = r10.i
            r1 = r0
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r11)     // Catch: java.util.concurrent.CancellationException -> L10
            r9 = r10
            goto L4f
        L10:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L3e
        L14:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.i
            r1 = r11
            fdjx r1 = (defpackage.fdjx) r1
            duu r11 = r10.b     // Catch: java.util.concurrent.CancellationException -> L3b
            dwm r7 = r11.e     // Catch: java.util.concurrent.CancellationException -> L3b
            isn r2 = r10.c     // Catch: java.util.concurrent.CancellationException -> L3b
            fdau r3 = r10.d     // Catch: java.util.concurrent.CancellationException -> L3b
            fdap r4 = r10.e     // Catch: java.util.concurrent.CancellationException -> L3b
            fdae r5 = r10.f     // Catch: java.util.concurrent.CancellationException -> L3b
            fdae r6 = r10.g     // Catch: java.util.concurrent.CancellationException -> L3b
            fdat r8 = r10.h     // Catch: java.util.concurrent.CancellationException -> L3b
            r10.i = r1     // Catch: java.util.concurrent.CancellationException -> L3b
            r11 = 1
            r10.a = r11     // Catch: java.util.concurrent.CancellationException -> L3b
            r9 = r10
            java.lang.Object r11 = defpackage.duh.i(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L39
            if (r11 != r0) goto L4f
            return r0
        L39:
            r0 = move-exception
            goto L3d
        L3b:
            r0 = move-exception
            r9 = r10
        L3d:
            r11 = r0
        L3e:
            duu r0 = r9.b
            fdoa r0 = r0.h
            if (r0 == 0) goto L49
            dte r2 = defpackage.dte.a
            r0.b(r2)
        L49:
            boolean r0 = defpackage.fdjy.g(r1)
            if (r0 == 0) goto L52
        L4f:
            fctx r11 = defpackage.fctx.a
            return r11
        L52:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dun.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dun dunVar = new dun(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
        dunVar.i = obj;
        return dunVar;
    }
}
