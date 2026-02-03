package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqw extends dcvk {
    public final List d = new ArrayList();
    protected dcvc e;
    private final ea f;
    private Activity g;

    public ddqw(ea eaVar) {
        this.f = eaVar;
    }

    @Override // defpackage.dcvk
    protected final void c(dcvc dcvcVar) {
        this.e = dcvcVar;
        d();
    }

    public final void d() {
        Activity activity = this.g;
        if (activity == null || this.e == null || this.a != null) {
            return;
        }
        try {
            ddqp.a(activity);
            IMapFragmentDelegate iMapFragmentDelegateNewMapFragmentDelegate = ddrb.a(this.g).newMapFragmentDelegate(ObjectWrapper.wrap(this.g));
            if (iMapFragmentDelegateNewMapFragmentDelegate == null) {
                return;
            }
            this.e.a(new ddqv(this.f, iMapFragmentDelegateNewMapFragmentDelegate));
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ddqv) this.a).getMapAsync((ddqq) it.next());
            }
            list.clear();
        } catch (RemoteException e) {
            throw new ddrw(e);
        } catch (dcen unused) {
        }
    }

    public final void e(Activity activity) {
        this.g = activity;
        d();
    }
}
