package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agtf {
    private final Context a;

    public agtf(Context context) {
        context.getClass();
        this.a = context;
    }

    private static final dlfk b(String str) {
        return new dlfk("", str, null, new dlek(agte.a, 13), false, 244);
    }

    public final divc a() {
        Context context = this.a;
        String string = context.getString(R.string.penpal_message_draft_suggestion_v2);
        string.getClass();
        String string2 = context.getString(R.string.penpal_cafe_recommendations_suggestion);
        string2.getClass();
        String string3 = context.getString(R.string.penpal_lunch_recipes_suggestion);
        string3.getClass();
        String string4 = context.getString(R.string.penpal_music_trivia_suggestion);
        string4.getClass();
        String string5 = context.getString(R.string.penpal_road_trip_suggestion);
        string5.getClass();
        String string6 = context.getString(R.string.penpal_settle_a_debate_suggestion);
        string6.getClass();
        String string7 = context.getString(R.string.penpal_conversation_suggestion);
        string7.getClass();
        String string8 = context.getString(R.string.penpal_dinner_suggestion_v2);
        string8.getClass();
        List listG = fcva.g(new dksi(fcva.g(b(string), b(string2), b(string3)), 1, 98), new dksi(fcva.g(b(string4), b(string5), b(string6)), 0, 0), new dksi(fcva.g(b(string7), b(string), b(string8)), 1, 110));
        String string9 = context.getString(R.string.penpal_sell_page_text);
        string9.getClass();
        return new divc(listG, new dkeg(string9, null, null, null, null, null, null, null, 254));
    }
}
