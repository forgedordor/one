package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbn extends owd {
    private final dmbc a;

    public dmbn(dmbc dmbcVar) {
        this.a = dmbcVar;
    }

    @Override // defpackage.owd
    public final /* bridge */ /* synthetic */ Object b(owe oweVar) {
        Integer num;
        Integer num2;
        Integer num3 = oweVar.b;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            owb owbVarA = oweVar.a(iIntValue);
            if (owbVarA != null && (num2 = (Integer) owbVarA.c) != null) {
                return Integer.valueOf(num2.intValue() + 1);
            }
            owb owbVarA2 = oweVar.a(iIntValue);
            if (owbVarA2 != null && (num = (Integer) owbVarA2.d) != null) {
                return Integer.valueOf(num.intValue() - 1);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.owd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ovx r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dmbm
            if (r0 == 0) goto L13
            r0 = r9
            dmbm r0 = (defpackage.dmbm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dmbm r0 = new dmbm
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            int r8 = r0.a
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L93
            goto L61
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r9)
            java.lang.Object r8 = r8.a()     // Catch: java.lang.Exception -> L93
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L93
            if (r8 == 0) goto L42
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L93
            goto L43
        L42:
            r8 = 0
        L43:
            dmbc r9 = r7.a     // Catch: java.lang.Exception -> L93
            int r2 = r8 * 20
            r0.a = r8     // Catch: java.lang.Exception -> L93
            r0.d = r4     // Catch: java.lang.Exception -> L93
            r5 = r9
            dmbi r5 = (defpackage.dmbi) r5     // Catch: java.lang.Exception -> L93
            fdjx r5 = r5.b     // Catch: java.lang.Exception -> L93
            fcyh r5 = r5.hE()     // Catch: java.lang.Exception -> L93
            dmbh r6 = new dmbh     // Catch: java.lang.Exception -> L93
            dmbi r9 = (defpackage.dmbi) r9     // Catch: java.lang.Exception -> L93
            r6.<init>(r9, r2, r3)     // Catch: java.lang.Exception -> L93
            java.lang.Object r9 = defpackage.fdin.a(r5, r6, r0)     // Catch: java.lang.Exception -> L93
            if (r9 == r1) goto L92
        L61:
            dmbb r9 = (defpackage.dmbb) r9     // Catch: java.lang.Exception -> L93
            java.util.List r0 = r9.a     // Catch: java.lang.Exception -> L93
            int r1 = r8 + (-1)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L93
            r2.<init>(r1)     // Catch: java.lang.Exception -> L93
            r2.intValue()     // Catch: java.lang.Exception -> L93
            if (r8 != 0) goto L72
            r2 = r3
        L72:
            int r8 = r8 + r4
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> L93
            r1.<init>(r8)     // Catch: java.lang.Exception -> L93
            r1.intValue()     // Catch: java.lang.Exception -> L93
            int r8 = r0.size()     // Catch: java.lang.Exception -> L93
            java.util.List r9 = r9.b     // Catch: java.lang.Exception -> L93
            int r9 = r9.size()     // Catch: java.lang.Exception -> L93
            int r8 = r8 + r9
            r9 = 20
            if (r8 >= r9) goto L8b
            goto L8c
        L8b:
            r3 = r1
        L8c:
            owb r8 = new owb     // Catch: java.lang.Exception -> L93
            r8.<init>(r0, r2, r3)     // Catch: java.lang.Exception -> L93
            return r8
        L92:
            return r1
        L93:
            r8 = move-exception
            ovy r9 = new ovy
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmbn.c(ovx, fcxy):java.lang.Object");
    }
}
