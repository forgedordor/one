package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadj {
    public static final void a(final aadg aadgVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-436969710);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aadgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            String strB = jqu.b(R.string.bottom_sheets_videocalling_meet_setup_heading, hmlVarC);
            String strB2 = jqu.b(R.string.bottom_sheets_videocalling_meet_setup_body, hmlVarC);
            String strB3 = jqu.b(R.string.bottom_sheets_videocalling_set_up_meet, hmlVarC);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: aadh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        aadg aadgVar2 = aadgVar;
                        aadgVar2.b.invoke();
                        aadgVar2.a.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dktq dktqVar = new dktq(strB3, (fdae) objS);
            String strB4 = jqu.b(R.string.bottom_sheets_videocalling_no_thanks, hmlVarC);
            fdae fdaeVar = aadgVar.a;
            diuy.a(new divf(strB, dktqVar, new dktq(strB4, fdaeVar), strB2, (List) null, new dktr(R.drawable.setup_meet_prompt_graphic), 0, fdaeVar, 912), icsVar, hmlVarC, i2 & 112, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aadi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aadg aadgVar2 = aadgVar;
                    int i5 = i;
                    aadj.a(aadgVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
