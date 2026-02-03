package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dafd extends daew {
    public dacu i;
    public final fcsu j;
    public final dabl k;
    private final daig l;

    public dafd(Context context, fcsu fcsuVar, dabl dablVar, daig daigVar) {
        super(context, context.getResources().getDimensionPixelSize(R.dimen.zero_state_search_photo_corner_radius));
        this.j = fcsuVar;
        this.k = dablVar;
        this.l = daigVar;
    }

    @Override // defpackage.daew
    public final int F(boolean z) {
        return z ? 6 : 4;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        final dafc dafcVar = new dafc(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_photo_result_item, viewGroup, false));
        dafcVar.s.setOnClickListener(new View.OnClickListener() { // from class: dafb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dafd dafdVar = this.a;
                dafdVar.i.u(new dabq(2, dafcVar.ft()));
                ((dabm) dafdVar.j.b()).e(2);
                dafdVar.k.f(6, 3);
            }
        });
        return dafcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    @Override // defpackage.vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void g(defpackage.wv r7, int r8) {
        /*
            r6 = this;
            dafc r7 = (defpackage.dafc) r7
            android.widget.ImageView r0 = r7.t
            android.view.View r1 = r7.s
            com.google.android.apps.messaging.ui.search.resultsview.MediaGridLayoutManager r2 = r6.e
            int r1 = r2.bE(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r2.width = r1
            r2.height = r1
            java.util.List r2 = r6.g
            java.lang.Object r8 = r2.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult) r8
            daig r2 = r6.l
            r3 = 0
            java.lang.String r2 = r2.a(r8, r3)
            r0.setContentDescription(r2)
            boolean r2 = r8.o()
            cpdw r7 = r7.u
            boolean r4 = r7.i()
            r5 = 1
            if (r4 != 0) goto L36
            if (r2 == 0) goto L43
            r2 = r5
        L36:
            android.view.View r7 = r7.b()
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r5 == r2) goto L40
            r3 = 8
        L40:
            r7.setVisibility(r3)
        L43:
            rbv r7 = r6.a
            android.net.Uri r8 = r8.h()
            rbr r7 = r7.f(r8)
            rtj r8 = r6.f
            rta r8 = r8.P(r1)
            rbr r7 = r7.q(r8)
            ruf r8 = r6.h
            rqi r8 = defpackage.rqi.c(r8)
            rbr r7 = r7.p(r8)
            r7.v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dafd.g(wv, int):void");
    }
}
