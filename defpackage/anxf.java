package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxf {
    private final fcsu a;

    public anxf(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ekgb r6, defpackage.fdap r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.anxe
            if (r0 == 0) goto L13
            r0 = r8
            anxe r0 = (defpackage.anxe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anxe r0 = new anxe
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            wyg r7 = r0.d
            defpackage.fctl.b(r8)
            goto L98
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r6, r2)
            r8.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L44:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            alqm r2 = r2.g()
            j$.util.Optional r2 = r2.e()
            r2.getClass()
            java.lang.Object r2 = defpackage.fdct.b(r2)
            aubq r2 = (defpackage.aubq) r2
            r8.add(r2)
            goto L44
        L65:
            boolean r6 = r8.isEmpty()
            if (r6 == 0) goto L6c
            goto L7f
        L6c:
            java.util.Iterator r6 = r8.iterator()
        L70:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r6.next()
            aubq r2 = (defpackage.aubq) r2
            if (r2 != 0) goto L70
            goto Ld2
        L7f:
            fcsu r6 = r5.a
            java.lang.Object r6 = r6.b()
            asxy r6 = (defpackage.asxy) r6
            java.util.List r8 = defpackage.fcva.ae(r8)
            r2 = r7
            wyg r2 = (defpackage.wyg) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 == r1) goto Ld7
        L98:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r6 = r8.values()
            boolean r8 = r6 instanceof java.util.Collection
            if (r8 == 0) goto Laa
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto Laa
        La8:
            r3 = r4
            goto Ld2
        Laa:
            java.util.Iterator r6 = r6.iterator()
        Lae:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto La8
            java.lang.Object r8 = r6.next()
            asts r8 = (defpackage.asts) r8
            asva r8 = r8.a()
            awhp r8 = defpackage.awhq.b(r8)
            anzf r8 = defpackage.anzd.a(r8)
            java.lang.Object r8 = r7.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lae
        Ld2:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anxf.a(ekgb, fdap, fcxy):java.lang.Object");
    }
}
