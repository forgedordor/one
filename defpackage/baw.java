package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baw {
    public final /* synthetic */ bbf a;

    public baw(bbf bbfVar) {
        this.a = bbfVar;
    }

    public final void a() {
        bbf bbfVar = this.a;
        AtomicReference atomicReference = bbfVar.b;
        synchronized (atomicReference) {
            Integer num = (Integer) atomicReference.getAndSet(null);
            if (num == null) {
                return;
            }
            if (num.intValue() != bbfVar.b()) {
                bbfVar.t();
            }
        }
    }
}
