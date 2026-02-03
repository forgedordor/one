package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dafr extends dafj {
    public final View s;
    final /* synthetic */ dafv t;
    private final TextView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dafr(dafv dafvVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_rich_cards_reminder_opt_in_banner, viewGroup, false));
        this.t = dafvVar;
        TextView textView = (TextView) this.a.findViewById(R.id.zss_reminder_opt_in_banner_text);
        this.u = textView;
        this.s = this.a.findViewById(R.id.zss_reminder_opt_in_banner_dismiss_button);
        String string = dafvVar.e.getString(R.string.zero_state_search_rich_cards_opt_in_banner_setting);
        textView.setText(dajs.e(dafvVar.e, dafvVar.e.getString(R.string.zero_state_search_rich_cards_reminder_opt_in_banner_text, string), string, new View.OnClickListener() { // from class: dafp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dafr dafrVar = this.a;
                dafrVar.t.c.B(dafrVar.s.getContext());
            }
        }));
        eebt.b(textView);
        eebt.c(textView);
    }

    @Override // defpackage.dafj
    public final void C(final dafk dafkVar) {
        this.s.setOnClickListener(new View.OnClickListener() { // from class: dafq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                crqx crqxVar = this.a.t.a;
                crqxVar.a.g(crqxVar.b.getString(R.string.reminder_rich_cards_opt_in_banner_dismissed), true);
                dafkVar.a();
            }
        });
    }

    @Override // defpackage.dafj
    public final void D() {
    }
}
