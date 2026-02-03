package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tof implements bzmy {
    public final autx a;
    public final fcsu b;
    private final cgbn c;
    private final Optional d;
    private final Optional e;
    private final aurx f;
    private final Context g;
    private final fdjx h;

    public tof(cgbn cgbnVar, Optional optional, Optional optional2, aurx aurxVar, autx autxVar, fcsu fcsuVar, Context context, fdjx fdjxVar) {
        cgbnVar.getClass();
        optional.getClass();
        aurxVar.getClass();
        autxVar.getClass();
        fcsuVar.getClass();
        context.getClass();
        fdjxVar.getClass();
        this.c = cgbnVar;
        this.d = optional;
        this.e = optional2;
        this.f = aurxVar;
        this.a = autxVar;
        this.b = fcsuVar;
        this.g = context;
        this.h = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.toe
            if (r0 == 0) goto L13
            r0 = r7
            toe r0 = (defpackage.toe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            toe r0 = new toe
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            auml r0 = r0.d
            defpackage.fctl.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.fctl.b(r7)
            goto L49
        L38:
            defpackage.fctl.b(r7)
            aurx r7 = r6.f
            eiju r7 = r7.f()
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto Ld8
        L49:
            aurx r2 = r6.f
            auml r7 = (defpackage.auml) r7
            eiju r2 = r2.r()
            r0.d = r7
            r0.c = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto Ld8
            r5 = r0
            r0 = r7
            r7 = r5
        L5e:
            auml r7 = (defpackage.auml) r7
            boolean r1 = defpackage.cpyl.a()
            java.lang.String r2 = "CMS_FEATURE_KEY"
            if (r1 == 0) goto Lb5
            cczi r1 = defpackage.cpyl.q
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L96
            ejxr r1 = defpackage.cqaa.a
            java.lang.Object r1 = r1.get()
            cczi r1 = (defpackage.cczi) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb5
            boolean r0 = defpackage.aurw.f(r0)
            if (r0 == 0) goto Lb5
            boolean r7 = defpackage.aurw.f(r7)
            if (r7 != 0) goto Lb5
        L96:
            j$.util.Optional r7 = r6.e
            boolean r0 = r7.isPresent()
            if (r0 == 0) goto Ld5
            java.lang.Object r7 = r7.get()
            tly r7 = (defpackage.tly) r7
            android.content.Intent r7 = r7.a()
            cpyb r0 = defpackage.cpyb.BACKUP_AND_RESTORE
            int r0 = r0.d
            r7.putExtra(r2, r0)
            cgbn r0 = r6.c
            r0.p(r7)
            goto Ld5
        Lb5:
            j$.util.Optional r7 = r6.d
            boolean r0 = r7.isPresent()
            if (r0 == 0) goto Ld5
            java.lang.Object r7 = r7.get()
            tlz r7 = (defpackage.tlz) r7
            android.content.Context r7 = r6.g
            android.content.Intent r7 = defpackage.tlz.c(r7)
            cpyb r0 = defpackage.cpyb.MULTI_DEVICE
            int r0 = r0.d
            r7.putExtra(r2, r0)
            cgbn r0 = r6.c
            r0.p(r7)
        Ld5:
            fctx r7 = defpackage.fctx.a
            return r7
        Ld8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tof.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.bzmy
    public final eiju b(int i) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new tod(this, i, null));
    }
}
