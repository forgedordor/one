package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fffa extends WritableByteChannel, fffz {
    void L(fffd fffdVar);

    void N(byte[] bArr, int i, int i2);

    void Q(int i);

    void S(int i);

    void T(int i);

    void aa(byte[] bArr);

    void ac(String str);

    @Override // defpackage.fffz, java.io.Flushable
    void flush();

    @fcsv
    ffez r();

    ffez s();

    fffa t(long j);
}
