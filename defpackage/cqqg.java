package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqqg implements eyif {
    public static esyd a(Set set) {
        esye esyeVar = new esye();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            esyw esywVar = (esyw) it.next();
            esywVar.getClass();
            esyeVar.a.add(esywVar);
        }
        return esyeVar.a();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
