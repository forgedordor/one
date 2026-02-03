package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyc implements adaq {
    static final cczv a = cdag.h(cdag.b, "show_otp_chip_in_conversation_list", true);
    public final fcsu b;
    public LinearLayout c;
    private final cogw d;
    private cpdw e;

    public acyc(cogw cogwVar, fcsu fcsuVar) {
        this.d = cogwVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!((Boolean) a.e()).booleanValue()) {
            this.e.g(8);
            return;
        }
        bbew bbewVarN = adaoVar.n();
        if (bbewVarN == null) {
            this.e.g(8);
            return;
        }
        Optional optionalB = bbewVarN.b();
        if (optionalB.isEmpty()) {
            this.e.g(8);
            return;
        }
        ConversationIdType conversationIdType = bbewVarN.b;
        MessageIdType messageIdType = bbewVarN.c;
        ezds ezdsVar = (ezds) optionalB.get();
        ekgb ekgbVarR = ekgb.r(bbew.a(conversationIdType, messageIdType, ezdsVar.c == 2 ? (ezei) ezdsVar.d : ezei.a));
        if (ekgbVarR == null) {
            this.e.g(8);
            return;
        }
        long epochMilli = this.d.f().toEpochMilli() - TimeUnit.HOURS.toMillis(2L);
        long jM = adaoVar.k().m();
        if (adaoVar.ab() || jM <= epochMilli) {
            this.e.g(8);
            return;
        }
        this.e.g(0);
        this.c.setGravity(8388611);
        ((ConversationSuggestionsView) this.e.b()).a(ekgbVarR, new acyb(this, adaoVar));
        View viewFindViewById = ((ConversationSuggestionsView) this.e.b()).findViewById(R.id.suggestion_button);
        if (viewFindViewById == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(0);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.e = new cpdw(view, R.id.conversation_suggestions_view_stub, R.id.conversation_suggestions_view, new cpdv() { // from class: acya
            @Override // defpackage.cpdv
            public final void a(Object obj) {
                this.a.c = (LinearLayout) ((ConversationSuggestionsView) obj).findViewById(R.id.suggestion_list_container);
            }
        });
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        return !Objects.equals(adaoVar.n(), adaoVar2.n());
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
    }
}
