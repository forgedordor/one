package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvw extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ zvx e;
    final /* synthetic */ ajlt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvw(zvx zvxVar, ajlt ajltVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = zvxVar;
        this.f = ajltVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        zvw zvwVar = new zvw(this.e, this.f, (fcxy) obj5);
        zvwVar.a = (aoer) obj;
        zvwVar.b = zBooleanValue;
        zvwVar.c = (dnvg) obj3;
        zvwVar.d = zBooleanValue2;
        return zvwVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Type inference failed for: r5v1, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.a
            boolean r0 = r4.b
            java.lang.Object r1 = r4.c
            boolean r2 = r4.d
            r3 = 0
            if (r2 != 0) goto L59
            if (r0 != 0) goto L11
            goto L59
        L11:
            zvx r0 = r4.e
            fcsu r2 = r0.g
            java.lang.Object r2 = r2.b()
            arxn r2 = (defpackage.arxn) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L32
            if (r5 == 0) goto L30
            ajlt r2 = r4.f
            angr r2 = r2.i()
            if (r2 == 0) goto L30
            anho r5 = r2.c(r5)
            goto L4a
        L30:
            r5 = r3
            goto L4a
        L32:
            if (r5 == 0) goto L41
            ajlt r2 = r4.f
            angr r2 = r2.i()
            if (r2 == 0) goto L41
            anhj r5 = r2.b(r5)
            goto L42
        L41:
            r5 = r3
        L42:
            if (r5 == 0) goto L30
            anho r2 = new anho
            r2.<init>(r5, r3)
            r5 = r2
        L4a:
            ajlt r2 = r4.f
            if (r1 == 0) goto L54
            dnvg r1 = (defpackage.dnvg) r1
            angp r3 = defpackage.anhp.b(r1)
        L54:
            dkzf r5 = r0.a(r2, r5, r3)
            return r5
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvw.b(java.lang.Object):java.lang.Object");
    }
}
