package defpackage;

import java.util.Set;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eblr extends TimerTask {
    final /* synthetic */ eblt a;
    private final String b;
    private final dhip c;

    public eblr(eblt ebltVar, String str, dhip dhipVar) {
        this.a = ebltVar;
        this.b = str;
        this.c = dhipVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Set set = this.a.e;
        synchronized (set) {
            dhip dhipVar = this.c;
            String str = this.b;
            dhja.d(dhipVar, "Removed context id: %s", str);
            set.remove(str);
        }
    }
}
