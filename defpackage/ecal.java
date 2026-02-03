package defpackage;

import android.content.Context;
import android.os.ConditionVariable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecal implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String[] b;
    final /* synthetic */ ConditionVariable c;
    final /* synthetic */ ecam d;

    public ecal(ecam ecamVar, Context context, String[] strArr, ConditionVariable conditionVariable) {
        this.a = context;
        this.b = strArr;
        this.c = conditionVariable;
        this.d = ecamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                ecam ecamVar = this.d;
                ecamVar.c = ecamVar.a(this.a, this.b);
            } catch (RuntimeException e) {
                this.d.d = e;
            }
        } finally {
            this.c.open();
        }
    }
}
