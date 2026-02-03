package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpav extends vo {
    private static final dons g;
    public final fdau a;
    public final fdap d;
    public final fdat e;
    public doyu f;
    private final dobl h;
    private final fdap i;

    static {
        fctc fctcVar = dofn.a;
        g = new dons(dofm.a(), (ImageView.ScaleType) null, 6);
    }

    public dpav(dobl doblVar, fdap fdapVar, fdau fdauVar, fdap fdapVar2, fdat fdatVar) {
        this.h = doblVar;
        this.i = fdapVar;
        this.a = fdauVar;
        this.d = fdapVar2;
        this.e = fdatVar;
    }

    public static final int l(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // defpackage.vo
    public final int a() {
        doyu doyuVar = this.f;
        if (doyuVar == null) {
            fdbq.c("stickerPack");
            doyuVar = null;
        }
        return doyuVar.e.size() + 1;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return l(i) - 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return this.h.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_media_item_layout, viewGroup, false), g);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_pack_header_layout, viewGroup, false);
        viewInflate.getClass();
        return new dpau(this, viewInflate);
    }

    @Override // defpackage.vo
    public final void g(final wv wvVar, int i) throws Resources.NotFoundException {
        wvVar.getClass();
        final doyu doyuVar = null;
        if (!(wvVar instanceof dpau)) {
            if (wvVar instanceof dobk) {
                dobk dobkVar = (dobk) wvVar;
                doyu doyuVar2 = this.f;
                if (doyuVar2 == null) {
                    fdbq.c("stickerPack");
                } else {
                    doyuVar = doyuVar2;
                }
                donr.G(dobkVar, (dohs) doyuVar.e.get(i - 1), this.i, new donn() { // from class: dpar
                    @Override // defpackage.donn
                    public final boolean a(Object obj, PointF pointF) {
                        this.a.a.a((doyt) obj, wvVar.a, pointF);
                        return true;
                    }
                }, null, null, 120);
                return;
            }
            return;
        }
        final dpau dpauVar = (dpau) wvVar;
        doyu doyuVar3 = this.f;
        if (doyuVar3 == null) {
            fdbq.c("stickerPack");
        } else {
            doyuVar = doyuVar3;
        }
        doyuVar.getClass();
        TextView textView = dpauVar.t;
        String str = doyuVar.c;
        textView.setText(str);
        dpauVar.u.setText(doyuVar.d);
        View view = dpauVar.v;
        final dpav dpavVar = dpauVar.x;
        view.setOnClickListener(new View.OnClickListener() { // from class: dpas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = dpau.y;
                this.a.d.invoke(doyuVar);
            }
        });
        dpauVar.w.setOnClickListener(new View.OnClickListener() { // from class: dpat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                doyu doyuVar4 = doyuVar;
                doyuVar4.f = !doyuVar4.f;
                dpau dpauVar2 = dpauVar;
                dpauVar2.C(dpauVar2.s);
                dpavVar.e.a(doyuVar4, Boolean.valueOf(doyuVar4.f));
            }
        });
        View view2 = dpauVar.s;
        dpauVar.C(view2);
        view2.setContentDescription(str);
        int i2 = -view2.getContext().getResources().getDimensionPixelSize(R.dimen.standard_view_padding);
        View view3 = dpauVar.a;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.setMarginEnd(i2);
        view3.setLayoutParams(marginLayoutParams);
    }
}
