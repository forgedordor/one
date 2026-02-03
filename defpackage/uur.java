package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uur implements uep {
    private final Context a;

    public uur(Context context) {
        this.a = context;
    }

    @Override // defpackage.uep
    public final /* bridge */ /* synthetic */ wv a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.star_badge, viewGroup, false);
        viewInflate.getClass();
        return new uuq(viewInflate);
    }
}
