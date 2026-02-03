package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtt implements dmix {
    private final dmtx a;

    public dmtt(dmtx dmtxVar) {
        this.a = dmtxVar;
    }

    @Override // defpackage.dmix
    public final dmiz a(ViewGroup viewGroup, dmiv dmivVar, fdap fdapVar) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.system_camera_picker_layout, viewGroup, false);
        dngc dngcVar = (dngc) this.a.a.b();
        dngcVar.getClass();
        viewInflate.getClass();
        return new dmtw(dngcVar, viewInflate, dmivVar);
    }
}
