package defpackage;

import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvd {
    public static ejwi a(ImageView imageView) {
        Object tag = imageView.getTag(R.id.og_avatar_size_hint);
        return tag instanceof Integer ? ejwi.j((Integer) tag) : ejud.a;
    }
}
