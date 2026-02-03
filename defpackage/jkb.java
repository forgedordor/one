package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkb implements fdjx {
    public final View a;
    public final key b;
    public final fdjx c;
    public final AtomicReference d = new AtomicReference(null);

    public jkb(View view, key keyVar, fdjx fdjxVar) {
        this.a = view;
        this.b = keyVar;
        this.c = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jnv r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jjw
            if (r0 == 0) goto L13
            r0 = r7
            jjw r0 = (defpackage.jjw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jjw r0 = new jjw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.fctl.b(r7)
            goto L48
        L2f:
            defpackage.fctl.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.d
            jjy r2 = new jjy
            r2.<init>(r6, r5)
            jka r6 = new jka
            r4 = 0
            r6.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.ida.b(r7, r2, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            fcta r6 = new fcta
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkb.a(jnv, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdjx
    public final fcyh hE() {
        return this.c.hE();
    }
}
