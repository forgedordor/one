package defpackage;

import android.content.Context;
import defpackage.eyhe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyhd implements lxk {
    final /* synthetic */ Context a;

    public eyhd(Context context) {
        this.a = context;
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd a(Class cls) {
        return lxj.b();
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        eyhn eyhnVar = new eyhn(lypVar);
        ahhl ahhlVarIB = ((eyhe.a) eygn.a(this.a, eyhe.a.class)).iB();
        ahhlVarIB.a = eyhnVar;
        return new eyhf(ahhlVarIB.a(), eyhnVar);
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
