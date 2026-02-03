package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionContainerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwqi {
    public static final cqce k = cqce.g("Bugle", "ConversationSuggestionsController");
    private final cqmb a;
    private final acgu b;
    private final ajhd c;
    private final cogw d;
    private final cwtz e;
    private final aykm f;
    public cvuk l;
    public final Context m;
    public craz n;
    public final List o = new ArrayList();
    public final crba p;
    public final crqv q;
    public final fcsu r;
    public final eygg s;
    public final eigp t;
    public final fcsu u;
    public final fcsu v;
    public LinearLayout w;

    public cwqi(Context context, cqmb cqmbVar, acgu acguVar, crba crbaVar, crqv crqvVar, ajhd ajhdVar, cogw cogwVar, fcsu fcsuVar, aykm aykmVar, cwtz cwtzVar, eygg eyggVar, eigp eigpVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.m = context;
        this.a = cqmbVar;
        this.b = acguVar;
        this.p = crbaVar;
        this.q = crqvVar;
        this.c = ajhdVar;
        this.d = cogwVar;
        this.r = fcsuVar;
        this.f = aykmVar;
        this.e = cwtzVar;
        this.s = eyggVar;
        this.t = eigpVar;
        this.u = fcsuVar2;
        this.v = fcsuVar3;
    }

    public static void k(View view, cwtb cwtbVar) {
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: cwqb
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, 500L);
        }
    }

    public abstract int a();

    protected abstract int b();

    protected abstract int c();

    /* JADX WARN: Removed duplicated region for block: B:83:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void d(defpackage.cwty r17, defpackage.cwtb r18) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwqi.d(cwty, cwtb):void");
    }

    protected abstract int e();

    protected abstract int f();

    protected void i(SuggestionData suggestionData, cwtb cwtbVar, View view) {
        throw null;
    }

    protected void j(View view, final SuggestionData suggestionData, final cwtb cwtbVar) {
        view.setOnClickListener(new eifs(this.t, "com/google/android/apps/messaging/ui/conversation/suggestions/ConversationSuggestionsController", "setOnClickListener", 684, "ConversationSuggestionsController#onClick", new View.OnClickListener() { // from class: cwqc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.l(suggestionData, cwtbVar);
            }
        }));
    }

    public final void l(SuggestionData suggestionData, cwtb cwtbVar) {
        if (suggestionData instanceof SmartSuggestionData) {
            ((crif) this.r.b()).n(suggestionData, ezai.CLICKED);
        }
        cwtbVar.b(suggestionData);
        if (suggestionData.f()) {
            return;
        }
        this.f.a(cwtbVar.a(), this.d.f().toEpochMilli()).s();
        boolean z = suggestionData instanceof RbmSuggestionData;
        ajhd ajhdVar = this.c;
        ajhdVar.V(z);
        if (z) {
            ajhdVar.W();
            ajhdVar.X();
        }
    }

    public final void m() {
        craz crazVar = this.n;
        if (crazVar != null) {
            this.p.c(crazVar);
        }
    }

    public final void n(ConversationSuggestionContainerView conversationSuggestionContainerView, SuggestionData suggestionData, cwtb cwtbVar) {
        cwty cwtxVar;
        boolean z = suggestionData instanceof SmartSuggestionData;
        cwtz cwtzVar = this.e;
        if (z) {
            ejwl.l(suggestionData instanceof SmartSuggestionItemSuggestionData);
            cwts cwtsVar = cwtzVar.a;
            SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
            ezan ezanVarL = smartSuggestionItemSuggestionData.l();
            int iOrdinal = ezanVarL.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 30 && iOrdinal != 40) {
                switch (iOrdinal) {
                    default:
                        switch (iOrdinal) {
                            case 21:
                            case 23:
                                break;
                            case 22:
                                cwtxVar = new cwtr(cwtsVar.a, smartSuggestionItemSuggestionData, conversationSuggestionContainerView);
                                break;
                            default:
                                throw new IllegalStateException("Unexpected value: " + ezanVarL.a());
                        }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        throw new IllegalArgumentException("Unhandled suggestion type: " + ezanVarL.a());
                }
            }
            throw new IllegalArgumentException("Unhandled suggestion type: " + ezanVarL.a());
        }
        cwtw cwtwVar = cwtzVar.b;
        RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
        int suggestionType = rbmSuggestionData.b.getSuggestionType();
        if (suggestionType == 0) {
            cwtxVar = new cwtx(cwtwVar.a, rbmSuggestionData, conversationSuggestionContainerView);
        } else if (suggestionType == 1) {
            cwub cwubVar = cwtwVar.b;
            Context context = cwtwVar.a;
            cpbz cpbzVar = (cpbz) cwubVar.a.b();
            cpbzVar.getClass();
            context.getClass();
            rbmSuggestionData.getClass();
            conversationSuggestionContainerView.getClass();
            cwtxVar = new cwua(cpbzVar, context, rbmSuggestionData, conversationSuggestionContainerView);
        } else if (suggestionType == 2) {
            cwtxVar = new cwtt(cwtwVar.a, rbmSuggestionData, conversationSuggestionContainerView);
        } else if (suggestionType == 3) {
            cwtxVar = new cwtq(cwtwVar.a, rbmSuggestionData, conversationSuggestionContainerView);
        } else if (suggestionType == 4) {
            cwtxVar = new cwtu(cwtwVar.a, rbmSuggestionData, conversationSuggestionContainerView);
        } else {
            if (suggestionType != 5) {
                throw new IllegalArgumentException(a.g(suggestionType, "Unhandled suggestion type: "));
            }
            cwtxVar = new cwtv(cwtwVar.a, rbmSuggestionData, conversationSuggestionContainerView);
        }
        this.o.add(cwtxVar);
        d(cwtxVar, cwtbVar);
        if (cwtbVar.c()) {
            j(conversationSuggestionContainerView, suggestionData, cwtbVar);
        }
        conversationSuggestionContainerView.setVisibility(0);
        conversationSuggestionContainerView.setTag(suggestionData);
        if (bbfa.b(suggestionData) != ezan.ASSISTANT_QUERY) {
            conversationSuggestionContainerView.setTag(R.id.growthkit_view_tag, null);
        } else {
            conversationSuggestionContainerView.setTag(R.id.growthkit_view_tag, "ASSISTANT_SUGGESTION");
            this.b.a(5);
        }
    }
}
