package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyp implements adaq {
    private final Context a;
    private cpdw b;
    private final arpr c;

    public acyp(Context context, arpr arprVar) {
        this.a = context;
        this.c = arprVar;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        this.b.g(adaoVar.e());
        if (adaoVar.e() != 0 || adaoVar.B() == null) {
            return;
        }
        Integer numB = adaoVar.B();
        numB.getClass();
        ((TextView) this.b.b()).setTextColor(numB.intValue() == 0 ? eehg.b(this.b.b(), R.attr.colorPrimary) : eehg.b(this.b.b(), R.attr.colorOnPrimary));
        TextView textView = (TextView) this.b.b();
        Integer numB2 = adaoVar.B();
        numB2.getClass();
        int iIntValue = numB2.intValue();
        textView.setText(iIntValue > 999 ? this.a.getString(R.string.overflow_unread_count) : String.valueOf(iIntValue));
        acxr.a((TextView) this.b.b(), adaoVar, this.c.a());
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.b = new cpdw(view, R.id.unread_badge_view_with_message_count_stub, R.id.unread_badge_with_message_count);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        boolean zC = acxp.c(acyxVar);
        ((adaj) adanVar).F = Integer.valueOf(acyxVar.k());
        adanVar.p(true != zC ? 0 : 8);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        boolean zAb = adaoVar.ab();
        boolean zAb2 = adaoVar2.ab();
        adaoVar.T();
        adaoVar2.T();
        return (Objects.equals(adaoVar.B(), adaoVar2.B()) && zAb == zAb2 && !(this.c.a() && adaoVar.b() != adaoVar2.b())) ? false : true;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
