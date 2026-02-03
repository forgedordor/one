package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ckja {
    public static ckiz i(ewrp ewrpVar, Optional optional) {
        String str = (String) optional.map(new Function() { // from class: ckiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ejwk.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("unknown");
        ckio ckioVar = new ckio();
        ckioVar.i(ewrpVar);
        ckioVar.c = 2;
        ckioVar.h(UUID.randomUUID().toString());
        ckioVar.g(str);
        ckioVar.m(2);
        ckioVar.f("");
        return ckioVar;
    }

    public static String l(ewli ewliVar) {
        return TextUtils.join(",", ewliVar.b);
    }

    public static ckiz m(int i) {
        String string = UUID.randomUUID().toString();
        ckio ckioVar = new ckio();
        ckioVar.i(ewrp.RCS_PROVISIONING_UNKNOWN_STATE);
        ckioVar.c = i;
        ckioVar.h(string);
        ckioVar.g(string);
        ckioVar.m(2);
        ckioVar.f("");
        return ckioVar;
    }

    public abstract ewlp a();

    public abstract ewrp b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public final ekgp j() {
        final ekgi ekgiVar = new ekgi();
        Map.EL.forEach(DesugarCollections.unmodifiableMap(a().f), new BiConsumer() { // from class: ckiw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String strL = ckja.l((ewli) obj2);
                ekgiVar.i((String) obj, strL);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return ekgiVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String k(String str) {
        ewlp ewlpVarA = a();
        ewli ewliVar = ewli.a;
        evub evubVar = ewlpVarA.f;
        if (evubVar.containsKey(str)) {
            ewliVar = (ewli) evubVar.get(str);
        }
        return l(ewliVar);
    }
}
