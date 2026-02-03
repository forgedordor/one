package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnt implements abpm {
    private static final cqce b = cqce.g("Bugle", "DownloadFileRequestHandler");
    public final Context a;
    private final eosc c;
    private final eosc d;

    public abnt(Context context, eosc eoscVar, eosc eoscVar2) {
        this.a = context;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    @Override // defpackage.abpm
    public final eiju a(final eppi eppiVar, final eppj eppjVar) throws IOException {
        b.p("Received DownloadFileRequest from Ditto");
        final epof epofVar = eppiVar.b == 207 ? (epof) eppiVar.c : epof.a;
        try {
            final InputStream inputStreamM = epofVar.c.m();
            try {
                eiju eijuVarH = eijx.g(new Callable() { // from class: abnr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return bxlf.g(inputStreamM, this.a.a);
                    }
                }, this.c).h(new ejvr() { // from class: abns
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) throws IOException {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            epof epofVar2 = epofVar;
                            Context context = this.a.a;
                            Intent intentA = aiiw.c(context, DittoWebActivity.class, "android.intent.action.VIEW").a();
                            intentA.setDataAndType(uri, epofVar2.b);
                            intentA.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            eiid.o(context, intentA);
                        }
                        eppi eppiVar2 = eppiVar;
                        eppj eppjVar2 = eppjVar;
                        String str = eppiVar2.d;
                        eppjVar2.copyOnWrite();
                        eppl epplVar = (eppl) eppjVar2.instance;
                        eppl epplVar2 = eppl.a;
                        str.getClass();
                        epplVar.d = str;
                        exmt exmtVar = exmt.OK;
                        eppjVar2.copyOnWrite();
                        ((eppl) eppjVar2.instance).e = exmtVar.a();
                        evrl evrlVar = evrl.a;
                        eppjVar2.copyOnWrite();
                        eppl epplVar3 = (eppl) eppjVar2.instance;
                        evrlVar.getClass();
                        epplVar3.c = evrlVar;
                        epplVar3.b = 207;
                        return eppjVar2.build();
                    }
                }, this.d);
                inputStreamM.close();
                return eijuVarH;
            } finally {
            }
        } catch (IOException e) {
            String str = eppiVar.d;
            eppjVar.copyOnWrite();
            eppl epplVar = (eppl) eppjVar.instance;
            eppl epplVar2 = eppl.a;
            str.getClass();
            epplVar.d = str;
            exmt exmtVar = exmt.INTERNAL;
            eppjVar.copyOnWrite();
            ((eppl) eppjVar.instance).e = exmtVar.a();
            String str2 = (String) Optional.ofNullable(e.getMessage()).orElse("Unknown Error");
            eppjVar.copyOnWrite();
            eppl epplVar3 = (eppl) eppjVar.instance;
            str2.getClass();
            epplVar3.f = str2;
            return eijx.e(eppjVar.build());
        }
    }
}
