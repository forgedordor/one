package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpu implements abpm {
    private static final cqce a = cqce.g("Bugle", "SendFeedbackLogsHandler");
    private final Context b;

    public abpu(Context context) {
        this.b = context;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) throws IOException {
        a.p("Received SendFeedbackLogs request from Ditto");
        epod epodVar = (eppiVar.b == 108 ? (epoh) eppiVar.c : epoh.a).b;
        if (epodVar == null) {
            epodVar = epod.a;
        }
        Context context = this.b;
        Intent intentA = aiiw.c(context, DittoWebActivity.class, "android.intent.action.VIEW").a();
        intentA.putExtra("SatelliteDittoLog", epodVar.b);
        intentA.putExtra("SatelliteDittoServerVersion", epodVar.c);
        intentA.putExtra("SatellitePairedBugleVersion", epodVar.d);
        intentA.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eiid.o(context, intentA);
        evrl evrlVar = evrl.a;
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        evrlVar.getClass();
        epplVar.c = evrlVar;
        epplVar.b = 108;
        return eijx.e(eppjVar.build());
    }
}
