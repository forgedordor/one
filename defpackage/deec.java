package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService;
import defpackage.dcjb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deec extends dcfm<dcez> implements dedz {
    public deec(Context context) {
        super(context, deee.b, dcfa.q, dcfl.a);
    }

    @Override // defpackage.dedz
    public final defn a(final String str) {
        ((eksl) deee.a.h()).t("GetSpatulaPreference: %s", str);
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{deeg.a};
        dcizVar.a = new dcir() { // from class: deea
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                deef deefVar = (deef) obj;
                final deec deecVar = this.a;
                final defr defrVar = (defr) obj2;
                ISpatulaSettingsCallbacks.Stub stub = new ISpatulaSettingsCallbacks.Stub() { // from class: com.google.android.gms.spatula.settings.internal.InternalSpatulaSettingsClient$createSpatulaSettingsCallback$1
                    @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks
                    public void onGetSpatulaPreference(Status status, SpatulaSettingPreference spatulaSettingPreference) {
                        if (spatulaSettingPreference != null) {
                            dcjb.b(status, spatulaSettingPreference, defrVar);
                            return;
                        }
                        SpatulaSettingPreference spatulaSettingPreference2 = new SpatulaSettingPreference();
                        spatulaSettingPreference2.a = 0;
                        dcjb.b(status, spatulaSettingPreference2, defrVar);
                    }
                };
                ISpatulaSettingsService iSpatulaSettingsService = (ISpatulaSettingsService) deefVar.w();
                Context context = deefVar.c;
                iSpatulaSettingsService.getSpatulaPreference(stub, str, ddlh.a());
            }
        };
        dcizVar.c = 34501;
        return j(dcizVar.a());
    }
}
