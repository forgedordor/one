package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxy {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public amxy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    public final amxx a(MessageIdType messageIdType) {
        coml comlVar = (coml) this.a.b();
        comlVar.getClass();
        cqtp cqtpVar = (cqtp) this.b.b();
        cqtpVar.getClass();
        ExecutorService executorService = (ExecutorService) this.c.b();
        executorService.getClass();
        messageIdType.getClass();
        return new amxx(comlVar, cqtpVar, executorService, messageIdType);
    }
}
