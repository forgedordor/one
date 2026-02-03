package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvl implements fduj {
    private final fduj a;
    private final fdat b;

    public fdvl(fduj fdujVar, fdat fdatVar) {
        this.a = fdujVar;
        this.b = fdatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fduj, defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdvk
            if (r0 == 0) goto L13
            r0 = r7
            fdvk r0 = (defpackage.fdvk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdvk r0 = new fdvk
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
            goto L44
        L2f:
            defpackage.fctl.b(r7)
            fduj r7 = r5.a
            fdat r2 = r5.b
            fdvj r4 = new fdvj
            r4.<init>(r6, r2)
            r0.c = r3
            java.lang.Object r6 = r7.a(r4, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            fcta r6 = new fcta
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdvl.a(fdpm, fcxy):java.lang.Object");
    }

    @Override // defpackage.fduj
    public final List d() {
        return this.a.d();
    }
}
