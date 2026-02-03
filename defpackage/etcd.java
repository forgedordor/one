package defpackage;

import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcd extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        String strJ = etdbVar.j();
        try {
            return UUID.fromString(strJ);
        } catch (IllegalArgumentException e) {
            throw new esyr(a.V(strJ, etdbVar, "Failed parsing '", "' as UUID; at path "), e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        etddVar.m(uuid == null ? null : uuid.toString());
    }
}
