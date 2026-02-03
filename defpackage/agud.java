package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agud {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/penpal/conversation/GeminiSmartSuggestionDatabaseOperations");
    public final cogw a;
    public final fcsu b;
    private final Context d;

    public agud(Context context, cogw cogwVar, fcsu fcsuVar) {
        context.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        this.d = context;
        this.a = cogwVar;
        this.b = fcsuVar;
    }

    static /* synthetic */ ezgi b(String str) {
        return c(str, null);
    }

    private static final ezgi c(String str, String str2) {
        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
        ezghVar.getClass();
        ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
        ezgjVar.getClass();
        ezav.b(str, ezgjVar);
        ezgjVar.copyOnWrite();
        ezgk ezgkVar = (ezgk) ezgjVar.instance;
        ezgkVar.b |= 1;
        if (str2 != null) {
            str = str2;
        }
        ezgkVar.d = str;
        ezau.d(ezav.a(ezgjVar), ezghVar);
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        ezgfVar.getClass();
        ezat.b(ezan.BARD, ezgfVar);
        ezau.c(ezat.a(ezgfVar), ezghVar);
        return ezau.a(ezghVar);
    }

    public final void a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        List listG;
        ((ekrd) c.e().h("com/google/android/apps/messaging/penpal/conversation/GeminiSmartSuggestionDatabaseOperations", "insertSuggestions", 56, "GeminiSmartSuggestionDatabaseOperations.kt")).D("#addBardSuggestions messageId=%s, conversationId=%s", messageIdType, conversationIdType);
        crif crifVar = (crif) this.b.b();
        if (((Boolean) ((cczi) crbf.as.get()).e()).booleanValue()) {
            Context context = this.d;
            String string = context.getString(R.string.penpal_sept_2024_starter_suggestion_1);
            string.getClass();
            String string2 = context.getString(R.string.penpal_sept_2024_starter_suggestion_2);
            string2.getClass();
            String string3 = context.getString(R.string.penpal_sept_2024_starter_suggestion_3);
            string3.getClass();
            String string4 = context.getString(R.string.penpal_sept_2024_starter_suggestion_4);
            string4.getClass();
            String string5 = context.getString(R.string.penpal_sept_2024_starter_suggestion_5);
            string5.getClass();
            String string6 = context.getString(R.string.penpal_sept_2024_starter_suggestion_6);
            string6.getClass();
            String string7 = context.getString(R.string.penpal_sept_2024_starter_suggestion_7);
            string7.getClass();
            String string8 = context.getString(R.string.penpal_sept_2024_starter_suggestion_8);
            string8.getClass();
            String string9 = context.getString(R.string.penpal_sept_2024_starter_suggestion_9);
            string9.getClass();
            String string10 = context.getString(R.string.penpal_sept_2024_starter_suggestion_10);
            string10.getClass();
            String string11 = context.getString(R.string.penpal_sept_2024_starter_suggestion_11);
            string11.getClass();
            String string12 = context.getString(R.string.penpal_sept_2024_starter_suggestion_12);
            string12.getClass();
            String string13 = context.getString(R.string.penpal_sept_2024_starter_suggestion_13);
            string13.getClass();
            String string14 = context.getString(R.string.penpal_sept_2024_starter_suggestion_14);
            string14.getClass();
            String string15 = context.getString(R.string.penpal_sept_2024_starter_suggestion_15);
            string15.getClass();
            String string16 = context.getString(R.string.penpal_sept_2024_starter_suggestion_16);
            string16.getClass();
            String string17 = context.getString(R.string.penpal_sept_2024_starter_suggestion_17);
            string17.getClass();
            String string18 = context.getString(R.string.penpal_sept_2024_starter_suggestion_18);
            string18.getClass();
            String string19 = context.getString(R.string.penpal_sept_2024_starter_suggestion_19);
            string19.getClass();
            String string20 = context.getString(R.string.penpal_sept_2024_starter_suggestion_20);
            string20.getClass();
            listG = fcva.c(fcva.g(b(string), b(string2), b(string3), b(string4), b(string5), b(string6), b(string7), b(string8), b(string9), b(string10), b(string11), b(string12), b(string13), b(string14), b(string15), b(string16), b(string17), b(string18), b(string19), b(string20)));
        } else if (((Boolean) ((cczi) crbf.ar.get()).e()).booleanValue()) {
            Context context2 = this.d;
            String string21 = context2.getString(R.string.penpal_funny_lyrics_suggestion_v2);
            string21.getClass();
            String string22 = context2.getString(R.string.penpal_short_story_suggestion_v2);
            string22.getClass();
            String string23 = context2.getString(R.string.penpal_funny_animal_jobs_suggestion_v2);
            string23.getClass();
            String string24 = context2.getString(R.string.penpal_would_you_rather_suggestion_v2);
            string24.getClass();
            String string25 = context2.getString(R.string.penpal_dinner_suggestion_v2);
            string25.getClass();
            String string26 = context2.getString(R.string.penpal_ice_breaker_suggestion_v2);
            string26.getClass();
            String string27 = context2.getString(R.string.penpal_message_draft_suggestion_v2);
            string27.getClass();
            String string28 = context2.getString(R.string.penpal_surprise_party_suggestion_v2);
            string28.getClass();
            listG = fcva.g(c(string21, context2.getString(R.string.penpal_funny_lyrics_prompt)), c(string22, context2.getString(R.string.penpal_short_story_prompt)), c(string23, context2.getString(R.string.penpal_funny_animal_jobs_prompt)), c(string24, context2.getString(R.string.penpal_would_you_rather_prompt)), c(string25, context2.getString(R.string.penpal_dinner_prompt)), c(string26, context2.getString(R.string.penpal_ice_breaker_prompt)), c(string27, context2.getString(R.string.penpal_message_darft_prompt)), c(string28, context2.getString(R.string.penpal_surprise_party_prompt)));
        } else {
            Context context3 = this.d;
            String string29 = context3.getString(R.string.penpal_message_draft_suggestion_v2);
            string29.getClass();
            String string30 = context3.getString(R.string.penpal_dinner_suggestion_v2);
            string30.getClass();
            String string31 = context3.getString(R.string.penpal_conversation_starters_suggestion_v2);
            string31.getClass();
            String string32 = context3.getString(R.string.penpal_movie_night_suggestion_v2);
            string32.getClass();
            String string33 = context3.getString(R.string.penpal_joke_suggestion_v2);
            string33.getClass();
            String string34 = context3.getString(R.string.penpal_workout_suggestion_v2);
            string34.getClass();
            listG = fcva.g(c(string29, context3.getString(R.string.penpal_message_darft_prompt)), c(string30, context3.getString(R.string.penpal_dinner_prompt)), c(string31, context3.getString(R.string.penpal_conversation_starters_prompt)), c(string32, context3.getString(R.string.penpal_movie_night_prompt)), c(string33, context3.getString(R.string.penpal_joke_prompt)), c(string34, context3.getString(R.string.penpal_workout_prompt)));
        }
        crifVar.j(listG, conversationIdType, messageIdType, this.a.f().toEpochMilli());
    }
}
