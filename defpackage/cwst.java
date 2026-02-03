package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwst implements uep {
    private final Context a;

    public cwst(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.uep
    public final /* bridge */ /* synthetic */ wv a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.calendar_badge, viewGroup, false);
        viewInflate.getClass();
        return new cwss(viewInflate);
    }
}
