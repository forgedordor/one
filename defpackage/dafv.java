package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dafv implements dafl {
    public final crqx a;
    public final fcsu b;
    public final aijh c;
    public final achu d;
    public final Context e;

    public dafv(crqx crqxVar, fcsu fcsuVar, aijh aijhVar, achu achuVar, Context context) {
        this.a = crqxVar;
        this.b = fcsuVar;
        this.c = aijhVar;
        this.d = achuVar;
        this.e = context;
    }

    @Override // defpackage.dafl
    public final int a() {
        if (TextUtils.isEmpty((CharSequence) ccze.v.e())) {
            return !TextUtils.isEmpty((CharSequence) ccze.w.e()) ? 2 : 0;
        }
        return 1;
    }

    @Override // defpackage.dafl
    public final AlertDialog.Builder b(Context context, final Runnable runnable) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.zero_state_search_rich_cards_opt_in_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.zero_state_search_rich_cards_opt_in_dialog_text);
        textView.setText(h());
        eebt.b(textView);
        eebt.c(textView);
        final int iA = a() + 2;
        return new AlertDialog.Builder(context, R.style.RichCardConsentDialog).setView(viewInflate).setNegativeButton(R.string.zero_state_search_rich_cards_opt_in_banner_cancel_button_text, new DialogInterface.OnClickListener() { // from class: dafm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws Resources.NotFoundException {
                dafv dafvVar = this.a;
                ((dabm) dafvVar.b.b()).c(iA);
                dafvVar.i();
            }
        }).setPositiveButton(R.string.zero_state_search_rich_cards_opt_in_banner_opt_in_button_text, new DialogInterface.OnClickListener() { // from class: dafn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws Resources.NotFoundException {
                dafv dafvVar = this.a;
                ((dabm) dafvVar.b.b()).d(iA);
                dafvVar.j();
                runnable.run();
            }
        });
    }

    @Override // defpackage.dafl
    public final dafj c(ViewGroup viewGroup) {
        return new dafr(this, viewGroup);
    }

    @Override // defpackage.dafl
    public final dafj d(ViewGroup viewGroup) {
        return new dafu(this, viewGroup);
    }

    @Override // defpackage.dafl
    public final boolean e() {
        crqx crqxVar = this.a;
        return (crqxVar.a.q(crqxVar.b.getString(R.string.rich_cards_opt_in_banner_dismissed), false) || crqxVar.f()) ? false : true;
    }

    @Override // defpackage.dafl
    public final boolean f() {
        crqx crqxVar = this.a;
        return (crqxVar.a.q(crqxVar.b.getString(R.string.rich_cards_opt_in_dialog_dismissed_pref_key), false) || crqxVar.f()) ? false : true;
    }

    @Override // defpackage.dafl
    public final boolean g() {
        crqx crqxVar = this.a;
        return (crqxVar.a.q(crqxVar.b.getString(R.string.reminder_rich_cards_opt_in_banner_dismissed), false) || crqxVar.f()) ? false : true;
    }

    public final CharSequence h() {
        Context context = this.e;
        String strA = cpef.a(context);
        return dajs.e(context, context.getString(R.string.zero_state_search_rich_cards_opt_in_banner_text, strA), strA, new View.OnClickListener() { // from class: dafo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dafv dafvVar = this.a;
                ((dabm) dafvVar.b.b()).a("Search.ConsentDialog.LearnMore.Link.Clicked", dafvVar.a());
                cczi ccziVar = ccze.v;
                if (!TextUtils.isEmpty((CharSequence) ccziVar.e())) {
                    dafvVar.c.t(dafvVar.e, (String) ccziVar.e());
                    return;
                }
                cczi ccziVar2 = ccze.w;
                if (TextUtils.isEmpty((CharSequence) ccziVar2.e())) {
                    return;
                }
                dafvVar.d.d(dafvVar.e, (String) ccziVar2.e());
            }
        });
    }

    public final void i() throws Resources.NotFoundException {
        crqx crqxVar = this.a;
        Resources resources = crqxVar.b;
        String string = resources.getString(R.string.rich_cards_opt_in_dialog_dismissed_pref_key);
        crqv crqvVar = crqxVar.a;
        crqvVar.g(string, true);
        crqvVar.g(resources.getString(R.string.rich_cards_opt_in_banner_dismissed), true);
    }

    public final void j() throws Resources.NotFoundException {
        i();
        crqx crqxVar = this.a;
        crqxVar.a.g(crqxVar.b.getString(R.string.rich_cards_settings_enable_all_pref_key), true);
        crqxVar.c();
    }
}
