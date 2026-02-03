package defpackage;

import com.google.communication.synapse.security.scytale.DecryptResult;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwoq extends bwoh {
    public static final ejvj a = new bwon();
    public static final ejvj b = new bwoo();

    @Override // defpackage.bwoh
    public final void b(DecryptResult decryptResult, bwol bwolVar) {
        decryptResult.getClass();
        bwolVar.getClass();
        if (decryptResult.getDecryptedMessage() == null) {
            return;
        }
        evqs evqsVarX = evqs.x(decryptResult.getDecryptedMessage());
        bwolVar.copyOnWrite();
        bwom bwomVar = (bwom) bwolVar.instance;
        bwom bwomVar2 = bwom.a;
        bwomVar.b |= 1;
        bwomVar.d = evqsVarX;
    }

    @Override // defpackage.bwoh
    public final void c(DecryptResult decryptResult, bwol bwolVar) {
        decryptResult.getClass();
        bwolVar.getClass();
        if (decryptResult.getReceipt() == null) {
            return;
        }
        bwoy bwoyVarApply = new bwop().apply(decryptResult.getReceipt());
        bwolVar.copyOnWrite();
        bwom bwomVar = (bwom) bwolVar.instance;
        bwom bwomVar2 = bwom.a;
        bwoyVarApply.getClass();
        bwomVar.e = bwoyVarApply;
        bwomVar.b |= 2;
    }
}
