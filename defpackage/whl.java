package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whl {
    private final Context a;

    public whl(Context context) {
        context.getClass();
        this.a = context;
    }

    public final String a(dltn dltnVar) throws Resources.NotFoundException {
        Context context = this.a;
        String string = context.getResources().getString(dltnVar.b().b.a());
        string.getClass();
        String string2 = context.getString(R.string.local_attachment_content_description_format, string, dngk.a(dltnVar.c()));
        string2.getClass();
        return string2;
    }
}
