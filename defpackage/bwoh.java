package defpackage;

import com.google.communication.synapse.security.scytale.DecryptResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class bwoh implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwom apply(DecryptResult decryptResult) {
        bwol bwolVar = (bwol) bwom.a.createBuilder();
        if (decryptResult.getStatus() != null) {
            bwor bworVar = (bwor) bwoq.a.fM(decryptResult.getStatus());
            bwolVar.copyOnWrite();
            ((bwom) bwolVar.instance).c = bworVar.a();
        }
        if (decryptResult.getDecryptedMessage() != null) {
            b(decryptResult, bwolVar);
        }
        c(decryptResult, bwolVar);
        return (bwom) bwolVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(DecryptResult decryptResult, bwol bwolVar);

    public abstract void c(DecryptResult decryptResult, bwol bwolVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
