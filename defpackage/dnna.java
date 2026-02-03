package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnna {
    private static final dnce c = new dnce(0);
    private static final ekrg d = ekrg.c("com/google/android/libraries/compose/emoji/data/gboard/FrecentEmojiProvider");
    public final drob a;
    public final dner b;
    private final fctc e;

    public dnna(drob drobVar, dner dnerVar) {
        drobVar.getClass();
        this.a = drobVar;
        this.b = dnerVar;
        this.e = fctd.a(new fdae() { // from class: dnmy
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.b.a(new dnfv(31));
            }
        });
    }

    public final dneq a() {
        return (dneq) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dnmz
            if (r0 == 0) goto L13
            r0 = r7
            dnmz r0 = (defpackage.dnmz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnmz r0 = new dnmz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r6 = r0.a
            defpackage.fctl.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            dneq r7 = r5.a()
            dnce r2 = defpackage.dnna.c
            fdpl r7 = r7.b(r2)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fdtc.a(r7, r0)
            if (r7 == r1) goto La4
        L48:
            fdev r7 = (defpackage.fdev) r7
            ekrg r0 = defpackage.dnna.d
            ekrw r0 = r0.e()
            r1 = 34
            java.lang.String r2 = "FrecentEmojiProvider.kt"
            java.lang.String r3 = "com/google/android/libraries/compose/emoji/data/gboard/FrecentEmojiProvider"
            java.lang.String r4 = "getFrecents"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.util.Iterator r1 = r7.a()
            boolean r1 = r1.hasNext()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "Has frecent emojis: %b"
            r0.t(r2, r1)
            dnmx r0 = new dnmx
            r0.<init>()
            fdev r7 = defpackage.fdey.j(r7, r0)
            fdek r0 = new fdek
            r0.<init>(r7)
            fdev r6 = defpackage.fdey.l(r0, r6)
            int r7 = defpackage.ekgb.d
            ekfw r7 = new ekfw
            r7.<init>()
            java.util.Iterator r6 = r6.a()
        L8c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            r7.h(r0)
            goto L8c
        L9c:
            ekgb r6 = r7.g()
            r6.getClass()
            return r6
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnna.b(int, fcxy):java.lang.Object");
    }
}
