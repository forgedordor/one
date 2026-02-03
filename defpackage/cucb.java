package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucb implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ cucd b;

    public cucb(fdpm fdpmVar, cucd cucdVar) {
        this.a = fdpmVar;
        this.b = cucdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r8.fO(r9, r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cuca
            if (r0 == 0) goto L13
            r0 = r9
            cuca r0 = (defpackage.cuca) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cuca r0 = new cuca
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r9)
            goto La6
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.c
            defpackage.fctl.b(r9)
            goto L53
        L39:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            cudx r8 = (defpackage.cudx) r8
            cucd r2 = r7.b
            java.util.List r8 = r8.e
            r0.c = r9
            r0.b = r4
            ctvb r2 = r2.i
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 == r1) goto La9
            r6 = r9
            r9 = r8
            r8 = r6
        L53:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L5e:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r9.next()
            r5 = r4
            ctva r5 = (defpackage.ctva) r5
            boolean r5 = r5.b
            if (r5 == 0) goto L5e
            r2.add(r4)
            goto L5e
        L73:
            java.util.ArrayList r9 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r2, r4)
            r9.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L82:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r2.next()
            ctva r4 = (defpackage.ctva) r4
            com.google.android.apps.messaging.startchat.chip.ChipData r4 = r4.a
            alqm r4 = r4.a
            r9.add(r4)
            goto L82
        L96:
            java.util.Set r9 = defpackage.fcva.av(r9)
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 != r1) goto La6
            goto La9
        La6:
            fctx r8 = defpackage.fctx.a
            return r8
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cucb.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
