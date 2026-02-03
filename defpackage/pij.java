package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pij {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[PHI: r3
      0x0062: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v3 int), (r3v3 int), (r3v3 int) binds: [B:6:0x0029, B:8:0x0031, B:10:0x0039, B:16:0x004d, B:18:0x0055, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pij(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, int r6) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            r1.getClass()
            java.lang.String r2 = "INT"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            if (r2 == 0) goto L22
            r1 = 3
            goto L63
        L22:
            java.lang.String r2 = "CHAR"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            r3 = 2
            if (r2 != 0) goto L62
            java.lang.String r2 = "CLOB"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            if (r2 != 0) goto L62
            java.lang.String r2 = "TEXT"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            if (r2 == 0) goto L3c
            goto L62
        L3c:
            java.lang.String r2 = "BLOB"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            if (r2 == 0) goto L46
            r1 = 5
            goto L63
        L46:
            java.lang.String r2 = "REAL"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            r3 = 4
            if (r2 != 0) goto L62
            java.lang.String r2 = "FLOA"
            boolean r2 = defpackage.fdgn.K(r1, r2)
            if (r2 != 0) goto L62
            java.lang.String r2 = "DOUB"
            boolean r1 = defpackage.fdgn.K(r1, r2)
            if (r1 == 0) goto L60
            goto L62
        L60:
            r1 = 1
            goto L63
        L62:
            r1 = r3
        L63:
            r0.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pij.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, int):void");
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pij)) {
            return false;
        }
        pij pijVar = (pij) obj;
        if (a() != pijVar.a() || !fdbq.f(this.a, pijVar.a) || this.c != pijVar.c) {
            return false;
        }
        String str = this.e;
        String str2 = pijVar.e;
        int i = this.f;
        if (i == 1 && pijVar.f == 2 && str != null && !pip.e(str, str2)) {
            return false;
        }
        if (i == 2 && pijVar.f == 1 && str2 != null && !pip.e(str2, str)) {
            return false;
        }
        if (i == pijVar.f) {
            if (str != null) {
                if (!pip.e(str, str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return this.g == pijVar.g;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return fdey.m(fdey.j(new fdhb(fdgn.c(sb.toString(), "|")), 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: RETURN 
              (wrap:java.lang.String:0x004f: INVOKE 
              (wrap:fdev:0x000a: INVOKE 
              (wrap:fdhb:0x0002: CONSTRUCTOR 
              (wrap:java.lang.String:0x004b: INVOKE 
              (wrap:java.lang.String:0x0047: INVOKE (r0v0 'sb' java.lang.StringBuilder) VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:72))
              ("|")
             STATIC call: fdgn.c(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m), WRAPPED] (LINE:3))
             A[MD:(java.lang.CharSequence):void (m), WRAPPED] (LINE:3) call: fdhb.<init>(java.lang.CharSequence):void type: CONSTRUCTOR)
              (wrap:fdap:0x0007: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:8) call: fdgp.<init>():void type: CONSTRUCTOR)
             STATIC call: fdey.j(fdev, fdap):fdev A[MD:(fdev, fdap):fdev (m), WRAPPED] (LINE:11))
              ("
            ")
              (62 int)
             STATIC call: fdey.m(fdev, java.lang.CharSequence, int):java.lang.String A[MD:(fdev, java.lang.CharSequence, int):java.lang.String throws java.io.IOException (m), WRAPPED] (LINE:19))
             (LINE:19) in method: pij.toString():java.lang.String, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: fdgp, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Column {\n            |   name = '"
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "',\n            |   type = '"
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "',\n            |   affinity = '"
            r0.append(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = "',\n            |   notNull = '"
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "',\n            |   primaryKeyPosition = '"
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = "',\n            |   defaultValue = '"
            r0.append(r1)
            java.lang.String r1 = r2.e
            if (r1 != 0) goto L3f
            java.lang.String r1 = "undefined"
        L3f:
            r0.append(r1)
            java.lang.String r1 = "'\n            |}\n        "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = defpackage.fdgn.e(r0)
            java.lang.String r0 = defpackage.fdgn.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pij.toString():java.lang.String");
    }
}
