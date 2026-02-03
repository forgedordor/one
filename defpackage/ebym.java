package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebym extends wv {
    public final ImageView s;
    final /* synthetic */ ebyn t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebym(ebyn ebynVar, View view) {
        super(view);
        this.t = ebynVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.sticker_thumbnail);
        this.s = imageView;
        if (ebynVar.d.B()) {
            imageView.setBackground(view.getResources().getDrawable(R.drawable.sticker_icon_background_dark_mode));
        }
    }
}
