package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orh extends owd implements opd {
    public final opq a;
    private final fcyh b;
    private int c;

    public orh(fcyh fcyhVar, opq opqVar) {
        opqVar.getClass();
        this.b = fcyhVar;
        this.a = opqVar;
        this.c = Integer.MIN_VALUE;
        opqVar.a.a(new ore(this));
        f(new fdae() { // from class: ord
            @Override // defpackage.fdae
            public final Object invoke() {
                orh orhVar = this.a;
                orf orfVar = new orf(orhVar);
                opq opqVar2 = orhVar.a;
                opqVar2.a.b(orfVar);
                opqVar2.c();
                return fctx.a;
            }
        });
    }

    @Override // defpackage.opd
    public final void a(int i) {
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.c = i;
            return;
        }
        throw new IllegalStateException("Page size is already set to " + this.c + '.');
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    @Override // defpackage.owd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.owe r9) {
        /*
            r8 = this;
            opq r0 = r8.a
            int r1 = r0.b
            int r1 = r1 + (-1)
            r2 = 1
            r3 = 0
            if (r1 == r2) goto Ld5
            java.lang.Integer r1 = r9.b
            if (r1 == 0) goto Ld5
            java.util.List r2 = r9.a
            int r1 = r1.intValue()
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L1d
        L1a:
            r9 = r3
            goto Lce
        L1d:
            java.util.Iterator r4 = r2.iterator()
        L21:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1a
            java.lang.Object r5 = r4.next()
            owb r5 = (defpackage.owb) r5
            java.util.List r5 = r5.b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L21
            int r9 = r9.c
            int r1 = r1 - r9
            r9 = 0
        L39:
            int r4 = defpackage.fcva.e(r2)
            if (r9 >= r4) goto L5d
            java.lang.Object r4 = r2.get(r9)
            owb r4 = (defpackage.owb) r4
            java.util.List r4 = r4.b
            int r4 = defpackage.fcva.e(r4)
            if (r1 <= r4) goto L5d
            java.lang.Object r4 = r2.get(r9)
            owb r4 = (defpackage.owb) r4
            java.util.List r4 = r4.b
            int r4 = r4.size()
            int r1 = r1 - r4
            int r9 = r9 + 1
            goto L39
        L5d:
            java.util.Iterator r4 = r2.iterator()
        L61:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc6
            java.lang.Object r5 = r4.next()
            owb r5 = (defpackage.owb) r5
            java.util.List r5 = r5.b
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L61
            int r4 = r2.size()
            java.util.ListIterator r4 = r2.listIterator(r4)
        L7d:
            boolean r6 = r4.hasPrevious()
            if (r6 == 0) goto Lbe
            java.lang.Object r6 = r4.previous()
            owb r6 = (defpackage.owb) r6
            java.util.List r6 = r6.b
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L7d
            if (r1 >= 0) goto L98
            java.lang.Object r9 = defpackage.fcva.N(r5)
            goto Lce
        L98:
            int r4 = defpackage.fcva.e(r2)
            if (r9 != r4) goto Lb1
            java.lang.Object r4 = defpackage.fcva.S(r2)
            owb r4 = (defpackage.owb) r4
            java.util.List r4 = r4.b
            int r4 = defpackage.fcva.e(r4)
            if (r1 <= r4) goto Lb1
            java.lang.Object r9 = defpackage.fcva.S(r6)
            goto Lce
        Lb1:
            java.lang.Object r9 = r2.get(r9)
            owb r9 = (defpackage.owb) r9
            java.util.List r9 = r9.b
            java.lang.Object r9 = r9.get(r1)
            goto Lce
        Lbe:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r0 = "List contains no element matching the predicate."
            r9.<init>(r0)
            throw r9
        Lc6:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r9.<init>(r0)
            throw r9
        Lce:
            if (r9 == 0) goto Ld5
            java.lang.Object r9 = r0.a(r9)
            return r9
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orh.b(owe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // defpackage.owd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ovx r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ovw
            if (r0 == 0) goto L7
            orr r1 = defpackage.orr.a
            goto L14
        L7:
            boolean r1 = r6 instanceof defpackage.ovu
            if (r1 == 0) goto Le
            orr r1 = defpackage.orr.c
            goto L14
        Le:
            boolean r1 = r6 instanceof defpackage.ovv
            if (r1 == 0) goto L4c
            orr r1 = defpackage.orr.b
        L14:
            int r2 = r5.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L34
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"
            r2.println(r3)
            if (r0 == 0) goto L2f
            r0 = r6
            ovw r0 = (defpackage.ovw) r0
            int r0 = r0.b
            int r2 = r0 % 3
            if (r2 != 0) goto L2f
            int r0 = r0 / 3
            goto L31
        L2f:
            int r0 = r6.b
        L31:
            r2 = r0
            r5.c = r2
        L34:
            opp r0 = new opp
            java.lang.Object r3 = r6.a()
            int r4 = r6.b
            r0.<init>(r1, r3, r4, r2)
            fcyh r1 = r5.b
            org r2 = new org
            r3 = 0
            r2.<init>(r5, r0, r6, r3)
            java.lang.Object r6 = defpackage.fdin.a(r1, r2, r7)
            return r6
        L4c:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orh.c(ovx, fcxy):java.lang.Object");
    }

    @Override // defpackage.owd
    public final boolean d() {
        return false;
    }
}
