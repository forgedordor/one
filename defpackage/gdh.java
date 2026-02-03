package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdh implements fdat {
    public static final gdh a = new gdh();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ioi ioiVar = him.a;
            if (ioiVar == null) {
                iog iogVar = new iog("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(15.41f, 16.59f, arrayList);
                ioj.g(10.83f, 12.0f, arrayList);
                ioj.h(4.58f, -4.59f, arrayList);
                ioj.g(14.0f, 6.0f, arrayList);
                ioj.h(-6.0f, 6.0f, arrayList);
                ioj.h(6.0f, 6.0f, arrayList);
                ioj.h(1.41f, -1.41f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                him.a = iogVar.a();
                ioiVar = him.a;
                ioiVar.getClass();
            }
            gkd.b(ioiVar, hjw.b(R.string.m3c_date_picker_switch_to_previous_month, hmlVar), null, 0L, hmlVar, 0, 12);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
