package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgrh {
    protected static final String[] b = {"-rcsconfiguration", "-rcscfg"};
    protected boolean c;

    protected dgrh() {
    }

    public synchronized void b(int i) {
        this.c = i > 0;
    }

    protected abstract boolean c(String str, int i, int i2);

    public final void d(Context context, Intent intent) {
        String messageBody;
        boolean z = dgrg.a;
        if (!dhff.e(context, intent) && !"android.intent.action.DATA_SMS_RECEIVED".equals(intent.getAction()) && !"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            dhja.q("Caller not Google signed or missing pending intent.", new Object[0]);
            return;
        }
        if ("com.google.android.ims.action.RAW_SMS_RECEIVED".equals(intent.getAction()) && (intent = (Intent) intent.getParcelableExtra("original_intent")) == null) {
            dhja.g("incomingIntent.getParcelableExtra(EXTRA_ORIGINAL_INTENT) is null", new Object[0]);
            return;
        }
        if (this.c && "android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            dhja.c("Ignoring a TEXT SMS as DATA OTP is expected", new Object[0]);
            return;
        }
        if (!this.c && "android.intent.action.DATA_SMS_RECEIVED".equals(intent.getAction())) {
            dhja.c("Ignoring a DATA SMS as TEXT OTP is expected", new Object[0]);
            return;
        }
        try {
            SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
            if (messagesFromIntent == null) {
                return;
            }
            int iMax = Math.max(intent.getIntExtra("subscription", -1), -1);
            int iMax2 = Math.max(intent.getIntExtra("slot", -1), -1);
            String strB = ejwk.b(messagesFromIntent.length > 0 ? messagesFromIntent[0].getOriginatingAddress() : "");
            for (SmsMessage smsMessage : messagesFromIntent) {
                if (this.c) {
                    byte[] userData = smsMessage.getUserData();
                    messageBody = userData.length == 0 ? null : new String(userData, StandardCharsets.UTF_16);
                } else {
                    messageBody = smsMessage.getMessageBody();
                }
                Objects.toString(smsMessage.getOriginatingAddress(), strB);
                if (c(messageBody, iMax, iMax2)) {
                    return;
                }
            }
        } catch (RuntimeException e) {
            dhja.i(e, "Unable to parse SMS messages", new Object[0]);
        }
    }
}
