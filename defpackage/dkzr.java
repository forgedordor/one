package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzr {
    public static final void a(final dkzp dkzpVar, final boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        hml hmlVarC = hmlVar.c(1599544550);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dkzpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        boolean z2 = i4 == 0;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z3 = z2 & z;
            if (dkzpVar instanceof dkzo) {
                hmlVarC.v(-630300480);
                throw null;
            }
            if (dkzpVar instanceof dkzn) {
                hmlVarC.v(-630021015);
                dkzn dkznVar = (dkzn) dkzpVar;
                dkzw dkzwVar = dkznVar.c;
                hmlVarC.v(-435964415);
                if (dkzwVar != null) {
                    dlac.a(dkzwVar, hmlVarC, 0);
                    egt.a(egq.o(ics.e, 12.0f), hmlVarC);
                }
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                dlaa.b(dkznVar.a, dkznVar.b, z3, hmlVarC, (i3 << 3) & 896, 0);
                z = z3;
                hmwVar.ab();
            } else {
                z = z3;
                if (!fdbq.f(dkzpVar, dkzm.a)) {
                    hmlVarC.v(-435975500);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-435955261);
                dlaa.b(null, jqu.b(R.string.reply_snippet_deleted_message_text, hmlVarC), false, hmlVarC, 6, 4);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkzq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkzp dkzpVar2 = dkzpVar;
                    int i5 = i;
                    dkzr.a(dkzpVar2, z, (hml) obj, hpy.a(i5 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
