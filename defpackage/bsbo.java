package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbo extends dqws<brzj, bsbm, bsbo, ParticipantsTable.BindData, brzi> {
    public bsbo(String[] strArr) {
        super("participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsbm b() {
        l();
        return new bsbm(this.a.a());
    }

    public final void c(brzi... brziVarArr) {
        int iIntValue = ParticipantsTable.i().intValue();
        for (brzi brziVar : brziVarArr) {
            if (((Integer) ParticipantsTable.b.getOrDefault(brziVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(brziVarArr);
    }

    public final void d(bsbl... bsblVarArr) {
        D((String) DesugarArrays.stream(bsblVarArr).map(new Function() { // from class: bsbn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsbl) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        c((brzi[]) function.apply(ParticipantsTable.c));
    }

    public final void f(Function function) {
        c((brzi) function.apply(ParticipantsTable.c));
    }

    public final void g(bsbx bsbxVar) {
        k(new bsbt(bsbxVar));
    }

    public final void h(Function function) {
        String[] strArr = ParticipantsTable.a;
        k(new bsbt((bsbx) function.apply(new bsbx())));
    }
}
