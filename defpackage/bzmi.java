package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmi {
    public static final bmqq a(final bmoy bmoyVar) {
        bmqr bmqrVarA = bmqy.a();
        bmqrVarA.A("+matchingDeadLetterExists");
        bmqrVarA.c(new Function() { // from class: bzmh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmqx bmqxVar = (bmqx) obj;
                bmqxVar.getClass();
                bmoy bmoyVar2 = bmoyVar;
                bmqz bmqzVar = bmoyVar2.d;
                bmqxVar.ap(new dqty("cms_dead_letter_queue.abandoned_action", 1, Integer.valueOf(bmqzVar == null ? 0 : bmqzVar.ordinal())));
                bmqxVar.c(bmoyVar2.f);
                int i = bmoyVar2.i;
                int iIntValue = bmqy.c().intValue();
                if (iIntValue < 57090) {
                    dqru.x("backup_flags", iIntValue);
                }
                bmqxVar.ap(new dqty("cms_dead_letter_queue.backup_flags", 1, Integer.valueOf(i)));
                emcn emcnVar = bmoyVar2.e;
                bmqxVar.ap(new dqty("cms_dead_letter_queue.failure_reason", 1, Integer.valueOf(emcnVar != null ? emcnVar.bs : 0)));
                int i2 = bmoyVar2.j;
                int iIntValue2 = bmqy.c().intValue();
                if (iIntValue2 < 57090) {
                    dqru.x("backup_dependency_table_type", iIntValue2);
                }
                bmqxVar.ap(new dqty("cms_dead_letter_queue.backup_dependency_table_type", 1, Integer.valueOf(i2)));
                String str = bmoyVar2.k;
                int iIntValue3 = bmqy.c().intValue();
                if (iIntValue3 < 57090) {
                    dqru.x("backup_dependency_bugle_id", iIntValue3);
                }
                bmqxVar.ap(new dqpj("cms_dead_letter_queue.backup_dependency_bugle_id", 1, String.valueOf(str)));
                bmqz bmqzVar2 = bmoyVar2.d;
                bmqzVar2.getClass();
                if (bzmi.b(bmqzVar2)) {
                    String str2 = bmoyVar2.b;
                    str2.getClass();
                    fdgn.H(str2);
                    bmqxVar.ap(new dqpj("cms_dead_letter_queue.cms_id", 1, String.valueOf(bmoyVar2.b)));
                    return bmqxVar;
                }
                String str3 = bmoyVar2.g;
                str3.getClass();
                fdgn.H(str3);
                String str4 = bmoyVar2.g;
                int iIntValue4 = bmqy.c().intValue();
                if (iIntValue4 < 57090) {
                    dqru.x("bugle_id", iIntValue4);
                }
                bmqxVar.ap(new dqpj("cms_dead_letter_queue.bugle_id", 1, String.valueOf(str4)));
                return bmqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bmqrVarA.b();
    }

    public static final boolean b(bmqz bmqzVar) {
        int iOrdinal = bmqzVar.ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 4;
    }

    public static final void c(cqbd cqbdVar, bmoy bmoyVar) {
        cqbdVar.y("tableType", bmoyVar.f);
        cqbdVar.A("id", bmoyVar.g);
        cqbdVar.A("cmsId", bmoyVar.b);
        cqbdVar.y("flags", bmoyVar.i);
        cqbdVar.A("failureReason", bmoyVar.e);
        cqbdVar.y("dependencyType", bmoyVar.j);
        cqbdVar.A("dependencyId", bmoyVar.k);
    }
}
