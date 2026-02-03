package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdpw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:13:0x002e, B:23:0x0056, B:27:0x006e, B:29:0x0076, B:18:0x0044, B:22:0x0052), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008d -> B:23:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fdpm r7, defpackage.fdou r8, boolean r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.fdpv
            if (r0 == 0) goto L13
            r0 = r10
            fdpv r0 = (defpackage.fdpv) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fdpv r0 = new fdpv
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r9 = r0.c
            fdnq r7 = r0.f
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L9a
            r10 = r7
            r7 = r2
            goto L56
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            boolean r9 = r0.c
            fdnq r7 = r0.f
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L9a
            r6 = r0
            r0 = r7
            r7 = r2
        L4a:
            r2 = r6
            goto L6e
        L4c:
            defpackage.fctl.b(r10)
            defpackage.fdra.b(r7)
            fdoc r10 = r8.r()     // Catch: java.lang.Throwable -> L9a
        L56:
            r0.a = r7     // Catch: java.lang.Throwable -> L9a
            r0.b = r8     // Catch: java.lang.Throwable -> L9a
            r2 = r10
            fdnq r2 = (defpackage.fdnq) r2     // Catch: java.lang.Throwable -> L9a
            r0.f = r2     // Catch: java.lang.Throwable -> L9a
            r0.c = r9     // Catch: java.lang.Throwable -> L9a
            r0.e = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 != r1) goto L6a
            goto L90
        L6a:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L4a
        L6e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9a
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r10 == 0) goto L91
            java.lang.Object r10 = r0.b()     // Catch: java.lang.Throwable -> L9a
            r2.a = r7     // Catch: java.lang.Throwable -> L9a
            r2.b = r8     // Catch: java.lang.Throwable -> L9a
            r5 = r0
            fdnq r5 = (defpackage.fdnq) r5     // Catch: java.lang.Throwable -> L9a
            r2.f = r5     // Catch: java.lang.Throwable -> L9a
            r2.c = r9     // Catch: java.lang.Throwable -> L9a
            r2.e = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r10 = r7.fO(r10, r2)     // Catch: java.lang.Throwable -> L9a
            if (r10 == r1) goto L90
            r10 = r0
            r0 = r2
            goto L56
        L90:
            return r1
        L91:
            if (r9 == 0) goto L97
            r7 = 0
            defpackage.fdok.a(r8, r7)
        L97:
            fctx r7 = defpackage.fctx.a
            return r7
        L9a:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r10 = move-exception
            if (r9 != 0) goto La0
            goto La3
        La0:
            defpackage.fdok.a(r8, r7)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdpw.a(fdpm, fdou, boolean, fcxy):java.lang.Object");
    }

    public static final fdou b(fdpl fdplVar, fdjx fdjxVar) {
        fdvt fdwbVar = fdplVar instanceof fdvt ? (fdvt) fdplVar : null;
        if (fdwbVar == null) {
            fdwbVar = new fdwb(fdplVar, null, 0, 0, 14);
        }
        return fdwbVar.e(fdjxVar);
    }
}
