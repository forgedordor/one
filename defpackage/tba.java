package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tba extends fcyz implements fdap {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ dbww c;
    final /* synthetic */ UUID d;
    final /* synthetic */ fcsf e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tba(tbe tbeVar, dbww dbwwVar, UUID uuid, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = tbeVar;
        this.c = dbwwVar;
        this.d = uuid;
        this.e = fcsfVar;
        this.f = duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r1.c(r2, r3, r6, r5) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L3f
        Ld:
            tbe r6 = r5.b
            dbww r1 = r5.c
            java.util.UUID r3 = r5.d
            r5.a = r2
            java.lang.Object r6 = r6.c(r1, r3, r5)
            if (r6 == r0) goto L42
        L1b:
            tbe r1 = r5.b
            fcsf r2 = r5.e
            tag r6 = (defpackage.tag) r6
            tab r3 = r6.c
            defpackage.tbe.g(r2, r3)
            fcsu r1 = r1.h
            java.lang.Object r1 = r1.b()
            tbn r1 = (defpackage.tbn) r1
            j$.time.Duration r2 = r5.f
            r2.getClass()
            java.util.UUID r3 = r5.d
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r1.c(r2, r3, r6, r5)
            if (r6 != r0) goto L3f
            goto L42
        L3f:
            fctx r6 = defpackage.fctx.a
            return r6
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tba.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new tba(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
