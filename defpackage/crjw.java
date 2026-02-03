package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crjw implements crjx {
    private final ejxr a = ejxx.a(new ejxr() { // from class: crjv
        @Override // defpackage.ejxr
        public final Object get() {
            Stream map = Collection.EL.stream(((ejgt) crbf.ab.e()).b).map(new Function() { // from class: crjs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return crjz.b((ejgw) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: crjt
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Optional) obj).isPresent();
                }
            }).map(new Function() { // from class: crju
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (crjz) ((Optional) obj).get();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            return (ekgb) map.collect(ekcv.a);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crjx
    public final Optional a(String str) {
        Optional optionalEmpty;
        eieu eieuVarK = eiiy.k("IosReactionMessageClassifier#classify");
        try {
            if (!TextUtils.isEmpty(str)) {
                ejxr ejxrVar = this.a;
                if (!((ekgb) ejxrVar.get()).isEmpty()) {
                    ekqh it = ((ekgb) ejxrVar.get()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            optionalEmpty = Optional.empty();
                            break;
                        }
                        crjz crjzVar = (crjz) it.next();
                        Optional optionalA = crjzVar.a(str);
                        if (!optionalA.isEmpty()) {
                            ezgc ezgcVar = (ezgc) ezgd.a.createBuilder();
                            ezah ezahVar = ezah.REACTION_CLASSIFICATION;
                            ezgcVar.copyOnWrite();
                            ((ezgd) ezgcVar.instance).d = ezahVar.a();
                            ezey ezeyVar = (ezey) ezfb.a.createBuilder();
                            ezeyVar.copyOnWrite();
                            ((ezfb) ezeyVar.instance).e = ezez.a(3);
                            String str2 = ((crjr) optionalA.get()).b;
                            ezeyVar.copyOnWrite();
                            ((ezfb) ezeyVar.instance).b = str2;
                            String str3 = ((crjr) optionalA.get()).a;
                            ezeyVar.copyOnWrite();
                            ((ezfb) ezeyVar.instance).c = str3;
                            int i = crjzVar.a;
                            ezeyVar.copyOnWrite();
                            ((ezfb) ezeyVar.instance).d = ezfa.a(i);
                            ezgcVar.copyOnWrite();
                            ezgd ezgdVar = (ezgd) ezgcVar.instance;
                            ezfb ezfbVar = (ezfb) ezeyVar.build();
                            ezfbVar.getClass();
                            ezgdVar.c = ezfbVar;
                            ezgdVar.b = 2;
                            optionalEmpty = Optional.of((ezgd) ezgcVar.build());
                            break;
                        }
                    }
                } else {
                    optionalEmpty = Optional.empty();
                }
            } else {
                optionalEmpty = Optional.empty();
            }
            eieuVarK.close();
            return optionalEmpty;
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
