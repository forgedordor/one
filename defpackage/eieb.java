package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eieb extends PhantomReference {
    final eiea a;

    public eieb(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new eiea(this);
    }
}
