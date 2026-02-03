package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhe extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ ezol d;
    final /* synthetic */ eqgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhe(eqhr eqhrVar, String str, ezol ezolVar, eqgu eqguVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = ezolVar;
        this.e = eqguVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0079, code lost:
    
        if (r7 == r0) goto L36;
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
            r2 = 2
            r3 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L1a
            goto L7c
        Le:
            eqhr r7 = r6.b
            java.lang.String r1 = r6.c
            r6.a = r3
            java.lang.Object r7 = defpackage.eqhr.o(r7, r1, r6)
            if (r7 == r0) goto Lbe
        L1a:
            ezol r1 = r6.d
            ezpp r7 = (defpackage.ezpp) r7
            ezuy r4 = defpackage.ezuy.a
            evsf r4 = r4.createBuilder()
            ezux r4 = (defpackage.ezux) r4
            r4.getClass()
            r7.getClass()
            r4.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance
            ezuy r5 = (defpackage.ezuy) r5
            r5.c = r7
            int r7 = r5.b
            r7 = r7 | r3
            r5.b = r7
            r4.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r7 = r4.instance
            ezuy r7 = (defpackage.ezuy) r7
            r7.d = r1
            int r1 = r7.b
            r1 = r1 | r2
            r7.b = r1
            evsn r7 = r4.build()
            r7.getClass()
            eqhr r1 = r6.b
            eqgu r4 = r6.e
            ezuy r7 = (defpackage.ezuy) r7
            eqei r5 = r1.a
            exzo r4 = r4.b()
            r5.a(r4)
            r6.a = r2
            eqfy r1 = r1.c
            cnla r1 = r1.a
            ceqd r4 = r1.a
            ceog r5 = r1.c
            fbrg r1 = r1.d
            fcrn r1 = r4.a(r5, r1)
            ezws r1 = (defpackage.ezws) r1
            fbrg r4 = new fbrg
            r4.<init>()
            java.lang.Object r7 = r1.b(r7, r4, r6)
            if (r7 != r0) goto L7c
            goto Lbe
        L7c:
            ezva r7 = (defpackage.ezva) r7
            int r7 = r7.b
            r0 = 3
            if (r7 == 0) goto L91
            if (r7 == r3) goto L8f
            if (r7 == r2) goto L8d
            if (r7 == r0) goto L8b
            r7 = 0
            goto L92
        L8b:
            r7 = 5
            goto L92
        L8d:
            r7 = 4
            goto L92
        L8f:
            r7 = r0
            goto L92
        L91:
            r7 = r2
        L92:
            if (r7 != 0) goto L95
            r7 = r3
        L95:
            int r7 = r7 + (-2)
            if (r7 == 0) goto Lb8
            if (r7 == r3) goto Lb5
            if (r7 == r2) goto Lb2
            if (r7 != r0) goto La2
            eqhx r7 = defpackage.eqhx.d
            goto Lba
        La2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.Integer.toString(r7)
            java.lang.String r1 = "unknown enum value: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        Lb2:
            eqhx r7 = defpackage.eqhx.c
            goto Lba
        Lb5:
            eqhx r7 = defpackage.eqhx.b
            goto Lba
        Lb8:
            eqhx r7 = defpackage.eqhx.a
        Lba:
            r7.getClass()
            return r7
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhe(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
