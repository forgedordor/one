package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqa {
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dqo r19, final defpackage.fdae r20, final defpackage.fdap r21, defpackage.ics r22, boolean r23, defpackage.fdae r24, final defpackage.fdat r25, defpackage.hml r26, final int r27, final int r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqa.a(dqo, fdae, fdap, ics, boolean, fdae, fdat, hml, int, int):void");
    }

    public static final void b(final dqo dqoVar, final fdae fdaeVar, final ics icsVar, final fdap fdapVar, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        dqo dqoVar2;
        int i3;
        hml hmlVarC = hmlVar.c(645832757);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i4 & 1171) != 1170, i4 & 1)) {
            icsVar = ics.e;
            dqn dqnVarA = dqoVar.a();
            if (!(dqnVarA instanceof dqm)) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dpv
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                            ((Integer) obj2).intValue();
                            dqo dqoVar3 = dqoVar;
                            fdae fdaeVar2 = fdaeVar;
                            ics icsVar2 = icsVar;
                            dqa.b(dqoVar3, fdaeVar2, icsVar2, fdapVar, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            dqoVar2 = dqoVar;
            i3 = i;
            dqm dqmVar = (dqm) dqnVarA;
            boolean zD = hmlVarC.D(dqmVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new dqf(kjc.c(dqmVar.a));
                hmwVar.af(objS);
            }
            dqz.c((dqf) objS, fdaeVar, icsVar, fdapVar, hmlVarC, i4 & 8176);
        } else {
            dqoVar2 = dqoVar;
            i3 = i;
            hmlVarC.s();
        }
        final ics icsVar2 = icsVar;
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            final dqo dqoVar3 = dqoVar2;
            final int i5 = i3;
            hpxVarL2.d = new fdat() { // from class: dpw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    dqo dqoVar4 = dqoVar3;
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar3 = icsVar2;
                    dqa.b(dqoVar4, fdaeVar2, icsVar3, fdapVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
