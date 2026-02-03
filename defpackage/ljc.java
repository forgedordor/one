package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljc {
    public static final ljd a(View view) {
        ljd ljdVar = (ljd) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (ljdVar != null) {
            return ljdVar;
        }
        ljd ljdVar2 = new ljd();
        view.setTag(R.id.pooling_container_listener_holder_tag, ljdVar2);
        return ljdVar2;
    }

    public static final void b(View view) {
        Iterator itA = new fdez(new lfh(view, null)).a();
        while (itA.hasNext()) {
            a((View) itA.next()).a();
        }
    }
}
