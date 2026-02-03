package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cimb {
    public static final cimb a = cilx.a(new fdap() { // from class: cilv
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            cimb cimbVar = cimb.a;
            ((cime) obj).getClass();
            return fctx.a;
        }
    });
    public final cimd b;
    public final int c;
    public final int d;
    public final int e;
    public final cily f;
    public final cilz g;

    public cimb(cimd cimdVar, int i) {
        Integer num;
        this.b = cimdVar;
        this.c = i;
        Iterator it = cimdVar.b.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((cilt) it.next()).b.length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((cilt) it.next()).b.length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        this.d = iIntValue;
        this.e = iIntValue + 1;
        this.f = new cily(this);
        this.g = new cilz(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r5, defpackage.cima r6) {
        /*
            r4 = this;
            cimd r0 = r6.b()
            r1 = 0
        L5:
            int r2 = r5.length()
            if (r1 >= r2) goto L30
            char r2 = r5.charAt(r1)
            if (r0 == 0) goto L23
            char r3 = defpackage.cimc.a(r2)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.util.Map r0 = r0.a
            java.lang.Object r0 = r0.get(r3)
            cimd r0 = (defpackage.cimd) r0
            if (r0 != 0) goto L2d
        L23:
            r0 = 64
            if (r2 != r0) goto L2c
            cimd r0 = r6.a()
            goto L2d
        L2c:
            r0 = 0
        L2d:
            int r1 = r1 + 1
            goto L5
        L30:
            java.util.List r5 = r6.c(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cimb.a(java.lang.String, cima):java.util.List");
    }
}
