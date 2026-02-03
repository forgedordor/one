package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoct extends fcyz implements fdat {
    final /* synthetic */ aocw a;
    final /* synthetic */ SelfIdentityId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoct(aocw aocwVar, SelfIdentityId selfIdentityId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aocwVar;
        this.b = selfIdentityId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoct) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final aoeq aoeqVar = this.a.b;
        Optional map = Optional.ofNullable(aoeqVar.b.f(this.b)).map(new Function() { // from class: aoep
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return aoeqVar.a((axcy) obj2);
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
        return new aoct(this.a, this.b, fcxyVar);
    }
}
