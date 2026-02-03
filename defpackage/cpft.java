package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpft extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpfu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpft(cpfu cpfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cpfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpft) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (defpackage.fdor.b(r7, r3, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (defpackage.fdor.b(r7, r3, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        return r0;
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
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Lb
            goto L5e
        Lb:
            java.lang.Object r7 = r6.c
            fdos r7 = (defpackage.fdos) r7
            cpfu r1 = r6.b
            android.view.accessibility.AccessibilityManager r3 = r1.a
            if (r3 != 0) goto L20
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.b(r0)
            fctx r7 = defpackage.fctx.a
            return r7
        L20:
            boolean r4 = r1.a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7.b(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L47
            cpfp r4 = new cpfp
            r4.<init>()
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r3, r4)
            cpfq r3 = new cpfq
            r3.<init>()
            r6.a = r2
            java.lang.Object r7 = defpackage.fdor.b(r7, r3, r6)
            if (r7 != r0) goto L5e
            goto L5d
        L47:
            cpfr r2 = new cpfr
            r2.<init>()
            r3.addAccessibilityStateChangeListener(r2)
            cpfs r3 = new cpfs
            r3.<init>()
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fdor.b(r7, r3, r6)
            if (r7 != r0) goto L5e
        L5d:
            return r0
        L5e:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpft.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cpft cpftVar = new cpft(this.b, fcxyVar);
        cpftVar.c = obj;
        return cpftVar;
    }
}
