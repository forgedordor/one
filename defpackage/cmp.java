package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmp {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    public final void a(Class cls, String str, cmq cmqVar) {
        this.c.put(cls, cmqVar);
        if (str != null) {
            this.d.put(str, cls);
            this.e.put(cls, str);
        }
    }
}
