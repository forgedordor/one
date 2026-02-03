package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjc implements dmix {
    private final dmjg a;

    public dmjc(dmjg dmjgVar) {
        this.a = dmjgVar;
    }

    @Override // defpackage.dmix
    public final dmiz a(ViewGroup viewGroup, dmiv dmivVar, fdap fdapVar) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.camera_button, viewGroup, false);
        dngc dngcVar = (dngc) this.a.a.b();
        dngcVar.getClass();
        viewInflate.getClass();
        return new dmjf(dngcVar, viewInflate, dmivVar);
    }
}
