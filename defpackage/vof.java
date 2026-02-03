package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vof implements vdy {
    public final fcsu a;
    public final fcsu b;
    public final fdpl c;
    private final Set d;

    public vof(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        String string = context.getString(R.string.rbm_verification_icon_content_description);
        string.getClass();
        this.c = new fdpu(new dihq(string, djrr.ez, false, false, true, false, null, false, null, new fdae() { // from class: voe
            @Override // defpackage.fdae
            public final Object invoke() {
                vof vofVar = this.a;
                fcsu fcsuVar3 = vofVar.a;
                if (((Optional) fcsuVar3.b()).isPresent()) {
                    ((afzc) vofVar.b.b()).h(new agdi(((cgsa) ((Optional) fcsuVar3.b()).get()).b()));
                }
                return fctx.a;
            }
        }, 996));
        this.d = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
