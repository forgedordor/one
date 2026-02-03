package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acit implements acin {
    private final Context a;
    private final aciq b;
    private final eosc c;

    public acit(Context context, acir acirVar, eosc eoscVar) {
        this.a = context;
        int i = ddny.a;
        ddos ddosVar = new ddos(context);
        LocationManager locationManager = (LocationManager) acirVar.a.b();
        locationManager.getClass();
        crma crmaVar = (crma) acirVar.b.b();
        crmaVar.getClass();
        eosc eoscVar2 = (eosc) acirVar.c.b();
        eoscVar2.getClass();
        this.b = new aciq(locationManager, crmaVar, eoscVar2, ddosVar);
        this.c = eoscVar;
    }

    @Override // defpackage.acin
    public final eiju a() {
        return this.b.a().h(new ejvr() { // from class: acis
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                HashMap map = new HashMap();
                for (cdff cdffVar : (List) obj) {
                    map.put(cdffVar.a(), cdffVar.b());
                }
                return map;
            }
        }, this.c);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        return this.b.a();
    }

    @Override // defpackage.acin
    public final elhx e() {
        return elhx.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_LOCATION;
    }

    @Override // defpackage.acin
    public final String f() {
        return this.a.getString(R.string.location_feedback_data_description);
    }

    @Override // defpackage.acin
    public final String g() {
        return this.a.getString(R.string.location_feedback_data_detail_title);
    }

    @Override // defpackage.acin
    public final String h() {
        return this.a.getString(R.string.location_feedback_data_name);
    }

    @Override // defpackage.acin
    public final String i() {
        return this.a.getString(R.string.location_feedback_data_rationale);
    }

    @Override // defpackage.acin
    public final String j() {
        return this.a.getString(R.string.location_feedback_data_rationale_title);
    }
}
