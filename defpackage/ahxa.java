package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxa extends fcyv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ahxy d;
    int e;
    UUID f;
    Duration g;
    fdci h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxa(ahxy ahxyVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = ahxyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
