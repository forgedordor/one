package defpackage;

import android.content.Intent;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tme implements eind {
    final /* synthetic */ tmd a;

    public tme(tmd tmdVar) {
        this.a = tmdVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) throws IOException {
        tmd tmdVar = this.a;
        try {
            egld egldVar = tmdVar.b;
            ecem.c();
            ejwl.m(egldVar.b != null, "Must call initialize() in onCreate().");
            egldVar.b.b();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("Cannot open account menu when the account list is empty")) {
                throw e;
            }
            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            intent.putExtra("account_types", new String[]{"com.google"});
            eiid.o(tmdVar.a, intent);
        }
        return eine.a;
    }
}
