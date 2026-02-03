package defpackage;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ras {
    public static qzr a(Context context) {
        qzr qzrVar = new qzr(new rai(new rar(context.getApplicationContext())), new rad(new ram()));
        qzb qzbVar = qzrVar.f;
        if (qzbVar != null) {
            qzbVar.a();
        }
        qzi[] qziVarArr = qzrVar.e;
        for (int i = 0; i < 4; i++) {
            qzi qziVar = qziVarArr[i];
            if (qziVar != null) {
                qziVar.a = true;
                qziVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = qzrVar.b;
        PriorityBlockingQueue priorityBlockingQueue2 = qzrVar.c;
        qyz qyzVar = qzrVar.d;
        qzg qzgVar = qzrVar.h;
        qzrVar.f = new qzb(priorityBlockingQueue, priorityBlockingQueue2, qyzVar, qzgVar);
        qzrVar.f.start();
        for (int i2 = 0; i2 < 4; i2++) {
            qzi qziVar2 = new qzi(priorityBlockingQueue2, qzrVar.i, qyzVar, qzgVar);
            qziVarArr[i2] = qziVar2;
            qziVar2.start();
        }
        return qzrVar;
    }
}
