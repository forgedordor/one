package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdn {
    public static final btxd a(final SelfIdentityId selfIdentityId) {
        eieu eieuVarK = eiiy.k("SelfParticipantsDatabaseOperations#getSelfParticipant");
        try {
            cqaz.h();
            if (!TextUtils.isEmpty(String.valueOf(selfIdentityId))) {
                btys btysVarA = btyx.a();
                btysVarA.A("SelfParticipantsDatabaseOperations#getSelfParticipant");
                btysVarA.c(new Function() { // from class: bbdm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btyw btywVar = (btyw) obj;
                        btywVar.ap(new dqpj("self_participants.participant_id", 1, String.valueOf(String.valueOf(selfIdentityId))));
                        return btywVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btyd btydVar = (btyd) btysVarA.b().p();
                try {
                    btxdVar = btydVar.moveToFirst() ? (btxd) btydVar.cQ() : null;
                    btydVar.close();
                } finally {
                }
            }
            eieuVarK.close();
            return btxdVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
