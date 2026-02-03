package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kli {
    public static final fdap a = klb.a;

    public static final klr a(jcr jcrVar) {
        kkt kktVar = jcrVar.l;
        if (kktVar != null) {
            return (klr) kktVar;
        }
        itw.b("Required value was null.");
        throw new fcta();
    }

    public static final void b(fdap fdapVar, ics icsVar, fdap fdapVar2, hml hmlVar, int i, int i2) {
        int i3;
        fdap fdapVar3;
        fdap fdapVar4;
        ics icsVar2;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1783766393);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.F(fdapVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdapVar2) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            ics icsVar3 = icsVar;
            fdap fdapVar5 = i6 != 0 ? a : fdapVar2;
            fdapVar3 = fdapVar;
            c(fdapVar3, icsVar3, a, fdapVar5, hmlVarC, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            icsVar2 = icsVar3;
            fdapVar4 = fdapVar5;
        } else {
            fdapVar3 = fdapVar;
            hmlVarC.s();
            fdapVar4 = fdapVar2;
            icsVar2 = icsVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new kkx(fdapVar3, icsVar2, fdapVar4, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.fdap r23, defpackage.ics r24, defpackage.fdap r25, defpackage.fdap r26, defpackage.hml r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kli.c(fdap, ics, fdap, fdap, hml, int, int):void");
    }
}
