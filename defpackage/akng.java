package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akng implements cqto {
    final /* synthetic */ aknj a;
    private cquc b;

    public akng(aknj aknjVar) {
        this.a = aknjVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final aknj aknjVar = this.a;
        bmma bmmaVarA = bmmf.a();
        bmmaVarA.A("createBusinessConversationsMetadataQuery");
        bmmaVarA.c(new Function() { // from class: akna
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmme bmmeVar = (bmme) obj;
                bmmeVar.b(aknjVar.d.l().a);
                return bmmeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = cqty.b(aknjVar.d.n().a(new anpi() { // from class: aknf
            @Override // defpackage.anpi
            public final eiju a() {
                return aknjVar.d();
            }
        }), aknjVar.a.a(bmmaVarA.b(), "RbmConversationPropertiesObservableSupplier#businessConversationsMetadataQuery").f(new cqtk() { // from class: aknb
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return aknjVar.d();
            }
        }, "RbmConversationPropertiesObservableSupplier::register", "RbmConversationPropertiesObservableSupplier::callback", "RbmConversationPropertiesObservableSupplier::unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        cquc cqucVar = this.b;
        if (cqucVar != null) {
            cqucVar.a();
        }
        this.b = null;
    }
}
