package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxjv {
    public abstract dxjx a();

    public abstract Map b();

    public final void c(dxju dxjuVar, String str) {
        List arrayList = b().containsKey(dxjuVar) ? (List) b().get(dxjuVar) : new ArrayList(1);
        arrayList.add(str);
        b().put(dxjuVar, arrayList);
    }
}
