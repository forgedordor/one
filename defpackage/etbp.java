package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbp extends esyv {
    private final esyd a;
    private final esyv b;
    private final Type c;

    public etbp(esyd esydVar, esyv esyvVar, Type type) {
        this.a = esydVar;
        this.b = esyvVar;
        this.c = type;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) {
        return this.b.a(etdbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // defpackage.esyv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.etdd r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            esyv r2 = r4.b
            if (r1 == r0) goto L3d
            esyd r0 = r4.a
            etcz r3 = new etcz
            r3.<init>(r1)
            esyv r0 = r0.a(r3)
            boolean r1 = r0 instanceof defpackage.etbi
            if (r1 != 0) goto L26
            goto L3c
        L26:
            r1 = r2
        L27:
            boolean r3 = r1 instanceof defpackage.etbn
            if (r3 == 0) goto L37
            r3 = r1
            etbn r3 = (defpackage.etbn) r3
            esyv r3 = r3.c()
            if (r3 != r1) goto L35
            goto L37
        L35:
            r1 = r3
            goto L27
        L37:
            boolean r1 = r1 instanceof defpackage.etbi
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r0
        L3d:
            r2.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etbp.b(etdd, java.lang.Object):void");
    }
}
