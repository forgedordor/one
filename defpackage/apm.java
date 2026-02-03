package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apm {
    public final Map a = new HashMap();
    private final ali b;

    public apm(Context context, ali aliVar, Object obj, Set set) {
        this.b = aliVar;
        lcg.i(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.a.put(str, new asj(context, str, (avp) obj, this.b));
        }
    }
}
