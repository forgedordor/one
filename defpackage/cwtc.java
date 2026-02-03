package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwtc implements cmyf {
    private static final cqce a = cqce.g("Bugle", "RbmSuggestionRule");
    private final cpbz b;
    private final cwtj c;
    private final Optional d;
    private final ains e;

    public cwtc(cpbz cpbzVar, cwtj cwtjVar, Optional optional, ains ainsVar) {
        cpbzVar.getClass();
        cwtjVar.getClass();
        optional.getClass();
        ainsVar.getClass();
        this.b = cpbzVar;
        this.c = cwtjVar;
        this.d = optional;
        this.e = ainsVar;
    }

    private final boolean c(boolean z, ConversationSuggestion conversationSuggestion, String str) {
        boolean z2 = true;
        if (!z) {
            if (conversationSuggestion.hasFallbackUrl()) {
                this.e.e("Bugle.Rbm.Suggestions.FallbackUrl.PotentialFallback", cwqv.a(conversationSuggestion.getSuggestionType()));
                cqbd cqbdVarC = a.c();
                cqbdVarC.I(str);
                cqbdVarC.I("intent not supported on this device, but fallback URL exists");
                cqbdVarC.M("suggestion", conversationSuggestion.toString());
                cqbdVarC.r();
            } else {
                z2 = false;
            }
            if (!z2) {
                this.e.e("Bugle.Rbm.Suggestions.FallbackUrl.NoFallbackUrlButActionUnsupported", cwqv.a(conversationSuggestion.getSuggestionType()));
                cqbd cqbdVarE = a.e();
                cqbdVarE.I(str);
                cqbdVarE.I("intent not supported on this device");
                cqbdVarE.M("suggestion", conversationSuggestion.toString());
                cqbdVarE.r();
            }
        }
        return z2;
    }

    @Override // defpackage.cmyf
    public final boolean a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return suggestionData instanceof RbmSuggestionData;
    }

    @Override // defpackage.cmyf
    public final Object b(SuggestionData suggestionData, cmxw cmxwVar, int i, fcxy fcxyVar) {
        boolean zC = false;
        if (!(suggestionData instanceof RbmSuggestionData)) {
            return false;
        }
        RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        int suggestionType = conversationSuggestion.getSuggestionType();
        if (suggestionType == 0) {
            zC = true;
        } else if (suggestionType == 1) {
            zC = c(this.b.d(this.c.d(rbmSuggestionData)), conversationSuggestion, "Web");
        } else if (suggestionType == 2) {
            zC = c(this.b.d(this.c.c(rbmSuggestionData)), conversationSuggestion, "Phone");
        } else if (suggestionType == 3) {
            zC = c(this.b.d(this.c.b(rbmSuggestionData)), conversationSuggestion, "Map");
        } else if (suggestionType == 4) {
            zC = c(this.b.d(this.c.a(rbmSuggestionData)), conversationSuggestion, "Calendar");
        } else if (suggestionType == 5) {
            zC = c(this.d.isPresent(), conversationSuggestion, "Location share");
        }
        return Boolean.valueOf(zC);
    }
}
