package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ght implements fdav {
    final /* synthetic */ fddq a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ fdap d;
    final /* synthetic */ geq e;
    final /* synthetic */ djll f;

    public ght(fddq fddqVar, int i, int i2, fdap fdapVar, djll djllVar, geq geqVar) {
        this.a = fddqVar;
        this.b = i;
        this.c = i2;
        this.d = fdapVar;
        this.f = djllVar;
        this.e = geqVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
            final int i = iIntValue + this.a.a;
            String strA = gaz.a(i, 0, 7);
            ics icsVarI = egq.i(ics.e, 72.0f, 36.0f);
            boolean z = i == this.b;
            boolean z2 = i == this.c;
            final fdap fdapVar = this.d;
            boolean zD = hmlVar.D(fdapVar) | hmlVar.B(i);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: ghs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar.invoke(Integer.valueOf(i));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            boolean zB = this.f.b(i);
            String str = String.format(hjw.b(R.string.m3c_date_picker_navigate_to_year_description, hmlVar), Arrays.copyOf(new Object[]{strA}, 1));
            str.getClass();
            ghx.e(strA, icsVarI, z, z2, fdaeVar, zB, str, this.e, hmlVar, 48);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
