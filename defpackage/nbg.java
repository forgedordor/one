package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbg extends mja implements nbi {
    public nbg() {
        super(new mix[1], new nbl[1]);
    }

    @Override // defpackage.mja
    protected final /* synthetic */ miv g(Throwable th) {
        return new nbj("Unexpected decode error", th);
    }

    @Override // defpackage.mja
    protected final /* bridge */ /* synthetic */ miv h(mix mixVar, miy miyVar, boolean z) throws nbj {
        nbl nblVar = (nbl) miyVar;
        try {
            ByteBuffer byteBuffer = mixVar.d;
            mee.f(byteBuffer);
            mee.c(byteBuffer.hasArray());
            mee.a(byteBuffer.arrayOffset() == 0);
            byte[] bArrArray = byteBuffer.array();
            int iRemaining = byteBuffer.remaining();
            try {
                nblVar.f = mhg.a(bArrArray, iRemaining, null, -1);
                nblVar.b = mixVar.f;
                return null;
            } catch (mby e) {
                throw new nbj("Could not decode image data with BitmapFactory. (data.length = " + bArrArray.length + ", input length = " + iRemaining + ")", e);
            } catch (IOException e2) {
                throw new nbj(e2);
            }
        } catch (nbj e3) {
            return e3;
        }
    }

    @Override // defpackage.mja
    protected final mix i() {
        return new mix(1);
    }

    @Override // defpackage.mja
    protected final /* synthetic */ miy k() {
        return new nbe(this);
    }

    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ nbl p() {
        return (nbl) super.b();
    }
}
