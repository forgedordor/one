package defpackage;

import android.content.Context;
import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobj implements rti {
    final /* synthetic */ dobk a;

    public dobj(dobk dobkVar) {
        this.a = dobkVar;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        return false;
    }

    @Override // defpackage.rti
    public final boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        RoundedImageView roundedImageView = this.a.v;
        Context context = roundedImageView.getContext();
        context.getClass();
        if (dpgx.e(context)) {
            return false;
        }
        roundedImageView.a();
        return false;
    }
}
