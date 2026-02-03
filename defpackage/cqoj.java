package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqoj {
    private static final cqce d = cqce.g("BugleDataModel", "GifDatabaseOperations");
    public final Context a;
    public final cogw b;
    public final dqsn c;

    public cqoj(Context context, cogw cogwVar, dqsn dqsnVar) {
        this.a = context;
        this.b = cogwVar;
        this.c = dqsnVar;
    }

    static /* synthetic */ Object a(btei bteiVar, byeu byeuVar) {
        try {
            final dqsy dqsyVarA = btfy.a();
            dqru.b(btfy.a(), "recent_gifs", bteiVar, new Function() { // from class: bteg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.Q("recent_gifs", (dqst) obj, 4));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bteh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } catch (SQLiteConstraintException e) {
            d.o("Invalid SQLite constraint while attempting to insert a recent gif item.", e);
            byeuVar.a(new Object());
        }
        return new Object();
    }
}
