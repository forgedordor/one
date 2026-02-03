package defpackage;

import android.R;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acri implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ eiik a;
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    final /* synthetic */ acrt c;

    public acri(acrt acrtVar, eiik eiikVar, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = eiikVar;
        this.b = onPreDrawListener;
        this.c = acrtVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        try {
            eifp eifpVarA = this.a.a();
            try {
                boolean zOnPreDraw = this.b.onPreDraw();
                eifpVarA.close();
                acrt acrtVar = this.c;
                acom acomVar = acrtVar.b;
                if (acomVar.a.c == lvb.a) {
                    ekrw ekrwVarH = acrt.a.h();
                    ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 3924, "HomeFragmentPeer.java")).q("fragment is destroyed after posting on UI thread.");
                    return zOnPreDraw;
                }
                if (!acrtVar.aL) {
                    ekrw ekrwVarH2 = acrt.a.h();
                    ekrwVarH2.X(eksq.a, "HomeFragmentFlogger");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 3933, "HomeFragmentPeer.java")).q("HomeScreen not ready. Keeping splash screen.");
                    return zOnPreDraw;
                }
                ekrw ekrwVarH3 = acrt.a.h();
                ekrwVarH3.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 3926, "HomeFragmentPeer.java")).q("HomeScreen ready. Removing splash screen.");
                acomVar.fg().findViewById(R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
                return zOnPreDraw;
            } finally {
            }
        } catch (Throwable th) {
            acrt acrtVar2 = this.c;
            acom acomVar2 = acrtVar2.b;
            if (acomVar2.a.c == lvb.a) {
                ekrw ekrwVarH4 = acrt.a.h();
                ekrwVarH4.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 3924, "HomeFragmentPeer.java")).q("fragment is destroyed after posting on UI thread.");
            } else if (acrtVar2.aL) {
                ekrw ekrwVarH5 = acrt.a.h();
                ekrwVarH5.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 3926, "HomeFragmentPeer.java")).q("HomeScreen ready. Removing splash screen.");
                acomVar2.fg().findViewById(R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
            } else {
                ekrw ekrwVarH6 = acrt.a.h();
                ekrwVarH6.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 3933, "HomeFragmentPeer.java")).q("HomeScreen not ready. Keeping splash screen.");
            }
            throw th;
        }
    }
}
