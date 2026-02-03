package org.chromium.net;

import defpackage.fbmt;
import internal.J.N;
import org.chromium.net.GURLUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static fbmt sOverride;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, org.chromium.net.GURLUtils$Natives] */
    public static GURLUtils.Natives get() {
        ?? r0;
        fbmt fbmtVar = sOverride;
        return (fbmtVar == null || (r0 = fbmtVar.b) == 0) ? new GURLUtilsJni() : r0;
    }

    public static void setInstanceForTesting(GURLUtils.Natives natives) {
        if (sOverride == null) {
            sOverride = fbmt.a();
        }
        sOverride.b = natives;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return (String) N.MpCt7siL(str);
    }
}
