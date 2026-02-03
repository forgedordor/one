package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahtl extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ahtm c;
    int d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahtl(ahtm ahtmVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = ahtmVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, this);
    }
}
