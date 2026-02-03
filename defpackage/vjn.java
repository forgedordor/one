package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjn implements vdy {
    public final afzc a;
    public final fdpl b;
    private final Context c;
    private final Set d;

    public vjn(Context context, afzc afzcVar) {
        context.getClass();
        afzcVar.getClass();
        this.c = context;
        this.a = afzcVar;
        String string = context.getString(R.string.go_back);
        string.getClass();
        this.b = new fdpu(new dihq(string, null, false, false, false, false, null, false, null, new fdae() { // from class: vjm
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.a.h(agbf.a);
                return fctx.a;
            }
        }, 1022));
        this.d = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.b;
    }
}
