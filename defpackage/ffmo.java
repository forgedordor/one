package defpackage;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmo implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws ffme {
        try {
            return PrivateKeyInfo.b(ffxfVar.d);
        } catch (Exception e) {
            throw new ffme("problem parsing PRIVATE KEY: ".concat(String.valueOf(e.toString())), e);
        }
    }
}
