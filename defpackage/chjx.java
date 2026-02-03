package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chjx implements Function {
    public static final chjx a = new chjx();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bsur bsurVar = (bsur) obj;
        int iIntValue = ProfilesTable.c().intValue();
        if (iIntValue < 60170) {
            dqru.x("profile_access_token", iIntValue);
        }
        bsurVar.ap(new dqpn("profiles_table.profile_access_token", 6));
        bsurVar.ap(new dqpn("profiles_table.display_name", 6));
        return bsurVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
