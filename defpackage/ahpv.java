package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpv extends fcyz implements fdat {
    final /* synthetic */ ahpw a;
    final /* synthetic */ ahqa b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahpv(fcxy fcxyVar, ahpw ahpwVar, ahqa ahqaVar, List list) {
        super(2, fcxyVar);
        this.a = ahpwVar;
        this.b = ahqaVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahpv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ahqa ahqaVar = this.b;
        String str = ahqaVar.b.b;
        if (str == null) {
            throw new IllegalArgumentException("ClearcutIncomingRepliesTransportLogger.buildMessageReplyInfo with empty rcsMessageId");
        }
        ahpw ahpwVar = this.a;
        List list = this.c;
        long j = ahqaVar.a;
        engt engtVar = (engt) engu.a.createBuilder();
        engtVar.getClass();
        Cenum.c(!ahqaVar.d.c(), engtVar);
        engv engvVar = (engv) engw.a.createBuilder();
        engvVar.getClass();
        enyu.c(ahqaVar.c.k(), engvVar);
        enyu.b(ahqaVar.e, engvVar);
        enyu.d(str, engvVar);
        Cenum.b(enyu.a(engvVar), engtVar);
        aiqx.b(ahpwVar.b, j, 4, null, list, null, Cenum.a(engtVar), null, null, 212);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahpv ahpvVar = new ahpv(fcxyVar, this.a, this.b, this.c);
        ahpvVar.d = obj;
        return ahpvVar;
    }
}
