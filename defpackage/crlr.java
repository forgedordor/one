package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crlr implements ehwh {
    public final crif a;
    private final fdjx b;

    public crlr(fdjx fdjxVar, crif crifVar) {
        fdjxVar.getClass();
        crifVar.getClass();
        this.b = fdjxVar;
        this.a = crifVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new crlq(this, null));
    }
}
