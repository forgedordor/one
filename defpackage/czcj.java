package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czcj extends vo {
    public boolean a = true;
    public final List d = new ArrayList();
    private final rbr e;
    private final czcu f;

    public czcj(Context context, czcu czcuVar) {
        this.f = czcuVar;
        this.e = (rbr) raw.c(context).c().q(rtj.e()).p(rqi.b()).R(R.drawable.compose2o_tile_background);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 1;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new czcy(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_item_view_m2_sg, viewGroup, false), this.e, this.f);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        final czcy czcyVar = (czcy) wvVar;
        final GifContentItem gifContentItem = (GifContentItem) this.d.get(i);
        final boolean z = this.a;
        String str = gifContentItem.d() + ":" + gifContentItem.c();
        aw awVar = new aw();
        ConstraintLayout constraintLayout = czcyVar.v;
        awVar.e(constraintLayout);
        ImageView imageView = czcyVar.s;
        awVar.a(imageView.getId()).w = str;
        awVar.b(constraintLayout);
        czcyVar.t.i(gifContentItem.a).v(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: czcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czcy czcyVar2 = czcyVar;
                czcu czcuVar = czcyVar2.u;
                int iFt = czcyVar2.ft();
                final czch czchVar = (czch) czcuVar;
                RecyclerView recyclerView = czchVar.k;
                GifBrowserActivity gifBrowserActivity = czchVar.a;
                czchVar.g.e(gifBrowserActivity, recyclerView);
                Intent intent = new Intent();
                final GifContentItem gifContentItem2 = gifContentItem;
                intent.putExtra("gif_content_item", gifContentItem2);
                intent.putExtra("gif_position_selected", iFt);
                gifBrowserActivity.setResult(-1, intent);
                if (!z) {
                    auwa.a(new Runnable() { // from class: czbx
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqoj cqojVar = (cqoj) czchVar.f.b();
                            String[] strArr = btfy.a;
                            btel btelVar = new btel();
                            GifContentItem gifContentItem3 = gifContentItem2;
                            btelVar.f(gifContentItem3.e);
                            btelVar.b(null);
                            btelVar.c(gifContentItem3.f);
                            btelVar.e(gifContentItem3.g);
                            btelVar.g(gifContentItem3.d());
                            btelVar.d(gifContentItem3.c());
                            final btei bteiVarA = btelVar.a();
                            cqaz.h();
                            ejwl.a(!TextUtils.isEmpty(bteiVarA.m().toString()));
                            ejwl.a(!TextUtils.isEmpty(bteiVarA.n()));
                            ejwl.a(!TextUtils.isEmpty(bteiVarA.o()));
                            cqojVar.c.a("GifDatabaseOperations#insertRecentGif", new dqsl() { // from class: cqog
                                @Override // defpackage.dqsl
                                public final Object a(byeu byeuVar) {
                                    return cqoj.a(bteiVarA, byeuVar);
                                }
                            });
                        }
                    }, czchVar.b);
                }
                String str2 = czchVar.t;
                if (str2 != null && czchVar.u != 2) {
                    ejca ejcaVar = czchVar.d;
                    if (ejcaVar instanceof cqpc) {
                        ((cqpc) ejcaVar).c(new cqpn(gifContentItem2.h, str2));
                    }
                }
                ((ajhd) czchVar.c.b()).ag(4, czchVar.u, czchVar.j.l());
                czchVar.e(emsh.SELECTION);
            }
        });
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return ((GifContentItem) this.d.get(i)).e.hashCode();
    }
}
