package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crkg implements crjx {
    private final fctc a = fctd.a(new fdae() { // from class: crkc
        @Override // defpackage.fdae
        public final Object invoke() {
            evtg evtgVar = ((ejgt) crbf.ac.e()).b;
            evtgVar.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
            Iterator<E> it = evtgVar.iterator();
            while (it.hasNext()) {
                arrayList.add(crjz.b((ejgw) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Optional) obj).isPresent()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((crjz) ((Optional) it2.next()).get());
            }
            return arrayList3;
        }
    });

    public static final ezgd b(String str, String str2, int i) {
        ezgc ezgcVar = (ezgc) ezgd.a.createBuilder();
        ezgcVar.getClass();
        eyzq.b(ezah.REACTION_CLASSIFICATION, ezgcVar);
        ezey ezeyVar = (ezey) ezfb.a.createBuilder();
        ezeyVar.getClass();
        ezeyVar.copyOnWrite();
        ((ezfb) ezeyVar.instance).e = ezez.a(4);
        str.getClass();
        ezeyVar.copyOnWrite();
        ((ezfb) ezeyVar.instance).b = str;
        str2.getClass();
        ezeyVar.copyOnWrite();
        ((ezfb) ezeyVar.instance).c = str2;
        ezeyVar.copyOnWrite();
        ((ezfb) ezeyVar.instance).d = ezfa.a(i);
        evsn evsnVarBuild = ezeyVar.build();
        evsnVarBuild.getClass();
        ezgcVar.copyOnWrite();
        ezgd ezgdVar = (ezgd) ezgcVar.instance;
        ezgdVar.c = (ezfb) evsnVarBuild;
        ezgdVar.b = 2;
        return eyzq.a(ezgcVar);
    }

    @Override // defpackage.crjx
    public final Optional a(final String str) throws IOException {
        Object next;
        eieu eieuVarH = eiiy.h("XmsReactionMessageClassifier#classify");
        try {
            fdft fdftVar = new fdft((fdfu) fdey.j(fcva.ax((List) this.a.a()), new fdap() { // from class: crkd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    final crjz crjzVar = (crjz) obj;
                    crjzVar.getClass();
                    String str2 = str;
                    Optional optionalA = crjzVar.a(str2);
                    final fdap fdapVar = new fdap() { // from class: crka
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            crjy crjyVar = (crjy) obj2;
                            return crkg.b(crjyVar.b(), crjyVar.a(), crjzVar.a);
                        }
                    };
                    Optional map = optionalA.map(new Function() { // from class: crkb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return fdapVar.invoke(obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (true != map.isPresent()) {
                        map = null;
                    }
                    if (map != null) {
                        return map;
                    }
                    Optional optionalA2 = crjzVar.a(str2 != null ? fdgn.X(str2).toString() : null);
                    final fdap fdapVar2 = new fdap() { // from class: crke
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            crjy crjyVar = (crjy) obj2;
                            return crkg.b(fdgn.X(crjyVar.b()).toString(), fdgn.X(crjyVar.a()).toString(), crjzVar.a);
                        }
                    };
                    Optional map2 = optionalA2.map(new Function() { // from class: crkf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return fdapVar2.invoke(obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    map2.getClass();
                    return map2;
                }
            }));
            while (true) {
                if (!fdftVar.hasNext()) {
                    next = null;
                    break;
                }
                next = fdftVar.next();
                if (((Optional) next).isPresent()) {
                    break;
                }
            }
            Optional optionalEmpty = (Optional) next;
            if (optionalEmpty == null) {
                optionalEmpty = Optional.empty();
            }
            fczl.a(eieuVarH, null);
            return optionalEmpty;
        } finally {
        }
    }
}
