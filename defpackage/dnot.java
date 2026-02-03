package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnot {
    private static final Map a = fcwa.g(new fcti("smileys_and_emotion", new dnos(R.string.emoji_standard_category_smileys_and_emotion, R.drawable.ic_emoji_standard_category_smileys_and_emotion)), new fcti("people", new dnos(R.string.emoji_standard_category_people, R.drawable.ic_emoji_standard_category_people)), new fcti("animals_and_nature", new dnos(R.string.emoji_standard_category_animals_and_nature, R.drawable.ic_emoji_standard_category_animals_and_nature)), new fcti("food_and_drink", new dnos(R.string.emoji_standard_category_food_and_drink, R.drawable.ic_emoji_standard_category_food_and_drink)), new fcti("travel_and_places", new dnos(R.string.emoji_standard_category_travel_and_places, R.drawable.ic_emoji_standard_category_travel_and_places)), new fcti("activities", new dnos(R.string.emoji_standard_category_activities, R.drawable.ic_emoji_standard_category_activities)), new fcti("objects", new dnos(R.string.emoji_standard_category_objects, R.drawable.ic_emoji_standard_category_objects)), new fcti("symbols", new dnos(R.string.emoji_standard_category_symbols, R.drawable.ic_emoji_standard_category_symbols)), new fcti("flags", new dnos(R.string.emoji_standard_category_flags, R.drawable.ic_emoji_standard_category_flags)));

    public static final dnos a(dnkg dnkgVar) {
        dnkgVar.getClass();
        Map map = a;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String str = dnkgVar.a;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        dnos dnosVar = (dnos) map.get(fdgn.q(fdgn.q(lowerCase, " ", "_"), "&", "and"));
        if (dnosVar != null) {
            return dnosVar;
        }
        throw new IllegalStateException(a.a(str, "No resource defined for ", "!"));
    }
}
