package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghv implements fdau {
    final /* synthetic */ fdat a;
    final /* synthetic */ boolean b;

    public ghv(fdat fdatVar, boolean z) {
        this.a = fdatVar;
        this.b = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String strB;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (hmlVar.J(i != 16, iIntValue & 1)) {
            this.a.a(hmlVar, 0);
            ico icoVar = ics.e;
            egc egcVar = gam.a;
            egt.a(egq.k(icoVar, gam.e), hmlVar);
            ioi ioiVar = hin.d;
            if (ioiVar == null) {
                iog iogVar = new iog("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(7.0f, 10.0f, arrayList);
                ioj.h(5.0f, 5.0f, arrayList);
                ioj.h(5.0f, -5.0f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hin.d = iogVar.a();
                ioiVar = hin.d;
                ioiVar.getClass();
            }
            boolean z = this.b;
            if (z) {
                hmlVar.v(1509384391);
                strB = hjw.b(R.string.m3c_date_picker_switch_to_day_selection, hmlVar);
                hmlVar.o();
            } else {
                hmlVar.v(1509478662);
                strB = hjw.b(R.string.m3c_date_picker_switch_to_year_selection, hmlVar);
                hmlVar.o();
            }
            gkd.b(ioiVar, strB, ifi.a(icoVar, true != z ? 0.0f : 180.0f), 0L, hmlVar, 0, 8);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
