package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ecam extends ebzt {
    private static final Handler a = new Handler(Looper.getMainLooper());
    public String c;
    public RuntimeException d;

    public ecam() {
        super("ui");
    }

    protected abstract String a(Context context, String[] strArr);

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        ConditionVariable conditionVariable = new ConditionVariable();
        a.post(new ecal(this, context, strArr, conditionVariable));
        conditionVariable.block();
        RuntimeException runtimeException = this.d;
        if (runtimeException == null) {
            return this.c;
        }
        throw runtimeException;
    }
}
