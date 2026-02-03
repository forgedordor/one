package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fesk extends fero {
    private static final long serialVersionUID = 1046534053331139832L;
    private final Map c;

    public fesk() {
        super("VFREEBUSY");
        HashMap map = new HashMap();
        this.c = map;
        map.put(fevh.c, new fesh());
        map.put(fevh.e, new fesi());
        map.put(fevh.d, new fesj());
        this.b.add(new feut());
    }

    public fesk(ferc fercVar) {
        super("VFREEBUSY", fercVar);
        HashMap map = new HashMap();
        this.c = map;
        map.put(fevh.c, new fesh());
        map.put(fevh.e, new fesi());
        map.put(fevh.d, new fesj());
    }
}
