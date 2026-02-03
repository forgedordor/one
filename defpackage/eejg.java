package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eejg extends vo {
    public final eeih a;

    public eejg(eeih eeihVar) {
        this.a = eeihVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.b.f;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new eejf((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        eeih eeihVar = this.a;
        int i2 = eeihVar.b.a.c;
        TextView textView = ((eejf) wvVar).s;
        Locale locale = Locale.getDefault();
        int i3 = i2 + i;
        Integer numValueOf = Integer.valueOf(i3);
        textView.setText(String.format(locale, "%d", numValueOf));
        Context context = textView.getContext();
        textView.setContentDescription(eejd.d().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), numValueOf) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), numValueOf));
        eehs eehsVar = eeihVar.d;
        Calendar calendarD = eejd.d();
        eehr eehrVar = calendarD.get(1) == i3 ? eehsVar.f : eehsVar.d;
        Iterator it = eeihVar.a.a().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarD.get(1) == i3) {
                eehrVar = eehsVar.e;
            }
        }
        eehrVar.d(textView);
        textView.setSelected(eehrVar == eehsVar.e);
        textView.setOnClickListener(new eeje(this, i3));
    }

    final int l(int i) {
        return i - this.a.b.a.c;
    }
}
