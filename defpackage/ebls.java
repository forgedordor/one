package defpackage;

import java.util.Set;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebls extends TimerTask {
    final /* synthetic */ eblt a;
    private final String b;
    private final dhip c;

    public ebls(eblt ebltVar, String str, dhip dhipVar) {
        this.a = ebltVar;
        this.b = str;
        this.c = dhipVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        eblt ebltVar = this.a;
        Set set = ebltVar.d;
        synchronized (set) {
            String str = this.b;
            if (set.contains(str)) {
                dhip dhipVar = ebltVar.a;
                dhja.r(dhipVar, "Transaction timed out for context id: %s", str);
                eblm eblmVarF = ebltVar.f(str);
                if (eblmVarF == null) {
                    dhja.r(dhipVar, "onTransactionTimeout: No transaction context found for context id: %s", str);
                } else {
                    eblu ebluVar = eblmVarF.d;
                    if (ebluVar == null) {
                        dhja.r(dhipVar, "onTransactionTimeout: No listener found for context id: %s", str);
                    } else {
                        ebluVar.c(eblmVarF);
                    }
                }
            } else {
                dhja.d(this.c, "context id: %s already removed - transaction finished", str);
            }
            set.remove(str);
        }
    }
}
