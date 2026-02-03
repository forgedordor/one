package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emt implements ixx {
    private boolean a;
    private final List b = new ArrayList();

    @Override // defpackage.ics
    public final /* synthetic */ ics a(ics icsVar) {
        return icn.a(this, icsVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ Object b(Object obj, fdat fdatVar) {
        return icp.a(this, obj, fdatVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ boolean c(fdap fdapVar) {
        return icp.b(this, fdapVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ems
            if (r0 == 0) goto L13
            r0 = r6
            ems r0 = (defpackage.ems) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ems r0 = new ems
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fdci r0 = r0.d
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L6d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            boolean r6 = r5.a
            if (r6 != 0) goto L78
            fdci r6 = new fdci
            r6.<init>()
            r0.d = r6     // Catch: java.lang.Throwable -> L69
            r0.c = r3     // Catch: java.lang.Throwable -> L69
            fdiu r2 = new fdiu     // Catch: java.lang.Throwable -> L69
            fcxy r0 = defpackage.fcym.c(r0)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L69
            r2.B()     // Catch: java.lang.Throwable -> L69
            r6.a = r2     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = r5.b     // Catch: java.lang.Throwable -> L69
            r0.add(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r2.m()     // Catch: java.lang.Throwable -> L69
            if (r0 == r1) goto L68
            r0 = r6
        L5d:
            java.util.List r6 = r5.b
            java.lang.Object r0 = r0.a
            defpackage.fdcm.f(r6)
            r6.remove(r0)
            goto L78
        L68:
            return r1
        L69:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L6d:
            java.util.List r1 = r5.b
            java.lang.Object r0 = r0.a
            defpackage.fdcm.f(r1)
            r1.remove(r0)
            throw r6
        L78:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emt.d(fcxy):java.lang.Object");
    }

    @Override // defpackage.ixx
    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((fcxy) list.get(i)).w(fctx.a);
        }
        list.clear();
    }
}
