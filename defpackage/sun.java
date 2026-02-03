package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sun extends BroadcastReceiver {
    public final fdis a;
    private final fdjx b;

    public sun(fdjx fdjxVar, fdis fdisVar) {
        this.b = fdjxVar;
        this.a = fdisVar;
    }

    public static final Map a(Bundle bundle, String str, int i) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            if (byteArray == null) {
                ((eksl) sux.a.j()).t("Null language pack data from %s", str);
                return fcvp.a;
            }
            evtg<exxd> evtgVar = ((exxf) evsn.parseFrom(exxf.a, byteArray, evrr.a())).b;
            evtgVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(evtgVar, 10)), 16));
            for (exxd exxdVar : evtgVar) {
                Locale localeForLanguageTag = Locale.forLanguageTag(exxdVar.b);
                localeForLanguageTag.getClass();
                fcti fctiVar = new fcti(localeForLanguageTag, new aonx(localeForLanguageTag, exxdVar.c, i));
                linkedHashMap.put(fctiVar.a, fctiVar.b);
            }
            return linkedHashMap;
        } catch (evtj e) {
            ((eksl) ((eksl) sux.a.j()).g(e)).t("Invalid language pack data from %s", str);
            return fcvp.a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        auvw.k(this.b, null, null, new sum(this, null), 3);
    }
}
