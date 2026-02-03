package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqm implements MapLifecycleDelegate {
    public final IMapViewDelegate a;
    private final ViewGroup b;
    private View c;

    public ddqm(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.a = iMapViewDelegate;
        dclh.m(viewGroup);
        this.b = viewGroup;
    }

    @Override // defpackage.dcvl
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // defpackage.dcvl
    public final void b(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ddra.b(bundle, bundle2);
            IMapViewDelegate iMapViewDelegate = this.a;
            iMapViewDelegate.onCreate(bundle2);
            ddra.b(bundle2, bundle);
            this.c = (View) ObjectWrapper.unwrap(iMapViewDelegate.getView());
            ViewGroup viewGroup = this.b;
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
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
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // defpackage.dcvl
    public final void e(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
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
            this.a.getMapAsync(new ddql(ddqqVar));
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
