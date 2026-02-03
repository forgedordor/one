package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tbd extends fcyv {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ tbe d;
    int e;
    UUID f;
    dbwx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbd(tbe tbeVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = tbeVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
