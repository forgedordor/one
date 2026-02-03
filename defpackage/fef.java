package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fef {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ire r7, defpackage.fcxy r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fed
            if (r0 == 0) goto L13
            r0 = r8
            fed r0 = (defpackage.fed) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fed r0 = new fed
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
        L34:
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.ird.a(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            irs r8 = (defpackage.irs) r8
            int r2 = r8.d
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L61
            java.lang.Object r6 = r8.get(r5)
            ise r6 = (defpackage.ise) r6
            boolean r6 = defpackage.irt.c(r6)
            if (r6 != 0) goto L5e
            goto L34
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fef.a(ire, fcxy):java.lang.Object");
    }
}
