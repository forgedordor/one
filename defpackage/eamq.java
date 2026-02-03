package defpackage;

import android.location.Location;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamq extends eamt {
    private final Location b;
    private final ekgb c;

    public eamq(eavj eavjVar, Location location, ekgb ekgbVar, Locale locale, String str, eaww eawwVar) {
        super(eavjVar, locale, str, eawwVar);
        this.b = location;
        this.c = ekgbVar;
    }

    @Override // defpackage.eamt
    protected final String d() {
        return "findplacefromuserlocation/json";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eamt
    public final Map e() throws IOException {
        eavj eavjVar = (eavj) this.a;
        HashMap map = new HashMap();
        ekgp ekgpVar = eang.a;
        Location location = this.b;
        f(map, "location", String.format(Locale.US, "%.15f,%.15f", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        ejwl.b(true, "maxLength must not be negative");
        StringBuilder sb = new StringBuilder();
        ekgb ekgbVar = this.c;
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            eaiz eaizVar = (eaiz) ekgbVar.get(i);
            int length = sb.length();
            ekgi ekgiVar = new ekgi();
            ekgiVar.i("mac", eaizVar.a);
            ekgiVar.i("strength_dbm", Integer.valueOf(eaizVar.b));
            ekgiVar.i("wifi_auth_type", eang.a.get(eaizVar.c));
            ekgiVar.i("is_connected", Boolean.valueOf(eaizVar.d));
            ekgiVar.i("frequency_mhz", Integer.valueOf(eaizVar.e));
            ekgp ekgpVarC = ekgiVar.c();
            ejwb ejwbVar = new ejwb(new ejwc(","), "=");
            Iterator it = ekgpVarC.entrySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            ejwbVar.a(sb2, it);
            String string = sb2.toString();
            int length2 = sb.length();
            String strConcat = (length > 0 ? "|" : "").concat(string);
            if (length2 + strConcat.length() > 4000) {
                break;
            }
            sb.append(strConcat);
        }
        f(map, "wifiaccesspoints", sb.toString());
        float accuracy = location.getAccuracy();
        Integer numValueOf = null;
        if (location.hasAccuracy() && accuracy > 0.0f) {
            numValueOf = Integer.valueOf(Math.round(accuracy * 100.0f));
        }
        f(map, "precision", numValueOf);
        f(map, "timestamp", Long.valueOf(location.getTime()));
        f(map, "fields", eanh.a(eavjVar.b()));
        return map;
    }
}
