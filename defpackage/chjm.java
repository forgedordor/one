package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjm implements cmvv {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/TelephonyChangeBugleDbUpdater");

    @Override // defpackage.cmvv
    public final void a(Uri uri, UUID uuid) {
        if (uuid != null) {
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.S(uri);
            Optional optionalOf = Optional.of(uuid);
            brec brecVar = new brec();
            brecVar.B(optionalOf);
            if (brduVar.aj(new brdv(brecVar), "messages-buildAndUpdateForMessagePersistenceId")) {
                ((ekrd) a.h().h("com/google/android/apps/messaging/shared/pipeline/sms/receive/TelephonyChangeBugleDbUpdater", "onIncomingSmsInserted", 20, "TelephonyChangeBugleDbUpdater.kt")).q("Updated telephony uri in message");
            } else {
                ((ekrd) a.j().h("com/google/android/apps/messaging/shared/pipeline/sms/receive/TelephonyChangeBugleDbUpdater", "onIncomingSmsInserted", 22, "TelephonyChangeBugleDbUpdater.kt")).t("Couldn't update uri for persistenceId: %s", uuid);
            }
        }
    }

    @Override // defpackage.cmvv
    public final void c() {
    }

    @Override // defpackage.cmvv
    public final void e() {
    }

    @Override // defpackage.cmvv
    public final void f() {
    }

    @Override // defpackage.cmvv
    public final void b(Uri uri) {
    }

    @Override // defpackage.cmvv
    public final void d(Uri uri) {
    }

    @Override // defpackage.cmvv
    public final void g(Uri uri) {
    }

    @Override // defpackage.cmvv
    public final void h(Uri uri) {
    }

    @Override // defpackage.cmvv
    public final void i(Uri uri) {
    }

    @Override // defpackage.cmvv
    public final void j(Uri uri) {
    }

    @Override // defpackage.cmvv
    public final void k(Uri uri) {
    }
}
