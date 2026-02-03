package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class und implements uep {
    private final Context a;
    private final une b;

    public und(Context context, une uneVar) {
        this.a = context;
        this.b = uneVar;
    }

    @Override // defpackage.uep
    public final /* bridge */ /* synthetic */ wv a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.reaction_badge, viewGroup, false);
        umu umuVar = (umu) this.b.a.b();
        umuVar.getClass();
        viewInflate.getClass();
        return new unc(umuVar, viewInflate);
    }
}
