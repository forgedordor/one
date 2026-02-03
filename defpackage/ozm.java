package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ozm extends ea implements ozx, ozv, ozw, oyf {
    public final ozi a = new ozi(this);
    public int ag = R.layout.preference_list_fragment;
    public final Handler ah = new ozg(this, Looper.getMainLooper());
    public final Runnable ai = new ozh(this);
    public ozy b;
    public RecyclerView c;
    public boolean d;
    public boolean e;

    @Override // defpackage.oyf
    public final Preference a(CharSequence charSequence) {
        ozy ozyVar = this.b;
        if (ozyVar == null) {
            return null;
        }
        return ozyVar.d(charSequence);
    }

    public void aV(PreferenceScreen preferenceScreen) {
        throw null;
    }

    public boolean aW(Preference preference) {
        boolean zA = false;
        if (preference.u == null) {
            return false;
        }
        for (ea eaVar = this; !zA && eaVar != null; eaVar = eaVar.E) {
            if (eaVar instanceof ozk) {
                zA = ((ozk) eaVar).a();
            }
        }
        if (!zA && (z() instanceof ozk)) {
            zA = ((ozk) z()).a();
        }
        if (zA) {
            return true;
        }
        if ((G() instanceof ozk) && ((ozk) G()).a()) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        fr frVarJ = J();
        Bundle bundleR = preference.r();
        em emVarK = frVarJ.k();
        fg().getClassLoader();
        ea eaVarB = emVarK.b(preference.u);
        eaVarB.at(bundleR);
        eaVarB.aP(this);
        cg cgVar = new cg(frVarJ);
        cgVar.D(((View) N().getParent()).getId(), eaVarB);
        cgVar.v(null);
        cgVar.j();
        return true;
    }

    @Override // defpackage.ozw
    public final void aX() {
        boolean zA = false;
        for (ea eaVar = this; !zA && eaVar != null; eaVar = eaVar.E) {
            if (eaVar instanceof ozl) {
                zA = ((ozl) eaVar).a();
            }
        }
        if (!zA && (z() instanceof ozl)) {
            zA = ((ozl) z()).a();
        }
        if (zA || !(G() instanceof ozl)) {
            return;
        }
        ((ozl) G()).a();
    }

    public RecyclerView b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (A().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        A();
        recyclerView2.ao(new LinearLayoutManager());
        recyclerView2.ak(new paa(recyclerView2));
        return recyclerView2;
    }

    public final PreferenceScreen e() {
        ozy ozyVar = this.b;
        if (ozyVar == null) {
            return null;
        }
        return ozyVar.b;
    }

    public final void f(int i) {
        s();
        aV(this.b.e(A(), i, e()));
    }

    public abstract void gh(Bundle bundle, String str);

    public final void gi() {
        PreferenceScreen preferenceScreenE = e();
        if (preferenceScreenE != null) {
            this.c.al(new ozt(preferenceScreenE));
            preferenceScreenE.B();
        }
    }

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        TypedValue typedValue = new TypedValue();
        A().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        A().getTheme().applyStyle(i, false);
        ozy ozyVar = new ozy(A());
        this.b = ozyVar;
        ozyVar.e = this;
        Bundle bundle2 = this.m;
        gh(bundle, bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.ea
    public void i() {
        Handler handler = this.ah;
        handler.removeCallbacks(this.ai);
        handler.removeMessages(1);
        if (this.d) {
            this.c.al(null);
            PreferenceScreen preferenceScreenE = e();
            if (preferenceScreenE != null) {
                preferenceScreenE.D();
            }
        }
        this.c = null;
        super.i();
    }

    @Override // defpackage.ea
    public void l() {
        super.l();
        ozy ozyVar = this.b;
        ozyVar.c = this;
        ozyVar.d = this;
    }

    @Override // defpackage.ea
    public void m() {
        super.m();
        ozy ozyVar = this.b;
        ozyVar.c = null;
        ozyVar.d = null;
    }

    @Override // defpackage.ozv
    public final void r(Preference preference) {
        dn oyvVar;
        boolean zA = false;
        for (ea eaVar = this; !zA && eaVar != null; eaVar = eaVar.E) {
            if (eaVar instanceof ozj) {
                zA = ((ozj) eaVar).a();
            }
        }
        if (!zA && (z() instanceof ozj)) {
            zA = ((ozj) z()).a();
        }
        if (zA) {
            return;
        }
        if (!((G() instanceof ozj) && ((ozj) G()).a()) && J().h("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                oyvVar = new oyl();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                oyvVar.at(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                oyvVar = new oyr();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                oyvVar.at(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.s;
                oyvVar = new oyv();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                oyvVar.at(bundle3);
            }
            oyvVar.aP(this);
            oyvVar.s(J(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void s() {
        if (this.b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public final void t(Drawable drawable) {
        ozi oziVar = this.a;
        if (drawable != null) {
            oziVar.b = drawable.getIntrinsicHeight();
        } else {
            oziVar.b = 0;
        }
        oziVar.a = drawable;
        oziVar.d.c.R();
    }
}
