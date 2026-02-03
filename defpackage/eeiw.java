package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeiw extends vo {
    public final eeia a;
    private final eehq d;
    private final eeht e;
    private final eehu f;
    private final int g;

    public eeiw(Context context, eeht eehtVar, eehq eehqVar, eehu eehuVar, eeia eeiaVar) {
        eeis eeisVar = eehqVar.a;
        eeis eeisVar2 = eehqVar.b;
        eeis eeisVar3 = eehqVar.d;
        if (eeisVar.compareTo(eeisVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (eeisVar3.compareTo(eeisVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.g = (eeit.a * eeih.a(context)) + (eeio.ba(context) ? eeih.a(context) : 0);
        this.d = eehqVar;
        this.e = eehtVar;
        this.f = eehuVar;
        this.a = eeiaVar;
        B(true);
    }

    final eeis F(int i) {
        return this.d.a.e(i);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.d.g;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!eeio.ba(viewGroup.getContext())) {
            return new eeiv(linearLayout, false);
        }
        linearLayout.setLayoutParams(new wc(-1, this.g));
        return new eeiv(linearLayout, true);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        eeiv eeivVar = (eeiv) wvVar;
        eehq eehqVar = this.d;
        eeis eeisVarE = eehqVar.a.e(i);
        eeivVar.s.setText(eeisVarE.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) eeivVar.t.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !eeisVarE.equals(materialCalendarGridView.getAdapter().b)) {
            eeit eeitVar = new eeit(eeisVarE, this.e, eehqVar, this.f);
            materialCalendarGridView.setNumColumns(eeisVarE.d);
            materialCalendarGridView.setAdapter((ListAdapter) eeitVar);
        } else {
            materialCalendarGridView.invalidate();
            eeit eeitVarA = materialCalendarGridView.getAdapter();
            Iterator it = eeitVarA.d.iterator();
            while (it.hasNext()) {
                eeitVarA.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            eeht eehtVar = eeitVarA.c;
            if (eehtVar != null) {
                Iterator it2 = eehtVar.a().iterator();
                while (it2.hasNext()) {
                    eeitVarA.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                eeitVarA.d = eehtVar.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new eeiu(this, materialCalendarGridView));
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return this.d.a.e(i).a.getTimeInMillis();
    }

    final int l(eeis eeisVar) {
        return this.d.a.b(eeisVar);
    }
}
