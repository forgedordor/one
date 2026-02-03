package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibx extends fcyv {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ aice c;
    int d;
    UUID e;
    szf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibx(aice aiceVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = aiceVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, null, this);
    }
}
