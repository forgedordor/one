package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unf implements uek {
    private final ckmb a;
    private final int b;

    public unf(ckmb ckmbVar, int i) {
        ckmbVar.getClass();
        this.a = ckmbVar;
        this.b = i;
    }

    @Override // defpackage.uek
    public final uer a() {
        return uer.CUSTOM_REACTION_BADGE;
    }

    @Override // defpackage.uek
    public final /* bridge */ /* synthetic */ void b(wv wvVar) throws Resources.NotFoundException {
        ung ungVar = (ung) wvVar;
        ungVar.getClass();
        View view = ungVar.a;
        Resources resources = view.getResources();
        resources.getClass();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reaction_badge_container_height);
        int i = this.b;
        if (i <= 1) {
            view.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_width), dimensionPixelSize));
        } else {
            view.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_with_count_width), dimensionPixelSize));
        }
        if (i <= 1) {
            ungVar.t.setVisibility(8);
        } else {
            TextView textView = ungVar.t;
            textView.setVisibility(0);
            String str = String.format(craf.c(textView.getContext().getApplicationContext()), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            str.getClass();
            textView.setText(str);
        }
        ckmb ckmbVar = this.a;
        view.setContentDescription(view.getResources().getQuantityString(R.plurals.reaction_badge_content_description, i, Integer.valueOf(i), ckmbVar.d));
        ungVar.s.setText(ckmbVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unf)) {
            return false;
        }
        unf unfVar = (unf) obj;
        return fdbq.f(this.a, unfVar.a) && this.b == unfVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CustomReactionBadgeData(reaction=" + this.a + ", instanceCount=" + this.b + ")";
    }
}
