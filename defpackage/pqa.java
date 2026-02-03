package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqa extends pqc {
    public pqa(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.pqc
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
