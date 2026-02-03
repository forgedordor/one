package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pip {
    public static final String a(Collection collection) {
        return !collection.isEmpty() ? fdey.m(fdey.j(new fdhb(fcva.aF(collection, ",\n", "\n", "\n", null, 56)), new fdap() { // from class: fdgp
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean zH = fdgn.H(str);
                String str2 = this.a;
                return zH ? str.length() >= str2.length() ? str : str2 : str2.concat(str);
            }
        }), "\n", 62).concat("},") : " }";
    }

    public static final String b(pim pimVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(pimVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(a(fcva.al(pimVar.b.values(), new pin())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(a(pimVar.c));
        sb.append("\n            |    indices = {");
        Set set = pimVar.d;
        sb.append(a(set != null ? fcva.al(set, new pio()) : fcvo.a));
        sb.append("\n            |}\n        ");
        return fdgn.c(sb.toString(), "|");
    }

    public static final void c(Collection collection) {
        fdey.m(fdey.j(new fdhb(fcva.aF(collection, ",", null, null, null, 62)), new fdap() { // from class: fdgp
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean zH = fdgn.H(str);
                String str2 = this.a;
                return zH ? str.length() >= str2.length() ? str : str2 : str2.concat(str);
            }
        }), "\n", 62);
        fdey.m(fdey.j(new fdhb(" }"), new fdap() { // from class: fdgp
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean zH = fdgn.H(str);
                String str2 = this.a;
                return zH ? str.length() >= str2.length() ? str : str2 : str2.concat(str);
            }
        }), "\n", 62);
    }

    public static final void d(Collection collection) {
        fdey.m(fdey.j(new fdhb(fcva.aF(collection, ",", null, null, null, 62)), new fdap() { // from class: fdgp
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean zH = fdgn.H(str);
                String str2 = this.a;
                return zH ? str.length() >= str2.length() ? str : str2 : str2.concat(str);
            }
        }), "\n", 62);
        fdey.m(fdey.j(new fdhb("},"), new fdap() { // from class: fdgp
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean zH = fdgn.H(str);
                String str2 = this.a;
                return zH ? str.length() >= str2.length() ? str : str2 : str2.concat(str);
            }
        }), "\n", 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = defpackage.fdbq.f(r8, r9)
            r1 = 1
            if (r0 != 0) goto L5c
            int r0 = r8.length()
            r2 = 0
            if (r0 == 0) goto L5b
            r0 = r2
            r3 = r0
            r4 = r3
        L11:
            int r5 = r8.length()
            if (r0 >= r5) goto L3f
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L25
            if (r5 != r7) goto L5b
            r4 = r2
            r5 = r7
        L25:
            if (r5 == r7) goto L39
            r7 = 41
            if (r5 == r7) goto L2c
            goto L3b
        L2c:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3b
            int r5 = r8.length()
            int r5 = r5 + (-1)
            if (r4 == r5) goto L3b
            goto L5b
        L39:
            int r3 = r3 + 1
        L3b:
            int r0 = r0 + 1
            r4 = r6
            goto L11
        L3f:
            if (r3 != 0) goto L5b
            int r0 = r8.length()
            int r0 = r0 + (-1)
            java.lang.String r8 = r8.substring(r1, r0)
            r8.getClass()
            java.lang.CharSequence r8 = defpackage.fdgn.x(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.fdbq.f(r8, r9)
            return r8
        L5b:
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pip.e(java.lang.String, java.lang.String):boolean");
    }

    public static final boolean f(pim pimVar, Object obj) {
        Set set;
        if (pimVar == obj) {
            return true;
        }
        if (!(obj instanceof pim)) {
            return false;
        }
        pim pimVar2 = (pim) obj;
        if (!fdbq.f(pimVar.a, pimVar2.a) || !fdbq.f(pimVar.b, pimVar2.b) || !fdbq.f(pimVar.c, pimVar2.c)) {
            return false;
        }
        Set set2 = pimVar.d;
        if (set2 == null || (set = pimVar2.d) == null) {
            return true;
        }
        return fdbq.f(set2, set);
    }
}
