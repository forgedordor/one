package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbj extends dbye {
    private final ekgb b;

    public dcbj(List list) {
        this.b = ekgb.n(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbye
    public final ListenableFuture a(dbzx dbzxVar) {
        ekgb ekgbVar = this.b;
        ekfw ekfwVarD = ekgb.d(ekgbVar.size());
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            ekfwVarD.h(((dbye) ekgbVar.get(i)).a(dbzxVar));
        }
        return eooq.f(eork.e(ekfwVarD.g()), new ejvr() { // from class: dcbi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                double dA = 1.0d;
                boolean zD = true;
                for (dbzy dbzyVar : (List) obj) {
                    zD &= dbzyVar.d();
                    dA *= dbzyVar.a();
                }
                return dbzy.c(zD, dA);
            }
        }, eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbye
    public final eyeg b() {
        Stream streamFlatMap = Collection.EL.stream(this.b).flatMap(new Function() { // from class: dcbh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(((dbye) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) streamFlatMap.collect(ekcv.a);
        if (ekgbVar.isEmpty()) {
            return null;
        }
        eyeb eyebVar = (eyeb) eyeg.a.createBuilder();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            eyebVar.mergeFrom((eyeb) ekgbVar.get(i2));
        }
        return (eyeg) eyebVar.build();
    }
}
