package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpr implements fdpm {
    final /* synthetic */ fdpm a;

    public zpr(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zpq
            if (r0 == 0) goto L13
            r0 = r10
            zpq r0 = (defpackage.zpq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zpq r0 = new zpq
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L7d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.fctl.b(r10)
            fdpm r10 = r8.a
            ekgb r9 = (defpackage.ekgb) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L3f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r9.next()
            alff r4 = (defpackage.alff) r4
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.albt
            if (r5 != 0) goto L54
            r4 = 0
            goto L6a
        L54:
            zph r5 = new zph
            albt r4 = (defpackage.albt) r4
            com.google.android.apps.messaging.shared.api.messaging.MessageId r6 = r4.b
            java.lang.String r6 = r6.a()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = defpackage.bary.b(r6)
            java.lang.String r7 = r4.a
            java.lang.String r4 = r4.c
            r5.<init>(r6, r7, r4)
            r4 = r5
        L6a:
            if (r4 == 0) goto L3f
            r2.add(r4)
            goto L3f
        L70:
            ekgb r9 = defpackage.ekfv.a(r2)
            r0.b = r3
            java.lang.Object r9 = r10.fO(r9, r0)
            if (r9 != r1) goto L7d
            return r1
        L7d:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpr.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
