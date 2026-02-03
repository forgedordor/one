package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyg {
    public final dmir a;
    public Size b;
    public int c;
    public int d;
    public final Map e = new LinkedHashMap();

    public dmyg(dmir dmirVar) {
        this.a = dmirVar;
    }

    public final void a(boolean z, boolean z2) {
        int i;
        Map map = this.e;
        map.clear();
        if (z) {
            map.put(0, new efvj(6, 1));
            i = 1;
        } else {
            i = 0;
        }
        if (z2) {
            map.put(Integer.valueOf(i), new efvj(6, 1));
            i++;
        }
        map.putAll(fcwa.h(new fcti(Integer.valueOf(i), new efvj(3, 2)), new fcti(Integer.valueOf(i + 1), new efvj(3, 1)), new fcti(Integer.valueOf(i + 2), new efvj(3, 1))));
    }
}
