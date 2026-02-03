package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpuk {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;

    public cpuk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final Optional a(final String str) {
        return Optional.ofNullable(((bbca) this.c.b()).b(str)).map(new Function() { // from class: cpuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cpuk cpukVar = this.a;
                String str2 = str;
                btxd btxdVarA = bbdn.a(aofa.b(str2));
                cptz cptzVarD = cpua.d();
                cptzVarD.c((ParticipantsTable.BindData) obj);
                cptzVarD.b(bbfz.d(str2));
                if (btxdVarA != null && btxdVarA.m() == -1) {
                    ((cplx) cptzVarD).a = btxdVarA;
                }
                return cptzVarD.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
