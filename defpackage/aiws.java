package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiws {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper");
    public final eosc a;
    private final aiwu c;
    private final aiwq d;

    public aiws(eosc eoscVar, aiwu aiwuVar, aiwq aiwqVar) {
        this.a = eoscVar;
        this.c = aiwuVar;
        this.d = aiwqVar;
    }

    public final byte[] a() {
        try {
            return this.d.h();
        } catch (IOException e) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper", "getAppEventLogData", 'I', "MessageLogDumper.java")).q("Failed to dump app events");
            return null;
        }
    }

    public final byte[] b() {
        try {
            return this.c.j();
        } catch (IOException e) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper", "getMessageStatusLogData", ':', "MessageLogDumper.java")).q("Failed to dump message status");
            return null;
        }
    }
}
