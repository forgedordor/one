package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajbo implements ehwh {
    public final efwo a;
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public ajbo(fdjx fdjxVar, efwo efwoVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        efwoVar.getClass();
        fcsuVar.getClass();
        this.d = fdjxVar;
        this.a = efwoVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ajbn(this, null));
    }
}
