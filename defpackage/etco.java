package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etco extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        try {
            return new AtomicInteger(etdbVar.c());
        } catch (NumberFormatException e) {
            throw new esyr(e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        etddVar.k(((AtomicInteger) obj).get());
    }
}
