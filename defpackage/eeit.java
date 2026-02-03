package defpackage;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeit extends BaseAdapter {
    static final int a = eejd.e().getMaximum(4);
    private static final int h = (eejd.e().getMaximum(5) + eejd.e().getMaximum(7)) - 1;
    public final eeis b;
    public final eeht c;
    public Collection d;
    public eehs e;
    final eehq f;
    final eehu g;

    public eeit(eeis eeisVar, eeht eehtVar, eehq eehqVar, eehu eehuVar) {
        this.b = eeisVar;
        this.c = eehtVar;
        this.f = eehqVar;
        this.g = eehuVar;
        this.d = eehtVar.a();
    }

    private final void f(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        eehr eehrVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean zG = g(j);
        eeht eehtVar = this.c;
        Iterator it = eehtVar.b().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Object obj = ((lcb) it.next()).a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Iterator it2 = eehtVar.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
            Object obj2 = ((lcb) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z3 = true;
                break;
            }
        }
        Calendar calendarD = eejd.d();
        Calendar calendarE = eejd.e();
        calendarE.setTimeInMillis(j);
        String str = calendarD.get(1) == calendarE.get(1) ? eejd.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : eejd.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (zG) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z3) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f.c.a()) {
            textView.setEnabled(true);
            Iterator it3 = eehtVar.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (eejd.a(j) == eejd.a(((Long) it3.next()).longValue())) {
                    z = true;
                    break;
                }
            }
            textView.setSelected(z);
            eehrVar = z ? this.e.b : g(j) ? this.e.c : this.e.a;
        } else {
            textView.setEnabled(false);
            eehrVar = this.e.g;
        }
        if (this.g == null || i == -1) {
            eehrVar.d(textView);
            return;
        }
        eeis eeisVar = this.b;
        int i2 = eeisVar.c;
        int i3 = eeisVar.b;
        throw null;
    }

    private static final boolean g(long j) {
        return eejd.d().getTimeInMillis() == j;
    }

    public final int a(int i) {
        return b() + (i - 1);
    }

    public final int b() {
        eeis eeisVar = this.b;
        Calendar calendar = eeisVar.a;
        int i = calendar.get(7);
        int firstDayOfWeek = this.f.e;
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + eeisVar.d : i2;
    }

    public final int c() {
        return (b() + this.b.e) - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < b() || i > c()) {
            return null;
        }
        eeis eeisVar = this.b;
        int iB = i - b();
        Calendar calendarC = eejd.c(eeisVar.a);
        calendarC.set(5, iB + 1);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        eeis eeisVarC = eeis.c(j);
        eeis eeisVar = this.b;
        if (eeisVarC.equals(eeisVar)) {
            Calendar calendarC = eejd.c(eeisVar.a);
            calendarC.setTimeInMillis(j);
            int i = calendarC.get(5);
            f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(i) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.b.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            eehs r1 = r5.e
            if (r1 != 0) goto Lf
            eehs r1 = new eehs
            r1.<init>(r0)
            r5.e = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131624516(0x7f0e0244, float:1.8876214E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            eeis r8 = r5.b
            int r2 = r8.e
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 == 0) goto L73
            long r1 = r6.longValue()
            r5.f(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeit.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
