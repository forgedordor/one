package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvd {
    public static final bkvw a(final aubq aubqVar) {
        bkwz bkwzVarA = bkxc.a();
        bkwzVarA.A("ConversationEncryptionStatus#getRemoteInstanceBindData");
        bkwzVarA.c(new Function() { // from class: bvvc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bkxb bkxbVar = (bkxb) obj;
                bkxbVar.ap(new dqpm("remote_user_id_to_registration_id.remote_user_id", 3, bkxb.au(aubqVar.d), false));
                return bkxbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = bkwzVarA.b().p();
        try {
            bkwx bkwxVar = (bkwx) dqqjVarP;
            bkvw bkvwVar = bkwxVar.moveToFirst() ? (bkvw) bkwxVar.cQ() : null;
            fczl.a(dqqjVarP, null);
            return bkvwVar;
        } finally {
        }
    }
}
