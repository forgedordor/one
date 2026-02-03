package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekke extends WeakReference implements ekkj {
    final int a;

    public ekke(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.a = i;
    }

    @Override // defpackage.ekkj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ekkj
    public ekkj b() {
        return null;
    }

    @Override // defpackage.ekkj
    public final Object c() {
        return get();
    }
}
