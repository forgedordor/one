package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhp extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ eqee d;
    final /* synthetic */ eqdr e;
    final /* synthetic */ eqgk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhp(eqhr eqhrVar, String str, eqee eqeeVar, eqdr eqdrVar, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = eqeeVar;
        this.e = eqdrVar;
        this.f = eqgkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[PHI: r7
      0x00ab: PHI (r7v19 java.lang.Object) = (r7v28 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x00a8, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
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
            if (r1 == 0) goto L11
            defpackage.fctl.b(r7)
            if (r1 == r3) goto L24
            if (r1 == r2) goto L90
            goto Lab
        L11:
            defpackage.fctl.b(r7)
            eqhr r7 = r6.b
            java.lang.String r1 = r6.c
            eqee r4 = r6.d
            r6.a = r3
            eqcz r3 = r4.d
            java.lang.Object r7 = r7.l(r1, r3, r6)
            if (r7 == r0) goto Leb
        L24:
            eqdr r1 = r6.e
            eqee r3 = r6.d
            ezpp r7 = (defpackage.ezpp) r7
            r6.a = r2
            ezqt r2 = defpackage.ezqt.a
            evsf r2 = r2.createBuilder()
            ezqs r2 = (defpackage.ezqs) r2
            eykh r2 = defpackage.eykg.a(r2)
            r2.c(r7)
            ezol r7 = r1.a
            r2.b(r7)
            ezot r7 = defpackage.ezot.a
            evsf r7 = r7.createBuilder()
            ezos r7 = (defpackage.ezos) r7
            r7.getClass()
            eyyj r1 = new eyyj
            r1.<init>(r7)
            eqgf r7 = new eqgf
            r7.<init>()
            eqgg r4 = new eqgg
            r4.<init>()
            j$.util.Optional r7 = r3.a
            r7.ifPresent(r4)
            eqgh r7 = new eqgh
            r7.<init>()
            eqgi r4 = new eqgi
            r4.<init>()
            j$.util.Optional r7 = r3.b
            r7.ifPresent(r4)
            ezos r7 = r1.a
            evsn r7 = r7.build()
            r7.getClass()
            ezqs r1 = r2.a
            ezot r7 = (defpackage.ezot) r7
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r1.instance
            ezqt r1 = (defpackage.ezqt) r1
            r1.e = r7
            int r7 = r1.b
            r7 = r7 | 8
            r1.b = r7
            ezqt r7 = r2.a()
            if (r7 == r0) goto Leb
        L90:
            eqhr r1 = r6.b
            eqgk r2 = r6.f
            eqei r3 = r1.a
            ezqt r7 = (defpackage.ezqt) r7
            exzo r2 = r2.b()
            r3.a(r2)
            r2 = 3
            r6.a = r2
            eqfy r1 = r1.c
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto Lab
            goto Leb
        Lab:
            ezqv r7 = (defpackage.ezqv) r7
            ezot r7 = r7.b
            if (r7 != 0) goto Lb3
            ezot r7 = defpackage.ezot.a
        Lb3:
            r7.getClass()
            eqee r0 = new eqee
            evvh r1 = defpackage.eyyk.a(r7)
            r2 = 0
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r1.b
            goto Lc3
        Lc2:
            r1 = r2
        Lc3:
            j$.util.Optional r1 = j$.util.Optional.ofNullable(r1)
            evvh r7 = defpackage.eyyk.b(r7)
            if (r7 == 0) goto Lcf
            java.lang.String r2 = r7.b
        Lcf:
            j$.util.Optional r7 = j$.util.Optional.ofNullable(r2)
            eqgd r2 = new eqgd
            r2.<init>()
            eqge r3 = new eqge
            r3.<init>()
            j$.util.Optional r2 = r7.map(r3)
            r2.getClass()
            r4 = 0
            r5 = 12
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhp(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
