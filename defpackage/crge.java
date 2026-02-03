package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crge implements crba {
    private static final Map a;
    private final crqv b;

    static {
        ezan ezanVar = ezan.FULL_MESSAGE;
        craz crazVar = craz.b;
        a = fcwa.g(new fcti(ezanVar, crazVar), new fcti(ezan.SHORT_MESSAGE, crazVar), new fcti(ezan.SCRIPTED_REPLY, crazVar), new fcti(ezan.EMOJI, crazVar), new fcti(ezan.ASSISTANT_QUERY, craz.c), new fcti(ezan.EMOTION, craz.e), new fcti(ezan.CALENDAR, craz.f));
    }

    public crge(crqv crqvVar) {
        crqvVar.getClass();
        this.b = crqvVar;
    }

    @Override // defpackage.crba
    public final craz a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return ((Boolean) ((cczi) crbf.aY.get()).e()).booleanValue() ? craz.a : suggestionData instanceof SmartSuggestionItemSuggestionData ? (craz) Map.EL.getOrDefault(a, ((SmartSuggestionItemSuggestionData) suggestionData).l(), craz.a) : craz.a;
    }

    @Override // defpackage.crba
    public final List b() {
        if (((Boolean) ((cczi) crbf.aY.get()).e()).booleanValue()) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList();
        craz crazVar = craz.c;
        if (d(crazVar)) {
            arrayList.add(crazVar);
        }
        craz crazVar2 = craz.b;
        if (d(crazVar2)) {
            arrayList.add(crazVar2);
        }
        craz crazVar3 = craz.e;
        if (d(crazVar3)) {
            arrayList.add(crazVar3);
        }
        craz crazVar4 = craz.f;
        if (d(crazVar4)) {
            arrayList.add(crazVar4);
        }
        return arrayList;
    }

    @Override // defpackage.crba
    public final void c(craz crazVar) {
        if (((Boolean) ((cczi) crbf.aY.get()).e()).booleanValue()) {
            return;
        }
        int iOrdinal = crazVar.ordinal();
        if (iOrdinal == 1) {
            this.b.h("has_user_dismissed_p2p_conversation_suggestions_tooltip", true);
            return;
        }
        if (iOrdinal == 2) {
            this.b.h("has_user_dismissed_assistant_suggestions_tooltip", true);
        } else if (iOrdinal == 4) {
            this.b.h("has_user_dismissed_emotion_suggestions_tooltip", true);
        } else {
            if (iOrdinal != 5) {
                return;
            }
            this.b.h("has_user_dismissed_calendar_suggestions_tooltip", true);
        }
    }

    @Override // defpackage.crba
    public final boolean d(craz crazVar) {
        crazVar.getClass();
        if (((Boolean) ((cczi) crbf.aY.get()).e()).booleanValue()) {
            return false;
        }
        int iOrdinal = crazVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 4) {
                    if (iOrdinal == 5 && !this.b.q("has_user_dismissed_calendar_suggestions_tooltip", false)) {
                        return true;
                    }
                } else if (!this.b.q("has_user_dismissed_emotion_suggestions_tooltip", false)) {
                    return true;
                }
            } else if (!this.b.q("has_user_dismissed_assistant_suggestions_tooltip", false)) {
                return true;
            }
        } else if (!this.b.q("has_user_dismissed_p2p_conversation_suggestions_tooltip", false)) {
            return true;
        }
        return false;
    }
}
