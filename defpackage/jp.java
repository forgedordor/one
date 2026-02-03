package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jp {
    static lah a(Configuration configuration) {
        return lah.c(configuration.getLocales().toLanguageTags());
    }

    static void b(Configuration configuration, lah lahVar) {
        configuration.setLocales(LocaleList.forLanguageTags(lahVar.e()));
    }
}
