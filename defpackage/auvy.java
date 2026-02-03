package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvy implements egyi {
    private final cogw a;
    private final Object b;
    private final Object c = "ImmediateDataSource";

    public auvy(cogw cogwVar, Object obj) {
        this.a = cogwVar;
        this.b = obj;
    }

    @Override // defpackage.egyi
    public final eopy a() throws IOException {
        eieu eieuVarH = eiiy.h("MessageDataSource#ImmediateDataSource#LoadData");
        try {
            eopy eopyVar = new eopy(eijx.e(egyh.a(this.b, this.a.f())));
            fczl.a(eieuVarH, null);
            return eopyVar;
        } finally {
        }
    }

    @Override // defpackage.egyi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return eijx.e(null);
    }

    @Override // defpackage.egyi
    public final Object c() {
        return this.c;
    }
}
