package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpa {
    public final hum a = new hum(new Reference[16]);
    public final ReferenceQueue b = new ReferenceQueue();

    public final void a() {
        Reference referencePoll;
        do {
            referencePoll = this.b.poll();
            if (referencePoll != null) {
                this.a.m(referencePoll);
            }
        } while (referencePoll != null);
    }
}
