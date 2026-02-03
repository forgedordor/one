package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esya extends esyv {
    final /* synthetic */ esyv a;

    public esya(esyv esyvVar) {
        this.a = esyvVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        return new AtomicLong(((Number) this.a.a(etdbVar)).longValue());
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) {
        this.a.b(etddVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
