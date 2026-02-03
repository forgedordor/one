package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjh implements eyif {
    public static cgxk a(chie chieVar, chjl chjlVar, chix chixVar, chjj chjjVar, chhx chhxVar, chir chirVar, aptb aptbVar, aprt aprtVar, chht chhtVar) {
        aptbVar.getClass();
        aprtVar.getClass();
        cgxm cgxmVar = new cgxm("SmsReceivePipeline");
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(chieVar);
        if (aptbVar.a()) {
            fcwwVar.add(chirVar);
            if (aprtVar.a()) {
                fcwwVar.add(chhtVar);
            }
        } else {
            fcwwVar.add(chjlVar);
        }
        fcwwVar.add(chjjVar);
        fcwwVar.add(chhxVar);
        if (aptbVar.a()) {
            fcwwVar.add(chixVar);
        }
        return new cgxo(cgxmVar, fcva.a(fcwwVar));
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
