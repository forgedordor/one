package defpackage;

import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkv extends Exception {
    public dqkv(Thread thread) throws NoSuchMethodException, SecurityException {
        Object blocker = LockSupport.getBlocker(thread);
        Thread.State state = thread.getState();
        String strValueOf = String.valueOf(thread);
        String strConcat = state == null ? "" : " in state ".concat(state.toString());
        String strConcat2 = blocker == null ? "" : " blocked on ".concat(blocker.toString());
        Thread threadA = a(blocker);
        StringBuilder sb = new StringBuilder();
        sb.append(strValueOf);
        sb.append(strConcat);
        sb.append(strConcat2);
        sb.append(threadA != null ? " (see cause for owner state)" : "");
        String string = sb.toString();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread threadA2 = a(LockSupport.getBlocker(thread));
        dqkv dqkvVar = threadA2 != null ? new dqkv(threadA2) : null;
        super(string);
        if (dqkvVar != null) {
            initCause(dqkvVar);
        }
        setStackTrace(stackTrace);
    }

    static Thread a(Object obj) throws NoSuchMethodException, SecurityException {
        if (obj instanceof AbstractOwnableSynchronizer) {
            try {
                Method declaredMethod = AbstractOwnableSynchronizer.class.getDeclaredMethod("getExclusiveOwnerThread", null);
                declaredMethod.setAccessible(true);
                return (Thread) declaredMethod.invoke(obj, null);
            } catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
