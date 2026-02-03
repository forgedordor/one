package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pil {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public pil(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pil)) {
            return false;
        }
        pil pilVar = (pil) obj;
        if (this.b != pilVar.b || !fdbq.f(this.c, pilVar.c) || !fdbq.f(this.d, pilVar.d)) {
            return false;
        }
        String str = this.a;
        return fdgn.t(str, "index_") ? fdgn.t(pilVar.a, "index_") : fdbq.f(str, pilVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((fdgn.t(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        pip.d(this.c);
        fctx fctxVar = fctx.a;
        sb.append(fctxVar);
        sb.append("\n            |   orders = {");
        pip.c(this.d);
        sb.append(fctxVar);
        sb.append("\n            |}\n        ");
        return fdey.m(fdey.j(new fdhb(fdgn.c(sb.toString(), "|")), 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: RETURN 
              (wrap:java.lang.String:0x003f: INVOKE 
              (wrap:fdev:0x000a: INVOKE 
              (wrap:fdhb:0x0002: CONSTRUCTOR 
              (wrap:java.lang.String:0x003b: INVOKE 
              (wrap:java.lang.String:0x0037: INVOKE (r0v0 'sb' java.lang.StringBuilder) VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:56))
              ("|")
             STATIC call: fdgn.c(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m), WRAPPED] (LINE:3))
             A[MD:(java.lang.CharSequence):void (m), WRAPPED] (LINE:3) call: fdhb.<init>(java.lang.CharSequence):void type: CONSTRUCTOR)
              (wrap:fdap:0x0007: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:8) call: fdgp.<init>():void type: CONSTRUCTOR)
             STATIC call: fdey.j(fdev, fdap):fdev A[MD:(fdev, fdap):fdev (m), WRAPPED] (LINE:11))
              ("
            ")
              (62 int)
             STATIC call: fdey.m(fdev, java.lang.CharSequence, int):java.lang.String A[MD:(fdev, java.lang.CharSequence, int):java.lang.String throws java.io.IOException (m), WRAPPED] (LINE:19))
             (LINE:19) in method: pil.toString():java.lang.String, file: classes.dex
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
            java.lang.String r1 = "\n            |Index {\n            |   name = '"
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = "',\n            |   unique = '"
            r0.append(r1)
            boolean r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columns = {"
            r0.append(r1)
            java.util.List r1 = r3.c
            defpackage.pip.d(r1)
            fctx r1 = defpackage.fctx.a
            r0.append(r1)
            java.lang.String r2 = "\n            |   orders = {"
            r0.append(r2)
            java.util.List r2 = r3.d
            defpackage.pip.c(r2)
            r0.append(r1)
            java.lang.String r1 = "\n            |}\n        "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = defpackage.fdgn.e(r0)
            java.lang.String r0 = defpackage.fdgn.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pil.toString():java.lang.String");
    }
}
