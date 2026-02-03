package defpackage;

import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlt {
    public static final ListenableFuture a(WorkDatabase workDatabase, qmg qmgVar, fdap fdapVar) {
        qlo qloVar = qmgVar.a;
        qloVar.getClass();
        return qak.a(qloVar, "loadStatusFuture", new qls(fdapVar, workDatabase));
    }
}
