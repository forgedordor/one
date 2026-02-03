package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adeh extends adel {
    private final dooy c;
    private final adfx d;

    public adeh(dooy dooyVar) {
        this.c = dooyVar;
        this.d = new adfx(dooyVar);
    }

    @Override // defpackage.adel
    public final /* bridge */ /* synthetic */ adeo a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, fdap fdapVar) {
        View viewFindViewById = layoutInflater.inflate(true != z ? R.layout.google_photos_onboarding_ineligible_cell : R.layout.google_photos_onboarding_ineligible_header, viewGroup, false).findViewById(R.id.gallery_photos_promo_signed_out_container);
        viewFindViewById.getClass();
        aden adenVar = new aden(viewFindViewById);
        TextView textView = adenVar.h;
        Context context = layoutInflater.getContext();
        context.getClass();
        textView.setText(f(context, R.string.google_photos_onboarding_ineligible_title, R.string.google_photos_onboarding_ineligible_title_photos_and_videos));
        fdapVar.invoke(adenVar);
        return adenVar;
    }

    @Override // defpackage.adel
    public final /* synthetic */ adga b() {
        return this.d;
    }
}
