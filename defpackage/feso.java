package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feso extends fero {
    private static final long serialVersionUID = -7635140949183238830L;
    private final Map c;

    public feso() {
        super("VJOURNAL");
        HashMap map = new HashMap();
        this.c = map;
        map.put(fevh.f, new fesl());
        map.put(fevh.g, new fesm());
        map.put(fevh.c, new fesn());
        this.b.add(new feut());
    }

    public feso(ferc fercVar) {
        super("VJOURNAL", fercVar);
        HashMap map = new HashMap();
        this.c = map;
        map.put(fevh.f, new fesl());
        map.put(fevh.g, new fesm());
        map.put(fevh.c, new fesn());
    }
}
