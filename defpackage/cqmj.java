package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmj {
    private final Context a;
    private final cqmp b;
    private final Optional c;
    private final fcsu d;
    private final fcsu e;

    public cqmj(Context context, cqmp cqmpVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = context;
        this.b = cqmpVar;
        this.c = optional;
        this.d = fcsuVar;
        this.e = fcsuVar2;
    }

    private final long c() {
        return this.b.d(this.a);
    }

    public final cqmi a(long j) {
        fcsu fcsuVar = this.e;
        int iB = ((crny) fcsuVar.b()).b();
        long jC = c();
        return (dhhi.b(this.a) || !((crny) fcsuVar.b()).h(iB).B() || ((chvg) this.d.b()).c()) ? jC == -1 ? new cqme(-1L, Optional.of("File auto download is disabled by RCS config")) : j > jC ? new cqme(jC, Optional.of("File is bigger than max auto download file size")) : new cqme(jC, Optional.empty()) : new cqme(jC, Optional.of("File auto download is disabled while roaming"));
    }

    public final cqmi b(ContentType contentType, long j) {
        return ((Boolean) this.c.map(new Function() { // from class: cqmh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cqmq) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(true)).booleanValue() ? a(j) : new cqme(c(), Optional.of("File auto download is disabled for the content type: ".concat(contentType.toString())));
    }
}
