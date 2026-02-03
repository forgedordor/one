package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwq extends wv {
    public final ImageView s;
    final /* synthetic */ ebwr t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebwq(ebwr ebwrVar, View view) {
        super(view);
        this.t = ebwrVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.sticker_thumbnail);
        this.s = imageView;
        if (ebwrVar.a.G()) {
            imageView.setBackground(view.getResources().getDrawable(R.drawable.sticker_icon_background_dark_mode));
        }
    }
}
