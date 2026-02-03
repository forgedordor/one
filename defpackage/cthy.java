package defpackage;

import com.google.android.apps.messaging.startchat.StartChatActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthy {
    public final StartChatActivity a;
    public final fcsu b;
    private final fcsu c;

    public cthy(StartChatActivity startChatActivity, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = startChatActivity;
        this.c = fcsuVar;
        this.b = fcsuVar2;
        egap egapVarE = egaq.e(startChatActivity);
        egapVarE.d(egkc.class);
        egapVarE.d(eghx.class);
        ((efxf) fcsuVar.b()).e(new cthx(this, startChatActivity.getIntent().getExtras()));
        ((efxf) fcsuVar.b()).g(egapVarE.a());
    }
}
