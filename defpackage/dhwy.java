package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwy implements dhwe {
    public dhwe a;
    public boolean b;
    private final dhwf c;
    private final dhwu d;

    public dhwy(dhwe dhweVar, dhwf dhwfVar, int i) {
        dhweVar.getClass();
        this.a = dhweVar;
        this.c = dhwfVar;
        this.d = i + (-1) != 0 ? new dhww() : new dhwv();
    }

    @Override // defpackage.dhwe
    public final dhwj a(final dhuu dhuuVar) {
        dhuuVar.getClass();
        return (dhwj) this.d.a(new fdae() { // from class: dhwr
            @Override // defpackage.fdae
            public final Object invoke() {
                dhwy dhwyVar = this.a;
                if (dhwyVar.b) {
                    throw new IllegalStateException("Classifier already closed");
                }
                return dhwyVar.a.a(dhuuVar);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dhvz r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dhwx
            if (r0 == 0) goto L13
            r0 = r6
            dhwx r0 = (defpackage.dhwx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhwx r0 = new dhwx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            dhwf r6 = r4.c
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            dhwu r5 = r4.d
            dhwe r6 = (defpackage.dhwe) r6
            dhwq r0 = new dhwq
            r0.<init>()
            r5.b(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhwy.b(dhvz, fcxy):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.b(new fdae() { // from class: dhwp
            @Override // defpackage.fdae
            public final Object invoke() throws Exception {
                dhwy dhwyVar = this.a;
                dhwo.a(dhwyVar.a);
                dhwyVar.b = true;
                return fctx.a;
            }
        });
    }
}
