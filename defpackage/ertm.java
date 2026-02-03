package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ertm implements eqsz {
    private final List a;
    private final eqsz b;

    public ertm(List list, eqsz eqszVar) {
        this.a = list;
        this.b = eqszVar;
    }

    @Override // defpackage.eqsz
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new ersy(this.a, inputStream, bArr);
    }

    @Override // defpackage.eqsz
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return this.b.b(outputStream, bArr);
    }
}
