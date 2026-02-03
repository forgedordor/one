package defpackage;

import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciq {
    private final ddnn a;
    private final LocationManager b;
    private final crma c;
    private final eosc d;

    public aciq(LocationManager locationManager, crma crmaVar, eosc eoscVar, ddnn ddnnVar) {
        this.b = locationManager;
        this.c = crmaVar;
        this.d = eoscVar;
        this.a = ddnnVar;
    }

    public final eiju a() {
        final ArrayList arrayList = new ArrayList();
        if (!this.c.i()) {
            cdew cdewVar = new cdew();
            cdewVar.b("currentLocation");
            cdewVar.c("App does not have location permission");
            arrayList.add(cdewVar.a());
            return eijx.e(arrayList);
        }
        LocationManager locationManager = this.b;
        if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network")) {
            return eiju.g(drgi.a(this.a.c(102))).h(new ejvr() { // from class: acip
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Location location = (Location) obj;
                    String str = String.format(Locale.US, "(%.4f, %.4f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    cdew cdewVar2 = new cdew();
                    cdewVar2.b("currentLocation");
                    cdewVar2.c(str);
                    cdff cdffVarA = cdewVar2.a();
                    List list = arrayList;
                    list.add(cdffVarA);
                    return list;
                }
            }, this.d);
        }
        cdew cdewVar2 = new cdew();
        cdewVar2.b("currentLocation");
        cdewVar2.c("System location is disabled");
        arrayList.add(cdewVar2.a());
        return eijx.e(arrayList);
    }
}
