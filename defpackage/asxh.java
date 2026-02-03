package defpackage;

import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asxh implements cldz, asxy, aszp {
    public static final cqce a = cqce.g("BugleRcsCapabilities", "DualRegistrationNetworkCapabilitiesProvider");
    public static final eksp b = eksp.c("BugleRcsCapabilities");
    public final ContactsService c;
    public final fcsu d;
    public final cogw e;
    public final Map f = new HashMap();
    public final Object g = new Object();
    private final eosc h;
    private final eosc i;
    private final awlc j;

    public asxh(eosc eoscVar, eosc eoscVar2, ContactsService contactsService, awlc awlcVar, fcsu fcsuVar, cogw cogwVar) {
        this.c = contactsService;
        this.j = awlcVar;
        this.d = fcsuVar;
        this.h = eoscVar2;
        this.i = eoscVar;
        this.e = cogwVar;
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        return eijx.d(new IllegalStateException("getBatchCapabilities not supported for DualReg."));
    }

    @Override // defpackage.asxy
    public final eiju b(aubq aubqVar) {
        ((eksl) b.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 96, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start getCapabilities with chatEndpoint %s", cqcv.b(aubqVar.d));
        if ((aubqVar.b & 2) == 0) {
            return eijx.d(new assm("[Dual Registration] Getting capabilities failed since remote user id is null"));
        }
        final String str = aubqVar.d;
        return eiju.g(kol.a(new koi() { // from class: aswz
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                eksl ekslVar = (eksl) asxh.b.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 110, "DualRegistrationNetworkCapabilitiesProvider.java");
                String str2 = str;
                ekslVar.t("DualRegistrationNetworkCapabilitiesProvider: start forceRefresh for remoteUserId %s", cqcv.b(str2));
                this.a.f(str2, kogVar, true);
                return "DualRegistrationNetworkCapabilitiesProvider.getCapabilities";
            }
        })).h(new ejvr() { // from class: asxa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar = (eksl) asxh.b.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 121, "DualRegistrationNetworkCapabilitiesProvider.java");
                List list = ((ImsCapabilities) obj).i;
                ekslVar.t("DualRegistrationNetworkCapabilitiesProvider: forceRefresh return imsCapabilities.getSupportedServiceIdList %s", list);
                int i = asts.b;
                aste asteVar = new aste();
                asteVar.c(asvj.a(list));
                asteVar.b(this.a.e.f());
                return asteVar.a();
            }
        }, this.h);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }

    @Override // defpackage.aszp
    public final eiju d(final aubq aubqVar) {
        if ((aubqVar.b & 2) == 0) {
            return eijx.d(new aszn());
        }
        final String str = aubqVar.d;
        return eiju.g(kol.a(new koi() { // from class: aswx
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                this.a.f(str, kogVar, false);
                return "DualRegistrationNetworkCapabilitiesProvider.getOnlineStatus";
            }
        })).i(new eooz() { // from class: aswy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                boolean z = imsCapabilities.c;
                asxh asxhVar = this.a;
                aubq aubqVar2 = aubqVar;
                if (z) {
                    return asxhVar.e(aubqVar2, imsCapabilities).h(new ejvr() { // from class: asxb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqce cqceVar = asxh.a;
                            return aszo.ONLINE;
                        }
                    }, eoqg.a);
                }
                int i = imsCapabilities.g;
                if (i != 404) {
                    if (i == 408 || i == 480) {
                        return eijx.e(aszo.OFFLINE);
                    }
                    if (i != 604) {
                        asxh.a.m(a.e(i, "[Dual Registraion] Received response code: ", " when trying to retrieve online status."));
                        return eijx.e(aszo.NOT_RCS);
                    }
                }
                return asxhVar.e(aubqVar2, imsCapabilities).h(new ejvr() { // from class: asxc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = asxh.a;
                        return aszo.NOT_RCS;
                    }
                }, eoqg.a);
            }
        }, this.h);
    }

    public final eiju e(final aubq aubqVar, ImsCapabilities imsCapabilities) {
        int i = asts.b;
        aste asteVar = new aste();
        asteVar.c(asvj.a(imsCapabilities.i));
        asteVar.b(this.e.f());
        final asts astsVarA = asteVar.a();
        return this.j.a(new Function() { // from class: asxd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = asxh.a;
                return ((asvl) obj).b(aubqVar, astsVarA);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void f(final String str, final kog kogVar, final boolean z) {
        eksp ekspVar = b;
        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 262, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start putPendingCompleter for remoteUserId %s and completer", cqcv.b(str));
        synchronized (this.g) {
            Map map = this.f;
            List arrayList = (List) map.get(str);
            ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 268, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: userPendingEvents %s", arrayList);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(str, arrayList);
            }
            arrayList.add(kogVar);
            ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 275, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: completer added to userPendingEvents %s", arrayList);
        }
        eiju eijuVarG = eijx.g(new Callable() { // from class: asxe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c.forceRefreshCapabilities(str);
            }
        }, this.i);
        ejvr ejvrVar = new ejvr() { // from class: asxf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                asxh asxhVar = this.a;
                String str2 = str;
                kog kogVar2 = kogVar;
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                if (contactsServiceResult == null) {
                    asxhVar.g(str2, kogVar2, new assm("[Dual Registration] ContactServiceResult is null"));
                    return null;
                }
                if (contactsServiceResult.succeeded()) {
                    return null;
                }
                asxhVar.g(str2, kogVar2, new assm("[Dual Registration] ContactServiceResult failed: " + dstt.codeToString(contactsServiceResult.getCode()) + "," + contactsServiceResult.getDescription()));
                return null;
            }
        };
        eosc eoscVar = this.h;
        auvh.h(eijuVarG.h(ejvrVar, eoscVar).e(efao.class, new ejvr() { // from class: asxg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                efao efaoVar = (efao) obj;
                Throwable assmVar = z ? new assm("[Dual Registration] RCS Engine failed with an exception", efaoVar) : new aszn("[Dual Registration] RCS Engine failed with an exception", efaoVar);
                this.a.g(str, kogVar, assmVar);
                return null;
            }
        }, eoscVar));
    }

    public final void g(String str, kog kogVar, Throwable th) {
        eksp ekspVar = b;
        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 282, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start removePendingCompleter for remoteUserId %s and completer", cqcv.b(str));
        synchronized (this.g) {
            Map map = this.f;
            List list = (List) map.get(str);
            if (list != null) {
                list.remove(kogVar);
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 292, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: completer removed from userPendingEvents %s", list);
                if (list.isEmpty()) {
                    map.remove(str);
                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 298, "DualRegistrationNetworkCapabilitiesProvider.java")).D("DualRegistrationNetworkCapabilitiesProvider: remoteUserId %s removed from pendingEvents %s", cqcv.b(str), map);
                }
            }
        }
        kogVar.c(th);
    }
}
