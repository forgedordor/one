package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkv extends cvkf {
    final /* synthetic */ ImageView d;
    final /* synthetic */ cvjd e;
    final /* synthetic */ cvke f;
    final /* synthetic */ cvke g;
    final /* synthetic */ cvke h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvkv(BiConsumer biConsumer, cvkd cvkdVar, ImageView imageView, cvjd cvjdVar, cvke cvkeVar, cvke cvkeVar2, cvke cvkeVar3) {
        super(biConsumer, cvkdVar);
        this.d = imageView;
        this.e = cvjdVar;
        this.f = cvkeVar;
        this.g = cvkeVar2;
        this.h = cvkeVar3;
    }

    @Override // defpackage.cvkf
    public final View a() {
        return this.d;
    }

    @Override // defpackage.cvkf
    public final void b(cvkd cvkdVar) {
        cvke cvkeVar;
        int iOrdinal = cvkdVar.ordinal();
        if (iOrdinal == 0) {
            cvkeVar = this.f;
        } else if (iOrdinal == 1) {
            cvkeVar = this.g;
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException("Unhandled state ".concat(String.valueOf(String.valueOf(cvkdVar))));
            }
            cvkeVar = this.h;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(this.e, (Property<cvjd, Integer>) cvns.b, cvkdVar == cvkd.OPEN ? 10000 : 0).setDuration(250L);
        duration.setInterpolator(new lud());
        duration.start();
        ImageView imageView = this.d;
        imageView.setColorFilter(cvkeVar.b);
        Context context = imageView.getContext();
        if (cvkeVar.e == null) {
            cvkeVar.e = context.getString(cvkeVar.c);
        }
        imageView.setContentDescription(cvkeVar.e);
        Integer num = cvkeVar.d;
        if (num == null) {
            imageView.setBackground(null);
        } else {
            num.intValue();
            imageView.setBackgroundResource(R.drawable.compose_audio_button_selected_background);
        }
    }
}
