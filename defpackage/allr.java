package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class allr {
    public static allr i(String str, alwk alwkVar) {
        return new alfn(str, alwkVar, "", null, 0, new ejxr() { // from class: allg
            @Override // defpackage.ejxr
            public final Object get() {
                return allt.e;
            }
        }, new ejxr() { // from class: alli
            @Override // defpackage.ejxr
            public final Object get() {
                return null;
            }
        }, new ejxr() { // from class: allj
            @Override // defpackage.ejxr
            public final Object get() {
                return null;
            }
        });
    }

    public static allr k(String str, alwk alwkVar, String str2, ephf ephfVar, int i, final ejxr ejxrVar) {
        return new alfn(str, alwkVar, str2, ephfVar, i, ejxrVar, new ejxr() { // from class: allo
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alls) ejxrVar.get()).b();
            }
        }, new ejxr() { // from class: allp
            @Override // defpackage.ejxr
            public final Object get() {
                return (crnc) ((alls) ejxrVar.get()).a().map(new Function() { // from class: alln
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        crnc crncVar = (crnc) obj;
                        if (crncVar.b()) {
                            return null;
                        }
                        return crncVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
            }
        });
    }

    public static allr l(String str, alwk alwkVar, String str2, ephf ephfVar, int i, final String str3, final crnc crncVar) {
        return new alfn(str, alwkVar, str2, ephfVar, i, new ejxr() { // from class: allk
            @Override // defpackage.ejxr
            public final Object get() {
                crnc crncVar2 = crncVar;
                return new alfo(ejwk.b(str3), crncVar2 != null ? crncVar2.a() : Optional.empty());
            }
        }, new ejxr() { // from class: alll
            @Override // defpackage.ejxr
            public final Object get() {
                return str3;
            }
        }, new ejxr() { // from class: allm
            @Override // defpackage.ejxr
            public final Object get() {
                return crncVar;
            }
        });
    }

    public abstract alwk a();

    public abstract ejxr b();

    public abstract ejxr c();

    public abstract ejxr d();

    public abstract ephf e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public final alls j() {
        return (alls) c().get();
    }
}
