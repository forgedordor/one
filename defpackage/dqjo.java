package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjo implements dqiz {
    public final Context a;
    public final fdjx b;
    public final dqiy c;
    public final fdap d;
    private final fdap e;
    private final fdap f;

    public dqjo(Context context, fdjx fdjxVar, dqiy dqiyVar) {
        context.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = dqiyVar;
        this.d = new elge(new dqjn(this, null));
        this.e = new elge(new dqjk(this, null));
        this.f = new elge(new dqjh(this, null));
    }

    @Override // defpackage.dqiz
    public final dpxd a(String str) {
        return (dpxd) this.c.e.get(str);
    }

    @Override // defpackage.dqiz
    public final Integer b(String str) {
        return (Integer) this.c.d.get(str);
    }

    @Override // defpackage.dqiz
    public final Object c(fcxy fcxyVar) {
        Object objInvoke = this.d.invoke(fcxyVar);
        return objInvoke == fcyl.a ? objInvoke : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dqiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dqji
            if (r0 == 0) goto L13
            r0 = r6
            dqji r0 = (defpackage.dqji) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqji r0 = new dqji
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            fdap r6 = r5.d
            r0.c = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 == r1) goto L52
        L43:
            fdap r6 = r5.e
            r0.c = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4e
            goto L52
        L4e:
            r6.getClass()
            return r6
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqjo.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dqiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, defpackage.fdap r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqjo.e(java.lang.String, fdap, fcxy):java.lang.Object");
    }

    @Override // defpackage.dqiz
    public final String f(String str) {
        String string;
        Integer num = (Integer) this.c.c.get(str);
        return (num == null || (string = this.a.getString(num.intValue())) == null) ? str : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dqiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.exkb r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dqje
            if (r0 == 0) goto L13
            r0 = r6
            dqje r0 = (defpackage.dqje) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqje r0 = new dqje
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            exiz r5 = r0.d
            defpackage.fctl.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fdap r6 = r4.d
            r2 = r5
            exiz r2 = (defpackage.exiz) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            exkx r6 = new exkx
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqjo.g(exkb, fcxy):java.lang.Object");
    }
}
