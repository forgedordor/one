package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnsh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnsi c;
    final /* synthetic */ dnsj d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnsh(dnsi dnsiVar, dnsj dnsjVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnsiVar;
        this.d = dnsjVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnsh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto L10
            java.lang.Object r0 = r7.a
            defpackage.fctl.b(r8)
            goto L8c
        L10:
            defpackage.fctl.b(r8)
            goto L76
        L14:
            defpackage.fctl.b(r8)
            dnsi r8 = r7.c
            dnsj r1 = r8.a
            fdlr r1 = r1.g
            java.lang.String r3 = "checkInitJobBeforeSearch"
            java.lang.String r4 = "com/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer$resultsRenderer$1"
            java.lang.String r5 = "EmojiSearchRenderer.kt"
            if (r1 != 0) goto L40
            ekrg r1 = defpackage.dnsj.a
            ekrw r1 = r1.i()
            ekrd r1 = (defpackage.ekrd) r1
            eksk r6 = defpackage.eksk.MEDIUM
            r1.Z(r6)
            r6 = 92
            ekrw r1 = r1.h(r4, r3, r6, r5)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r3 = "`search` called before enabled."
            r1.q(r3)
            goto L60
        L40:
            boolean r1 = r1.x()
            if (r1 == 0) goto L68
            ekrg r1 = defpackage.dnsj.a
            ekrw r1 = r1.i()
            ekrd r1 = (defpackage.ekrd) r1
            eksk r6 = defpackage.eksk.MEDIUM
            r1.Z(r6)
            r6 = 95
            ekrw r1 = r1.h(r4, r3, r6, r5)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r3 = "`enable` job was canceled."
            r1.q(r3)
        L60:
            dnsj r1 = r7.d
            r3 = 0
            r1.g = r3
            r8.b()
        L68:
            dnsj r8 = r7.d
            fdlr r8 = r8.g
            if (r8 == 0) goto L76
            r7.b = r2
            java.lang.Object r8 = r8.o(r7)
            if (r8 == r0) goto L94
        L76:
            dnsj r8 = r7.d
            java.lang.String r1 = r7.e
            r8.i = r1
            fdat r2 = r8.e
            r7.a = r2
            r3 = 2
            r7.b = r3
            dnnu r8 = r8.d
            java.lang.Object r8 = r8.b(r1, r7)
            if (r8 == r0) goto L94
            r0 = r2
        L8c:
            java.lang.String r1 = r7.e
            r0.a(r8, r1)
            fctx r8 = defpackage.fctx.a
            return r8
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnsh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnsh(this.c, this.d, this.e, fcxyVar);
    }
}
