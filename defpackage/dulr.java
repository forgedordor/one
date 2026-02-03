package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dulr implements dugs {
    public final dtvq a;
    public final ecjh b;
    public final Executor c;
    private final duag d;

    public dulr(duag duagVar, dtvq dtvqVar, ecjh ecjhVar, Executor executor) {
        this.d = duagVar;
        this.a = dtvqVar;
        this.b = ecjhVar;
        this.c = executor;
    }

    @Override // defpackage.dugs
    public final ListenableFuture a(dtqy dtqyVar) {
        durt.c("%s: Adding file group %s", "ProtoDataStoreFileGroupsMetadata", dtqyVar.d);
        dtqy dtqyVarD = dutx.d(dtqyVar, (this.d.a() / 1000) + dtqyVar.l);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dtqyVarD);
        return m(arrayList);
    }

    @Override // defpackage.dugs
    public final ListenableFuture b() {
        return dvaq.e(k()).g(new eooz() { // from class: dull
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejvr ejvrVar = new ejvr() { // from class: dukw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        dtrp dtrpVar = (dtrp) ((dtrs) obj2).toBuilder();
                        dtrpVar.clear();
                        return (dtrs) dtrpVar.build();
                    }
                };
                dulr dulrVar = this.a;
                return dulrVar.b.b(ejvrVar, dulrVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.dugs
    public final ListenableFuture c() {
        final ArrayList arrayList = new ArrayList();
        ejvr ejvrVar = new ejvr() { // from class: dulp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrs dtrsVar = (dtrs) obj;
                dtrp dtrpVar = (dtrp) dtrsVar.toBuilder();
                List list = arrayList;
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(dtrsVar.b).entrySet()) {
                    String str = (String) entry.getKey();
                    try {
                        list.add(new duol(dutz.a(str), (dtqy) entry.getValue()));
                    } catch (duty e) {
                        dtrpVar.b(str);
                        durt.j(e, "Failed to deserialized file group key: ".concat(String.valueOf(str)));
                    }
                }
                return (dtrs) dtrpVar.build();
            }
        };
        Executor executor = this.c;
        return dvaq.e(this.b.b(ejvrVar, executor)).f(new ejvr() { // from class: dulq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return arrayList;
            }
        }, executor);
    }

    @Override // defpackage.dugs
    public final ListenableFuture d() {
        final ArrayList arrayList = new ArrayList();
        ejvr ejvrVar = new ejvr() { // from class: dule
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrs dtrsVar = (dtrs) obj;
                dtrp dtrpVar = (dtrp) dtrsVar.toBuilder();
                List list = arrayList;
                for (String str : DesugarCollections.unmodifiableMap(dtrsVar.b).keySet()) {
                    try {
                        list.add(dutz.a(str));
                    } catch (duty e) {
                        dulr dulrVar = this.a;
                        durt.j(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                        dulrVar.a.a();
                        dtrpVar.b(str);
                        durt.b("%s: Deleting null file group ", "ProtoDataStoreFileGroupsMetadata");
                    }
                }
                return (dtrs) dtrpVar.build();
            }
        };
        Executor executor = this.c;
        return dvaq.e(this.b.b(ejvrVar, executor)).f(new ejvr() { // from class: dulf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return arrayList;
            }
        }, executor);
    }

    @Override // defpackage.dugs
    public final ListenableFuture e() {
        return eika.j(this.b.a(), new ejvr() { // from class: dulb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dtrs) obj).d;
            }
        }, this.c);
    }

    @Override // defpackage.dugs
    public final ListenableFuture f() {
        return eorv.a;
    }

    @Override // defpackage.dugs
    public final ListenableFuture g(dtrw dtrwVar) {
        final String strC = dutz.c(dtrwVar);
        return eika.j(this.b.a(), new ejvr() { // from class: dulk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (dtqy) DesugarCollections.unmodifiableMap(((dtrs) obj).b).get(strC);
            }
        }, this.c);
    }

    @Override // defpackage.dugs
    public final ListenableFuture h(dtrw dtrwVar) {
        final String strC = dutz.c(dtrwVar);
        return eika.j(this.b.a(), new ejvr() { // from class: dukx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (dtry) DesugarCollections.unmodifiableMap(((dtrs) obj).c).get(strC);
            }
        }, this.c);
    }

    @Override // defpackage.dugs
    public final ListenableFuture i(dtrw dtrwVar) {
        final String strC = dutz.c(dtrwVar);
        ejvr ejvrVar = new ejvr() { // from class: dulm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrp dtrpVar = (dtrp) ((dtrs) obj).toBuilder();
                dtrpVar.b(strC);
                return (dtrs) dtrpVar.build();
            }
        };
        Executor executor = this.c;
        return dvaq.e(this.b.b(ejvrVar, executor)).f(new ejvr() { // from class: duln
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).c(IOException.class, new ejvr() { // from class: dulo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.dugs
    public final ListenableFuture j(final List list) {
        ejvr ejvrVar = new ejvr() { // from class: duky
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrp dtrpVar = (dtrp) ((dtrs) obj).toBuilder();
                for (dtrw dtrwVar : list) {
                    durt.d("%s: Removing group %s %s", "ProtoDataStoreFileGroupsMetadata", dtrwVar.c, dtrwVar.d);
                    dtrpVar.b(dutz.c(dtrwVar));
                }
                return (dtrs) dtrpVar.build();
            }
        };
        Executor executor = this.c;
        return dvaq.e(this.b.b(ejvrVar, executor)).f(new ejvr() { // from class: dukz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).c(IOException.class, new ejvr() { // from class: dula
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.dugs
    public final ListenableFuture k() {
        return this.b.b(new ejvr() { // from class: dulc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrp dtrpVar = (dtrp) ((dtrs) obj).toBuilder();
                dtrpVar.copyOnWrite();
                ((dtrs) dtrpVar.instance).d = dtrs.emptyProtobufList();
                return (dtrs) dtrpVar.build();
            }
        }, this.c);
    }

    @Override // defpackage.dugs
    public final ListenableFuture l(dtrw dtrwVar, final dtqy dtqyVar) {
        final String strC = dutz.c(dtrwVar);
        ejvr ejvrVar = new ejvr() { // from class: dulg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrp dtrpVar = (dtrp) ((dtrs) obj).toBuilder();
                dtrpVar.a(strC, dtqyVar);
                return (dtrs) dtrpVar.build();
            }
        };
        Executor executor = this.c;
        return dvaq.e(this.b.b(ejvrVar, executor)).f(new ejvr() { // from class: dulh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).c(IOException.class, new ejvr() { // from class: duli
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.dugs
    public final ListenableFuture m(final List list) {
        ejvr ejvrVar = new ejvr() { // from class: dukv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtrp dtrpVar = (dtrp) ((dtrs) obj).toBuilder();
                dtrpVar.copyOnWrite();
                dtrs dtrsVar = (dtrs) dtrpVar.instance;
                evtg evtgVar = dtrsVar.d;
                if (!evtgVar.c()) {
                    dtrsVar.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(list, dtrsVar.d);
                return (dtrs) dtrpVar.build();
            }
        };
        Executor executor = this.c;
        return dvaq.e(this.b.b(ejvrVar, executor)).f(new ejvr() { // from class: duld
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).c(IOException.class, new ejvr() { // from class: dulj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }
}
