package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvr extends fcyz implements fdat {
    final /* synthetic */ ahwd a;
    final /* synthetic */ UUID b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvr(fcxy fcxyVar, ahwd ahwdVar, UUID uuid) {
        super(2, fcxyVar);
        this.a = ahwdVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final UUID uuid = this.b;
        uuid.getClass();
        btqt btqtVarA = btqy.a();
        btqtVarA.A("RestoreWorkflowSettingsService#getRestoreExecutionSync");
        btqtVarA.c(new Function() { // from class: ahuc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                btqx btqxVar = (btqx) obj2;
                btqxVar.b(Optional.of(uuid));
                return btqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btor btorVar = (btor) btqtVarA.b().l();
        if (btorVar != null) {
            return ahwd.y(btorVar);
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahvr ahvrVar = new ahvr(fcxyVar, this.a, this.b);
        ahvrVar.c = obj;
        return ahvrVar;
    }
}
