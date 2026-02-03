package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dafu extends dafj {
    final /* synthetic */ dafv s;
    private final View t;
    private final View u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dafu(dafv dafvVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_rich_cards_opt_in_banner, viewGroup, false));
        this.s = dafvVar;
        TextView textView = (TextView) this.a.findViewById(R.id.zero_state_search_rich_cards_opt_in_banner_text);
        textView.setText(dafvVar.h());
        eebt.b(textView);
        eebt.c(textView);
        this.t = this.a.findViewById(R.id.zero_state_search_rich_cards_opt_in_banner_cancel_button);
        this.u = this.a.findViewById(R.id.zero_state_search_rich_cards_opt_in_banner_opt_in_button);
    }

    @Override // defpackage.dafj
    public final void C(final dafk dafkVar) {
        this.t.setOnClickListener(new View.OnClickListener() { // from class: dafs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                dafv dafvVar = this.a.s;
                ((dabm) dafvVar.b.b()).c(dafvVar.a());
                dafvVar.i();
                dafkVar.a();
            }
        });
        this.u.setOnClickListener(new View.OnClickListener() { // from class: daft
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                dafv dafvVar = this.a.s;
                ((dabm) dafvVar.b.b()).d(dafvVar.a());
                dafvVar.j();
                dafkVar.b();
            }
        });
    }

    @Override // defpackage.dafj
    public final void D() {
        this.t.setOnClickListener(null);
        this.u.setOnClickListener(null);
    }
}
