package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwn extends egxm {
    private static final cqce b = cqce.g("BugleDataModel", "TelephonyMessagesObserver");
    public final fcsu a;
    private final fcsu c;

    public bwwn(fcsu fcsuVar, fcsu fcsuVar2, eigp eigpVar, eosc eoscVar) {
        super(eigpVar, "TelephonyMessagesObserver", eoscVar);
        this.c = fcsuVar;
        this.a = fcsuVar2;
    }

    @Override // defpackage.egxm
    public final void a(Uri uri) {
        cqbd cqbdVarA = b.a();
        cqbdVarA.I("Sms/Mms DB changed");
        cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        cqbdVarA.r();
        fcsu fcsuVar = this.c;
        if (((cmqf) fcsuVar.b()).v()) {
            return;
        }
        if (((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue()) {
            ((cmqf) fcsuVar.b()).l(enqq.TELEPHONY_MESSAGES_OBSERVER);
        } else {
            ((cmqf) fcsuVar.b()).h();
        }
    }
}
