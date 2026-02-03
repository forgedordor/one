package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmax {
    public static final dqxe a;

    static {
        cmcm cmcmVarB = ScheduledSendTable.b();
        cmcmVarB.A("SCHEDULED_MESSAGES_COUNT_SUBQUERY");
        cmcmVarB.c(ScheduledSendTable.c.a);
        cmcmVarB.e(new Function() { // from class: cmat
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmcs cmcsVar = (cmcs) obj;
                dqxe dqxeVar = cmax.a;
                cmcsVar.b(botm.c.a);
                return cmcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a = cmcmVarB.b().v();
    }
}
