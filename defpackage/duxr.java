package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duxr implements eora {
    final /* synthetic */ dzzh a;

    public duxr(dzzh dzzhVar) {
        this.a = dzzhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((dtns) this.a.b()).c;
        if (((Boolean) obj).booleanValue()) {
            Log.d("PhFileGroupPop", "Added file groups ".concat(String.valueOf(str)));
        } else {
            Log.e("PhFileGroupPop", "Failed to add file group ".concat(String.valueOf(str)));
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("PhFileGroupPop", "Failed to add file group", th);
    }
}
