package defpackage;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.banner.HomeBannerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acua {
    public final eigp a;
    public final egpr b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final Button f;
    public final Button g;

    public acua(eigp eigpVar, egpr egprVar, HomeBannerView homeBannerView) {
        this.a = eigpVar;
        this.b = egprVar;
        this.c = (ImageView) homeBannerView.findViewById(R.id.banner_icon);
        this.d = (TextView) homeBannerView.findViewById(R.id.banner_title);
        this.e = (TextView) homeBannerView.findViewById(R.id.banner_body);
        this.f = (Button) homeBannerView.findViewById(R.id.banner_positive_button);
        this.g = (Button) homeBannerView.findViewById(R.id.banner_negative_button);
    }
}
