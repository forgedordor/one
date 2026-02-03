package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwp extends vo {
    public ekgb a;
    public final ecwq d;
    private final String e;

    public ecwp(ecwq ecwqVar, String str) {
        int i = ekgb.d;
        this.a = ekoe.a;
        this.d = ecwqVar;
        this.e = str;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new ecwo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_country_code, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        ecwo ecwoVar = (ecwo) wvVar;
        final ecww ecwwVar = (ecww) this.a.get(i);
        View view = ecwoVar.a;
        Context context = view.getContext();
        TextView textView = ecwoVar.s;
        textView.setText(ecwwVar.b);
        TextView textView2 = ecwoVar.t;
        textView2.setText(context.getString(R.string.country_code_format, String.valueOf(ecwwVar.d)));
        textView2.setSelected(true);
        boolean zEquals = TextUtils.equals(ecwwVar.c, this.e);
        textView.setTypeface(null, zEquals ? 1 : 0);
        textView2.setTypeface(null, zEquals ? 1 : 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: ecwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czsp czspVar = this.a.d.a.ah;
                ecww ecwwVar2 = czspVar.d;
                ecww ecwwVar3 = ecwwVar;
                if (ecwwVar2 != null && !ecwwVar2.c.equals(ecwwVar3.c)) {
                    ((cjya) czspVar.b.b()).e(emfc.RCS_PROVISIONING_MANUAL_MSISDN_COUNTRY_CHANGED, emfe.PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY);
                }
                Intent intent = new Intent();
                intent.putExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED", ecwwVar3.toByteArray());
                CountryCodePickerActivity countryCodePickerActivity = czspVar.a;
                countryCodePickerActivity.setResult(-1, intent);
                countryCodePickerActivity.finish();
            }
        });
    }
}
