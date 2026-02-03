package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrr implements ehti {
    public static final cqce a = cqce.g("Bugle", "SatelliteNotificationActionsBroadcastReceiver");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;

    public abrr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    private final eiju b(final String str, final abgl abglVar, final String str2, final byte[] bArr, final int i) {
        eooy eooyVar = new eooy() { // from class: abrn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                abrr abrrVar = this.a;
                byte[] bArr2 = bArr;
                String str3 = str;
                try {
                    epqj epqjVar = (epqj) evsn.parseFrom(epqj.a, bArr2, evrr.a());
                    abod abodVarA = ((aboe) abrrVar.b.b()).a();
                    abodVarA.e();
                    abodVarA.f = true;
                    abou abouVar = abou.AGNOSTIC;
                    eppg eppgVar = (eppg) eppi.a.createBuilder();
                    epos eposVar = (epos) epot.a.createBuilder();
                    eposVar.copyOnWrite();
                    epot epotVar = (epot) eposVar.instance;
                    epqjVar.getClass();
                    epotVar.c = epqjVar;
                    epotVar.b |= 1;
                    eposVar.copyOnWrite();
                    epot epotVar2 = (epot) eposVar.instance;
                    str3.getClass();
                    epotVar2.d = str3;
                    eppgVar.copyOnWrite();
                    eppi eppiVar = (eppi) eppgVar.instance;
                    epot epotVar3 = (epot) eposVar.build();
                    epotVar3.getClass();
                    eppiVar.c = epotVar3;
                    eppiVar.b = 211;
                    return abodVarA.b(abouVar, (eppi) eppgVar.build());
                } catch (evtj e) {
                    throw new abrq(e);
                }
            }
        };
        fcsu fcsuVar = this.d;
        return eijx.h(eooyVar, (Executor) fcsuVar.b()).h(new ejvr() { // from class: abro
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eppl epplVar = (eppl) obj;
                epov epovVar = epplVar.b == 211 ? (epov) epplVar.c : epov.a;
                if (epovVar.equals(epov.a) || !epovVar.b) {
                    throw new abrq();
                }
                return null;
            }
        }, (Executor) fcsuVar.b()).e(Exception.class, new ejvr() { // from class: abrp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                abru abruVar = (abru) this.a.c.b();
                String str3 = str;
                if (str3 == null) {
                    throw new NullPointerException("Null replyText");
                }
                String str4 = str2;
                abruVar.e(new abrf(i, str3, abglVar, str4, evqs.x(bArr)));
                abrr.a.s("Could not send message reply. Showing failure notification.", exc);
                return null;
            }
        }, (Executor) fcsuVar.b());
    }

    @Override // defpackage.ehti
    public final ListenableFuture a(Intent intent) {
        String action = intent.getAction();
        if (ejwk.c(action)) {
            return eijx.d(new IllegalArgumentException("Received intent with empty action"));
        }
        if (action.equals("com.google.android.apps.messaging.SATELLITE_MESSAGE_REPLY")) {
            a.p("Received message reply action");
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent == null) {
                return eijx.d(new IllegalArgumentException("Intent contains no RemoteInput results"));
            }
            CharSequence charSequence = resultsFromIntent.getCharSequence("bugle_dittosatellite_reply_text");
            if (charSequence == null) {
                return eijx.d(new IllegalArgumentException("Intent contains no RemoteInput text"));
            }
            abgl abglVar = new abgl(intent.getStringExtra("bugle_dittosatellite_reply_conversation_id"));
            if (abglVar.b()) {
                return eijx.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_ID_KEY"));
            }
            String stringExtra = intent.getStringExtra("bugle_dittosatellite_reply_conversation_name");
            if (stringExtra == null) {
                return eijx.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_NAME_KEY"));
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("bugle_dittosatellite_conversation_proto");
            return byteArrayExtra == null ? eijx.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_PAYLOAD")) : b(charSequence.toString(), abglVar, stringExtra, byteArrayExtra, 0);
        }
        if (!action.equals("com.google.android.apps.messaging.SATELLITE_RETRY_MESSAGE_REPLY")) {
            return eijx.d(new IllegalArgumentException(String.format("Received unknown action: %s", intent.getAction())));
        }
        a.p("Received message reply retry action");
        String stringExtra2 = intent.getStringExtra("bugle_dittosatellite_reply_text");
        if (stringExtra2 == null) {
            return eijx.d(new IllegalArgumentException("Intent contains no REPLY_TEXT_KEY"));
        }
        abgl abglVar2 = new abgl(intent.getStringExtra("bugle_dittosatellite_reply_conversation_id"));
        if (abglVar2.b()) {
            return eijx.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_ID_KEY"));
        }
        String stringExtra3 = intent.getStringExtra("bugle_dittosatellite_reply_conversation_name");
        if (stringExtra3 == null) {
            return eijx.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_NAME_KEY"));
        }
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("bugle_dittosatellite_conversation_proto");
        if (byteArrayExtra2 == null) {
            return eijx.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_PAYLOAD"));
        }
        int intExtra = intent.getIntExtra("bugle_dittosatellite_reply_retry_count", 0);
        return intExtra == 0 ? eijx.d(new IllegalArgumentException("Intent contains no RETRY_COUNT_KEY")) : b(stringExtra2, abglVar2, stringExtra3, byteArrayExtra2, intExtra);
    }
}
