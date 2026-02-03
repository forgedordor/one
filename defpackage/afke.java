package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afke extends fcyz implements fdat {
    final /* synthetic */ afki a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afke(fcxy fcxyVar, afki afkiVar) {
        super(2, fcxyVar);
        this.a = afkiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afke) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bngz.a;
        bngp bngpVar = new bngp();
        bngpVar.f("ConversationClassificationPersisterImpl#deleteExpiredClassifications");
        final afki afkiVar = this.a;
        bngpVar.c(new Function() { // from class: afkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bngy bngyVar = (bngy) obj2;
                bngyVar.getClass();
                bngyVar.c(aukf.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM);
                long epochMilli = afkiVar.c.f().toEpochMilli() - Duration.ofDays(((Number) crbf.bB.e()).intValue()).toMillis();
                int iIntValue = bngz.c().intValue();
                if (iIntValue < 58840) {
                    dqru.x("generated_timestamp", iIntValue);
                }
                bngyVar.ap(new dqty("conversation_classifications_table.generated_timestamp", 10, Long.valueOf(epochMilli)));
                return bngyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new Integer(bngpVar.b().b());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afke afkeVar = new afke(fcxyVar, this.a);
        afkeVar.b = obj;
        return afkeVar;
    }
}
