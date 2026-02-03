package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adeo {
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final ImageView j;

    public adeo(View view) {
        this.f = view;
        View viewFindViewById = view.findViewById(R.id.gallery_hqms_onboarding_learn_more);
        viewFindViewById.getClass();
        this.g = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.gallery_onboarding_promo_title);
        viewFindViewById2.getClass();
        this.h = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.gallery_onboarding_promo_body);
        viewFindViewById3.getClass();
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.gallery_promo_photos_logo);
        viewFindViewById4.getClass();
        this.j = (ImageView) viewFindViewById4;
    }
}
