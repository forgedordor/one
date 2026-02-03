package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gih {
    public static final gih a = new gih();

    private gih() {
    }

    public final void a(final fze fzeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1565826668);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(fzeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            kme.a(fzeVar.a, fzeVar.c, hxe.d(1163527043, new gig(fzeVar), hmlVarC), hmlVarC, 384, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gie
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gih gihVar = this.a;
                    int i4 = i;
                    gihVar.a(fzeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
