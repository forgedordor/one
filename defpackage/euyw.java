package defpackage;

import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euyw {
    public abstract euza a();

    public abstract void b();

    public final euza c() {
        euza euzaVarA = a();
        euyr euyrVar = (euyr) euzaVarA;
        euyrVar.a.isPresent();
        Optional optional = euyrVar.b;
        Optional optional2 = euyrVar.c;
        if ((optional.isPresent() ? 1 : 0) + (optional2.isPresent() ? 1 : 0) != 1) {
            throw new IllegalArgumentException("Please specify only one of the model asset path, the model asset file descriptor, and the model asset buffer.");
        }
        if (optional2.isPresent() && !((ByteBuffer) optional2.get()).isDirect() && !(optional2.get() instanceof MappedByteBuffer)) {
            throw new IllegalArgumentException("The model buffer should be either a direct ByteBuffer or a MappedByteBuffer.");
        }
        Optional optional3 = euyrVar.d;
        if (optional3.isPresent()) {
            optional3.get();
        }
        return euzaVarA;
    }
}
