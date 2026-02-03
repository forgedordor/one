package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.TokenData;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espf implements esos {
    private final Context a;
    private final diep b;

    public espf(Context context, diep diepVar) {
        this.a = context;
        this.b = diepVar;
    }

    @Override // defpackage.esos
    public final eson a(Account account, String str) throws Exception {
        try {
            Context context = this.a;
            int i = dbmj.a;
            TokenData tokenDataB = dbmq.b(context, account, str, null);
            return new eson(tokenDataB.b, this.b.f(), (Instant) Optional.ofNullable(tokenDataB.c).map(new Function() { // from class: espe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Instant.ofEpochSecond(((Long) obj).longValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
        } catch (dbmi e) {
            throw new esom(e);
        }
    }

    @Override // defpackage.esos
    public final void b(String str) throws Exception {
        try {
            Context context = this.a;
            int i = dbmj.a;
            dbmq.f(context, str);
        } catch (dbmi e) {
            throw new esom(e);
        }
    }
}
