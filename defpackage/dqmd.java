package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqmd extends AbstractOwnableSynchronizer {
    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
