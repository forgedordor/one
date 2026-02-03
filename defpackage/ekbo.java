package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekbo extends ekmw {
    final /* synthetic */ ekbr a;

    public ekbo(ekbr ekbrVar) {
        this.a = ekbrVar;
    }

    @Override // defpackage.ekmw
    public final ekmj a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry> iterator() {
        return this.a.l();
    }
}
