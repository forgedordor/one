package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctlp implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ oxm b;
    final /* synthetic */ djqn c;
    final /* synthetic */ List d;

    public ctlp(fdpm fdpmVar, oxm oxmVar, djqn djqnVar, List list) {
        this.a = fdpmVar;
        this.b = oxmVar;
        this.c = djqnVar;
        this.d = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[EDGE_INSN: B:50:0x00ce->B:51:0x00cf BREAK  A[LOOP:2: B:46:0x00b4->B:64:?]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ctlo
            if (r0 == 0) goto L13
            r0 = r9
            ctlo r0 = (defpackage.ctlo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ctlo r0 = new ctlo
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r9)
            goto Ldc
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            java.util.List r8 = (java.util.List) r8
            oxm r2 = r7.b
            int r2 = r2.a()
            r4 = 0
            if (r2 == 0) goto L6a
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L4c
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L4c
            goto Lcf
        L4c:
            java.util.Iterator r2 = r8.iterator()
        L50:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lcf
            java.lang.Object r5 = r2.next()
            eji r5 = (defpackage.eji) r5
            java.lang.Object r5 = r5.d
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "contact_"
            boolean r5 = defpackage.fdgn.t(r5, r6)
            if (r5 == 0) goto L50
        L6a:
            djqn r2 = r7.c
            java.util.List r2 = r2.b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9d
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L7f
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L7f
            goto Lcf
        L7f:
            java.util.Iterator r2 = r8.iterator()
        L83:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lcf
            java.lang.Object r5 = r2.next()
            eji r5 = (defpackage.eji) r5
            java.lang.Object r5 = r5.d
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "favorite"
            boolean r5 = defpackage.fdgn.t(r5, r6)
            if (r5 == 0) goto L83
        L9d:
            java.util.List r2 = r7.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lce
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto Lb0
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto Lb0
            goto Lcf
        Lb0:
            java.util.Iterator r8 = r8.iterator()
        Lb4:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r8.next()
            eji r2 = (defpackage.eji) r2
            java.lang.Object r2 = r2.d
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "group_chat_"
            boolean r2 = defpackage.fdgn.t(r2, r5)
            if (r2 == 0) goto Lb4
        Lce:
            r4 = r3
        Lcf:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r0.b = r3
            java.lang.Object r8 = r9.fO(r8, r0)
            if (r8 != r1) goto Ldc
            return r1
        Ldc:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctlp.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
