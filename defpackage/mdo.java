package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdo extends mdn {
    private final SparseArray e = new SparseArray();

    @Override // defpackage.mdm
    public final void f(ByteBuffer byteBuffer) {
        mdp mdpVar = (mdp) this.e.get(this.b.c);
        mee.g(mdpVar);
        int iRemaining = byteBuffer.remaining() / this.b.e;
        ByteBuffer byteBufferK = k(this.c.e * iRemaining);
        mdi.b(byteBuffer, this.b, byteBufferK, this.c, mdpVar, iRemaining, false);
        byteBufferK.flip();
    }

    @Override // defpackage.mdn
    protected final mdk j(mdk mdkVar) throws mdl {
        if (mdkVar.d != 2) {
            throw new mdl(mdkVar);
        }
        mdp mdpVar = (mdp) this.e.get(mdkVar.c);
        if (mdpVar != null) {
            return mdpVar.d ? mdk.a : new mdk(mdkVar.b, mdpVar.b, 2);
        }
        throw new mdl("No mixing matrix for input channel count", mdkVar);
    }

    public final void o(mdp mdpVar) {
        this.e.put(mdpVar.a, mdpVar);
    }
}
