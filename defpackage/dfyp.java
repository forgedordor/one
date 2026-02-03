package defpackage;

import android.content.Context;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfyp {
    public InetAddress a;
    public Network b;
    private final Context c;

    public dfyp(Context context) {
        this.c = context;
    }

    public final dhkr a() {
        return dhkq.f(this.c);
    }

    public final synchronized void b(String str) {
        try {
            this.a = InetAddress.getByName(str);
            try {
                this.b = (Network) DesugarArrays.stream(a().i()).filter(new Predicate() { // from class: dfyn
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
                        LinkProperties linkPropertiesA;
                        List list;
                        dfyp dfypVar = this.a;
                        try {
                            linkPropertiesA = dfypVar.a().a((Network) obj);
                        } catch (dhkf e) {
                            dhja.i(e, "Can't get link properties, missing permissions.", new Object[0]);
                            linkPropertiesA = null;
                        }
                        if (linkPropertiesA == null) {
                            int i = ekgb.d;
                            list = ekoe.a;
                        } else {
                            list = (List) Collection.EL.stream(linkPropertiesA.getLinkAddresses()).map(new Function() { // from class: dfyo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((LinkAddress) obj2).getAddress();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toList());
                        }
                        return list.contains(dfypVar.a);
                    }
                }).findFirst().orElse(null);
            } catch (dhkf e) {
                dhja.i(e, "Can't get network, missing permissions.", new Object[0]);
            }
            dhja.k("Updated network %s", this.b);
        } catch (UnknownHostException e2) {
            dhja.i(e2, "Unknown ip address %s", str);
        }
    }
}
