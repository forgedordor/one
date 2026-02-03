package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlx {
    private final cazj a;

    public cnlx(cazj cazjVar) {
        cazjVar.getClass();
        this.a = cazjVar;
    }

    public final void a(UUID uuid) {
        cnor cnorVar = cnor.a;
        cnoq cnoqVar = (cnoq) cnorVar.createBuilder();
        cnoqVar.getClass();
        if (uuid != null) {
            cnoq cnoqVar2 = (cnoq) cnorVar.createBuilder();
            evqs evqsVarA = cobs.a(uuid);
            cnoqVar2.copyOnWrite();
            cnor cnorVar2 = (cnor) cnoqVar2.instance;
            cnorVar2.b |= 4;
            cnorVar2.e = evqsVarA;
        }
        this.a.a(cbcu.f("IncrementalReverseSyncWorkItemHandler", cnoqVar.build()));
    }
}
