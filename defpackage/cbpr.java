package defpackage;

import android.content.Context;
import android.telephony.SmsMessage;
import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpr {
    public final AtomicInteger a;
    public final Context b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public cbpr(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.a = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.f = atomicInteger2;
        this.b = context;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        atomicInteger.set(Alert.DURATION_SHOW_INDEFINITELY);
        atomicInteger2.set(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final int a() {
        return this.d.get();
    }

    public final void b(int i, String str) {
        cqaz.h();
        boolean zC = ((cmtv) this.g.b()).c(str);
        fcsu fcsuVar = this.h;
        boolean z = false;
        int[] iArrCalculateLength = SmsMessage.calculateLength(str, ((cmuq) fcsuVar.b()).e(i) && zC);
        AtomicInteger atomicInteger = this.d;
        atomicInteger.set(iArrCalculateLength[0]);
        this.e.set(iArrCalculateLength[1]);
        AtomicInteger atomicInteger2 = this.a;
        atomicInteger2.set(iArrCalculateLength[2]);
        cmuh cmuhVarA = ((cmum) this.i.b()).a(i);
        int iA = ((cmuq) fcsuVar.b()).a(i);
        AtomicBoolean atomicBoolean = this.c;
        if (iA > 0 && atomicInteger.get() > iA) {
            z = true;
        }
        atomicBoolean.set(z);
        AtomicInteger atomicInteger3 = this.f;
        if (iA <= 0) {
            iA = Alert.DURATION_SHOW_INDEFINITELY;
        }
        atomicInteger3.set(iA);
        int iF = cmuhVarA.f();
        if (iF > 0) {
            int i2 = iArrCalculateLength[1];
            if (atomicInteger2.get() + i2 < 140) {
                iF >>= 1;
            }
            if (i2 > iF) {
                atomicBoolean.set(true);
            }
        }
    }

    public final boolean c() {
        return this.c.get();
    }
}
