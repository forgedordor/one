package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmr {
    private static final eksp b = eksp.c("BugleMessageView");
    public final fduf a;
    private final fdjx c;
    private final fcsu d;

    public cwmr(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.a = fdvf.a((Map) cwmu.a.a());
        auvw.k(fdjxVar, null, null, new cwmq(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cwms
            if (r0 == 0) goto L13
            r0 = r7
            cwms r0 = (defpackage.cwms) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwms r0 = new cwms
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L28
            goto La3
        L28:
            r7 = move-exception
            goto Lcb
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.fctl.b(r7)
            ejha r7 = defpackage.ejha.a
            evsf r7 = r7.createBuilder()
            ejgz r7 = (defpackage.ejgz) r7
            ejhc r2 = defpackage.ejhc.a
            evsf r2 = r2.createBuilder()
            ejhb r2 = (defpackage.ejhb) r2
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r2.instance
            ejhc r4 = (defpackage.ejhc) r4
            int r5 = r4.b
            r5 = r5 | 2
            r4.b = r5
            java.lang.String r5 = "animated_emoji"
            r4.d = r5
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r2.instance
            ejhc r4 = (defpackage.ejhc) r4
            int r5 = r4.b
            r5 = r5 | r3
            r4.b = r5
            java.lang.String r5 = "animated_emojis_mapping.json"
            r4.c = r5
            r7.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r7.instance
            ejha r4 = (defpackage.ejha) r4
            evsn r2 = r2.build()
            ejhc r2 = (defpackage.ejhc) r2
            r2.getClass()
            r4.c = r2
            int r2 = r4.b
            r2 = r2 | r3
            r4.b = r2
            evsn r7 = r7.build()
            r7.getClass()
            ejha r7 = (defpackage.ejha) r7
            fcsu r2 = r6.d     // Catch: java.lang.Exception -> L28
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L28
            ejly r2 = (defpackage.ejly) r2     // Catch: java.lang.Exception -> L28
            eopy r7 = r2.c(r7)     // Catch: java.lang.Exception -> L28
            fdjx r2 = r6.c     // Catch: java.lang.Exception -> L28
            fdkf r7 = defpackage.auus.b(r7, r2)     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            fdme r7 = (defpackage.fdme) r7     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r7.hJ(r0)     // Catch: java.lang.Exception -> L28
            if (r7 == r1) goto Lca
        La3:
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch: java.lang.Exception -> L28
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L28
            java.nio.charset.Charset r1 = defpackage.fdfy.a     // Catch: java.lang.Exception -> L28
            r0.<init>(r7, r1)     // Catch: java.lang.Exception -> L28
            esyj r7 = defpackage.esyo.b(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L28
            r7.getClass()     // Catch: java.lang.Exception -> L28
            esyd r0 = new esyd     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            cwmr$1 r1 = new cwmr$1     // Catch: java.lang.Exception -> L28
            r1.<init>()     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Type r1 = r1.b     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r0.j(r7, r1)     // Catch: java.lang.Exception -> L28
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L28
            return r7
        Lca:
            return r1
        Lcb:
            eksp r0 = defpackage.cwmr.b
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            eksl r0 = r0.a(r1)
            java.lang.String r1 = "Could not parse the animated emojis mapping through mdd: %s"
            java.lang.String r7 = r7.toString()
            r0.t(r1, r7)
            fcvp r7 = defpackage.fcvp.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwmr.a(fcxy):java.lang.Object");
    }

    public final String b(CharSequence charSequence) {
        charSequence.getClass();
        return (String) ((Map) this.a.c()).get(charSequence);
    }
}
