package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvw {
    public final eygg a;

    public cmvw(eygg eyggVar) {
        eyggVar.getClass();
        this.a = eyggVar;
    }

    public final boolean a(boolean z, int i, int i2) {
        if (!z) {
            return false;
        }
        cmuh cmuhVarA = ((cmum) this.a.b()).a(i);
        if (TextUtils.isEmpty(cmuhVarA.h())) {
            return true;
        }
        int iA = cmuhVarA.a();
        return iA >= 0 && i2 > iA;
    }
}
