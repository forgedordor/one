package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekbs extends eknk {
    final /* synthetic */ ekbu a;

    public ekbs(ekbu ekbuVar) {
        this.a = ekbuVar;
    }

    @Override // defpackage.eknk
    public final ekni a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }
}
