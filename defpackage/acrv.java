package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrv implements eind {
    final /* synthetic */ acrt a;

    public acrv(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) throws Resources.NotFoundException {
        acwa acwaVar = (acwa) einbVar;
        boolean zE = acwaVar.e();
        SelectedConversation selectedConversationB = acwaVar.b();
        View viewA = acwaVar.a();
        acwaVar.d();
        bajg bajgVarC = acwaVar.c();
        ekrw ekrwVarH = acrt.a.h();
        ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onConversationClick", 3129, "HomeFragmentPeer.java");
        ConversationIdType conversationIdType = selectedConversationB.a;
        ekrdVar.E("onConversationClick: key=%s, isLongClick=%s", conversationIdType, zE);
        acrt acrtVar = this.a;
        acom acomVar = acrtVar.b;
        if (cpga.g(acomVar.A())) {
            viewA.setFocusableInTouchMode(true);
            viewA.requestFocus();
        }
        if (acrtVar.aP == null) {
            if (zE && !acrtVar.B()) {
                acrtVar.n();
            }
            if (acrtVar.B()) {
                cwvv cwvvVarK = acrt.k(acomVar.fg());
                HashSet hashSet = acrtVar.aX;
                if (!conversationIdType.b()) {
                    cwvvVarK.b = hashSet;
                    csq csqVar = cwvvVarK.a;
                    if (csqVar.containsKey(conversationIdType)) {
                        csqVar.remove(conversationIdType);
                        cwvvVarK.c(false, viewA);
                    } else {
                        csqVar.put(conversationIdType, selectedConversationB);
                        cwvvVarK.c(true, viewA);
                    }
                    cwvvVarK.d();
                }
                if (acrtVar.aO.e().isPresent()) {
                    ((ActionMode) acrtVar.aO.e().get()).setTitle(((asgt) acrtVar.bw.b()).a() ? Integer.toString(cwvvVarK.a()) : acomVar.B().getQuantityString(R.plurals.selected_count, cwvvVarK.a(), Integer.valueOf(cwvvVarK.a())));
                }
                acrtVar.aO.g();
                ((acwj) acrtVar.q.b()).q(LinearLayoutManager.bu(viewA) - acrtVar.r.a());
            } else {
                acrt.b(acomVar).o.getClass();
                acrtVar.F(wb.bu(viewA), selectedConversationB, bajgVarC);
            }
        } else if (!zE && !acrtVar.B()) {
            acrt.b(acomVar).o.getClass();
            acrtVar.F(wb.bu(viewA), selectedConversationB, bajgVarC);
        }
        return eine.a;
    }
}
