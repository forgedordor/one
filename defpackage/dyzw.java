package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyzw implements eora {
    final /* synthetic */ dyzx a;

    public dyzw(dyzx dyzxVar) {
        this.a = dyzxVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            this.a.i((Account) it.next());
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
