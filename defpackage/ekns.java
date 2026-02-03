package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekns extends eknj {
    final Object a;
    int b;
    final /* synthetic */ eknt c;

    public ekns(eknt ekntVar, int i) {
        this.c = ekntVar;
        this.a = ekntVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // defpackage.eknh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 == r1) goto L17
            eknt r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.ejwh.a(r3, r0)
            if (r0 != 0) goto L21
        L17:
            eknt r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.d(r2)
            r4.b = r0
        L21:
            int r0 = r4.b
            if (r0 != r1) goto L27
            r0 = 0
            return r0
        L27:
            eknt r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekns.a():int");
    }

    @Override // defpackage.eknh
    public final Object b() {
        return this.a;
    }
}
