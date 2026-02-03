package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdi implements fdat {
    public static final gdi a = new gdi();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ioi ioiVar = hin.b;
            if (ioiVar == null) {
                iog iogVar = new iog("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(3.0f, 17.25f, arrayList);
                arrayList.add(new ipg(21.0f));
                ioj.f(3.75f, arrayList);
                ioj.g(17.81f, 9.94f, arrayList);
                ioj.h(-3.75f, -3.75f, arrayList);
                ioj.g(3.0f, 17.25f, arrayList);
                ioj.b(arrayList);
                ioj.i(20.71f, 7.04f, arrayList);
                ioj.d(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f, arrayList);
                ioj.h(-2.34f, -2.34f, arrayList);
                ioj.d(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f, arrayList);
                ioj.h(-1.83f, 1.83f, arrayList);
                ioj.h(3.75f, 3.75f, arrayList);
                ioj.h(1.83f, -1.83f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hin.b = iogVar.a();
                ioiVar = hin.b;
                ioiVar.getClass();
            }
            gkd.b(ioiVar, hjw.b(R.string.m3c_date_picker_switch_to_input_mode, hmlVar), null, 0L, hmlVar, 0, 12);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
