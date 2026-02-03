package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drvl implements drvr {
    public final String toString() {
        drvo drvoVar = (drvo) drvp.a.get(getClass());
        String str = drvoVar != null ? drvoVar.a : "";
        return TextUtils.isEmpty(str) ? super.toString() : str;
    }

    @Override // defpackage.drvq
    public final /* synthetic */ void a() {
    }
}
