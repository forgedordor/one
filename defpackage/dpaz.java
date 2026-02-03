package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpaz extends vo {
    public final fdap a;
    public boolean d;
    public fdap e;
    private List f = fcvo.a;

    public dpaz(fdap fdapVar) {
        this.a = fdapVar;
    }

    public final void F(fdap fdapVar) {
        fdapVar.getClass();
        this.e = fdapVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_pack_item_layout, viewGroup, false);
        viewInflate.getClass();
        return new dpay(this, viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dpay dpayVar = (dpay) wvVar;
        dpayVar.getClass();
        final doyu doyuVar = (doyu) this.f.get(i);
        doyuVar.getClass();
        ImageView imageView = dpayVar.t;
        rbv rbvVarE = raw.e(imageView);
        rbvVarE.k(imageView);
        rbvVarE.i(doyuVar.b).v(imageView);
        TextView textView = dpayVar.u;
        String str = doyuVar.c;
        textView.setText(str);
        int i2 = 8;
        if (doyuVar.f && dpayVar.w.d) {
            i2 = 0;
        }
        dpayVar.v.setVisibility(i2);
        View view = dpayVar.s;
        final dpaz dpazVar = dpayVar.w;
        view.setContentDescription(str);
        view.setOnClickListener(new View.OnClickListener() { // from class: dpax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = dpay.x;
                this.a.a.invoke(doyuVar);
            }
        });
        fdap fdapVar = dpazVar.e;
        if (fdapVar != null) {
            fdapVar.invoke(view);
        }
    }

    public final void l(List list, boolean z) {
        list.getClass();
        this.f = list;
        this.d = z;
        p();
    }
}
