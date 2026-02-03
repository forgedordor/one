package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumj extends ArrayAdapter {
    final /* synthetic */ eumy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eumj(eumy eumyVar, Context context) {
        super(context, 0);
        this.a = eumyVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        eunc euncVar = (eunc) getItem(i);
        eumy eumyVar = this.a;
        int width = eumyVar.H.getWidth();
        euncVar.getClass();
        eumx eumxVar = eumyVar.n;
        if (view != null) {
            eumz.h(view, euncVar, eumxVar.b, eumx.b(euncVar));
        } else {
            view = eumxVar.a(euncVar);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
