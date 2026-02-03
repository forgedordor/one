package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnz implements dbzz {
    private final dqnl a;
    private final dqnq b;

    protected dqnz(Context context, dqnq dqnqVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        dqoa dqoaVar = new dqoa();
        dqnh dqnhVar = new dqnh();
        dqnhVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        dqnhVar.a = applicationContext;
        dqnhVar.c = ejwi.j(dqoaVar);
        dqnhVar.a();
        if (dqnhVar.e == 1 && (context2 = dqnhVar.a) != null) {
            this.a = new dqni(context2, dqnhVar.b, dqnhVar.c, dqnhVar.d);
            this.b = dqnqVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dqnhVar.a == null) {
            sb.append(" context");
        }
        if (dqnhVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static dbzz b(Context context, dqnj dqnjVar) {
        return new dqnz(context, new dqnq(dqnjVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x0063, DONT_GENERATE, TryCatch #0 {, blocks: (B:8:0x0023, B:10:0x0027, B:12:0x0036, B:14:0x0042, B:16:0x0055, B:17:0x005c, B:19:0x005e, B:20:0x0061), top: B:44:0x0023 }] */
    @Override // defpackage.dbzz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.evqs r5) {
        /*
            r4 = this;
            r5.I()
            dqny r5 = defpackage.dqno.a
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La1
            dqnl r5 = r4.a
            dqny r0 = defpackage.dqno.a
            boolean r1 = defpackage.dqnx.a
            r2 = r5
            dqni r2 = (defpackage.dqni) r2
            android.content.Context r2 = r2.a
            if (r1 != 0) goto L66
            java.lang.Object r1 = defpackage.dqnx.b
            monitor-enter(r1)
            boolean r3 = defpackage.dqnx.a     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L61
            r3 = 1
            defpackage.dqnx.a = r3     // Catch: java.lang.Throwable -> L63
            defpackage.dzyn.f(r2)     // Catch: java.lang.Throwable -> L63
            defpackage.dzzh.f(r2)     // Catch: java.lang.Throwable -> L63
            boolean r3 = defpackage.dqnn.a(r2)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L61
            fbag r3 = defpackage.fbag.a     // Catch: java.lang.Throwable -> L63
            fbah r3 = r3.get()     // Catch: java.lang.Throwable -> L63
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5e
            dcer r3 = defpackage.dcer.c(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L63
            dcel r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L63
            r2.b()     // Catch: java.lang.Throwable -> L63
            boolean r2 = r2.b     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L5e
            java.lang.String r5 = "CBVerifier"
            java.lang.String r0 = "Phenotype flags were not sycned because package was not Google Signed."
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            goto L66
        L5e:
            defpackage.dqnx.a(r5, r0)     // Catch: java.lang.Throwable -> L63
        L61:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            throw r5
        L66:
            fbag r5 = defpackage.fbag.a
            fbah r5 = r5.get()
            boolean r5 = r5.a()
            if (r5 == 0) goto L92
            dqnp r5 = defpackage.dqnp.a
            if (r5 != 0) goto L89
            java.lang.Class<dqnp> r5 = defpackage.dqnp.class
            monitor-enter(r5)
            dqnp r0 = defpackage.dqnp.a     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L84
            dqnp r0 = new dqnp     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            defpackage.dqnp.a = r0     // Catch: java.lang.Throwable -> L86
        L84:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
            goto L89
        L86:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
            throw r0
        L89:
            dqnq r5 = r4.b
            dqnp r0 = defpackage.dqnp.a
            dqnj r5 = r5.a
            r5.a()
        L92:
            fbaj r5 = defpackage.fbaj.a
            r5.get()
            fbag r5 = defpackage.fbag.a
            fbah r5 = r5.get()
            r5.c()
            return
        La1:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqnz.a(evqs):void");
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
