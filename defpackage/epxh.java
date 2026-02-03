package defpackage;

import com.sun.jna.Pointer;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxh implements epzu {
    final /* synthetic */ ccnl a;

    public epxh(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzu
    public eqay invoke(Pointer pointer) {
        eqaw eqawVarA;
        try {
            ccnm ccnmVar = this.a.b;
            ccnp ccnpVar = ccnmVar.a;
            final String str = ccnmVar.b;
            Instant instantA = ((coha) ((ccny) ccnpVar).a.b()).a();
            Object objB = ((ccny) ccnpVar).c.b();
            objB.getClass();
            final Instant instantMinusMillis = instantA.minusMillis(((Number) objB).longValue());
            String[] strArr = ccen.a;
            ccea cceaVar = new ccea();
            cceaVar.e();
            cceaVar.f("deleteExpired");
            cceaVar.c(new Function() { // from class: ccnx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ccem ccemVar = (ccem) obj;
                    ccemVar.d(str);
                    ccemVar.ap(new dqpj("mls_epoch_records.creation_timestamp", 8, Long.valueOf(bart.a(instantMinusMillis))));
                    return ccemVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cceaVar.b().b();
            eqax eqaxVar = eqaw.a;
            eqawVarA = eqav.c();
        } catch (Exception e) {
            ekrw ekrwVarI = ccnl.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "deleteExpired", 197, "GroupStateStorageAdapter.kt")).q("Failed to delete expired epoch records from MlsEpochRecords table");
            eqax eqaxVar2 = eqaw.a;
            eqawVarA = eqav.a(eqbq.w);
        }
        return eqawVarA.b;
    }
}
