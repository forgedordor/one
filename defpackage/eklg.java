package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eklg extends ekke implements ekli {
    public volatile eklj b;

    public eklg(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = eklm.a;
    }

    @Override // defpackage.ekkj
    public final Object d() {
        return this.b.get();
    }

    @Override // defpackage.ekli
    public final eklj e() {
        return this.b;
    }
}
