package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdg implements fdat {
    public static final gdg a = new gdg();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ioi ioiVar = hin.c;
            if (ioiVar == null) {
                iog iogVar = new iog("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(9.0f, 11.0f, arrayList);
                ioj.g(7.0f, 11.0f, arrayList);
                ioj.m(2.0f, arrayList);
                ioj.f(2.0f, arrayList);
                ioj.m(-2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(13.0f, 11.0f, arrayList);
                ioj.f(-2.0f, arrayList);
                ioj.m(2.0f, arrayList);
                ioj.f(2.0f, arrayList);
                ioj.m(-2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(17.0f, 11.0f, arrayList);
                ioj.f(-2.0f, arrayList);
                ioj.m(2.0f, arrayList);
                ioj.f(2.0f, arrayList);
                ioj.m(-2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(19.0f, 4.0f, arrayList);
                ioj.f(-1.0f, arrayList);
                ioj.g(18.0f, 2.0f, arrayList);
                ioj.f(-2.0f, arrayList);
                ioj.m(2.0f, arrayList);
                ioj.g(8.0f, 4.0f, arrayList);
                ioj.g(8.0f, 2.0f, arrayList);
                ioj.g(6.0f, 2.0f, arrayList);
                ioj.m(2.0f, arrayList);
                ioj.g(5.0f, 4.0f, arrayList);
                ioj.d(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f, arrayList);
                ioj.g(3.0f, 20.0f, arrayList);
                ioj.d(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f, arrayList);
                ioj.f(14.0f, arrayList);
                ioj.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                ioj.g(21.0f, 6.0f, arrayList);
                ioj.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(19.0f, 20.0f, arrayList);
                ioj.g(5.0f, 20.0f, arrayList);
                ioj.g(5.0f, 9.0f, arrayList);
                ioj.f(14.0f, arrayList);
                ioj.m(11.0f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hin.c = iogVar.a();
                ioiVar = hin.c;
                ioiVar.getClass();
            }
            gkd.b(ioiVar, hjw.b(R.string.m3c_date_picker_switch_to_calendar_mode, hmlVar), null, 0L, hmlVar, 0, 12);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
