package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akie {
    private final fcsu a;

    public akie(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(int i, int i2, int i3) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONVERSATION_READ_STATUS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ents entsVar = (ents) entv.a.createBuilder();
        entsVar.copyOnWrite();
        entv entvVar = (entv) entsVar.instance;
        entvVar.d = i2 - 1;
        entvVar.b |= 2;
        entsVar.copyOnWrite();
        entv entvVar2 = (entv) entsVar.instance;
        entvVar2.c = i - 1;
        entvVar2.b |= 1;
        entsVar.copyOnWrite();
        entv entvVar3 = (entv) entsVar.instance;
        entvVar3.b |= 4;
        entvVar3.e = i3;
        entv entvVar4 = (entv) entsVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        entvVar4.getClass();
        ellhVar2.bx = entvVar4;
        ellhVar2.g |= 256;
        aillVar.j(ellgVar);
    }
}
