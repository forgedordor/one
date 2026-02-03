package defpackage;

import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxkz implements dxky {
    private static final eksp a = eksp.c("GnpSdk");

    @Override // defpackage.dxky
    public final dxft a(byte[] bArr) {
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            try {
                byte[] bArrA = fczk.a(inflaterInputStream);
                fczl.a(inflaterInputStream, null);
                return new dxfx(bArrA);
            } finally {
            }
        } catch (Exception e) {
            ((eksl) ((eksl) a.i()).g(e)).q("Failed to decompress the decrypted bytes.");
            return new dxfp(e);
        }
    }
}
