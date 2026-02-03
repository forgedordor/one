package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkd implements rkb {
    @Override // defpackage.rkb
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rkb
    public final /* synthetic */ Object b(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }
}
