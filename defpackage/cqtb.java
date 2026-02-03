package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqtb implements ehaw {
    final /* synthetic */ cqtc a;

    public cqtb(cqtc cqtcVar) {
        this.a = cqtcVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cqtc.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        return this.a.b().h();
    }
}
