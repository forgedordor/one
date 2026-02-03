package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklw extends eklz {
    final /* synthetic */ eklx a;

    public eklw(eklx eklxVar) {
        this.a = eklxVar;
    }

    @Override // defpackage.eklz
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        eklx eklxVar = this.a;
        return ekmi.i(eklxVar.a, eklxVar.b);
    }
}
