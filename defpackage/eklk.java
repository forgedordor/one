package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklk extends WeakReference implements eklj {
    final ekkj a;

    public eklk(ReferenceQueue referenceQueue, Object obj, ekkj ekkjVar) {
        super(obj, referenceQueue);
        this.a = ekkjVar;
    }

    @Override // defpackage.eklj
    public final ekkj a() {
        return this.a;
    }

    @Override // defpackage.eklj
    public final eklj b(ReferenceQueue referenceQueue, ekkj ekkjVar) {
        return new eklk(referenceQueue, get(), ekkjVar);
    }
}
