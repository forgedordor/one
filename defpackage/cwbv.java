package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwbv extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cwbw e;
    final /* synthetic */ cwbs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwbv(cwbw cwbwVar, cwbs cwbsVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = cwbwVar;
        this.f = cwbsVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cwbv cwbvVar = new cwbv(this.e, this.f, (fcxy) obj5);
        cwbvVar.a = (dihq) obj;
        cwbvVar.b = (dihq) obj2;
        cwbvVar.c = (dihq) obj3;
        cwbvVar.d = (dihq) obj4;
        return cwbvVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(obj3);
        if (obj2 != null) {
            fcwwVar.add(obj2);
        }
        if (obj4 != null) {
            fcwwVar.add(obj4);
        }
        if (obj5 != null) {
            fcwwVar.add(obj5);
        }
        ekgb ekgbVarA = ekfv.a(fcva.a(fcwwVar));
        final cwbw cwbwVar = this.e;
        final cwbs cwbsVar = this.f;
        return new cwbx(ekgbVarA, new fdap() { // from class: cwbu
            /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[PHI: r5
              0x006e: PHI (r5v4 int) = (r5v3 int), (r5v3 int), (r5v7 int), (r5v7 int) binds: [B:23:0x006c, B:26:0x0078, B:11:0x003b, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // defpackage.fdap
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r9) {
                /*
                    r8 = this;
                    cwbs r0 = r2
                    int r0 = r0.a
                    cwbw r1 = r1
                    java.lang.String r9 = (java.lang.String) r9
                    r2 = 1
                    r3 = 2132082798(0x7f15006e, float:1.980572E38)
                    r4 = 2132082799(0x7f15006f, float:1.9805722E38)
                    r5 = 2132087407(0x7f15126f, float:1.9815068E38)
                    r6 = 2132083243(0x7f15022b, float:1.9806623E38)
                    r7 = 3
                    if (r0 != r7) goto L49
                    android.content.Context r0 = r1.a
                    java.lang.String r6 = r0.getString(r6)
                    boolean r6 = defpackage.fdbq.f(r9, r6)
                    if (r6 == 0) goto L26
                    r2 = 5
                    goto L7b
                L26:
                    java.lang.String r5 = r0.getString(r5)
                    boolean r5 = defpackage.fdbq.f(r9, r5)
                    if (r5 == 0) goto L32
                    r2 = 6
                    goto L7b
                L32:
                    java.lang.String r4 = r0.getString(r4)
                    boolean r4 = defpackage.fdbq.f(r9, r4)
                    r5 = 7
                    if (r4 == 0) goto L3e
                    goto L6e
                L3e:
                    java.lang.String r0 = r0.getString(r3)
                    boolean r9 = defpackage.fdbq.f(r9, r0)
                    if (r9 == 0) goto L7b
                    goto L6e
                L49:
                    android.content.Context r0 = r1.a
                    java.lang.String r6 = r0.getString(r6)
                    boolean r6 = defpackage.fdbq.f(r9, r6)
                    if (r6 == 0) goto L57
                    r2 = 2
                    goto L7b
                L57:
                    java.lang.String r5 = r0.getString(r5)
                    boolean r5 = defpackage.fdbq.f(r9, r5)
                    if (r5 == 0) goto L63
                    r2 = r7
                    goto L7b
                L63:
                    java.lang.String r4 = r0.getString(r4)
                    boolean r4 = defpackage.fdbq.f(r9, r4)
                    r5 = 4
                    if (r4 == 0) goto L70
                L6e:
                    r2 = r5
                    goto L7b
                L70:
                    java.lang.String r0 = r0.getString(r3)
                    boolean r9 = defpackage.fdbq.f(r9, r0)
                    if (r9 == 0) goto L7b
                    goto L6e
                L7b:
                    fcsu r9 = r1.b
                    java.lang.Object r9 = r9.b()
                    ains r9 = (defpackage.ains) r9
                    int r2 = r2 + (-1)
                    java.lang.String r0 = "Bugle.MiniConversationDetailsPage.Action.Count"
                    r9.e(r0, r2)
                    fctx r9 = defpackage.fctx.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwbu.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }
}
