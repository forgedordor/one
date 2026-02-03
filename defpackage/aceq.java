package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aceq extends fcyz implements fdat {
    Object a;
    int b;
    int c;
    final /* synthetic */ acex d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aceq(acex acexVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = acexVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aceq) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r11.fO(r4, r12) == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto Le
            defpackage.fctl.b(r13)
            goto L6c
        Le:
            int r1 = r12.b
            java.lang.Object r4 = r12.a
            java.lang.Object r5 = r12.e
            fdpm r5 = (defpackage.fdpm) r5
            defpackage.fctl.b(r13)
        L19:
            r6 = r4
            r11 = r5
            goto L40
        L1c:
            defpackage.fctl.b(r13)
            java.lang.Object r13 = r12.e
            r5 = r13
            fdpm r5 = (defpackage.fdpm) r5
            acex r13 = r12.d
            com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments r1 = r13.c
            efwo r1 = r1.a
            if (r1 == 0) goto L2e
            r1 = r3
            goto L2f
        L2e:
            r1 = r2
        L2f:
            r12.e = r5
            fduf r4 = r13.l
            r12.a = r4
            r12.b = r1
            r12.c = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 == r0) goto L6f
            goto L19
        L40:
            if (r3 == r1) goto L44
            r5 = r2
            goto L45
        L44:
            r5 = r3
        L45:
            acex r1 = r12.d
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            aceo r8 = new aceo
            r8.<init>()
            acep r9 = new acep
            r9.<init>(r1)
            acey r4 = new acey
            aaft r13 = r1.m
            fduj r10 = r13.a
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = 0
            r12.e = r13
            r12.a = r13
            r13 = 2
            r12.c = r13
            java.lang.Object r13 = r11.fO(r4, r12)
            if (r13 != r0) goto L6c
            goto L6f
        L6c:
            fctx r13 = defpackage.fctx.a
            return r13
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aceq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aceq aceqVar = new aceq(this.d, fcxyVar);
        aceqVar.e = obj;
        return aceqVar;
    }
}
