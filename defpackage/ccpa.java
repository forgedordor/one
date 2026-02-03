package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpa {
    public static final InputStream a(fdev fdevVar) {
        return new SequenceInputStream(new ccoz(new fdft((fdfu) fdey.j(fdevVar, new fdap() { // from class: ccoy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                return new ByteArrayInputStream(bArr);
            }
        }))));
    }
}
