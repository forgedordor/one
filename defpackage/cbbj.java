package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbj {
    public static final cczv a;
    public final cogw b;
    public final cbaz c;
    public final Object d = new Object();
    public ekea e = new ekea(((Integer) a.e()).intValue());

    static {
        a = cdag.j(cdag.b, "WorkQueueDebugHistoryCount", true != cqbe.d() ? 100 : 5000);
    }

    public cbbj(cogw cogwVar, cbaz cbazVar) {
        this.b = cogwVar;
        this.c = cbazVar;
    }

    public static long a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return 0L;
        }
        return Arrays.hashCode(DesugarArrays.stream(stackTraceElementArr).map(new Function() { // from class: cbbf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczv cczvVar = cbbj.a;
                return ((StackTraceElement) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray());
    }

    public static String c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "EXECUTION_RESULT" : "INITIATE_HANDLER_EXECUTION" : "JANITOR_DISCOVER" : "SUBMIT_TO_WORK_MANAGER" : "SUBMIT_TO_EXECUTOR" : "WORK_MANAGER_WORK_STARTED";
    }

    public final void b(String str) {
        synchronized (this.d) {
            this.e.add(new cbbi(this.b.f().toEpochMilli(), 3, str));
        }
    }
}
