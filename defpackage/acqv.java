package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acqv implements egps<SelectedConversation, ParticipantsTable.BindData> {
    final /* synthetic */ acrt a;

    public acqv(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void c(Object obj, Object obj2) {
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
        if (bindData == null) {
            ekrw ekrwVarJ = acrt.a.j();
            ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.s, selectedConversation.a);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/home/HomeFragmentPeer$19", "onSuccess", 3729, "HomeFragmentPeer.java")).q("HomeFragmentPeer#getBlockCallback#onSuccess: participant is null");
            return;
        }
        acrt acrtVar = this.a;
        tlp tlpVarA = tjn.a(bindData);
        tlq tlqVar = tlq.BLOCK;
        tlo tjiVar = new tji(5);
        if (selectedConversation.h) {
            tlqVar = tlq.RBM_BLOCK;
            tjiVar = new tjj();
        }
        tlh tlhVar = (tlh) acrtVar.K.b();
        tlm tlmVarK = tlr.k();
        tlmVarK.d(tlqVar);
        tjs tjsVar = (tjs) tlmVarK;
        tjsVar.e = 1;
        tlmVarK.c(selectedConversation.a);
        tlmVarK.b(R.id.start_chat_fab);
        tjsVar.b = bindData;
        tjsVar.c = tjiVar;
        tjsVar.a = new acoy(acrtVar);
        tjsVar.d = tlpVarA;
        tlmVarK.e();
        tjsVar.f = 3;
        tlhVar.c(tlmVarK.f());
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(th);
        ekrdVar.X(cqnc.s, ((SelectedConversation) obj).a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/home/HomeFragmentPeer$19", "onFailure", 3742, "HomeFragmentPeer.java")).q("HomeFragmentPeer#getBlockCallback#onFailure: Error getting local blocked users for migrating blocked");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
