package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejb implements deic {
    public final Object a = new Object();
    public WeakReference b;
    private final deic c;
    private final deig d;
    private boolean e;

    public dejb(deic deicVar) {
        deicVar.getClass();
        this.c = deicVar;
        this.d = new deig() { // from class: deja
            @Override // defpackage.deig
            public final void a(deib deibVar) {
                dejb dejbVar = this.a;
                synchronized (dejbVar.a) {
                    WeakReference weakReference = dejbVar.b;
                    if (weakReference == null) {
                        return;
                    }
                    deig deigVar = (deig) weakReference.get();
                    if (deigVar == null) {
                        deht.a.n().q("Not forwarding timeSignal: listener has been garbage collected");
                    } else {
                        deigVar.a(deibVar);
                    }
                }
            }
        };
    }

    @Override // defpackage.deic
    public final defn a() {
        synchronized (this.a) {
            this.e = true;
            this.b = null;
        }
        return this.c.a();
    }

    @Override // defpackage.deic
    public final void d(deig deigVar) {
        synchronized (this.a) {
            if (this.e) {
                throw new IllegalStateException("dispose() has been called");
            }
            WeakReference weakReference = this.b;
            if (weakReference != null) {
                throw new IllegalStateException(a.J(weakReference, "Listener already set:"));
            }
            this.b = new WeakReference(deigVar);
            this.c.d(this.d);
        }
    }
}
