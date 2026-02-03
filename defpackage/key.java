package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class key {
    public final kep a;
    public final AtomicReference b = new AtomicReference(null);

    public key(kep kepVar) {
        this.a = kepVar;
    }

    public final kfl a() {
        return (kfl) this.b.get();
    }
}
