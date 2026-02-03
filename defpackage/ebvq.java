package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebvq extends wv {
    final /* synthetic */ ebvr A;
    etyu s;
    final ImageView t;
    final ImageButton u;
    final TextView v;
    final TextView w;
    final lda x;
    final GestureDetector.SimpleOnGestureListener y;
    boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebvq(ebvr ebvrVar, View view) {
        super(view);
        this.A = ebvrVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.pack_icon);
        this.t = imageView;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.favorite_pack_icon);
        this.u = imageButton;
        TextView textView = (TextView) view.findViewById(R.id.pack_name);
        this.v = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.pack_author);
        this.w = textView2;
        ebvp ebvpVar = new ebvp(this);
        this.y = ebvpVar;
        this.x = new lda(view.getContext(), ebvpVar);
        if (ebvrVar.h.G()) {
            Context context = view.getContext();
            imageView.setBackground(context.getResources().getDrawable(R.drawable.sticker_icon_background_dark_mode));
            textView.setTextColor(context.getColor(R.color.white));
            textView2.setTextColor(context.getColor(R.color.sticker_pack_author_color_dark_mode));
            imageButton.setColorFilter(context.getColor(R.color.favorite_enabled_color_dark_mode));
        }
    }
}
