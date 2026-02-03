package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbh {
    static final /* synthetic */ crbh a = new crbh();

    private crbh() {
    }

    public static final String a(List list) {
        SuggestionData suggestionData;
        return (dhic.a(list) || (suggestionData = (SuggestionData) list.get(0)) == null) ? "" : suggestionData.c();
    }

    public static final String b(long j) {
        String str = String.format(Locale.US, "%019d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        str.getClass();
        return str;
    }

    public static final String c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return b(messageCoreData.t());
    }
}
