package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdu implements fdat {
    public static final gdu a = new gdu();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ioi ioiVar = hin.a;
            if (ioiVar == null) {
                float f = 24.0f;
                iog iogVar = new iog("Filled.Close", f, f, f, f, 0L, 0, false, 224);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(19.0f, 6.41f, arrayList);
                ioj.g(17.59f, 5.0f, arrayList);
                ioj.g(12.0f, 10.59f, arrayList);
                ioj.g(6.41f, 5.0f, arrayList);
                ioj.g(5.0f, 6.41f, arrayList);
                ioj.g(10.59f, 12.0f, arrayList);
                ioj.g(5.0f, 17.59f, arrayList);
                ioj.g(6.41f, 19.0f, arrayList);
                ioj.g(12.0f, 13.41f, arrayList);
                ioj.g(17.59f, 19.0f, arrayList);
                ioj.g(19.0f, 17.59f, arrayList);
                ioj.g(13.41f, 12.0f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hin.a = iogVar.a();
                ioiVar = hin.a;
                ioiVar.getClass();
            }
            gkd.b(ioiVar, hjw.b(R.string.m3c_snackbar_dismiss, hmlVar), null, 0L, hmlVar, 0, 12);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
