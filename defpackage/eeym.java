package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeym extends eeyk {
    final /* synthetic */ eeyn d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeym(eeyn eeynVar, defr defrVar, String str) {
        super(eeynVar, new eeza("OnRequestInstallCallback"), defrVar);
        this.d = eeynVar;
        this.e = str;
    }

    @Override // defpackage.eeyk, com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public final void onRequestInfo(Bundle bundle) {
        super.onRequestInfo(bundle);
        if (eeyn.a(bundle) != 0) {
            this.b.c(new eeyv(eeyn.a(bundle)));
            return;
        }
        defr defrVar = this.b;
        eeyn eeynVar = this.d;
        String str = this.e;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        eeyp.a(new File(eeynVar.e.a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", eeyn.d(bundle.getIntegerArrayList(eeyw.a("blocking.destructive.intent"))));
        map.put("nonblocking.destructive.intent", eeyn.d(bundle.getIntegerArrayList(eeyw.a("nonblocking.destructive.intent"))));
        map.put("blocking.intent", eeyn.d(bundle.getIntegerArrayList(eeyw.a("blocking.intent"))));
        map.put("nonblocking.intent", eeyn.d(bundle.getIntegerArrayList(eeyw.a("nonblocking.intent"))));
        defrVar.d(new eexu(str, i, i2, i3, numValueOf, pendingIntent, pendingIntent2));
    }
}
