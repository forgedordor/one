package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmi implements efyq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement");
    public final Context b;
    private final fdjx c;

    public tmi(fdjx fdjxVar, Context context) {
        fdjxVar.getClass();
        context.getClass();
        this.c = fdjxVar;
        this.b = context;
    }

    @Override // defpackage.efyq
    public final ListenableFuture a(efwo efwoVar, efyr efyrVar) {
        efwoVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new tmh(efwoVar, this, efyrVar, null));
    }
}
