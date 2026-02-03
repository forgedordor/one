package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cniq implements ehwh {
    public final cnik a;
    private final fdjx b;

    public cniq(fdjx fdjxVar, cnik cnikVar) {
        fdjxVar.getClass();
        cnikVar.getClass();
        this.b = fdjxVar;
        this.a = cnikVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new cnip(this, null));
    }
}
