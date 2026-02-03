package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeiu implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialCalendarGridView a;
    final /* synthetic */ eeiw b;

    public eeiu(eeiw eeiwVar, MaterialCalendarGridView materialCalendarGridView) {
        this.a = materialCalendarGridView;
        this.b = eeiwVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        eeit adapter = materialCalendarGridView.getAdapter();
        if (i < adapter.b() || i > adapter.c()) {
            return;
        }
        eeiw eeiwVar = this.b;
        materialCalendarGridView.getAdapter().getItem(i).longValue();
        eeih eeihVar = eeiwVar.a.a;
        if (eeihVar.b.c.a()) {
            eeihVar.a.h();
            Iterator it = eeihVar.ak.iterator();
            while (it.hasNext()) {
                eeix eeixVar = (eeix) it.next();
                eeihVar.a.i();
                eeixVar.a();
            }
            eeihVar.ag.n.p();
            RecyclerView recyclerView = eeihVar.e;
            if (recyclerView != null) {
                recyclerView.n.p();
            }
        }
    }
}
