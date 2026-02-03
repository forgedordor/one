package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anuq {
    public static final ProfilesTable.BindData a(final long j) {
        bsun bsunVarA = ProfilesTable.a();
        bsunVarA.A("getProfileRowIfItExists");
        bsur bsurVar = new bsur();
        bsurVar.aq((bsur) new Function() { // from class: anup
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsur bsurVar2 = (bsur) obj;
                bsurVar2.b(j);
                return bsurVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bsur()));
        bsunVarA.k(new bsuq(bsurVar));
        ekgb ekgbVarZ = bsunVarA.b().z();
        if (ekgbVarZ.isEmpty()) {
            return null;
        }
        ekgbVarZ.getClass();
        return (ProfilesTable.BindData) fcva.N(ekgbVarZ);
    }
}
