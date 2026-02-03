package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxa extends fcyv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dlxf c;
    int d;
    MediaCodec.BufferInfo e;
    MediaCodec f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlxa(dlxf dlxfVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = dlxfVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
