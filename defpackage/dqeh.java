package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqeh extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dqbw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqeh(boolean z, dqbw dqbwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = dqbwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqeh) c((dqee) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r4.d(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.c(r1, r3) == r0) goto L12;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Lb
            goto L28
        Lb:
            java.lang.Object r4 = r3.d
            dqee r4 = (defpackage.dqee) r4
            boolean r1 = r3.b
            if (r1 == 0) goto L1e
            dqbw r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.c(r1, r3)
            if (r4 != r0) goto L28
            goto L27
        L1e:
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.d(r3)
            if (r4 != r0) goto L28
        L27:
            return r0
        L28:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqeh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dqeh dqehVar = new dqeh(this.b, this.c, fcxyVar);
        dqehVar.d = obj;
        return dqehVar;
    }
}
