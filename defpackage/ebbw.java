package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebbw {
    private final Context a;
    private final Set b;

    public ebbw(Context context, Map map) {
        this.a = context;
        this.b = ((ekgp) map).keySet();
    }

    public final boolean a() {
        if (!ebbu.b()) {
            return false;
        }
        Context context = this.a;
        String strA = ebbu.a(context);
        if (strA == null) {
            return true;
        }
        Set set = this.b;
        int size = set.size();
        if (size == 0) {
            return strA.equals(context.getPackageName());
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String strA2 = ((ebbv) ekis.l(set)).a();
        ejwl.f(strA2.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA2);
        return strA.equals(String.valueOf(context.getPackageName()).concat(String.valueOf(strA2)));
    }
}
