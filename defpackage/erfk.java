package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfk {
    public static final void a(erwn erwnVar, Object obj, Map map) throws GeneralSecurityException {
        List list;
        if (erwnVar.a() != 0 && erwnVar.a() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (map.containsKey(erwnVar)) {
            list = (List) map.get(erwnVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(erwnVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}
