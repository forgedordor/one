package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edqb extends edpy {
    public eduu b;
    public dswb c;
    public edmz d;
    public edex e;
    public dsvx f;

    public edqb(Context context) {
        super(context);
        setOrientation(1);
        if (!this.a) {
            while (!(context instanceof eygk) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            ((eygk) context).ab().a(this);
        }
        inflate(context, R.layout.photo_picker_me_photos_section, this);
        this.f.b(this, this.c.a(89748));
    }
}
