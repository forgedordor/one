package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadf {
    public static final void a(final aadc aadcVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1368200106);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aadcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            String strC = jqu.c(R.string.bottom_sheets_videocalling_invite_heading, new Object[]{aadcVar.a}, hmlVarC);
            String strB = jqu.b(R.string.bottom_sheets_videocalling_send_invite, hmlVarC);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: aadd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        aadc aadcVar2 = aadcVar;
                        aadcVar2.c.invoke();
                        aadcVar2.b.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dktq dktqVar = new dktq(strB, (fdae) objS);
            String strB2 = jqu.b(R.string.bottom_sheets_videocalling_no_thanks, hmlVarC);
            fdae fdaeVar = aadcVar.b;
            diuy.a(new divf(strC, dktqVar, new dktq(strB2, fdaeVar), (String) null, (List) null, new dktr(R.drawable.invite_link_prompt_graphic), 0, fdaeVar, 920), icsVar, hmlVarC, i2 & 112, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aade
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aadc aadcVar2 = aadcVar;
                    int i5 = i;
                    aadf.a(aadcVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
