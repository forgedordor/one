package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axct implements Function {
    public static final axct a = new axct();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        bsbx bsbxVar = (bsbx) obj;
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 59930) {
            dqru.x("my_identity_token", iIntValue);
        }
        bsbxVar.ap(new dqpn("participants.my_identity_token", 5));
        return bsbxVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
