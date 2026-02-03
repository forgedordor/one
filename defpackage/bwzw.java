package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwzw {
    public bwzx a;
    final /* synthetic */ bwzy b;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();

    public bwzw(bwzy bwzyVar) {
        this.b = bwzyVar;
    }

    public final void a(dqsb dqsbVar, boolean z) {
        bwwo bwwoVar = new bwwo(dqsbVar, Thread.currentThread().getId(), this.b.d.f().toEpochMilli(), z);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        concurrentLinkedQueue.offer(bwwoVar);
        while (concurrentLinkedQueue.size() > 50) {
            concurrentLinkedQueue.poll();
        }
    }
}
