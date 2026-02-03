package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IOnMarkerDragListener;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqg extends IOnMarkerDragListener.Stub {
    final /* synthetic */ czdv a;

    public ddqg(czdv czdvVar) {
        this.a = czdvVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDrag(IMarkerDelegate iMarkerDelegate) {
        new ddrp(iMarkerDelegate);
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate) {
        try {
            this.a.a.R.f(new ddrp(iMarkerDelegate).a.getPosition());
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDragStart(IMarkerDelegate iMarkerDelegate) {
        new ddrp(iMarkerDelegate);
    }
}
