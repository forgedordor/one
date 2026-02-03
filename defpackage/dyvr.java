package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvr implements dxyj {
    private final Context a;
    private final dxxk b;
    private final egko c;

    public dyvr(egko egkoVar, Context context, dxxk dxxkVar) {
        this.c = egkoVar;
        this.a = context;
        this.b = dxxkVar;
    }

    @Override // defpackage.dxyj
    public final void a(Object obj, ImageView imageView) {
        rtj rtjVarB = rtj.b();
        ejwi ejwiVarA = dyvd.a(imageView);
        if (ejwiVarA.g()) {
            rtjVarB = (rtj) rtjVarB.P(((Integer) ejwiVarA.c()).intValue());
        }
        ((rbr) this.c.a.e(obj == null ? null : dyvv.c(obj, this.b)).q(rtjVarB).I(dyvc.a(this.a))).v(imageView);
    }
}
