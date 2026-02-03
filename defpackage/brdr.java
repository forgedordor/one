package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdr extends dqws<brap, brdp, brdr, MessagesTable.BindData, brao> {
    public brdr(String[] strArr) {
        super("messages", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brdp b() {
        l();
        return new brdp(this.a.a());
    }

    public final void c(brao... braoVarArr) {
        int iIntValue = MessagesTable.g().intValue();
        for (brao braoVar : braoVarArr) {
            if (((Integer) MessagesTable.b.getOrDefault(braoVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(braoVarArr);
    }

    public final void d(brdo... brdoVarArr) {
        D((String) DesugarArrays.stream(brdoVarArr).map(new Function() { // from class: brdq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((brdo) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        c((brao[]) function.apply(MessagesTable.c));
    }

    public final void f(Function function) {
        c((brao) function.apply(MessagesTable.c));
    }

    public final void g(brec brecVar) {
        k(new brdv(brecVar));
    }

    public final void h(Function function) {
        String[] strArr = MessagesTable.a;
        k(new brdv((brec) function.apply(new brec())));
    }
}
