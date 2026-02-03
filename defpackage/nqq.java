package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqq extends nqm {
    @Override // defpackage.nqm
    protected final mbt b(nql nqlVar, ByteBuffer byteBuffer) {
        mfr mfrVar = new mfr(byteBuffer.array(), byteBuffer.limit());
        String strW = mfrVar.w();
        mee.f(strW);
        String strW2 = mfrVar.w();
        mee.f(strW2);
        return new mbt(new nqp(strW, strW2, mfrVar.q(), mfrVar.q(), Arrays.copyOfRange(mfrVar.a, mfrVar.b, mfrVar.c)));
    }
}
