package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfs implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ Context b;
    final /* synthetic */ vft c;
    final /* synthetic */ zqm d;

    public vfs(fdpl fdplVar, Context context, vft vftVar, zqm zqmVar) {
        this.a = fdplVar;
        this.b = context;
        this.c = vftVar;
        this.d = zqmVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        Object objA = this.a.a(new vfr(fdpmVar, this.b, this.c, this.d), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
