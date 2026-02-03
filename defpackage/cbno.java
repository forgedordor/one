package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbno {
    public final cazg a;
    public final String b;
    public final List c;

    public cbno(cazg cazgVar, String str, List list) {
        str.getClass();
        this.a = cazgVar;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbnm
            if (r0 == 0) goto L13
            r0 = r6
            cbnm r0 = (defpackage.cbnm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbnm r0 = new cbnm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            cazg r6 = r5.a
            cbnn r2 = new cbnn
            r2.<init>(r5)
            java.util.List r4 = r5.c
            ekgb r4 = defpackage.ekfv.a(r4)
            eiju r6 = r6.s(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbno.a(fcxy):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbno)) {
            return false;
        }
        cbno cbnoVar = (cbno) obj;
        return fdbq.f(this.a, cbnoVar.a) && fdbq.f(this.b, cbnoVar.b) && fdbq.f(this.c, cbnoVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Tranche(handler=" + this.a + ", queueName=" + this.b + ", items=" + this.c + ")";
    }
}
