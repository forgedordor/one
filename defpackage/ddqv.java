package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqv implements MapLifecycleDelegate {
    public final IMapFragmentDelegate a;
    private final ea b;

    public ddqv(ea eaVar, IMapFragmentDelegate iMapFragmentDelegate) {
        this.a = iMapFragmentDelegate;
        dclh.m(eaVar);
        this.b = eaVar;
    }

    @Override // defpackage.dcvl
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ddra.b(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                IObjectWrapper iObjectWrapperOnCreateView = this.a.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                ddra.b(bundle2, bundle);
                return (View) ObjectWrapper.unwrap(iObjectWrapperOnCreateView);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void b(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ddra.b(bundle, bundle2);
            Bundle bundle3 = this.b.m;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                ddra.c(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            this.a.onCreate(bundle2);
            ddra.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void c() {
        try {
            this.a.onDestroy();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void d() {
        try {
            this.a.onDestroyView();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void e(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            ddra.b(bundle2, bundle3);
            this.a.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
            ddra.b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void f() {
        try {
            this.a.onLowMemory();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void g() {
        try {
            this.a.onPause();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
    public final void getMapAsync(ddqq ddqqVar) {
        try {
            this.a.getMapAsync(new ddqu(ddqqVar));
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void h() {
        try {
            this.a.onResume();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ddra.b(bundle, bundle2);
            this.a.onSaveInstanceState(bundle2);
            ddra.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void j() {
        try {
            this.a.onStart();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // defpackage.dcvl
    public final void k() {
        try {
            this.a.onStop();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }
}
