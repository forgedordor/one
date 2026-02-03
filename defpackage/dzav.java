package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzav {
    public static final void a(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        dyyq dyyqVarM = dyys.m();
        dyyqVarM.b(str);
        map.put(str, dyyqVarM);
    }
}
