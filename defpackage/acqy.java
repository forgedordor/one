package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acqy implements egps<SelectedConversation, ParticipantsTable.BindData> {
    final /* synthetic */ acrt a;

    public acqy(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void c(Object obj, Object obj2) {
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
        if (bindData == null) {
            ekrw ekrwVarI = acrt.a.i();
            ekrwVarI.X(eksq.a, "HomeFragmentFlogger");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.X(cqnc.s, selectedConversation.a);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/home/HomeFragmentPeer$20", "onSuccess", 3777, "HomeFragmentPeer.java")).q("reportGroupCallback: Failed to find any reportable Participant for");
            return;
        }
        tlh tlhVar = (tlh) this.a.K.b();
        tlm tlmVarK = tlr.k();
        tlmVarK.d(tlq.GROUP_SPAM);
        tjs tjsVar = (tjs) tlmVarK;
        tjsVar.e = 1;
        tlmVarK.c(selectedConversation.a);
        tjsVar.b = bindData;
        tjsVar.a = new Runnable() { // from class: acqx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.o();
            }
        };
        tjsVar.c = new tji(5);
        tjsVar.d = tjn.a(bindData);
        tlmVarK.e();
        tjsVar.f = 3;
        tlhVar.c(tlmVarK.f());
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$20", "onFailure", (char) 3783, "HomeFragmentPeer.java")).q("Error getting reportable participant for group conversation");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
