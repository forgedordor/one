package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibw extends fcyv {
    int a;
    int b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ aice e;
    int f;
    evvp g;
    UUID h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibw(aice aiceVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = aiceVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
