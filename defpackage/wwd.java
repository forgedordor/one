package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl");
    public final wre b;
    public final wsb c;
    public final vuc d;
    private final fcyh e;

    public wwd(fcyh fcyhVar, wre wreVar, wsb wsbVar, vuc vucVar) {
        fcyhVar.getClass();
        wreVar.getClass();
        vucVar.getClass();
        this.e = fcyhVar;
        this.b = wreVar;
        this.c = wsbVar;
        this.d = vucVar;
    }

    public final Object a(IncomingDraft incomingDraft, fdap fdapVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new wwb(null, incomingDraft, this, fdapVar), fcxyVar);
    }
}
