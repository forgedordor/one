package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqn extends dcvk {
    public final List d = new ArrayList();
    protected dcvc e;
    private final ViewGroup f;
    private final Context g;
    private final GoogleMapOptions h;

    public ddqn(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f = viewGroup;
        this.g = context;
        this.h = googleMapOptions;
    }

    @Override // defpackage.dcvk
    protected final void c(dcvc dcvcVar) {
        this.e = dcvcVar;
        if (dcvcVar == null || this.a != null) {
            return;
        }
        try {
            try {
                Context context = this.g;
                ddqp.a(context);
                IMapViewDelegate iMapViewDelegateNewMapViewDelegate = ddrb.a(context).newMapViewDelegate(ObjectWrapper.wrap(context), this.h);
                if (iMapViewDelegateNewMapViewDelegate == null) {
                    return;
                }
                this.e.a(new ddqm(this.f, iMapViewDelegateNewMapViewDelegate));
                List list = this.d;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((ddqm) this.a).a.getMapAsync(new ddql((ddqq) it.next()));
                    } catch (RemoteException e) {
                        throw new ddrw(e);
                    }
                }
                list.clear();
            } catch (dcen unused) {
            }
        } catch (RemoteException e2) {
            throw new ddrw(e2);
        }
    }
}
