package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umy implements uek {
    private final ckmb a;
    private final int b;

    public umy(ckmb ckmbVar, int i) {
        ckmbVar.getClass();
        this.a = ckmbVar;
        this.b = i;
    }

    @Override // defpackage.uek
    public final uer a() {
        return uer.REACTION_BADGE;
    }

    @Override // defpackage.uek
    public final /* bridge */ /* synthetic */ void b(wv wvVar) throws Resources.NotFoundException {
        unc uncVar = (unc) wvVar;
        uncVar.getClass();
        ckml ckmlVarB = ckml.b(this.a.e);
        if (ckmlVarB == null) {
            ckmlVarB = ckml.UNRECOGNIZED;
        }
        int i = this.b;
        View view = uncVar.a;
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reaction_badge_container_height);
        if (i <= 1) {
            view.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_width), dimensionPixelSize));
        } else {
            view.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_with_count_width), dimensionPixelSize));
        }
        TextView textView = uncVar.v;
        if (textView != null) {
            if (i <= 1) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(String.format(craf.c(textView.getContext().getApplicationContext()), "%d", Integer.valueOf(i)));
            }
        }
        if (uncVar.u) {
            return;
        }
        Resources resources2 = view.getResources();
        Integer numValueOf = Integer.valueOf(i);
        ekgp ekgpVar = umw.a;
        ejwl.f(ekgpVar.containsKey(ckmlVarB), "Could not get content description for reaction type=%s", ckmlVarB);
        Integer num = (Integer) ekgpVar.get(ckmlVarB);
        num.getClass();
        view.setContentDescription(resources2.getQuantityString(R.plurals.reaction_badge_content_description, i, numValueOf, resources2.getString(num.intValue())));
        uncVar.s.a(uncVar.t, ckmlVarB).addOnAttachStateChangeListener(new unb());
        uncVar.u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umy)) {
            return false;
        }
        umy umyVar = (umy) obj;
        return fdbq.f(this.a, umyVar.a) && this.b == umyVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ReactionBadgeData(reaction=" + this.a + ", instanceCount=" + this.b + ")";
    }
}
