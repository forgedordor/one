package defpackage;

import java.util.ArrayList;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzh {
    public final ekzg a;
    int b = 0;
    public final ArrayList c = new ArrayList();
    public final PriorityQueue d = new PriorityQueue(10, new ekzk());
    public final /* synthetic */ ekzm e;

    public ekzh(ekzm ekzmVar, ekzg ekzgVar) {
        this.e = ekzmVar;
        this.a = ekzgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekzj a(defpackage.ekxo r6) throws java.lang.Throwable {
        /*
            r5 = this;
            ekzg r0 = r5.a
            ekyh r0 = (defpackage.ekyh) r0
            elaw r1 = r0.b
            ekya r1 = r1.a()
            ekxp r2 = r6.d
            int r2 = defpackage.ekxy.e(r1, r2)
            r3 = 3
            if (r2 != r3) goto L14
            goto L30
        L14:
            r3 = 2
            if (r2 != r3) goto L18
            goto L32
        L18:
            ekxp r2 = r6.d
            int r2 = defpackage.ekxy.a(r1, r2)
            if (r2 == 0) goto L32
            boolean r2 = r0.n(r1, r6)
            if (r2 != 0) goto L32
            ekyj r2 = r6.a()
            boolean r1 = r0.o(r1, r2)
            if (r1 != 0) goto L32
        L30:
            r6 = 0
            return r6
        L32:
            byte r1 = r6.b
            r2 = 0
            r3 = 1
            if (r1 < 0) goto L5e
            int r1 = r1 + r3
            r4 = 30
            if (r1 > r4) goto L5d
            elaw r1 = r0.b
            ekya r1 = r1.a()
            ekxp r4 = r6.d
            int r4 = defpackage.ekxy.e(r1, r4)
            if (r4 == r3) goto L4c
            goto L5e
        L4c:
            boolean r4 = r0.n(r1, r6)
            if (r4 == 0) goto L53
            goto L5e
        L53:
            ekyj r4 = r6.a()
            boolean r0 = r0.o(r1, r4)
            if (r0 == 0) goto L5e
        L5d:
            r2 = r3
        L5e:
            ekzj r0 = new ekzj
            r0.<init>()
            r0.a = r6
            r0.b = r2
            if (r2 != 0) goto L6e
            r6 = 4
            ekzj[] r6 = new defpackage.ekzj[r6]
            r0.d = r6
        L6e:
            int r6 = r5.b
            int r6 = r6 + r3
            r5.b = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekzh.a(ekxo):ekzj");
    }

    public final void b(ekzj ekzjVar) throws Throwable {
        ekxp ekxpVar;
        if (ekzjVar == null) {
            return;
        }
        if (ekzjVar.b) {
            this.c.add(ekzjVar.a.d);
            return;
        }
        ekxo ekxoVar = ekzjVar.a;
        byte b = ekxoVar.b;
        ekxo[] ekxoVarArr = new ekxo[4];
        for (int i = 0; i < 4; i++) {
            ekxoVarArr[i] = new ekxo();
        }
        if (!ekxoVar.d.G()) {
            long j = ekxoVar.d.d;
            long jLowestOneBit = Long.lowestOneBit(j);
            ekxp ekxpVar2 = new ekxp((j - jLowestOneBit) + (jLowestOneBit >>> 2));
            long j2 = ekxoVar.d.j();
            ekxg ekxgVar = new ekxg(ekzf.c(ekzf.b(ekxp.f(j2))), ekzf.c(ekzf.b((int) j2)));
            double d = ekxgVar.a;
            double d2 = ekxgVar.b;
            for (int i2 = 0; i2 < 4; i2++) {
                ekxo ekxoVar2 = ekxoVarArr[i2];
                ekxoVar2.a = ekxoVar.a;
                ekxoVar2.b = (byte) (ekxoVar.b + 1);
                ekxoVar2.c = (byte) (ekxoVar.c ^ ekxm.b(i2));
                ekxoVar2.d = ekxpVar2;
                int iA = ekxm.a(ekxoVar.c, i2);
                if ((iA & 2) != 0) {
                    ekxoVar2.e = d;
                    ekxpVar = ekxpVar2;
                    ekxoVar2.f = ekxoVar.f;
                } else {
                    ekxpVar = ekxpVar2;
                    ekxoVar2.e = ekxoVar.e;
                    ekxoVar2.f = d;
                }
                if ((iA & 1) != 0) {
                    ekxoVar2.g = d2;
                    ekxoVar2.h = ekxoVar.h;
                } else {
                    ekxoVar2.g = ekxoVar.g;
                    ekxoVar2.h = d2;
                }
                ekxpVar2 = ekxpVar.v();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            ekzj ekzjVarA = a(ekxoVarArr[i4]);
            if (ekzjVarA != null) {
                ekzj[] ekzjVarArr = ekzjVar.d;
                int i5 = ekzjVar.c;
                ekzjVar.c = i5 + 1;
                ekzjVarArr[i5] = ekzjVarA;
                if (ekzjVarA.b) {
                    i3++;
                }
            }
        }
        int i6 = ekzjVar.c;
        if (i6 != 0) {
            if (i3 != 4 || ekzjVar.a.b < 0) {
                this.d.add(new ekzl(-((((ekzjVar.a.b << 2) + i6) << 2) + i3), ekzjVar));
            } else {
                ekzjVar.b = true;
                b(ekzjVar);
            }
        }
    }
}
