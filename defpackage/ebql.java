package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebql {
    public static final ebnn a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "bad arg "));
        }
        ebnn ebnnVar = new ebnn();
        ebnnVar.f(str);
        ebnnVar.g(i);
        return ebnnVar;
    }

    public static final ebno b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null arg callId");
        }
        ebno ebnoVar = new ebno();
        ebnoVar.b(str);
        return ebnoVar;
    }

    public static final ebnu c(int i) {
        ebnu ebnuVar = new ebnu();
        ebnuVar.b(i);
        return ebnuVar;
    }

    public static final ebnv d(String str, String str2) {
        ebnv ebnvVar = new ebnv();
        ebnvVar.g(str);
        ebnvVar.f(str2);
        return ebnvVar;
    }

    public static final ebny e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "bad value "));
        }
        ebny ebnyVar = new ebny();
        ebnyVar.e(i);
        return ebnyVar;
    }

    public static final eboa f(eblv eblvVar, String str) {
        eboa eboaVar = new eboa();
        eboaVar.a = eblvVar;
        eboaVar.e(str);
        return eboaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ebob g(java.lang.String r7, java.lang.String r8) throws defpackage.ebml {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.util.Hashtable r1 = defpackage.ebof.a
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r7.toLowerCase(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L2e
            ebnz r0 = new ebnz
            r0.<init>()
            r0.c = r7
            r0.d = r8
            return r0
        L2e:
            if (r8 != 0) goto L41
            java.lang.Object r8 = r1.newInstance()     // Catch: java.lang.Exception -> L39
            ebob r8 = (defpackage.ebob) r8     // Catch: java.lang.Exception -> L39
            r8.c = r7     // Catch: java.lang.Exception -> L39
            goto L41
        L39:
            ebml r7 = new ebml
            java.lang.String r8 = "Problems creating header!"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 0
        L47:
            java.lang.String r1 = "\n\n"
            java.lang.String r1 = r0.concat(r1)
            char r2 = r1.charAt(r8)
            r3 = 10
            if (r2 == r3) goto Lcc
            char r2 = r1.charAt(r8)
            r4 = 9
            if (r2 == r4) goto Lcc
            char r2 = r1.charAt(r8)
            r5 = 32
            if (r2 != r5) goto L66
            goto Lcc
        L66:
            int r0 = r1.length()
            r2 = 1
            if (r8 >= r0) goto L97
            int r0 = r1.length()
            int r0 = r0 + (-1)
            if (r8 >= r0) goto L8e
            char r0 = r1.charAt(r8)
            if (r0 != r3) goto L8e
            int r0 = r8 + 1
            char r6 = r1.charAt(r0)
            if (r6 == r4) goto L89
            char r6 = r1.charAt(r0)
            if (r6 != r5) goto L8e
        L89:
            r7.append(r5)
            r8 = r0
            goto L95
        L8e:
            char r0 = r1.charAt(r8)
            r7.append(r0)
        L95:
            int r8 = r8 + r2
            goto L66
        L97:
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            ebpt r7 = defpackage.ebpy.a(r7)
            if (r7 == 0) goto Lc4
            ebob r7 = r7.b()
            boolean r8 = r7 instanceof defpackage.eboc
            if (r8 == 0) goto Lc3
            eboc r7 = (defpackage.eboc) r7
            int r8 = r7.b()
            if (r8 > r2) goto Lbb
            ebob r7 = r7.f()
            return r7
        Lbb:
            ebml r7 = new ebml
            java.lang.String r8 = "Only singleton allowed !"
            r7.<init>(r8)
            throw r7
        Lc3:
            return r7
        Lc4:
            ebml r7 = new ebml
            java.lang.String r8 = "could not create parser"
            r7.<init>(r8)
            throw r7
        Lcc:
            int r8 = r8 + 1
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebql.g(java.lang.String, java.lang.String):ebob");
    }

    public static final ebod h(int i) {
        ebod ebodVar = new ebod();
        ebodVar.b(i);
        return ebodVar;
    }

    public static final ebos i(eblv eblvVar, String str) {
        ebos ebosVar = new ebos();
        ebosVar.a = eblvVar;
        if (str != null) {
            ebosVar.f(str);
        }
        return ebosVar;
    }

    public static final ebov j(String str, int i, String str2, String str3) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("null arg");
        }
        ebov ebovVar = new ebov();
        ebovVar.e(str3);
        ebovVar.b.a = new ebme(str);
        ebovVar.b.b = i;
        ebovVar.p(str2);
        return ebovVar;
    }
}
