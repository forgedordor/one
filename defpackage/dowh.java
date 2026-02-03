package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowh extends vo {
    public final dpzn a;
    public final dngc d;
    public final fdap e;
    public final fdap f;
    public String g;
    private final fctc i = fctd.a(new fdae() { // from class: dovv
        @Override // defpackage.fdae
        public final Object invoke() {
            final dowh dowhVar = this.a;
            dndy dndyVar = new dndy() { // from class: dovw
                @Override // defpackage.dndy
                public final /* synthetic */ boolean a(Object obj, int i, Object obj2) {
                    dowg dowgVar = (dowg) obj;
                    dowh dowhVar2 = dowhVar;
                    String str = dowhVar2.g;
                    if (str == null) {
                        fdbq.c("userQuery");
                        str = null;
                    }
                    dowgVar.C(str, (dovz) dowhVar2.h.get(i));
                    return true;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = fdcj.a;
            dndx.b(new fdbi(dowa.class), dndyVar, linkedHashMap);
            return dndx.a(linkedHashMap);
        }
    });
    public List h = fcvo.a;

    public dowh(dpzn dpznVar, dngc dngcVar, fdap fdapVar, fdap fdapVar2) {
        this.a = dpznVar;
        this.d = dngcVar;
        this.e = fdapVar;
        this.f = fdapVar2;
    }

    public final void F(List list) {
        List listA = dndw.a(this.h, list, 0, new fdat() { // from class: dovt
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                ((dovz) obj).getClass();
                ((dovz) obj2).getClass();
                return false;
            }
        }, new fdat() { // from class: dovu
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                ((dovz) obj).getClass();
                ((dovz) obj2).getClass();
                return dowa.a;
            }
        }, 12);
        this.h = list;
        dndw.b(listA, 6, this);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.h.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_row_layout, viewGroup, false);
        viewInflate.getClass();
        return new dowg(this, viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dowg dowgVar = (dowg) wvVar;
        dowgVar.getClass();
        z(dowgVar, i, fcvo.a);
    }

    @Override // defpackage.vo
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void z(dowg dowgVar, int i, List list) {
        dowgVar.getClass();
        list.getClass();
        if (((dndz) this.i.a()).a(dowgVar, i, list)) {
            return;
        }
        String str = this.g;
        if (str == null) {
            fdbq.c("userQuery");
            str = null;
        }
        final dovz dovzVar = (dovz) this.h.get(i);
        str.getClass();
        dovzVar.getClass();
        Object objA = dowgVar.t.a();
        objA.getClass();
        View view = dowgVar.s;
        ((ImageView) objA).setImageDrawable(view.getContext().getDrawable(dovzVar.a()));
        final dowh dowhVar = dowgVar.u;
        view.setOnClickListener(dowhVar.d.a("SearchRowsAdapter.ViewHolder#onRowClick", new View.OnClickListener() { // from class: dowe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = dowg.v;
                this.a.e.invoke(dovzVar.b());
            }
        }));
        dowgVar.C(str, dovzVar);
    }
}
