package defpackage;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmt {
    public static final cczi a = cdag.e(cdag.b, "max_conversation_count", 5);
    public static final cczi b = cdag.e(cdag.b, "max_message_count", 20);
    public LinearLayout c;
    public final fcsu d;
    public final fcsu e;
    public LayoutInflater g;
    public final acjr i;
    public final egzv j;
    public final List f = new ArrayList();
    public final eksp h = eksp.c("Bugle");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [acms] */
    public acmt(fcsu fcsuVar, fcsu fcsuVar2) {
        cczv cczvVar = acjr.d;
        acjk acjkVar = new acjk();
        acjkVar.c(((Integer) a.e()).intValue());
        acjkVar.d(((Integer) b.e()).intValue());
        acjkVar.b(new Object() { // from class: acms
        });
        this.i = acjkVar.e();
        this.j = new egzv<ekgb<acjp>>() { // from class: acmt.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                ((eksl) ((eksl) ((eksl) acmt.this.h.j()).g(th)).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/MessageSelectorFragmentPeer$1", "onError", 'N', "MessageSelectorFragmentPeer.java")).q("Failed to fetch data from ProblematicConversationDataRequest, skip");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v2, types: [int] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r6v2, types: [ekgb, java.util.List] */
            /* JADX WARN: Type inference failed for: r9v1, types: [android.view.LayoutInflater] */
            @Override // defpackage.egzv
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                ekgb ekgbVar;
                int i;
                ekgb ekgbVar2 = (ekgb) obj;
                int size = ekgbVar2.size();
                boolean z = false;
                int i2 = 0;
                while (i2 < size) {
                    acmt acmtVar = acmt.this;
                    acjp acjpVar = (acjp) ekgbVar2.get(i2);
                    LayoutInflater layoutInflater = acmtVar.g;
                    if (layoutInflater != null) {
                        ProblematicConversationDataView problematicConversationDataView = (ProblematicConversationDataView) layoutInflater.inflate(R.layout.problematic_conversation_data_view, acmtVar.c, z);
                        acna acnaVarH = problematicConversationDataView.H();
                        ?? r9 = acmtVar.g;
                        acnaVarH.f = acjpVar.a();
                        acnaVarH.b.setText(acnaVarH.f);
                        acnaVarH.e = acjpVar.b();
                        ?? C = acjpVar.c();
                        int i3 = ((ekoe) C).c;
                        for (?? r11 = z; r11 < i3; r11++) {
                            acjo acjoVar = (acjo) C.get(r11);
                            LinearLayout linearLayout = acnaVarH.a;
                            ProblematicMessageDataView problematicMessageDataView = (ProblematicMessageDataView) r9.inflate(R.layout.problematic_message_data_view, linearLayout, z);
                            acnh acnhVarH = problematicMessageDataView.H();
                            acnhVarH.f = acjoVar;
                            acnhVarH.a.setText(acjoVar.b());
                            acnhVarH.b.setText(((cqjk) acnhVarH.d.b()).c(acjoVar.a()));
                            acnhVarH.e = acnaVarH;
                            acnaVarH.d.add(problematicMessageDataView.H());
                            linearLayout.addView(problematicMessageDataView);
                            ekgbVar2 = ekgbVar2;
                            i2 = i2;
                            z = false;
                        }
                        ekgbVar = ekgbVar2;
                        i = i2;
                        acnaVarH.a();
                        acmtVar.f.add(problematicConversationDataView.H());
                        LinearLayout linearLayout2 = acmtVar.c;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(problematicConversationDataView);
                        }
                    } else {
                        ekgbVar = ekgbVar2;
                        i = i2;
                    }
                    i2 = i + 1;
                    ekgbVar2 = ekgbVar;
                    z = false;
                }
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        };
        this.e = fcsuVar;
        this.d = fcsuVar2;
    }
}
