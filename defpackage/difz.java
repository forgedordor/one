package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class difz {
    public static final ekrg a = ekrg.c("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager");
    public final long b;
    public final Context c;
    public final eosc d;
    public final eosc e;
    public final eygg f;
    public final List g;
    public final Optional h;
    public final Optional i;
    protected final AtomicReference j = new AtomicReference(new HashSet());
    public final ceao k;

    public difz(Context context, Optional optional, long j, Optional optional2, eosc eoscVar, eosc eoscVar2, ceao ceaoVar, eygg eyggVar, List list) {
        this.b = j;
        this.c = context;
        this.h = optional.map(new Function() { // from class: difp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new AtomicReference((etsp) etsp.h(new etso(), (fbqm) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.i = optional2;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.k = ceaoVar;
        this.f = eyggVar;
        this.g = list;
    }
}
