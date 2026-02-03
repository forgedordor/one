package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chey implements eyif {
    public static cgxk a(chgf chgfVar, chgb chgbVar, chep chepVar, chfk chfkVar, chfn chfnVar, chfh chfhVar, chel chelVar, chfc chfcVar, chge chgeVar, asbs asbsVar, apwn apwnVar) {
        asbsVar.getClass();
        apwnVar.getClass();
        cgxm cgxmVar = new cgxm("RequestToSendPhase");
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(chgbVar);
        fcwwVar.add(chepVar);
        if (asbsVar.a()) {
            fcwwVar.add(chfcVar);
            fcwwVar.add(chgeVar);
        }
        fcwwVar.add(chfkVar);
        fcwwVar.add(chfnVar);
        fcwwVar.add(chgfVar);
        return new cgxo(new cgxm("SendingPipeline"), fcva.g(new cgxo(cgxmVar, fcva.a(fcwwVar)), new cgxo(new cgxm("ProcessMessageStatusPhase"), fcva.b(chfhVar)), new cgxo(new cgxm("ProcessPipelineResultPhase"), fcva.b(chelVar))));
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
