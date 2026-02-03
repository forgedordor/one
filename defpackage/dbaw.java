package defpackage;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.util.Rational;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbaw implements dbax {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/youtube/YouTubePlayerFragmentPeer");
    public static final Rational b = new Rational(16, 9);
    public final Activity c;
    public final ea d;
    public final ehpl e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;

    public dbaw(Activity activity, ea eaVar, ehpl ehplVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.c = activity;
        this.d = eaVar;
        this.e = ehplVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
    }

    public final PictureInPictureParams.Builder a() {
        return new PictureInPictureParams.Builder().setAspectRatio(b);
    }

    public final void b(List list) {
        this.c.setPictureInPictureParams(a().setActions(list).build());
    }

    public final void c(fdap fdapVar) {
        fdapVar.invoke((ViewGroup) this.d.N());
    }
}
