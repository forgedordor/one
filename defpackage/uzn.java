package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzn {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteStyleMap");
    public final Context b;
    private final fctc c;

    public uzn(Context context) {
        context.getClass();
        this.b = context;
        this.c = fctd.a(new fdae() { // from class: uzm
            @Override // defpackage.fdae
            public final Object invoke() {
                Context context2 = this.a.b;
                Map mapG = fcwa.g(new fcti(epiv.TONE_REPHRASE, context2.getString(R.string.rephrase_tone)), new fcti(epiv.TONE_SHAKESPEARE, context2.getString(R.string.shakespeare_tone)), new fcti(epiv.TONE_CHILL, context2.getString(R.string.fellow_kid_tone)), new fcti(epiv.TONE_EXCITED, context2.getString(R.string.excited_tone)), new fcti(epiv.TONE_RHYMES, context2.getString(R.string.rhyme_tone)), new fcti(epiv.TONE_FORMAL, context2.getString(R.string.formal_tone)), new fcti(epiv.TONE_CONCISE, context2.getString(R.string.concise_tone)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = (String) crbf.aS.e();
                ArrayList<epiv> arrayList = new ArrayList();
                if (str != null) {
                    for (String str2 : cssr.c(str)) {
                        str2.getClass();
                        if (str2.length() > 0) {
                            try {
                                arrayList.add(epiv.c(str2));
                            } catch (IllegalArgumentException e) {
                                ekrw ekrwVarI = uzn.a.i();
                                ekrwVarI.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteStyleMap", "allowedStyles", 50, "MagicRewriteStyleMap.kt")).t("Unknown Magic Compose style %s", str2);
                            }
                        }
                    }
                }
                for (epiv epivVar : arrayList) {
                    String str3 = (String) mapG.get(epivVar);
                    if (str3 != null) {
                        linkedHashMap.put(str3, epivVar);
                    }
                }
                return linkedHashMap;
            }
        });
    }

    public final LinkedHashMap a() {
        return (LinkedHashMap) this.c.a();
    }
}
