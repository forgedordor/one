package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptInfo;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class bwoi implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwoy apply(ReceiptInfo receiptInfo) {
        bwox bwoxVar = (bwox) bwoy.a.createBuilder();
        if (receiptInfo.getMessageId() != null) {
            String messageId = receiptInfo.getMessageId();
            bwoxVar.copyOnWrite();
            bwoy bwoyVar = (bwoy) bwoxVar.instance;
            messageId.getClass();
            bwoyVar.c = messageId;
        }
        long messageTimestampUsec = receiptInfo.getMessageTimestampUsec();
        bwoxVar.copyOnWrite();
        ((bwoy) bwoxVar.instance).d = messageTimestampUsec;
        b(receiptInfo, bwoxVar);
        if (receiptInfo.getSignature() != null) {
            c(receiptInfo, bwoxVar);
        }
        return (bwoy) bwoxVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(ReceiptInfo receiptInfo, bwox bwoxVar);

    public abstract void c(ReceiptInfo receiptInfo, bwox bwoxVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
