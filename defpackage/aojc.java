package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aojc extends fcyz implements fdat {
    final /* synthetic */ aojd a;
    final /* synthetic */ SelfIdentityId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aojc(aojd aojdVar, SelfIdentityId selfIdentityId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aojdVar;
        this.b = selfIdentityId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aojc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final aojd aojdVar = this.a;
        axfu axfuVar = aojdVar.b;
        final SelfIdentityId selfIdentityId = this.b;
        Optional optionalOfNullable = Optional.ofNullable(axfuVar.f(selfIdentityId));
        final fdap fdapVar = new fdap() { // from class: aoja
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return aojdVar.c.a(aofa.b(selfIdentityId.b()));
            }
        };
        Optional map = optionalOfNullable.map(new Function() { // from class: aojb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return map;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aojc(this.a, this.b, fcxyVar);
    }
}
