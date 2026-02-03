package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etel {
    public static final etel a;
    private static final Set d;
    public final etfk b;
    public final Map c = etdt.a;

    static {
        Logger.getLogger(etel.class.getName());
        a = new etel(etem.a().a);
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add(etdn.BR);
        hashSet.add(etdn.CL);
        hashSet.add(etdn.NI);
    }

    public etel(etfk etfkVar) {
        this.b = etfkVar;
    }
}
