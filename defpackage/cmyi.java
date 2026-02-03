package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmyi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/suggestions/SuggestionTypeCombinationsConfig");
    public static final ejxk b = ejxk.b(';').a();
    public static final ejxh c = new ejxh(ejxk.b(',').a(), ejxk.b('|'));
    public static final Pattern d;
    public final ejxr e;

    static {
        Pattern patternCompile = Pattern.compile("\\[(\\d?):(\\d*)]");
        patternCompile.getClass();
        d = patternCompile;
    }

    public cmyi() {
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: cmyg
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = cmyi.a;
                String str = (String) cmyc.a.e();
                ekfw ekfwVar = new ekfw();
                try {
                    for (String str2 : cmyi.b.g(str)) {
                        str2.getClass();
                        ekfwVar.h(new cmyh(str2));
                    }
                } catch (Exception e) {
                    ekrw ekrwVarJ = cmyi.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/suggestions/SuggestionTypeCombinationsConfig", "parseConfigString", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SuggestionTypeCombinationsConfig.kt")).t("Error while parsing config string %s", str);
                }
                ekgb ekgbVarG = ekfwVar.g();
                ekgbVarG.getClass();
                return ekgbVarG;
            }
        });
        ejxrVarA.getClass();
        this.e = ejxrVarA;
    }
}
