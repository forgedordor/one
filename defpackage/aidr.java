package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/samsung/SamsungExperience");
    public final Context b;
    private final AtomicBoolean c;
    private final fctc d;

    public aidr(Context context) {
        context.getClass();
        this.b = context;
        this.c = new AtomicBoolean(false);
        this.d = fctd.a(new fdae() { // from class: aidq
            @Override // defpackage.fdae
            public final Object invoke() {
                boolean zHasSystemFeature = this.a.b.getPackageManager().hasSystemFeature("com.samsung.feature.SAMSUNG_EXPERIENCE_AM");
                ekrw ekrwVarH = aidr.a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/samsung/SamsungExperience", "hasSystemFeature_delegate$lambda$0", 40, "SamsungExperience.kt");
                Boolean boolValueOf = Boolean.valueOf(zHasSystemFeature);
                ekrdVar.t("Has Samsung system feature: %b", boolValueOf);
                return boolValueOf;
            }
        });
    }

    public final boolean a() {
        return this.c.get() || ((Boolean) this.d.a()).booleanValue();
    }
}
