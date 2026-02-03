package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyy implements efze, efzf {
    public static final abyu g = new abyu();
    public final egcd a;
    public final abzk b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final egbf h;
    private final fdjx i;
    private final egyt j;
    private final fdjx k;

    public abyy(egbf egbfVar, egcd egcdVar, abzk abzkVar, fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, egyt egytVar, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar2) {
        egbfVar.getClass();
        egcdVar.getClass();
        fdjxVar.getClass();
        egytVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar2.getClass();
        this.h = egbfVar;
        this.a = egcdVar;
        this.b = abzkVar;
        this.c = fcsuVar;
        this.i = fdjxVar;
        this.d = fcsuVar2;
        this.j = egytVar;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.k = fdjxVar2;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) throws IOException {
        eieu eieuVarA = eiiy.a("AutoSelect Account");
        try {
            eiju eijuVarC = auvw.c(this.k, fcyi.a, fdjz.a, new abyv(this, null));
            eieuVarA.b(eijuVarC);
            fczl.a(eieuVarA, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        return auvw.c(this.i, fcyi.a, fdjz.a, new abyx(this, efwoVar, null));
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.egzr r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.abyw
            if (r0 == 0) goto L13
            r0 = r6
            abyw r0 = (defpackage.abyw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abyw r0 = new abyw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            egyt r6 = r4.j
            egbf r2 = r4.h
            egyi r2 = r2.b()
            com.google.common.util.concurrent.ListenableFuture r5 = r6.a(r2, r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L90
        L49:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r6.next()
            egbe r0 = (defpackage.egbe) r0
            int r1 = r0.c()
            r2 = 3
            if (r1 == r2) goto L54
            egbs r1 = r0.b()
            java.lang.String r1 = r1.k
            java.lang.String r2 = "pseudonymous"
            boolean r1 = defpackage.fdbq.f(r2, r1)
            if (r1 != 0) goto L54
            r0.getClass()
            r5.add(r0)
            goto L54
        L7c:
            int r6 = r5.size()
            if (r6 != r3) goto L8e
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            egbe r5 = (defpackage.egbe) r5
            efwo r5 = r5.a()
            return r5
        L8e:
            r5 = 0
            return r5
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyy.d(egzr, fcxy):java.lang.Object");
    }
}
