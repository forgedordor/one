package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplc implements dpkv {
    private static final ekrg f = ekrg.c("com/google/android/libraries/compose/ui/keyboard/persistence/KeyboardDataPersistenceProtoDataStore");
    public final diep a;
    public final ecjh b;
    public final fdjx c;
    public final dngc d;
    public volatile dple e;
    private final Activity g;
    private fdlr h;
    private int i;
    private dpjd j;

    public dplc(Activity activity, diep diepVar, ecjh ecjhVar, fdjx fdjxVar, dngc dngcVar) {
        activity.getClass();
        diepVar.getClass();
        ecjhVar.getClass();
        fdjxVar.getClass();
        dngcVar.getClass();
        this.g = activity;
        this.a = diepVar;
        this.b = ecjhVar;
        this.c = fdjxVar;
        this.d = dngcVar;
        this.j = dpjd.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(defpackage.dpjd r7, int r8) {
        /*
            r6 = this;
            dpjd r0 = defpackage.dpjd.a
            if (r7 != r0) goto L64
            if (r8 < 0) goto L64
            android.app.Activity r7 = r6.g
            boolean r0 = defpackage.dpgx.f(r7)
            r1 = 0
            if (r0 == 0) goto L1a
            dple r0 = r6.e
            if (r0 == 0) goto L25
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26
        L1a:
            dple r0 = r6.e
            if (r0 == 0) goto L25
            int r0 = r0.d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 != 0) goto L29
            goto L30
        L29:
            int r0 = r0.intValue()
            if (r8 != r0) goto L30
            goto L64
        L30:
            r6.e = r1
            boolean r7 = defpackage.dpgx.f(r7)
            ekrg r0 = defpackage.dplc.f
            ekrw r0 = r0.h()
            r2 = 89
            java.lang.String r3 = "KeyboardDataPersistenceProtoDataStore.kt"
            java.lang.String r4 = "com/google/android/libraries/compose/ui/keyboard/persistence/KeyboardDataPersistenceProtoDataStore"
            java.lang.String r5 = "saveHeightToDataStore"
            ekrw r0 = r0.h(r4, r5, r2, r3)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r2 = "Saving keyboard height of %d (is portrait: %s)"
            r0.x(r2, r8, r7)
            fdlr r0 = r6.h
            if (r0 == 0) goto L56
            defpackage.fdlp.a(r0)
        L56:
            fdjx r0 = r6.c
            dpkz r2 = new dpkz
            r2.<init>(r6, r7, r8, r1)
            r7 = 3
            fdlr r7 = defpackage.fdil.d(r0, r1, r1, r2, r7)
            r6.h = r7
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dplc.c(dpjd, int):void");
    }

    @Override // defpackage.dpje
    public final void a(int i) {
        this.i = i;
        c(this.j, i);
    }

    @Override // defpackage.dpje
    public final void b(dpjd dpjdVar) {
        dpjdVar.getClass();
        this.j = dpjdVar;
        c(dpjdVar, this.i);
    }
}
