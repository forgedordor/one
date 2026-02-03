package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udn {
    private final Context a;

    public udn(Context context) {
        context.getClass();
        this.a = context;
    }

    public final String a(List list, boolean z) throws Resources.NotFoundException {
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        String strC = cssf.c(((ajpk) list.get(0)).b);
        if (!z || list.size() <= 1) {
            strC.getClass();
            return strC;
        }
        String string = this.a.getResources().getString(R.string.contact_has_multiple_destinations_phone, strC, String.valueOf(list.size() - 1));
        string.getClass();
        return string;
    }
}
