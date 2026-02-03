package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eklc extends ekke implements ekkj {
    public volatile Object b;

    public eklc(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = null;
    }

    @Override // defpackage.ekkj
    public final Object d() {
        return this.b;
    }
}
