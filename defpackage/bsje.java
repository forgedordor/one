package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsje extends dqws<bsgt, bsjc, bsje, PartsTable.BindData, bsgs> {
    public bsje(String[] strArr) {
        super("parts", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsjc b() {
        l();
        return new bsjc(this.a.a());
    }

    public final void c(bsgs... bsgsVarArr) {
        int iIntValue = PartsTable.e().intValue();
        for (bsgs bsgsVar : bsgsVarArr) {
            if (((Integer) PartsTable.b.getOrDefault(bsgsVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bsgsVarArr);
    }

    public final void d(bsjb... bsjbVarArr) {
        D((String) DesugarArrays.stream(bsjbVarArr).map(new Function() { // from class: bsjd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsjb) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        c((bsgs[]) function.apply(PartsTable.d));
    }

    public final void f(Function function) {
        c((bsgs) function.apply(PartsTable.d));
    }

    public final void g(bsjl bsjlVar) {
        k(new bsji(bsjlVar));
    }

    public final void h(Function function) {
        String[] strArr = PartsTable.a;
        k(new bsji((bsjl) function.apply(new bsjl())));
    }
}
