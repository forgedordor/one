package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwop extends bwoi {
    @Override // defpackage.bwoi
    public final void b(ReceiptInfo receiptInfo, bwox bwoxVar) {
        bwow bwowVar;
        receiptInfo.getClass();
        bwoxVar.getClass();
        ReceiptError error = receiptInfo.getError();
        if (error == null || (bwowVar = (bwow) new bwoo().fM(error)) == null) {
            return;
        }
        bwoxVar.copyOnWrite();
        bwoy bwoyVar = (bwoy) bwoxVar.instance;
        bwoy bwoyVar2 = bwoy.a;
        bwoyVar.e = bwowVar.a();
    }

    @Override // defpackage.bwoi
    public final void c(ReceiptInfo receiptInfo, bwox bwoxVar) {
        receiptInfo.getClass();
        bwoxVar.getClass();
        if (receiptInfo.getSignature() == null) {
            return;
        }
        evqs evqsVarX = evqs.x(receiptInfo.getSignature());
        bwoxVar.copyOnWrite();
        bwoy bwoyVar = (bwoy) bwoxVar.instance;
        bwoy bwoyVar2 = bwoy.a;
        bwoyVar.b |= 1;
        bwoyVar.f = evqsVarX;
    }
}
