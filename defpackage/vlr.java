package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlr implements vdy {
    public final afzc a;
    public final fdpl b;
    private final Context c;
    private final Set d;

    public vlr(Context context, afzc afzcVar) {
        context.getClass();
        afzcVar.getClass();
        this.c = context;
        this.a = afzcVar;
        String string = context.getString(R.string.learn_more_about_rcs_chats);
        string.getClass();
        this.b = new fdpu(new dihq(string, null, false, false, false, false, null, false, null, new fdae() { // from class: vlq
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.a.h(agey.a);
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
