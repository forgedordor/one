package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donx {
    public static final /* synthetic */ int c = 0;
    private static final Duration d;
    public boolean a;
    public final fctc b = fctd.a(new fdae() { // from class: dont
        @Override // defpackage.fdae
        public final Object invoke() {
            int i = donx.c;
            return new dngs(new fdat() { // from class: donv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ViewGroup viewGroup = (ViewGroup) obj;
                    ImageView imageView = (ImageView) obj2;
                    int i2 = donx.c;
                    viewGroup.getClass();
                    imageView.getClass();
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.selection_layout, viewGroup, false);
                    viewInflate.getClass();
                    TextView textView = (TextView) viewInflate;
                    viewGroup.addView(textView);
                    textView.setOutlineProvider(imageView.getOutlineProvider());
                    textView.setClipToOutline(true);
                    return textView;
                }
            });
        }
    });

    static {
        Duration durationOfMillis = Duration.ofMillis(150L);
        durationOfMillis.getClass();
        d = durationOfMillis;
    }

    public static final void a(View view, TextView textView, float f, float f2, final fdae fdaeVar) {
        textView.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        Duration duration = d;
        viewPropertyAnimatorAnimate.setDuration(duration.toMillis());
        viewPropertyAnimatorAnimate.scaleX(f);
        viewPropertyAnimatorAnimate.scaleY(f);
        if (fdaeVar != null) {
            viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: donu
                @Override // java.lang.Runnable
                public final void run() {
                    int i = donx.c;
                    fdaeVar.invoke();
                }
            });
        }
        viewPropertyAnimatorAnimate.start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = textView.animate();
        viewPropertyAnimatorAnimate2.setDuration(duration.toMillis());
        viewPropertyAnimatorAnimate2.alpha(f2);
        viewPropertyAnimatorAnimate2.start();
    }

    public static final void b(TextView textView, int i) throws Resources.NotFoundException {
        String string = textView.getResources().getString(R.string.selection_position_text, Integer.valueOf(i + 1));
        string.getClass();
        textView.setText(string);
    }

    public static final void c(View view, TextView textView, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f);
        textView.setAlpha(f2);
    }
}
