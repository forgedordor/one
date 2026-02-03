package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aiif extends ecdm {
    private static void aY(Preference preference) {
        preference.Z();
        preference.x = true;
        preference.y = false;
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            for (int i = 0; i < preferenceGroup.k(); i++) {
                aY(preferenceGroup.o(i));
            }
        }
    }

    @Override // defpackage.ozm
    public final void aV(PreferenceScreen preferenceScreen) {
        ozy ozyVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen != null) {
            aY(preferenceScreen);
        }
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (ozyVar = this.b).b)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.D();
        }
        ozyVar.b = preferenceScreen;
        this.d = true;
        if (this.e) {
            Handler handler = this.ah;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.obtainMessage(1).sendToTarget();
        }
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenE;
        this.am.k(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenE = e()) != null) {
            preferenceScreenE.x(bundle2);
        }
        if (this.d) {
            gi();
        }
        this.e = true;
        RecyclerView recyclerView = this.c;
        recyclerView.setImportantForAccessibility(2);
        recyclerView.y(new aiie());
        if (bj()) {
            recyclerView.setOnApplyWindowInsetsListener(new dajf(new daje() { // from class: aiid
                @Override // defpackage.daje
                public final void a(View view2, WindowInsets windowInsets) {
                    view2.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                }
            }));
        }
        if (asgy.a()) {
            t(null);
        }
    }

    @Override // defpackage.ozm
    public final RecyclerView b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!asgy.a()) {
            return super.b(layoutInflater, viewGroup, bundle);
        }
        RecyclerView recyclerViewB = super.b(layoutInflater, viewGroup, bundle);
        Resources resourcesB = B();
        recyclerViewB.v(new aiii(eehg.b(recyclerViewB, R.attr.colorSurface), resourcesB.getDimensionPixelSize(R.dimen.settings_containment_corner_radius_large), resourcesB.getDimensionPixelSize(R.dimen.settings_containment_corner_radius_small), resourcesB.getDimensionPixelSize(R.dimen.settings_containment_item_offset), resourcesB.getDimensionPixelSize(R.dimen.settings_containment_side_offset)));
        return recyclerViewB;
    }

    protected boolean bj() {
        return true;
    }

    @Override // defpackage.ozm
    public void gh(Bundle bundle, String str) {
        if (asgy.a()) {
            A().getTheme().applyStyle(R.style.ThemeOverlay_BugleCoolRanch3_Preference, true);
        }
    }
}
