package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvwc extends fcyz implements fdat {
    final /* synthetic */ bvwd a;
    final /* synthetic */ bvwb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvwc(bvwd bvwdVar, bvwb bvwbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bvwdVar;
        this.b = bvwbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvwc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            defpackage.fctl.b(r7)
            bvwb r7 = r6.b
            boolean r0 = r7.e
            r1 = 1
            if (r0 != 0) goto L40
            evtg r0 = r7.b
            r0.getClass()
            evtg r2 = r7.c
            r2.getClass()
            java.lang.Object r0 = defpackage.fcva.Y(r0)
            evqs r0 = (defpackage.evqs) r0
            if (r0 == 0) goto Lb2
            boolean r3 = r0.H()
            r4 = 0
            if (r1 != r3) goto L24
            r0 = r4
        L24:
            if (r0 != 0) goto L28
            goto Lb2
        L28:
            java.lang.Object r2 = defpackage.fcva.Y(r2)
            evqs r2 = (defpackage.evqs) r2
            if (r2 == 0) goto Lb2
            boolean r3 = r2.H()
            if (r1 != r3) goto L37
            goto L38
        L37:
            r4 = r2
        L38:
            if (r4 == 0) goto Lb2
            boolean r0 = defpackage.fdbq.f(r0, r4)
            if (r0 != 0) goto Lb2
        L40:
            bvwd r0 = r6.a
            fcsu r2 = r0.a
            java.lang.Object r3 = r2.b()
            ains r3 = (defpackage.ains) r3
            r4 = 4
            int r4 = defpackage.bwby.a(r4)
            java.lang.String r5 = "Bugle.Etouffee.MonitoredNonExceptionalStates"
            r3.e(r5, r4)
            java.lang.String r7 = r7.d
            r7.getClass()
            fcsu r0 = r0.b
            java.lang.Object r3 = r0.b()
            bakt r3 = (defpackage.bakt) r3
            ekhx r7 = r3.D(r7)
            r7.getClass()
            ekgb r7 = defpackage.ekfv.a(r7)
            java.lang.Object r0 = r0.b()
            bakt r0 = (defpackage.bakt) r0
            ekgp r7 = r0.C(r7)
            java.util.Collection r7 = r7.values()
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r7.next()
            r4 = r3
            bojh r4 = (defpackage.bojh) r4
            int r4 = r4.m()
            if (r4 != r1) goto L86
            r0.add(r3)
            goto L86
        L9d:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto Lb2
            java.lang.Object r7 = r2.b()
            ains r7 = (defpackage.ains) r7
            int r0 = r0.size()
            java.lang.String r1 = "Bugle.Etouffee.RemoteUserIdentityKeyChange.ImpactedConversations.Count"
            r7.e(r1, r0)
        Lb2:
            cbcw r7 = defpackage.cbcw.i()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvwc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvwc(this.a, this.b, fcxyVar);
    }
}
