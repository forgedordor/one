package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umc extends aivg {
    static {
        cdag.h(cdag.b, "disable_logging_selected_messages_event_logger", true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umc(fcsu fcsuVar, Executor executor, fcsu fcsuVar2, fdjx fdjxVar, fcyh fcyhVar, Context context) {
        super(fcsuVar, new ulz(), executor);
        fcsuVar.getClass();
        executor.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        context.getClass();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new umb(uma.a);
    }
}
