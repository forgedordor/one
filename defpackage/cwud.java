package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwud implements fdat {
    public static final cwud a = new cwud();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ioi ioiVar = fwf.a;
            if (ioiVar == null) {
                iog iogVar = new iog("Outlined.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
                ioj.g(19.0f, 6.41f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fwf.a = iogVar.a();
                ioiVar = fwf.a;
                ioiVar.getClass();
            }
            dtfn.b(ioiVar, jqu.b(R.string.action_close, hmlVar), egq.k(ics.e, 16.0f), glz.a(hmlVar).s, hmlVar, 384, 0);
        }
        return fctx.a;
    }
}
