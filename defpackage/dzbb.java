package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.people.internal.IPeopleService;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbb implements dyyv {
    public static final /* synthetic */ int b = 0;
    private static final ddul c;
    private final Context d;
    private final ddun e;
    private final ddut f;
    private final ddup g;
    private final Executor h;
    private final dyyl i;
    private final dcdt j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final dduq k = new dduq() { // from class: dzax
        @Override // defpackage.dduq
        public final void a() {
            Iterator it = this.a.a.iterator();
            while (it.hasNext()) {
                ((eglg) it.next()).a();
            }
        }
    };

    static {
        ddul ddulVar = new ddul();
        ddulVar.a = 1;
        c = ddulVar;
    }

    public dzbb(Context context, ddun ddunVar, ddut ddutVar, ddup ddupVar, dyyl dyylVar, Executor executor, dcdt dcdtVar) {
        this.d = context;
        this.e = ddunVar;
        this.f = ddutVar;
        this.g = ddupVar;
        this.h = executor;
        this.i = dyylVar;
        this.j = dcdtVar;
    }

    public static Object h(ListenableFuture listenableFuture, String str) throws ExecutionException {
        try {
            return eork.q(listenableFuture);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof dceo) || (cause instanceof dcen)) {
                throw e;
            }
            Log.e("OneGoogle", String.format("Failed to load %s. Exception: %s", str, dyqf.a(cause)));
            return null;
        }
    }

    private final ListenableFuture i(int i) {
        return dceq.g(i) ? eork.h(new dceo(i, "Google Play Services not available", this.j.i(this.d, i, null))) : eork.h(new dcen(i));
    }

    @Override // defpackage.dyyv
    public final ListenableFuture a() {
        return c();
    }

    @Override // defpackage.dyyv
    public final ListenableFuture b(final String str) {
        return eooq.f(c(), eiid.a(new ejvr() { // from class: dzaz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                int i = dzbb.b;
                int size = ekgbVar.size();
                int i2 = 0;
                while (i2 < size) {
                    String str2 = str;
                    dyys dyysVar = (dyys) ekgbVar.get(i2);
                    i2++;
                    if (str2.equals(dyysVar.a())) {
                        return dyysVar;
                    }
                }
                return null;
            }
        }), eoqg.a);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture c() {
        final ListenableFuture listenableFutureA;
        dcdt dcdtVar = this.j;
        Context context = this.d;
        dyyl dyylVar = this.i;
        final ListenableFuture listenableFutureA2 = dyylVar.a();
        int iH = dcdtVar.h(context, 10000000);
        if (iH != 0) {
            listenableFutureA = i(iH);
        } else {
            ddun ddunVar = this.e;
            ddul ddulVar = c;
            dcfd dcfdVar = dduy.a;
            dcfq dcfqVar = ddunVar.k;
            ddxk ddxkVar = new ddxk(dcfqVar, ddulVar);
            dcfqVar.b(ddxkVar);
            listenableFutureA = dzbh.a(ddxkVar, eiid.a(new ejvr() { // from class: dzba
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = dzbb.b;
                    ddxp ddxpVarC = ((ddum) obj).c();
                    ArrayList arrayList = new ArrayList();
                    dcji dcjiVar = new dcji(ddxpVarC);
                    while (dcjiVar.hasNext()) {
                        ddxa ddxaVar = (ddxa) dcjiVar.next();
                        if (!ddxaVar.a.f()) {
                            arrayList.add(dzbc.a.apply(ddxaVar));
                        }
                    }
                    return ekgb.n(arrayList);
                }
            }), eoqg.a);
        }
        final dyyp dyypVar = (dyyp) dyylVar;
        final ListenableFuture listenableFutureH = eika.h(new Callable() { // from class: dyyn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Arrays.asList(dbmj.a(dyypVar.b, dyyp.a));
            }
        }, dyypVar.c);
        return eika.b(listenableFutureA2, listenableFutureA, listenableFutureH).a(new Callable() { // from class: dzay
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() throws dyyu {
                boolean z;
                List list = (List) dzbb.h(listenableFutureA2, "device accounts");
                List<Account> list2 = (List) dzbb.h(listenableFutureH, "g1 accounts");
                ekgb ekgbVar = (ekgb) dzbb.h(listenableFutureA, "owners");
                if (list == null && list2 == null && ekgbVar == null) {
                    throw new dyyu();
                }
                ArrayList arrayList = new ArrayList();
                HashMap map = new HashMap();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dzav.a(((Account) it.next()).name, arrayList, map);
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (list2 != null) {
                    for (Account account : list2) {
                        if (!z) {
                            dzav.a(account.name, arrayList, map);
                        }
                        dyyq dyyqVar = (dyyq) map.get(account.name);
                        if (dyyqVar != null) {
                            dyyqVar.h(true);
                        }
                    }
                }
                if (ekgbVar != null) {
                    int size = ekgbVar.size();
                    for (int i = 0; i < size; i++) {
                        dyys dyysVar = (dyys) ekgbVar.get(i);
                        String strA = dyysVar.a();
                        if (!z) {
                            dzav.a(strA, arrayList, map);
                        }
                        dyyq dyyqVar2 = (dyyq) map.get(strA);
                        if (dyyqVar2 != null) {
                            dyyqVar2.d(dyysVar.d());
                            dyyqVar2.f(dyysVar.f());
                            dyyqVar2.e(dyysVar.e());
                            dyyqVar2.j(dyysVar.g());
                            dyyqVar2.c(dyysVar.b());
                            dyyqVar2.g(dyysVar.k());
                        }
                    }
                }
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ekfwVar.h(((dyyq) map.get((String) it2.next())).a());
                }
                return ekfwVar.g();
            }
        }, eoqg.a);
    }

    @Override // defpackage.dyyv
    public final void d(eglg eglgVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList.isEmpty()) {
            ddut ddutVar = this.f;
            dcib dcibVarG = ddutVar.g(this.k, dduq.class.getName());
            final PeopleClientImpl.OnDataChangedBinderCallback onDataChangedBinderCallback = new PeopleClientImpl.OnDataChangedBinderCallback(dcibVarG);
            dcir dcirVar = new dcir() { // from class: ddur
                @Override // defpackage.dcir
                public final void a(Object obj, Object obj2) {
                    PeopleClientImpl peopleClientImpl = (PeopleClientImpl) obj;
                    IPeopleService iPeopleService = (IPeopleService) peopleClientImpl.w();
                    Context context = peopleClientImpl.c;
                    iPeopleService.registerDataChangedListener(onDataChangedBinderCallback, true, null, null, 1, ddlh.a());
                    ((defr) obj2).b(null);
                }
            };
            dcir dcirVar2 = new dcir() { // from class: ddus
                @Override // defpackage.dcir
                public final void a(Object obj, Object obj2) {
                    PeopleClientImpl peopleClientImpl = (PeopleClientImpl) obj;
                    IPeopleService iPeopleService = (IPeopleService) peopleClientImpl.w();
                    Context context = peopleClientImpl.c;
                    iPeopleService.registerDataChangedListener(onDataChangedBinderCallback, false, null, null, 0, ddlh.a());
                    ((defr) obj2).b(true);
                }
            };
            dcip dcipVar = new dcip();
            dcipVar.a = dcirVar;
            dcipVar.b = dcirVar2;
            dcipVar.c = dcibVarG;
            dcipVar.e = 2720;
            ddutVar.k(dcipVar.a());
        }
        copyOnWriteArrayList.add(eglgVar);
    }

    @Override // defpackage.dyyv
    public final void e(eglg eglgVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        copyOnWriteArrayList.remove(eglgVar);
        if (copyOnWriteArrayList.isEmpty()) {
            this.f.l(dcic.a(this.k, dduq.class.getName()), 2721);
        }
    }

    @Override // defpackage.dyyv
    public final ListenableFuture f(String str, int i) {
        return g(str, i);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture g(String str, int i) {
        int iH = this.j.h(this.d, 10400000);
        if (iH != 0) {
            return i(iH);
        }
        ddup ddupVar = this.g;
        int iA = dyyk.a(i);
        dcfd dcfdVar = dduy.a;
        dcfq dcfqVar = ddupVar.k;
        ddxl ddxlVar = new ddxl(dcfqVar, str, iA);
        dcfqVar.b(ddxlVar);
        return dzbh.a(ddxlVar, new ejvr() { // from class: dzaw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                int i2 = dzbb.b;
                ParcelFileDescriptor parcelFileDescriptorC = ((dduo) obj).c();
                if (parcelFileDescriptorC == null) {
                    return null;
                }
                try {
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorC);
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                        return bitmapDecodeStream;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, this.h);
    }
}
