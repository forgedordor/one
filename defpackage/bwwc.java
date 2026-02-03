package defpackage;

import android.net.Uri;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwc {
    private final fcsu a;

    public bwwc(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static List a(String str) {
        cqaz.h();
        String[] strArr = btee.a;
        bteb btebVar = new bteb(btee.a);
        btebVar.A("+queryRecentExpressiveStickers");
        btebVar.D((String) DesugarArrays.stream(new btdy[]{new btdy(btee.b.f)}).map(new Function() { // from class: btea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btdy) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        btebVar.z(str);
        return btebVar.b().z();
    }

    public static final List c() {
        eieu eieuVarK = eiiy.k("RecentExpressiveStickerDatabaseOperations#getRecentExpressiveStickers");
        try {
            List listA = a(String.valueOf(ccze.I.e()));
            eieuVarK.close();
            return listA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(btct btctVar) {
        eieu eieuVarK = eiiy.k("RecentExpressiveStickerDatabaseOperations#insertOrReplaceRecentExpressiveSticker");
        try {
            cqaz.h();
            final dqsy dqsyVarA = btee.a();
            dqru.b(btee.a(), "recent_expressive_stickers", btctVar, new Function() { // from class: btcr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.Q("recent_expressive_stickers", (dqst) obj, 5));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: btcs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bxlc bxlcVar = (bxlc) this.a.b();
            eieu eieuVarK2 = eiiy.k("DataChangeNotifier#notifyExpressiveStickersChanged");
            try {
                bxlcVar.c.e(Uri.parse(bace.m(bxlcVar.b).concat("expressivestickers/recents")));
                eieuVarK2.close();
                eieuVarK.close();
            } finally {
            }
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
