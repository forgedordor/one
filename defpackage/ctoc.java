package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoc implements ctnw {
    public final Context a;
    public final fcyh b;
    public final fdjx c;
    public final fcsu d;
    public final ctxf e;
    public final eigp f;
    public final fcsu g;
    private final fcsu h;
    private final cudy i;
    private final fcsu j;
    private final asdy k;
    private final fdpl l;
    private final fdvc m;
    private final fdpl n;

    public ctoc(Context context, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, cudy cudyVar, ctxf ctxfVar, eigp eigpVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, asdy asdyVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        cudyVar.getClass();
        ctxfVar.getClass();
        eigpVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.h = fcsuVar;
        this.d = fcsuVar2;
        this.i = cudyVar;
        this.e = ctxfVar;
        this.f = eigpVar;
        this.g = fcsuVar4;
        this.j = fcsuVar5;
        this.k = asdyVar;
        Object objB = fcsuVar3.b();
        objB.getClass();
        fdpl fdplVarA = fdqq.a(new fdui(new ctod((Optional) objB, null)));
        this.l = fdplVarA;
        fdvc fdvcVarB = fdtg.b(fdplVarA, fdjxVar, fdur.b, null);
        this.m = fdvcVarB;
        fdpl fduaVar = new fdua(asdyVar.a() ? fdplVarA : fdvcVarB, cudyVar.a(), new ctny(this, null));
        this.n = asdyVar.a() ? fduaVar : fdtg.b(fduaVar, fdjxVar, fdur.a(0L, 3), null);
    }

    @Override // defpackage.ctnw
    public final fdpl a() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cudx r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ctoa
            if (r0 == 0) goto L13
            r0 = r14
            ctoa r0 = (defpackage.ctoa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctoa r0 = new ctoa
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            alqk r13 = r0.d
            defpackage.fctl.b(r14)
            goto L8c
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            defpackage.fctl.b(r14)
            fcsu r14 = r12.h
            java.lang.Object r14 = r14.b()
            alrj r14 = (defpackage.alrj) r14
            alqm r5 = r14.v()
            fcsu r14 = r12.d
            java.lang.Object r2 = r14.b()
            cgsa r2 = (defpackage.cgsa) r2
            java.lang.String r6 = r2.s()
            java.lang.Object r14 = r14.b()
            cgsa r14 = (defpackage.cgsa) r14
            android.net.Uri r8 = r14.c()
            com.google.android.apps.messaging.startchat.chip.ChipData r4 = new com.google.android.apps.messaging.startchat.chip.ChipData
            r10 = 20
            r11 = 0
            r7 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            cudy r14 = r12.i
            r14.c(r4)
            cueh r13 = r13.d
            cueh r14 = defpackage.cueh.a
            if (r13 != r14) goto La5
            fcsu r13 = r12.j
            java.lang.Object r13 = r13.b()
            aofc r13 = (defpackage.aofc) r13
            anpj r13 = r13.a()
            eiju r13 = r13.b()
            r13.getClass()
            r14 = r5
            alqk r14 = (defpackage.alqk) r14
            r0.d = r14
            r0.c = r3
            java.lang.Object r14 = defpackage.fdxs.c(r13, r0)
            if (r14 == r1) goto La4
            r13 = r5
        L8c:
            r14.getClass()
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = defpackage.fcva.P(r14)
            aoer r14 = (defpackage.aoer) r14
            fdjx r0 = r12.c
            ctob r1 = new ctob
            r2 = 0
            r1.<init>(r12, r13, r14, r2)
            r13 = 3
            defpackage.auvw.k(r0, r2, r2, r1, r13)
            goto La5
        La4:
            return r1
        La5:
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctoc.b(cudx, fcxy):java.lang.Object");
    }
}
