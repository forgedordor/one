package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyxv implements dsyb {
    final /* synthetic */ Context a;

    public dyxv(Context context) {
        this.a = context;
    }

    @Override // defpackage.dsyb
    public final /* synthetic */ ejwi a(dsuj dsujVar) {
        return ejud.a;
    }

    @Override // defpackage.dsyb
    public final /* synthetic */ ejwi b(dsuj dsujVar) {
        return ejud.a;
    }

    @Override // defpackage.dsyb
    public final ejwi c(dsuj dsujVar) {
        return ejwi.j(dbyw.c(78315553, eyen.EVENT_OVERRIDE));
    }

    @Override // defpackage.dsyb
    public final ListenableFuture d(dsuj dsujVar, ListenableFuture listenableFuture) {
        exbh exbhVar = (exbh) exbi.a.createBuilder();
        exbf exbfVar = (exbf) exbg.a.createBuilder();
        String packageName = this.a.getPackageName();
        exbfVar.copyOnWrite();
        exbg exbgVar = (exbg) exbfVar.instance;
        packageName.getClass();
        exbgVar.b |= 64;
        exbgVar.g = packageName;
        exbhVar.copyOnWrite();
        exbi exbiVar = (exbi) exbhVar.instance;
        exbg exbgVar2 = (exbg) exbfVar.build();
        exbgVar2.getClass();
        exbiVar.c = exbgVar2;
        exbiVar.b |= 1;
        return eork.i(exbhVar.build());
    }

    @Override // defpackage.dsyb
    public final /* synthetic */ ListenableFuture e(dsuj dsujVar, ListenableFuture listenableFuture) {
        return dsya.b();
    }

    @Override // defpackage.dsyb
    public final eyek f(dsuj dsujVar) {
        return eyek.DEFAULT;
    }

    @Override // defpackage.dsyb
    public final String g(dsuj dsujVar) {
        return "ONEGOOGLE_MOBILE";
    }

    @Override // defpackage.dsyb
    public final /* synthetic */ ListenableFuture h() {
        throw null;
    }
}
