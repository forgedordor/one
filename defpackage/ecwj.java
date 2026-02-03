package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwj extends ecvs {
    private final exoc c;

    public ecwj(exoc exocVar) {
        this.c = exocVar;
        this.b = 5;
    }

    @Override // defpackage.ecvs
    public final ea a(Integer num, int i) {
        ecwm ecwmVar = new ecwm();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", this.c.toByteArray());
        ecwmVar.at(bundle);
        return ecwmVar;
    }
}
