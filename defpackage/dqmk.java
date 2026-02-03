package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqmk extends ThreadLocal {
    public static final dqmk a = new dqmk();

    private dqmk() {
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        int iMyTid = Process.myTid();
        return new dqmh(Thread.currentThread(), iMyTid, true, Process.getThreadPriority(iMyTid), false, 112);
    }
}
