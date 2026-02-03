package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdt {
    private static final eksp c = eksp.c("Bugle");
    public boolean a;
    public boolean b;
    private final String d;
    private final fdae e;

    public cpdt(String str, fdae fdaeVar) {
        this.d = str;
        this.e = fdaeVar;
    }

    public final void a(Bundle bundle) {
        if (this.b) {
            bundle.putBoolean(this.d, this.a);
            return;
        }
        eksl ekslVar = (eksl) c.j();
        String str = this.d;
        ekslVar.t("Didn't read using savedInstanceState first for %s, use default value instead", str);
        bundle.putBoolean(str, ((Boolean) this.e.invoke()).booleanValue());
    }

    public final boolean b() {
        if (this.b) {
            return this.a;
        }
        throw new IllegalStateException("Must read using savedInstanceState first");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.os.Bundle r3) {
        /*
            r2 = this;
            boolean r0 = r2.b
            if (r0 == 0) goto L7
            boolean r3 = r2.a
            return r3
        L7:
            if (r3 == 0) goto L18
            java.lang.String r0 = r2.d
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L18
            boolean r3 = r3.getBoolean(r0)
            r2.a = r3
            goto L26
        L18:
            fdae r3 = r2.e
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.a = r3
        L26:
            r0 = 1
            r2.b = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpdt.c(android.os.Bundle):boolean");
    }
}
