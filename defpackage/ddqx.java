package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqx extends ea {
    public final ddqw a = new ddqw(this);

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        ddqw ddqwVar = this.a;
        ddqwVar.b(bundle, new dcvf(ddqwVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (ddqwVar.a == null) {
            dcdt dcdtVar = dcdt.a;
            Context context = frameLayout.getContext();
            int iG = dcdtVar.g(context);
            String strC = dckf.c(context, iG);
            String strB = dckf.b(context, iG);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(strC);
            linearLayout.addView(textView);
            Intent intentI = dcdtVar.i(context, iG, null);
            if (intentI != null) {
                Button button = new Button(context);
                button.setId(R.id.button1);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(strB);
                linearLayout.addView(button);
                button.setOnClickListener(new dcvg(context, intentI));
            }
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // defpackage.ea
    public final void ac(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String debugString;
        super.ac(str, fileDescriptor, printWriter, strArr);
        printWriter.println(str + getClass().getName() + ":");
        String strConcat = str.concat("  ");
        dcvl dcvlVar = this.a.a;
        if (dcvlVar != null) {
            try {
                debugString = ((ddqv) dcvlVar).a.getDebugString(strConcat);
            } catch (RemoteException e) {
                throw new ddrw(e);
            }
        } else {
            debugString = "delegate is null";
        }
        printWriter.println(debugString);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        ClassLoader classLoader = ddqx.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        this.a.e(activity);
    }

    @Override // defpackage.ea
    public final void ai() {
        ddqw ddqwVar = this.a;
        dcvl dcvlVar = ddqwVar.a;
        if (dcvlVar != null) {
            dcvlVar.c();
        } else {
            ddqwVar.a(1);
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void aj(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.aj(activity, attributeSet, bundle);
            ddqw ddqwVar = this.a;
            ddqwVar.e(activity);
            GoogleMapOptions googleMapOptionsA = GoogleMapOptions.a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsA);
            ddqwVar.b(bundle, new dcvd(ddqwVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.ea
    public final void am() {
        ddqw ddqwVar = this.a;
        dcvl dcvlVar = ddqwVar.a;
        if (dcvlVar != null) {
            dcvlVar.g();
        } else {
            ddqwVar.a(5);
        }
        super.am();
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        ddqw ddqwVar = this.a;
        ddqwVar.b(null, new dcvi(ddqwVar));
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.h(bundle);
            ddqw ddqwVar = this.a;
            ddqwVar.b(bundle, new dcve(ddqwVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.ea
    public final void i() {
        ddqw ddqwVar = this.a;
        dcvl dcvlVar = ddqwVar.a;
        if (dcvlVar != null) {
            dcvlVar.d();
        } else {
            ddqwVar.a(2);
        }
        super.i();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        ClassLoader classLoader = ddqx.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        ddqw ddqwVar = this.a;
        dcvl dcvlVar = ddqwVar.a;
        if (dcvlVar != null) {
            dcvlVar.i(bundle);
            return;
        }
        Bundle bundle2 = ddqwVar.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // defpackage.ea
    public final void l() {
        super.l();
        ddqw ddqwVar = this.a;
        ddqwVar.b(null, new dcvh(ddqwVar));
    }

    @Override // defpackage.ea
    public final void m() {
        ddqw ddqwVar = this.a;
        dcvl dcvlVar = ddqwVar.a;
        if (dcvlVar != null) {
            dcvlVar.k();
        } else {
            ddqwVar.a(4);
        }
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        dcvl dcvlVar = this.a.a;
        if (dcvlVar != null) {
            dcvlVar.f();
        }
        super.onLowMemory();
    }
}
