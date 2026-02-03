package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bod implements Enumeration {
    int a = 0;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i = this.a;
        String str = boh.d;
        return i < 4;
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        HashMap map = new HashMap();
        for (boj bojVar : boh.b[this.a]) {
            map.put(bojVar.b, bojVar);
        }
        this.a++;
        return map;
    }
}
