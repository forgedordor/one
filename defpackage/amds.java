package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amds implements ajmg {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    final /* synthetic */ amdx c;

    public amds(amdx amdxVar) {
        this.c = amdxVar;
    }

    @Override // defpackage.cqtk
    public final /* bridge */ /* synthetic */ eiju a(Object obj) {
        ekgb ekgbVarN;
        final ajmf ajmfVar = (ajmf) obj;
        synchronized (this.a) {
            ekgbVarN = ekgb.n(this.b);
        }
        final ekgb ekgbVar = (ekgb) Collection.EL.stream(ekgbVarN).map(new Function() { // from class: amdn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((ajmg) obj2).a(ajmfVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        if (!ekgbVar.isEmpty()) {
            auvh.h(eijx.h(new eooy() { // from class: amdo
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eijx.a(ekgbVar);
                }
            }, this.c.b));
        }
        return eijx.e(null);
    }

    @Override // defpackage.ajmg
    public final eiju b() {
        ekgb ekgbVarN;
        synchronized (this.a) {
            ekgbVarN = ekgb.n(this.b);
        }
        final ekgb ekgbVar = (ekgb) Collection.EL.stream(ekgbVarN).map(new Function() { // from class: amdp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ajmg) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        if (!ekgbVar.isEmpty()) {
            auvh.h(eijx.h(new eooy() { // from class: amdq
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eijx.a(ekgbVar);
                }
            }, this.c.b));
        }
        return eijx.e(null);
    }
}
