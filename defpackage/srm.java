package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srm implements ehaw {
    final /* synthetic */ srn a;
    final /* synthetic */ Context b;

    public srm(srn srnVar, Context context) {
        this.a = srnVar;
        this.b = context;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return srn.a;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        srn srnVar = this.a;
        return auvw.c(srnVar.f, fcyi.a, fdjz.a, new srl(srnVar, this.b, null));
    }
}
