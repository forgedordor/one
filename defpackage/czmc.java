package defpackage;

import android.content.Intent;
import android.widget.TextView;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmc extends abs {
    final /* synthetic */ czmd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czmc(czmd czmdVar) {
        super(true);
        this.a = czmdVar;
    }

    @Override // defpackage.abs
    public final void b() {
        czmk czmkVar;
        czmd czmdVar = this.a;
        czmk czmkVar2 = czmdVar.d;
        if (czmkVar2 == null || !czmkVar2.H().w()) {
            czmdVar.e.h(false);
            if (czmdVar.f && (czmkVar = czmdVar.d) != null) {
                czmx czmxVarH = czmkVar.H();
                ejwl.l(czmxVarH.aa);
                TextView textView = czmxVarH.F;
                textView.getClass();
                CharSequence text = textView.getText();
                czmdVar.a.setResult(-1, new Intent("android.intent.action.SEND").putExtra("direct_send_result", new DirectSendResult.Discard(ejwk.a(text == null ? null : text.toString()))));
            }
            czmdVar.a.c().d();
        }
    }
}
