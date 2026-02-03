package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpx implements ahpy {
    private static final eksp a = eksp.c("BugleReplies");

    @Override // defpackage.ahpy
    public final void a(enul enulVar, ahpz ahpzVar) {
        basd basdVar = ahpzVar.a;
        String str = basdVar.b;
        if (str == null) {
            a.o().q("ClearcutOutgoingRepliesTransportLogger.applyReplyQueuedInfo with no rcsMessageId");
        }
        ekrw ekrwVarO = a.o();
        ekrz ekrzVar = ahrb.a;
        ekrwVarO.X(ahrb.b, basdVar.f());
        ekrwVarO.q("ClearcutOutgoingRepliesTransportLogger.applyReplyQueuedInfo with null customCpimHeaders");
        engt engtVar = (engt) engu.a.createBuilder();
        engtVar.getClass();
        Cenum.c(true, engtVar);
        engv engvVar = (engv) engw.a.createBuilder();
        engvVar.getClass();
        enyu.c(true, engvVar);
        enyu.b(true, engvVar);
        if (str != null) {
            enyu.d(str, engvVar);
        }
        Cenum.b(enyu.a(engvVar), engtVar);
        engu enguVarA = Cenum.a(engtVar);
        emzm emzmVar = enulVar.a;
        emzmVar.copyOnWrite();
        emzn emznVar = (emzn) emzmVar.instance;
        emzn emznVar2 = emzn.a;
        emznVar.h = enguVarA;
        emznVar.b |= 16;
    }
}
