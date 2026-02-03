package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimIconView;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utw extends vo {
    public final List a;
    private final eidm d;

    public utw(eidm eidmVar) {
        int i = ekgb.d;
        this.a = ekoe.a;
        this.d = eidmVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return ((ekoe) this.a).c;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new utv((SimPickerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sim_picker_item_view, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        utv utvVar = (utv) wvVar;
        eifp eifpVarA = this.d.a("SimPickerItemAdapter#onBindViewHolder");
        try {
            utx utxVarH = utvVar.s.H();
            baim baimVar = (baim) this.a.get(i);
            if (TextUtils.isEmpty(baimVar.g())) {
                utxVarH.e.setVisibility(8);
            } else {
                TextView textView = utxVarH.e;
                textView.setVisibility(0);
                textView.setText(baimVar.g());
            }
            String strF = baimVar.f();
            if (TextUtils.isEmpty(strF)) {
                utxVarH.d.setVisibility(8);
            } else {
                TextView textView2 = utxVarH.d;
                textView2.setVisibility(0);
                textView2.setText(utxVarH.a.a(utxVarH.g.u(strF, baimVar.b())));
            }
            SimIconView simIconView = utxVarH.f;
            simIconView.g(baimVar.c());
            utq utqVar = new utq(baimVar);
            einm einmVar = utxVarH.b;
            einmVar.b(utxVarH.c, utqVar);
            einmVar.b(simIconView, utqVar);
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
