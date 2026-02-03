package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coap extends fcyv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ coaw d;
    int e;
    cnup f;
    UUID g;
    Instant h;
    Instant i;
    Instant j;
    ekoe k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coap(coaw coawVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = coawVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.q(null, null, this);
    }
}
