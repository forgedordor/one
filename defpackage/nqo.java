package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqo extends nqm {
    @Override // defpackage.nqm
    protected final mbt b(nql nqlVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            mfq mfqVar = new mfq(byteBuffer.array(), byteBuffer.limit());
            mfqVar.n(12);
            int iB = mfqVar.b() + mfqVar.d(12);
            mfqVar.n(44);
            mfqVar.o(mfqVar.d(12));
            mfqVar.n(16);
            ArrayList arrayList = new ArrayList();
            while (mfqVar.b() < iB - 4) {
                mfqVar.n(48);
                int iD = mfqVar.d(8);
                mfqVar.n(4);
                int iB2 = mfqVar.b() + mfqVar.d(12);
                String strF = null;
                String strF2 = null;
                while (mfqVar.b() < iB2) {
                    int iD2 = mfqVar.d(8);
                    int iD3 = mfqVar.d(8);
                    int iB3 = mfqVar.b() + iD3;
                    if (iD2 == 2) {
                        int iD4 = mfqVar.d(16);
                        mfqVar.n(8);
                        if (iD4 == 3) {
                            while (mfqVar.b() < iB3) {
                                strF = mfqVar.f(mfqVar.d(8), StandardCharsets.US_ASCII);
                                int iD5 = mfqVar.d(8);
                                for (int i = 0; i < iD5; i++) {
                                    mfqVar.o(mfqVar.d(8));
                                }
                            }
                        }
                    } else if (iD2 == 21) {
                        strF2 = mfqVar.f(iD3, StandardCharsets.US_ASCII);
                    }
                    mfqVar.l(iB3 * 8);
                }
                mfqVar.l(iB2 * 8);
                if (strF != null && strF2 != null) {
                    arrayList.add(new nqn(iD, strF.concat(strF2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new mbt(arrayList);
            }
        }
        return null;
    }
}
