package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebvc implements ebun, ebyd {
    public final Context a;
    public final eosc b;
    public final ejxr c;
    public final ejwi d;
    public final ejwi e;
    public final ebxs f;
    public final ebyc g;
    public final ebvk h;
    private final eryv i;
    private final ejxr j;
    private final ejxr k;

    public ebvc(Context context, eosc eoscVar, eryv eryvVar, final ejxr ejxrVar, String str, ebvk ebvkVar, ebxs ebxsVar, ebyf ebyfVar, Uri uri, ejxr ejxrVar2) {
        this.a = context;
        this.b = eoscVar;
        this.i = eryvVar;
        this.k = ejxrVar2;
        final ArrayList arrayList = new ArrayList();
        fbrg fbrgVar = new fbrg();
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), str);
        arrayList.add(new fcrz(fbrgVar));
        this.j = ejxrVar;
        this.c = ejxx.a(new ejxr() { // from class: ebuw
            @Override // defpackage.ejxr
            public final Object get() {
                return (etza) etza.h(new etyz(), fbnk.a((fbnd) ejxrVar.get(), arrayList));
            }
        });
        this.h = ebvkVar;
        this.f = ebxsVar;
        this.g = new ebyc(this);
        this.d = ejwi.i(ebyfVar);
        this.e = uri != null ? ejwi.j(uri.buildUpon().appendQueryParameter("key", str).appendQueryParameter("alt", "proto").build()) : ejud.a;
    }

    private final ListenableFuture u() {
        ListenableFuture listenableFutureA;
        ebyc ebycVar = this.g;
        synchronized (ebycVar.b) {
            if (ebycVar.d == null) {
                ebyc.b();
            }
            listenableFutureA = ebycVar.d.a();
        }
        return listenableFutureA;
    }

    @Override // defpackage.ebun
    public final ebxr a() {
        return this.f;
    }

    @Override // defpackage.ebun
    public final ListenableFuture b() {
        return eooq.f(u(), new ejvr() { // from class: ebur
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                ArrayList arrayList = new ArrayList();
                for (String str : this.a.h.a()) {
                    if (linkedHashMap.containsKey(str)) {
                        arrayList.add((etyu) linkedHashMap.get(str));
                    }
                }
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.ebun
    public final ListenableFuture c(final String str) {
        return eooq.f(u(), new ejvr() { // from class: ebut
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                String str2 = str;
                if (linkedHashMap.containsKey(str2)) {
                    return (etyu) linkedHashMap.get(str2);
                }
                throw new NoSuchElementException(a.a(str2, "Sticker pack ", " not found."));
            }
        }, eoqg.a);
    }

    @Override // defpackage.ebun
    public final ListenableFuture d() {
        return eooq.f(u(), new ejvr() { // from class: ebup
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new ArrayList(((LinkedHashMap) obj).values());
            }
        }, eoqg.a);
    }

    @Override // defpackage.ebun
    public final ListenableFuture e(final String str) {
        return eooq.f(c(ebve.c(str)), new ejvr() { // from class: ebuy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str2;
                etyp etypVar;
                Iterator<E> it = ((etyu) obj).h.iterator();
                do {
                    str2 = str;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException(a.a(str2, "Sticker ", " not found."));
                    }
                    etypVar = (etyp) it.next();
                } while (!str2.equals(etypVar.c));
                return etypVar;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ebun
    public final ListenableFuture f(final String str) {
        ebyc ebycVar = this.g;
        synchronized (ebycVar.b) {
            if (ebycVar.d == null) {
                ebyc.b();
            }
        }
        String strA = this.g.a();
        eooy eooyVar = new eooy() { // from class: ebus
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                etyr etyrVar;
                Locale locale;
                etyk etykVar = (etyk) etyl.a.createBuilder();
                etyi etyiVar = (etyi) etyj.a.createBuilder();
                etyiVar.copyOnWrite();
                etyj etyjVar = (etyj) etyiVar.instance;
                String str2 = str;
                str2.getClass();
                etyjVar.b = str2;
                etykVar.copyOnWrite();
                etyl etylVar = (etyl) etykVar.instance;
                etyj etyjVar2 = (etyj) etyiVar.build();
                etyjVar2.getClass();
                etylVar.d = etyjVar2;
                etylVar.b |= 2;
                ebvc ebvcVar = this.a;
                ebyc ebycVar2 = ebvcVar.g;
                String strA2 = ebycVar2.a();
                synchronized (ebycVar2.b) {
                    ebxz ebxzVar = ebycVar2.d;
                    etyrVar = null;
                    locale = ebxzVar == null ? null : ebxzVar.d;
                }
                ebyc ebycVar3 = ebvcVar.g;
                synchronized (ebycVar3.b) {
                    ebxz ebxzVar2 = ebycVar3.d;
                    if (ebxzVar2 != null) {
                        etyrVar = ebxzVar2.f;
                    }
                }
                etzd etzdVar = (etzd) ebvcVar.r(strA2, locale, etyrVar).build();
                etykVar.copyOnWrite();
                etyl etylVar2 = (etyl) etykVar.instance;
                etzdVar.getClass();
                etylVar2.c = etzdVar;
                etylVar2.b |= 1;
                etyl etylVar3 = (etyl) etykVar.build();
                ebvcVar.t();
                etza etzaVar = (etza) ebvcVar.c.get();
                fbnd fbndVar = etzaVar.a;
                fbrk fbrkVarA = etzb.b;
                if (fbrkVarA == null) {
                    synchronized (etzb.class) {
                        fbrkVarA = etzb.b;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.expression.sticker.v1.StickerService", "SearchStickers");
                            fbrhVarA.b();
                            etyl etylVar4 = etyl.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etylVar4);
                            fbrhVarA.b = new fcrh(etyn.a);
                            fbrkVarA = fbrhVarA.a();
                            etzb.b = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, etzaVar.b), etylVar3);
            }
        };
        eosc eoscVar = this.b;
        ListenableFuture listenableFutureN = eork.n(eooyVar, eoscVar);
        eork.r(listenableFutureN, new ebva(this, strA), eoscVar);
        return listenableFutureN;
    }

    @Override // defpackage.ebun
    public final ListenableFuture g(final String str, final boolean z) {
        return this.b.submit(new Callable() { // from class: ebux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.h.b(str, z);
                return null;
            }
        });
    }

    @Override // defpackage.ebun
    public final eosc h() {
        return this.b;
    }

    @Override // defpackage.ebun
    public final eryv i() {
        return this.i;
    }

    @Override // defpackage.ebun
    public final void j(ebvg ebvgVar) {
        this.h.a.add(ebvgVar);
    }

    @Override // defpackage.ebun
    public final void k() {
        ebyc ebycVar = this.g;
        synchronized (ebycVar.c) {
            ebxz ebxzVar = ebycVar.e;
        }
        synchronized (ebycVar.b) {
            ebxz ebxzVar2 = ebycVar.d;
            if (ebxzVar2 != null) {
                ebxzVar2.c();
            }
        }
    }

    @Override // defpackage.ebun
    public final void l(ebvg ebvgVar) {
        this.h.a.remove(ebvgVar);
    }

    @Override // defpackage.ebun
    public final boolean m(String str) {
        return this.h.a().contains(str);
    }

    @Override // defpackage.ebun
    public final boolean n() {
        return ((Boolean) ((ejxw) this.k).a).booleanValue();
    }

    @Override // defpackage.ebun
    public final ebvk o() {
        return this.h;
    }

    @Override // defpackage.ebun
    public final void p(final List list) {
        this.b.submit(new Callable() { // from class: ebuq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = list.iterator();
                while (true) {
                    ebvc ebvcVar = this.a;
                    if (!it.hasNext()) {
                        ebvcVar.h.c(true);
                        return null;
                    }
                    ebvcVar.h.b((String) it.next(), true);
                }
            }
        });
    }

    @Override // defpackage.ebun
    public final /* synthetic */ void q(String str, Locale locale, etyr etyrVar) {
        ebyc ebycVar = this.g;
        String strB = ebye.b(str, locale, etyrVar);
        synchronized (ebycVar.b) {
            ebxz ebxzVar = ebycVar.d;
            if (ebxzVar != null && strB.equals(ebxzVar.e)) {
                eooq.f(ebycVar.d.a(), new ejvr() { // from class: ebya
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return null;
                    }
                }, eoqg.a);
                return;
            }
            ebxz ebxzVar2 = ebycVar.d;
            if (ebxzVar2 != null) {
                ebxzVar2.c();
            }
            ebyd ebydVar = ebycVar.a;
            ebycVar.d = new ebxz(ebydVar, str, locale, etyrVar);
            ((ebvc) ebydVar).f.a = str;
            eooq.f(ebycVar.d.a(), new ejvr() { // from class: ebyb
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return null;
                }
            }, eoqg.a);
        }
    }

    public final etzc r(String str, Locale locale, etyr etyrVar) {
        String upperCase;
        int i;
        etzc etzcVar = (etzc) etzd.a.createBuilder();
        etyc etycVar = (etyc) etyd.a.createBuilder();
        etycVar.copyOnWrite();
        etyd etydVar = (etyd) etycVar.instance;
        eryv eryvVar = this.i;
        etydVar.c = eryvVar;
        etydVar.b |= 1;
        String string = locale.toString();
        etycVar.copyOnWrite();
        etyd etydVar2 = (etyd) etycVar.instance;
        string.getClass();
        etydVar2.d = string;
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager == null) {
            upperCase = locale.getCountry();
        } else {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso)) {
                simCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    simCountryIso = locale.getCountry();
                }
            }
            upperCase = simCountryIso.toUpperCase();
        }
        etycVar.copyOnWrite();
        etyd etydVar3 = (etyd) etycVar.instance;
        upperCase.getClass();
        etydVar3.e = upperCase;
        etyd etydVar4 = (etyd) etycVar.build();
        etzcVar.copyOnWrite();
        etzd etzdVar = (etzd) etzcVar.instance;
        etydVar4.getClass();
        etzdVar.c = etydVar4;
        etzdVar.b |= 1;
        etzcVar.copyOnWrite();
        etzd etzdVar2 = (etzd) etzcVar.instance;
        str.getClass();
        etzdVar2.d = str;
        etzcVar.copyOnWrite();
        etzd etzdVar3 = (etzd) etzcVar.instance;
        etyrVar.getClass();
        etzdVar3.g = etyrVar;
        etzdVar3.b |= 2;
        List listA = this.h.a();
        etzcVar.copyOnWrite();
        etzd etzdVar4 = (etzd) etzcVar.instance;
        evtg evtgVar = etzdVar4.e;
        if (!evtgVar.c()) {
            etzdVar4.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(listA, etzdVar4.e);
        int i2 = eryvVar.b;
        int iB = eryr.b(i2);
        if (iB != 0 && iB == 12) {
            i = 7;
        } else {
            int iB2 = eryr.b(i2);
            i = (iB2 != 0 && iB2 == 5) ? 6 : 5;
        }
        etzcVar.copyOnWrite();
        ((etzd) etzcVar.instance).f = i - 2;
        return etzcVar;
    }

    @Override // defpackage.ebyd
    public final File s() {
        return this.a.getCacheDir();
    }

    public final void t() {
        fbqm fbqmVar = (fbqm) this.j.get();
        if (fbqmVar.g().equals(fbnv.TRANSIENT_FAILURE)) {
            Log.d("ExpressiveStickerClient", "RPCChannel was in TRANSIENT_FAILURE state.");
            fbqmVar.e();
        }
    }
}
