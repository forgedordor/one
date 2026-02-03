package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiht {
    public final aijs a;

    public aiht(aijs aijsVar) {
        this.a = aijsVar;
    }

    public static aiju a() {
        aijt aijtVar = (aijt) aiju.a.createBuilder();
        aijtVar.copyOnWrite();
        aiju aijuVar = (aiju) aijtVar.instance;
        aijuVar.b |= 2;
        aijuVar.d = "com.google.android.apps.messaging.scheduledsend.scheduling.ScheduledSendTask";
        aijtVar.copyOnWrite();
        aiju aijuVar2 = (aiju) aijtVar.instance;
        aijuVar2.b |= 1;
        aijuVar2.c = "com.google.android.apps.messaging.scheduledsend.scheduling.ScheduledSendTask";
        return (aiju) aijtVar.build();
    }
}
