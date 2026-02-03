package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adej extends adel {
    private final boolean c;
    private final adfy d = adfy.a;

    public adej(boolean z) {
        this.c = z;
    }

    @Override // defpackage.adel
    public final /* bridge */ /* synthetic */ adeo a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, fdap fdapVar) {
        View viewFindViewById = layoutInflater.inflate(true != z ? R.layout.google_photos_onboarding_eligible_cell : R.layout.google_photos_onboarding_eligible_header, viewGroup, false).findViewById(R.id.gallery_photos_promo_signed_in_container);
        viewFindViewById.getClass();
        adem ademVar = new adem(viewFindViewById);
        if (ademVar.f.getResources().getConfiguration().fontScale > 1.0f) {
            ademVar.j.setVisibility(8);
        }
        TextView textView = ademVar.h;
        Context context = layoutInflater.getContext();
        context.getClass();
        textView.setText(f(context, R.string.google_photos_onboarding_title, R.string.google_photos_onboarding_title_photos_and_videos));
        fdapVar.invoke(ademVar);
        if (this.c) {
            TextView textView2 = ademVar.i;
            textView2.getViewTreeObserver().addOnGlobalLayoutListener(new adei(textView2, ademVar));
        }
        return ademVar;
    }

    @Override // defpackage.adel
    public final /* synthetic */ adga b() {
        return this.d;
    }
}
