package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcg implements acth {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner");
    public final fdjx b;
    public final fdjx c;
    public final clhx d;
    public final asae e;
    public final fcsu f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final fdpl i;
    private final Context j;
    private final cliy k;

    public adcg(fdjx fdjxVar, fdjx fdjxVar2, Context context, clhx clhxVar, asae asaeVar, fcsu fcsuVar, cliy cliyVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        context.getClass();
        clhxVar.getClass();
        cliyVar.getClass();
        this.b = fdjxVar;
        this.c = fdjxVar2;
        this.j = context;
        this.d = clhxVar;
        this.e = asaeVar;
        this.f = fcsuVar;
        this.k = cliyVar;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new fdqt(new fdtm(fdqq.a(new adcf(cliyVar.h(), this)), new adby(null)), new adbz(this, null));
    }

    @Override // defpackage.acth
    public final eiju a() {
        actk actkVarL = actn.l();
        acte acteVar = (acte) actkVarL;
        acteVar.a = "satellite_manual_connection_banner";
        actkVarL.c(R.drawable.gs_android_satellite_vd_theme_24);
        Context context = this.j;
        acteVar.c = context.getString(R.string.satellite_manual_connection_banner_body_text);
        actkVarL.b(false);
        actkVarL.e(context.getString(R.string.satellite_manual_connection_banner_negative_button_text));
        acteVar.e = new actm() { // from class: adbv
            @Override // defpackage.actm
            public final void a(egpr egprVar, View view) {
                adcg adcgVar = this.a;
                if (adcgVar.e.a() && adcgVar.h.getAndSet(true)) {
                    ekrw ekrwVarH = adcg.a.h();
                    ekrwVarH.X(eksq.a, "BugleSatellite");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner", "onConnectClick", 89, "SatelliteManualConnectionBanner.kt")).q("Connect request from SatelliteManualConnectionBanner is already being processed");
                } else {
                    ekrw ekrwVarH2 = adcg.a.h();
                    ekrwVarH2.X(eksq.a, "BugleSatellite");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner", "onConnectClick", 92, "SatelliteManualConnectionBanner.kt")).q("Connect button clicked on SatelliteManualConnectionBanner");
                    auvw.k(adcgVar.c, null, null, new adcb(adcgVar, null), 3);
                }
            }
        };
        actkVarL.d(new actl() { // from class: adbw
            @Override // defpackage.actl
            public final void n() {
            }
        });
        eiju eijuVarE = eijx.e(actkVarL.a());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.acth
    public final eiju b() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new adbx(this, null));
    }

    @Override // defpackage.acth
    public final /* synthetic */ Set c() {
        return new ekph(cdpg.HOME);
    }

    @Override // defpackage.acth
    public final int d() {
        return 1;
    }
}
