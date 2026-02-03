package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffs {
    public final ffez a = new ffez();
    public boolean b;
    public boolean c;
    public final ReentrantLock d;
    public final Condition e;
    public final fffz f;
    public final ffgb g;

    public fffs() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        this.e = conditionNewCondition;
        this.f = new fffq(this);
        this.g = new fffr(this);
    }
}
