package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajm {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(defpackage.afo r8, java.util.Map r9, java.util.Map r10, java.util.Set r11) {
        /*
            java.lang.String r0 = r8.a
            boolean r1 = r11.contains(r0)
            if (r1 != 0) goto Lab
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L19
            java.lang.Object r8 = r10.get(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            return r8
        L19:
            r11.add(r0)
            java.util.List r8 = r8.b()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
            r2 = r1
        L26:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto La0
            java.lang.Object r3 = r8.next()
            afl r3 = (defpackage.afl) r3
            int r4 = r3.e()
            r5 = 6
            if (r4 != r5) goto L6c
            aff r3 = (defpackage.aff) r3
            java.lang.String r4 = r3.a()
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L60
            boolean r5 = r3.c()
            if (r5 != 0) goto L54
            java.util.List r3 = r3.b()
            int r3 = r3.size()
            goto L5e
        L54:
            java.lang.Object r3 = r9.get(r4)
            afo r3 = (defpackage.afo) r3
            int r3 = a(r3, r9, r10, r11)
        L5e:
            int r2 = r2 + r3
            goto L26
        L60:
            java.lang.String r8 = "Undefined schema type: "
            java.lang.String r8 = r8.concat(r4)
            ahz r9 = new ahz
            r9.<init>(r8)
            throw r9
        L6c:
            int r4 = r3.e()
            r6 = 1
            if (r4 == r6) goto L96
            r7 = 2
            if (r4 == r7) goto L8d
            if (r4 == r5) goto L7a
        L78:
            r6 = r1
            goto L9e
        L7a:
            aff r3 = (defpackage.aff) r3
            boolean r4 = r3.c()
            if (r4 != 0) goto L9e
            java.util.List r3 = r3.b()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L78
            goto L9e
        L8d:
            afk r3 = (defpackage.afk) r3
            int r3 = r3.a()
            if (r3 == 0) goto L78
            goto L9e
        L96:
            afn r3 = (defpackage.afn) r3
            int r3 = r3.a()
            if (r3 == 0) goto L78
        L9e:
            int r2 = r2 + r6
            goto L26
        La0:
            r11.remove(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r10.put(r0, r8)
            return r2
        Lab:
            ahz r8 = new ahz
            java.lang.String r9 = "Invalid cycle detected in schema type configs. '"
            java.lang.String r10 = "' references itself."
            java.lang.String r9 = defpackage.a.a(r0, r9, r10)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajm.a(afo, java.util.Map, java.util.Map, java.util.Set):int");
    }
}
