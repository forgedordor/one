package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdj implements fdat {
    public static final gdj a = new gdj();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ioi ioiVar = him.b;
            if (ioiVar == null) {
                iog iogVar = new iog("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(8.59f, 16.59f, arrayList);
                ioj.g(13.17f, 12.0f, arrayList);
                ioj.g(8.59f, 7.41f, arrayList);
                ioj.g(10.0f, 6.0f, arrayList);
                ioj.h(6.0f, 6.0f, arrayList);
                ioj.h(-6.0f, 6.0f, arrayList);
                ioj.h(-1.41f, -1.41f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                him.b = iogVar.a();
                ioiVar = him.b;
                ioiVar.getClass();
            }
            gkd.b(ioiVar, hjw.b(R.string.m3c_date_picker_switch_to_next_month, hmlVar), null, 0L, hmlVar, 0, 12);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
