package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fboe {
    static final fbof a;

    static {
        fbof fbtlVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            fbtlVar = (fbof) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(fbof.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            fbtlVar = new fbtl();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = fbtlVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            fbog.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
