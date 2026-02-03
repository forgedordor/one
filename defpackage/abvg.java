package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvg implements dnwx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/emotify/logging/EmotifyEventLoggerImpl");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public abvg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public static final int e(dnwy dnwyVar) {
        int iOrdinal = dnwyVar.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        if (iOrdinal == 3) {
            return 5;
        }
        throw new fctg();
    }

    @Override // defpackage.dnwx
    public final void a() {
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.EMOTIFY_CREATE_EVENT, ellgVar);
        fcsu fcsuVar = this.c;
        abvd abvdVar = (abvd) fcsuVar.b();
        fdav fdavVar = new fdav() { // from class: abvf
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                int i;
                dnwy dnwyVar = (dnwy) obj;
                dnwz dnwzVar = (dnwz) obj2;
                dnww dnwwVar = (dnww) obj3;
                Long l = (Long) obj4;
                long jLongValue = l.longValue();
                dnwyVar.getClass();
                dnwwVar.getClass();
                ((ekrd) abvg.a.e().h("com/google/android/apps/messaging/emotify/logging/EmotifyEventLoggerImpl", "logCreationEvent$lambda$3$lambda$2", 60, "EmotifyEventLoggerImpl.kt")).J("Logging emotify create event: entry: %s, error: %s, result: %s, latency: %d", dnwyVar.name(), dnwzVar != null ? dnwzVar.name() : null, dnwwVar.name(), l);
                eodf eodfVar = (eodf) eodi.a.createBuilder();
                eodfVar.getClass();
                int iE = abvg.e(dnwyVar);
                eodfVar.copyOnWrite();
                eodi eodiVar = (eodi) eodfVar.instance;
                eodiVar.c = iE - 1;
                eodiVar.b |= 1;
                int iOrdinal = dnwwVar.ordinal();
                int i2 = 3;
                if (iOrdinal == 0) {
                    i = 2;
                } else if (iOrdinal == 1) {
                    i = 3;
                } else {
                    if (iOrdinal != 2) {
                        throw new fctg();
                    }
                    i = 4;
                }
                eodfVar.copyOnWrite();
                eodi eodiVar2 = (eodi) eodfVar.instance;
                eodiVar2.d = i - 1;
                eodiVar2.b |= 2;
                if (dnwzVar != null) {
                    switch (dnwzVar.ordinal()) {
                        case 0:
                            i2 = 2;
                            eodfVar.copyOnWrite();
                            eodi eodiVar3 = (eodi) eodfVar.instance;
                            eodiVar3.e = i2 - 1;
                            eodiVar3.b |= 4;
                            break;
                        case 1:
                            eodfVar.copyOnWrite();
                            eodi eodiVar32 = (eodi) eodfVar.instance;
                            eodiVar32.e = i2 - 1;
                            eodiVar32.b |= 4;
                            break;
                        case 2:
                            i2 = 4;
                            eodfVar.copyOnWrite();
                            eodi eodiVar322 = (eodi) eodfVar.instance;
                            eodiVar322.e = i2 - 1;
                            eodiVar322.b |= 4;
                            break;
                        case 3:
                            i2 = 5;
                            eodfVar.copyOnWrite();
                            eodi eodiVar3222 = (eodi) eodfVar.instance;
                            eodiVar3222.e = i2 - 1;
                            eodiVar3222.b |= 4;
                            break;
                        case 4:
                            i2 = 6;
                            eodfVar.copyOnWrite();
                            eodi eodiVar32222 = (eodi) eodfVar.instance;
                            eodiVar32222.e = i2 - 1;
                            eodiVar32222.b |= 4;
                            break;
                        case 5:
                            i2 = 7;
                            eodfVar.copyOnWrite();
                            eodi eodiVar322222 = (eodi) eodfVar.instance;
                            eodiVar322222.e = i2 - 1;
                            eodiVar322222.b |= 4;
                            break;
                        case 6:
                            i2 = 8;
                            eodfVar.copyOnWrite();
                            eodi eodiVar3222222 = (eodi) eodfVar.instance;
                            eodiVar3222222.e = i2 - 1;
                            eodiVar3222222.b |= 4;
                            break;
                        default:
                            throw new fctg();
                    }
                }
                eodfVar.copyOnWrite();
                eodi eodiVar4 = (eodi) eodfVar.instance;
                eodiVar4.b = 8 | eodiVar4.b;
                eodiVar4.f = (int) jLongValue;
                evsn evsnVarBuild = eodfVar.build();
                evsnVarBuild.getClass();
                return (eodi) evsnVarBuild;
            }
        };
        dnwy dnwyVar = abvdVar.b;
        if (dnwyVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        dnwz dnwzVar = abvdVar.c;
        dnww dnwwVar = abvdVar.d;
        if (dnwwVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long j = abvdVar.f;
        Object objA = fdavVar.a(dnwyVar, dnwzVar, dnwwVar, Long.valueOf(j > 0 ? j - abvdVar.e : 0L));
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.bP = (eodi) objA;
        ellhVar.g |= 536870912;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_EMOTIFY_EVENTS);
        ((abvd) fcsuVar.b()).c();
    }

    @Override // defpackage.dnwx
    public final void b(dnwy dnwyVar) {
        dnwyVar.getClass();
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.EMOTIFY_DELETE_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eodj eodjVar = (eodj) eodk.a.createBuilder();
        eodjVar.getClass();
        int iE = e(dnwyVar);
        eodjVar.copyOnWrite();
        eodk eodkVar = (eodk) eodjVar.instance;
        eodkVar.c = iE - 1;
        eodkVar.b |= 1;
        evsn evsnVarBuild = eodjVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.bS = (eodk) evsnVarBuild;
        ellhVar2.h |= 1;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_EMOTIFY_EVENTS);
    }

    @Override // defpackage.dnwx
    public final void c(dnwy dnwyVar) {
        dnwyVar.getClass();
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.EMOTIFY_IMPRESSION_EVENT, ellgVar);
        eodl eodlVar = (eodl) eodm.a.createBuilder();
        eodlVar.getClass();
        int iE = e(dnwyVar);
        eodlVar.copyOnWrite();
        eodm eodmVar = (eodm) eodlVar.instance;
        eodmVar.c = iE - 1;
        eodmVar.b |= 1;
        evsn evsnVarBuild = eodlVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.bQ = (eodm) evsnVarBuild;
        ellhVar.g |= 1073741824;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_EMOTIFY_EVENTS);
    }

    @Override // defpackage.dnwx
    public final void d() {
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.EMOTIFY_MESSAGE_SEND_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        fcsu fcsuVar = this.d;
        abvh abvhVar = (abvh) fcsuVar.b();
        Object objA = new fdav() { // from class: abve
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Integer num2 = (Integer) obj2;
                int iIntValue2 = num2.intValue();
                Integer num3 = (Integer) obj3;
                int iIntValue3 = num3.intValue();
                Boolean bool = (Boolean) obj4;
                boolean zBooleanValue = bool.booleanValue();
                ((ekrd) abvg.a.e().h("com/google/android/apps/messaging/emotify/logging/EmotifyEventLoggerImpl", "logSendEvent$lambda$7", 110, "EmotifyEventLoggerImpl.kt")).J("Logging emotify send event: tabClicks: %d, selected: %d, sent: %d, createButtonClicked: %s", num, num2, num3, bool);
                eodn eodnVar = (eodn) eodo.a.createBuilder();
                eodnVar.getClass();
                eodnVar.copyOnWrite();
                eodo eodoVar = (eodo) eodnVar.instance;
                eodoVar.b |= 1;
                eodoVar.c = iIntValue;
                eodnVar.copyOnWrite();
                eodo eodoVar2 = (eodo) eodnVar.instance;
                eodoVar2.b |= 2;
                eodoVar2.d = iIntValue2;
                eodnVar.copyOnWrite();
                eodo eodoVar3 = (eodo) eodnVar.instance;
                eodoVar3.b |= 8;
                eodoVar3.e = iIntValue3;
                eodnVar.copyOnWrite();
                eodo eodoVar4 = (eodo) eodnVar.instance;
                eodoVar4.b |= 32;
                eodoVar4.f = zBooleanValue;
                evsn evsnVarBuild = eodnVar.build();
                evsnVarBuild.getClass();
                return (eodo) evsnVarBuild;
            }
        }.a(Integer.valueOf(abvhVar.a), Integer.valueOf(abvhVar.b), Integer.valueOf(abvhVar.c), Boolean.valueOf(abvhVar.d));
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.bR = (eodo) objA;
        ellhVar2.g |= Integer.MIN_VALUE;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_EMOTIFY_EVENTS);
        abvh abvhVar2 = (abvh) fcsuVar.b();
        abvhVar2.a = 0;
        abvhVar2.b = 0;
        abvhVar2.c = 0;
    }
}
