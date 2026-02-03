package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aifa implements uep {
    private final Context a;

    public aifa(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.uep
    public final /* bridge */ /* synthetic */ wv a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.scheduled_send_badge, viewGroup, false);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.scheduled_send_badge_icon);
        viewFindViewById.getClass();
        ((ImageView) viewFindViewById).getDrawable().setAutoMirrored(true);
        return new aiez(viewInflate);
    }
}
