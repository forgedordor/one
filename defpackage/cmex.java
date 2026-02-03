package defpackage;

import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmex implements chtw, cldz {
    public static final cqce a = cqce.g("Bugle", "RbmBotIdResolverServiceImpl");
    public final eosc b;
    public final eosc c;
    public final ScheduledExecutorService d;
    public final ContactsService e;
    public final fcsu f;
    public final aspz g;
    public final Object h = new Object();
    public final Map i = new HashMap();

    public cmex(eosc eoscVar, eosc eoscVar2, eosd eosdVar, ContactsService contactsService, fcsu fcsuVar, aspz aspzVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = eosdVar;
        this.e = contactsService;
        this.f = fcsuVar;
        this.g = aspzVar;
    }

    @Override // defpackage.chtw
    public final eiju a(alqm alqmVar) {
        cqce cqceVar = a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.D("remoteMessagingIdentity", alqmVar.toString());
        cqbdVarA.r();
        if (alqmVar == null || alqmVar.x(false)) {
            this.g.b(null);
            cqceVar.r("Shortcode does not exist!");
            return eijx.d(new assm("[Dual Registration] Getting capabilities failed since remote user id is null"));
        }
        final String strJ = alqmVar.j();
        this.g.b(strJ);
        return eiju.g(kol.a(new koi() { // from class: cmeu
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final String str = strJ;
                if (str == null) {
                    cmex.a.r("Shortcode does not exist!");
                    kogVar.c(new assm("Getting Capabilities failed due to remote user id being null"));
                    return "RbmBotIdResolverServiceImpl.getBotChatEndpoint";
                }
                final cmex cmexVar = this.a;
                cmex.a.p("Remove completer on time out for UserId: ".concat(str));
                kogVar.a(new Runnable() { // from class: cmew
                    @Override // java.lang.Runnable
                    public final void run() {
                        cmex cmexVar2 = cmexVar;
                        aspz aspzVar = cmexVar2.g;
                        String str2 = str;
                        aspzVar.l(str2, 2);
                        cmexVar2.c(str2, kogVar);
                    }
                }, cmexVar.d);
                synchronized (cmexVar.h) {
                    Map map = cmexVar.i;
                    Set hashSet = (Set) map.get(str);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(str, hashSet);
                    }
                    hashSet.add(kogVar);
                }
                eiju eijuVarG = eijx.g(new Callable() { // from class: cmer
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cmexVar.e.refreshCapabilities(str);
                    }
                }, cmexVar.b);
                ejvr ejvrVar = new ejvr() { // from class: cmes
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                        if (contactsServiceResult == null) {
                            contactsServiceResult = new ContactsServiceResult(1, "ContactsService returned null.");
                        }
                        String str2 = str;
                        if (contactsServiceResult.succeeded()) {
                            cmex.a.p("Capabilities feched in bot id resolving for user: ".concat(str2));
                            return null;
                        }
                        cmexVar.b(new assf(contactsServiceResult), kogVar, str2);
                        return null;
                    }
                };
                eosc eoscVar = cmexVar.c;
                auvh.h(eijuVarG.h(ejvrVar, eoscVar).e(efao.class, new ejvr() { // from class: cmet
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cmexVar.b(new assf((efao) obj), kogVar, str);
                        return null;
                    }
                }, eoscVar));
                return "RbmBotIdResolverServiceImpl.getBotChatEndpoint";
            }
        })).j(12L, TimeUnit.SECONDS, this.d).h(new ejvr() { // from class: cmev
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                boolean zIsEmpty = imsCapabilities.j.isEmpty();
                cmex cmexVar = this.a;
                String str = strJ;
                if (zIsEmpty) {
                    cmexVar.g.l(str, 3);
                    return Optional.empty();
                }
                String str2 = (String) imsCapabilities.j.get();
                cqbd cqbdVarC = cmex.a.c();
                cqbdVarC.A("RBM bot id for shortcode", str2);
                cqbdVarC.r();
                cmexVar.g.c(str, str2);
                return Optional.of(((asqx) cmexVar.f.b()).b(str2));
            }
        }, eoqg.a);
    }

    public final void b(Throwable th, kog kogVar, String str) {
        a.s("Error getting capabilities for bot id resolving.", th);
        this.g.l(str, 4);
        kogVar.c(th);
        c(str, kogVar);
    }

    public final void c(String str, kog kogVar) {
        synchronized (this.h) {
            Map map = this.i;
            Set set = (Set) map.get(str);
            if (set == null) {
                return;
            }
            set.remove(kogVar);
            if (set.isEmpty()) {
                map.remove(str);
            }
        }
    }
}
