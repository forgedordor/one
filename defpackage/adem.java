package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adem extends adeo {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;

    public adem(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.gallery_hqms_onboarding_ok);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.gallery_onboarding_profile_name);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.gallery_onboarding_profile_email);
        viewFindViewById3.getClass();
        this.c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.gallery_onboarding_profile_avatar);
        viewFindViewById4.getClass();
        this.d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.gallery_onboarding_profile_footnote_logo);
        viewFindViewById5.getClass();
        this.e = (ImageView) viewFindViewById5;
    }
}
