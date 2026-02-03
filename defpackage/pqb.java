package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pqb extends pqc {
    public pqb() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    }

    @Override // defpackage.pqc
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
