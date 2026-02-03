package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebvr extends vo {
    static final etyu a;
    public final boolean d;
    public final List e = new ArrayList();
    public final ebun f;
    public final AccessibilityManager g;
    public final ebxh h;

    static {
        etys etysVar = (etys) etyu.a.createBuilder();
        etysVar.copyOnWrite();
        ((etyu) etysVar.instance).b = "sticker_play_store_link";
        a = (etyu) etysVar.build();
    }

    public ebvr(ebun ebunVar, AccessibilityManager accessibilityManager, boolean z, ebxh ebxhVar) {
        this.f = ebunVar;
        this.g = accessibilityManager;
        this.d = z;
        this.h = ebxhVar;
        B(true);
    }

    @Override // defpackage.vo
    public final int a() {
        List list = this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = etyt.a(((etyu) it.next()).c);
            if (iA != 0 && iA == 3) {
                return list.size();
            }
        }
        return 0;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return ((etyu) this.e.get(i)).equals(a) ? 1 : 0;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ebvq(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_sticker_packs_item_view, viewGroup, false));
        }
        if (i == 1) {
            return new ebvm(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_play_store_link_item_view, viewGroup, false));
        }
        throw new IllegalStateException(a.g(i, "Unknown view type: "));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = wvVar.f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException(a.g(i2, "Unknown view type: "));
            }
            final ebvm ebvmVar = (ebvm) wvVar;
            View view = ebvmVar.a;
            view.setOnClickListener(new View.OnClickListener() { // from class: ebvl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ebvr ebvrVar = ebvmVar.s;
                    ebxh ebxhVar = ebvrVar.h;
                    if (ebxhVar != null) {
                        ebxhVar.F();
                        ebxr ebxrVarA = ebvrVar.f.a();
                        eryy eryyVar = eryy.BROWSE;
                        erza erzaVar = (erza) erzb.a.createBuilder();
                        erzaVar.copyOnWrite();
                        ((erzb) erzaVar.instance).b = eryz.a(15);
                        erzaVar.copyOnWrite();
                        ((erzb) erzaVar.instance).e = eryyVar.a();
                        ((ebxs) ebxrVarA).f((erzb) erzaVar.build());
                    }
                }
            });
            view.setContentDescription(view.getContext().getString(R.string.cd_browse_play_store_item_view));
            return;
        }
        final etyu etyuVar = (etyu) this.e.get(i);
        final ebvq ebvqVar = (ebvq) wvVar;
        ebvqVar.s = etyuVar;
        ImageView imageView = ebvqVar.t;
        Resources resources = imageView.getContext().getResources();
        rbv rbvVarE = raw.e(imageView);
        etyb etybVar = etyuVar.d;
        if (etybVar == null) {
            etybVar = etyb.a;
        }
        rbvVarE.i(etybVar.c).q(new rtj().H(ebve.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), imageView, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).v(imageView);
        imageView.setContentDescription(etyuVar.f);
        ebvqVar.v.setText(etyuVar.e);
        ebvqVar.w.setText(etyuVar.g);
        ebvr ebvrVar = ebvqVar.A;
        boolean zM = ebvrVar.f.m(etyuVar.b);
        ebvqVar.z = zM;
        if (zM) {
            ebvqVar.u.setVisibility(0);
        } else {
            ebvqVar.u.setVisibility(8);
        }
        View view2 = ebvqVar.a;
        view2.setOnClickListener(new View.OnClickListener() { // from class: ebvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ebxh ebxhVar = ebvqVar.A.h;
                if (ebxhVar != null) {
                    ebxhVar.E(etyuVar);
                }
            }
        });
        view2.setContentDescription(view2.getContext().getString(R.string.cd_browse_sticker_packs_item_view, etyuVar.e));
        view2.setPressed(false);
        if (ebvrVar.g.isTouchExplorationEnabled()) {
            return;
        }
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: ebvo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return ebvqVar.x.b(motionEvent);
            }
        });
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return ((etyu) this.e.get(i)).b.hashCode();
    }
}
