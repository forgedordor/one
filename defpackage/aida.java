package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aida extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ aidc b;
    int c;
    Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aida(aidc aidcVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = aidcVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
