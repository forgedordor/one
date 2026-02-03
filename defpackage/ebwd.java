package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebwd extends vo {
    public final ebun a;
    public final ebxh d;
    public final aam e = new aam(new ebvx(this));
    public final Set f = new HashSet();
    public final List g = new ArrayList();
    public final Map h = new HashMap();
    public final Map i = new HashMap();

    public ebwd(ebun ebunVar, ebxh ebxhVar) {
        this.a = ebunVar;
        this.d = ebxhVar;
        B(true);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new ebwc(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favorite_sticker_packs_item_view, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        final ebwc ebwcVar = (ebwc) wvVar;
        final etyu etyuVar = (etyu) this.g.get(i);
        ebwcVar.x = ebwcVar.y.a.m(etyuVar.b);
        ebwcVar.C();
        ImageView imageView = ebwcVar.s;
        Resources resources = imageView.getContext().getResources();
        int iA = etyt.a(etyuVar.c);
        if (iA == 0) {
            iA = 1;
        }
        if (iA - 2 != 1) {
            throw new IllegalStateException("Loaded pack type should be Regular.");
        }
        rbv rbvVarE = raw.e(imageView);
        etyb etybVar = etyuVar.d;
        if (etybVar == null) {
            etybVar = etyb.a;
        }
        rbvVarE.i(etybVar.c).q(new rtj().H(ebve.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), imageView, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rqi.b()).v(imageView);
        ebwcVar.t.setText(etyuVar.e);
        ebwcVar.u.setText(etyuVar.g);
        View view = ebwcVar.a;
        view.setOnClickListener(new View.OnClickListener() { // from class: ebvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ebxh ebxhVar = ebwcVar.y.d;
                if (ebxhVar != null) {
                    ebxhVar.E(etyuVar);
                }
            }
        });
        view.setContentDescription(view.getContext().getResources().getString(R.string.cd_browse_sticker_packs_item_view, etyuVar.e));
        ebwcVar.w.setOnTouchListener(new View.OnTouchListener() { // from class: ebvz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                ebwc ebwcVar2 = ebwcVar;
                ebwcVar2.y.e.n(ebwcVar2);
                return true;
            }
        });
        ebwcVar.v.setOnClickListener(new View.OnClickListener() { // from class: ebwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ebwc ebwcVar2 = ebwcVar;
                ebwcVar2.v.setClickable(false);
                boolean z = ebwcVar2.x;
                ebwcVar2.x = !z;
                String str = etyuVar.b;
                if (z) {
                    ebwcVar2.y.f.add(str);
                }
                ebwd ebwdVar = ebwcVar2.y;
                boolean z2 = ebwcVar2.x;
                ebun ebunVar = ebwdVar.a;
                ListenableFuture listenableFutureG = ebunVar.g(str, z2);
                Map map = ebwdVar.i;
                if (map.containsKey(str)) {
                    ((ListenableFuture) map.get(str)).cancel(true);
                }
                map.put(str, listenableFutureG);
                eork.r(listenableFutureG, new ebwb(ebwcVar2, str, view2), ebvf.a);
                ebunVar.a().a(str, eryy.FAVORITES, ebwcVar2.x);
            }
        });
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return ((etyu) this.g.get(i)).b.hashCode();
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        this.e.f(recyclerView);
    }

    public final void l(String str) {
        int i = 0;
        while (true) {
            List list = this.g;
            if (i >= list.size()) {
                return;
            }
            if (((etyu) list.get(i)).b.equals(str)) {
                list.remove(i);
                y(i);
                return;
            }
            i++;
        }
    }
}
