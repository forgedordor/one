package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csgg implements csfm {
    private static final fdgl a = new fdgl("[0-9]");
    private static final fdgl b = new fdgl("\\p{C}");
    private final cugg c;
    private final eukf d;

    public csgg(cugg cuggVar) {
        cuggVar.getClass();
        this.c = cuggVar;
        euke eukeVar = new euke();
        eukeVar.b = fcva.g("email", "url");
        eukeVar.b();
        this.d = eukeVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csfm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.csgf
            if (r0 == 0) goto L13
            r0 = r9
            csgf r0 = (defpackage.csgf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csgf r0 = new csgf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.d
            defpackage.fctl.b(r9)
            goto L57
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            r8.getClass()
            java.lang.String r9 = "0"
            fdgl r2 = defpackage.csgg.a
            java.lang.String r8 = r2.b(r8, r9)
            java.lang.String r9 = ""
            fdgl r2 = defpackage.csgg.b
            java.lang.String r8 = r2.b(r8, r9)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 == r1) goto Lc5
        L57:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lc4
            java.nio.charset.Charset r0 = defpackage.fdfy.a
            byte[] r8 = r8.getBytes(r0)
            r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
        L72:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r9.next()
            csex r3 = (defpackage.csex) r3
            int r4 = r3.a
            int r5 = r3.b
            if (r2 > r4) goto L72
            int r4 = r4 - r2
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8, r2, r4, r0)
            r1.append(r6)
            java.lang.String r3 = r3.c
            java.lang.String r4 = "URL_BASIC"
            boolean r4 = defpackage.fdbq.f(r3, r4)
            if (r4 == 0) goto L9a
            java.lang.String r3 = "[url]"
            goto La7
        L9a:
            java.lang.String r4 = "EMAIL_ADDRESS"
            boolean r3 = defpackage.fdbq.f(r3, r4)
            if (r3 == 0) goto La5
            java.lang.String r3 = "[email]"
            goto La7
        La5:
            java.lang.String r3 = "[unk]"
        La7:
            r1.append(r3)
            if (r2 >= r5) goto Lae
            r2 = r5
            goto L72
        Lae:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
        Lb6:
            int r9 = r8.length
            int r9 = r9 - r2
            java.lang.String r3 = new java.lang.String
            r3.<init>(r8, r2, r9, r0)
            r1.append(r3)
            java.lang.String r8 = r1.toString()
        Lc4:
            return r8
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgg.a(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.csge
            if (r0 == 0) goto L13
            r0 = r11
            csge r0 = (defpackage.csge) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csge r0 = new csge
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r10 = r0.d
            defpackage.fctl.b(r11)
            goto L44
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.fctl.b(r11)
            cugg r11 = r9.c
            eiju r11 = r11.a()
            r0.d = r10
            r0.c = r3
            java.lang.Object r11 = defpackage.fdxs.c(r11, r0)
            if (r11 == r1) goto Ld2
        L44:
            r11.getClass()
            j$.util.Optional r11 = (j$.util.Optional) r11
            java.lang.Object r11 = defpackage.fdct.b(r11)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib r11 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib) r11
            if (r11 != 0) goto L54
            fcvo r10 = defpackage.fcvo.a
            return r10
        L54:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            eulo r1 = new eulo
            r1.<init>(r10)
            eukf r10 = r9.d
            r1.a = r10
            eulp r10 = r1.a()
            eult r10 = r11.b(r10)
            java.util.List r10 = r10.d
            java.util.Iterator r10 = r10.iterator()
        L70:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lc4
            java.lang.Object r11 = r10.next()
            eulq r11 = (defpackage.eulq) r11
            int r1 = r11.a()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L70
            r2 = 0
        L85:
            java.lang.String r3 = r11.b(r2)
            r3.getClass()
            euiz r4 = r11.a
            csq r4 = r4.a
            boolean r5 = r4.containsKey(r3)
            if (r5 == 0) goto La1
            java.lang.Object r4 = r4.get(r3)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto La2
        La1:
            r4 = 0
        La2:
            cczi r5 = defpackage.crao.a
            java.lang.Object r5 = r5.e()
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r7 = (double) r4
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto Lbf
            int r4 = r11.b
            int r5 = r11.c
            csex r6 = new csex
            r6.<init>(r4, r5, r3)
            r0.add(r6)
        Lbf:
            if (r2 == r1) goto L70
            int r2 = r2 + 1
            goto L85
        Lc4:
            java.util.List r10 = defpackage.fcva.ao(r0)
            csgd r11 = new csgd
            r11.<init>()
            java.util.List r10 = defpackage.fcva.al(r10, r11)
            return r10
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgg.b(java.lang.String, fcxy):java.lang.Object");
    }
}
