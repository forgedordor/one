package com.google.android.apps.messaging.cloudstore.fi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.cczi;
import defpackage.cpyl;
import defpackage.ehqs;
import defpackage.ehqu;
import defpackage.pab;
import defpackage.rtt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FiAccountPreference extends Preference {
    public View.OnClickListener a;
    public String b;
    private final Context c;
    private View.OnClickListener d;
    private boolean e;

    public FiAccountPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        this.b = "";
        this.c = context;
        this.A = R.layout.fi_account_preference_layout;
        aa();
    }

    @Override // androidx.preference.Preference
    public final void G(boolean z) {
        this.e = z;
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return this.e;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        Button button = (Button) pabVar.C(R.id.disconnect_button);
        button.setEnabled(this.e);
        View.OnClickListener onClickListener = this.d;
        if (onClickListener != null) {
            button.setOnClickListener(onClickListener);
        }
        if (((Boolean) ((cczi) cpyl.m.get()).e()).booleanValue()) {
            Button button2 = (Button) pabVar.C(R.id.delete_button);
            button2.setEnabled(this.e);
            button2.setVisibility(0);
            View.OnClickListener onClickListener2 = this.a;
            if (onClickListener2 != null) {
                button2.setOnClickListener(onClickListener2);
            }
        }
        ((TextView) pabVar.C(android.R.id.title)).setTextColor(this.j.getColor(R.color.text_color_primary));
        ImageView imageView = (ImageView) pabVar.C(R.id.account_avatar);
        if (!this.b.isEmpty()) {
            ehqu ehquVarA = ehqs.a(this.c).i(this.b).A();
            rtt rttVar = new rtt(imageView);
            rttVar.l();
            ehquVarA.w(rttVar);
            imageView.setImageTintList(null);
            return;
        }
        Context context = this.c;
        ehqu ehquVarE = ehqs.a(context).e(context.getResources().getDrawable(R.drawable.quantum_ic_account_circle_black_48, null));
        rtt rttVar2 = new rtt(imageView);
        rttVar2.l();
        ehquVarE.w(rttVar2);
        imageView.setColorFilter(context.getColor(R.color.text_color_primary));
    }

    public final void k(View.OnClickListener onClickListener) {
        this.d = onClickListener;
        d();
    }
}
