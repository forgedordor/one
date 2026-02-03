package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwl implements dhwf, dhro {
    private final dhnz a;
    private final dhwa b;
    private final dhrn c;

    public dhwl(dhnz dhnzVar, dhwa dhwaVar, dhrn dhrnVar) {
        dhnzVar.getClass();
        this.a = dhnzVar;
        this.b = dhwaVar;
        this.c = dhrnVar;
    }

    @Override // defpackage.dhob
    public final Object a(fcxy fcxyVar) {
        return new dhoa(this.a.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dhvz r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dhwk
            if (r0 == 0) goto L13
            r0 = r11
            dhwk r0 = (defpackage.dhwk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhwk r0 = new dhwk
            r0.<init>(r9, r11)
        L18:
            r7 = r0
            java.lang.Object r11 = r7.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r11)
            goto L62
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.fctl.b(r11)
            dhwa r11 = r9.b
            r7.c = r2
            boolean r1 = r10 instanceof defpackage.dhwd
            if (r1 == 0) goto L52
            dhwd r10 = (defpackage.dhwd) r10
            java.util.List r3 = r10.a
            java.util.List r4 = r10.b
            evqs r5 = r10.c
            java.util.List r10 = r10.d
            r1 = r11
            dhvu r1 = (defpackage.dhvu) r1
            r6 = 0
            r8 = 16
            r2 = 0
            java.lang.Object r10 = defpackage.dhvu.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L50:
            r11 = r10
            goto L5f
        L52:
            boolean r1 = r10 instanceof defpackage.dhvy
            if (r1 == 0) goto L6c
            dhvy r10 = (defpackage.dhvy) r10
            dhvu r11 = (defpackage.dhvu) r11
            java.lang.Object r10 = r11.a(r10, r7)
            goto L50
        L5f:
            if (r11 != r0) goto L62
            return r0
        L62:
            dhwb r11 = (defpackage.dhwb) r11
            dhwm r10 = new dhwm
            fdhs r0 = defpackage.fdhs.a
            r10.<init>(r0, r11)
            return r10
        L6c:
            fctg r10 = new fctg
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhwl.b(dhvz, fcxy):java.lang.Object");
    }

    @Override // defpackage.dhro
    public final Object d(dhvy dhvyVar, fcxy fcxyVar) {
        return this.c.d(dhvyVar, fcxyVar);
    }
}
