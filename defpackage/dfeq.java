package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfeq extends IEventObserver.Stub {
    public int a;
    final /* synthetic */ dfer b;
    private final long c;
    private final String d;

    public dfeq(dfer dferVar, long j, String str) {
        this.b = dferVar;
        this.c = j;
        this.d = str;
    }

    @Override // com.google.android.ims.rcsservice.events.IEventObserver
    public final void notifyEvent(Event event) {
        if (event.h == 50030) {
            long j = event.j;
            long j2 = this.c;
            if (j == j2 && (event instanceof ChatSessionMessageEvent) && this.d.equals(((ChatSessionMessageEvent) event).c)) {
                dfer dferVar = this.b;
                String string = Long.toString(j2);
                dferVar.f.remove(string);
                dferVar.b(string);
                dferVar.d.d(this.a);
            }
        }
    }
}
