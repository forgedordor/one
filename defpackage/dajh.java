package defpackage;

import android.support.constraint.Guideline;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajh {
    public static void a(Guideline guideline, int i) {
        au auVar = (au) guideline.getLayoutParams();
        auVar.a = i;
        auVar.b = -1;
        guideline.setLayoutParams(auVar);
    }

    public static void b(Guideline guideline, int i) {
        au auVar = (au) guideline.getLayoutParams();
        auVar.b = i;
        auVar.a = -1;
        guideline.setLayoutParams(auVar);
    }
}
