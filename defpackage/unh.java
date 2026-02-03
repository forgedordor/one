package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unh implements uep {
    @Override // defpackage.uep
    public final /* bridge */ /* synthetic */ wv a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_reaction_badge, viewGroup, false);
        viewInflate.getClass();
        return new ung(viewInflate);
    }
}
