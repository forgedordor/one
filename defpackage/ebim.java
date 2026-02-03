package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebim implements ebid {
    private static final ekgb a;
    private final List b;
    private final ebia c;
    private final ebib d;

    static {
        int i = ekgb.d;
        a = ekoe.a;
    }

    public ebim(List list, ebia ebiaVar, ebib ebibVar) {
        list.getClass();
        this.b = (List) Collection.EL.stream(list).map(new Function() { // from class: ebil
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InetAddress) obj).getHostAddress();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        ebiaVar.getClass();
        this.c = ebiaVar;
        ebibVar.getClass();
        this.d = ebibVar;
    }

    static final String[] e() {
        ResolverConfig resolverConfigB = ResolverConfig.b();
        return resolverConfigB == null ? new String[0] : resolverConfigB.servers;
    }

    private final ListenableFuture f(String str, Class cls) {
        ListenableFuture listenableFutureH;
        List list = this.b;
        int iA = ebif.a(cls);
        if (list.isEmpty()) {
            return eork.i(a);
        }
        if (TextUtils.isEmpty(str)) {
            dhja.q("Unable to lookup records for null target!", new Object[0]);
            return eork.i(a);
        }
        try {
            ebip ebipVar = new ebip(new fgya(str, iA));
            ebhy ebhyVarB = ebif.b(str, cls, e());
            this.c.a(ebhyVarB);
            List listB = null;
            try {
                try {
                    listB = ebipVar.b(cls);
                    listenableFutureH = eork.i(listB);
                } catch (ClassCastException e) {
                    dhja.i(e, "classcastexception - this should never happen", new Object[0]);
                    listenableFutureH = eork.h(e);
                }
                return listenableFutureH;
            } finally {
                this.d.a(ebif.d(ebipVar, ebhyVarB, listB));
            }
        } catch (fhae e2) {
            dhja.s(e2, "Invalid %s lookup target: %s", fhag.a(iA), str);
            return eork.i(a);
        }
    }

    @Override // defpackage.ebid
    public final synchronized ListenableFuture a(String str) {
        int i;
        ListenableFuture listenableFutureH;
        if (this.b.isEmpty()) {
            return eork.i(a);
        }
        ebhy ebhyVarB = ebif.b(str, fgwi.class, e());
        this.c.a(ebhyVarB);
        try {
            listenableFutureH = eork.i(Arrays.asList(fgwj.f(str)));
            i = 0;
        } catch (UnknownHostException e) {
            i = 3;
            try {
                listenableFutureH = eork.h(e);
            } catch (Throwable th) {
                th = th;
                this.d.a(ebif.d(new ebip(i), ebhyVarB, null));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 1;
            this.d.a(ebif.d(new ebip(i), ebhyVarB, null));
            throw th;
        }
        this.d.a(ebif.d(new ebip(i), ebhyVarB, null));
        return listenableFutureH;
    }

    @Override // defpackage.ebid
    public final synchronized ListenableFuture b(String str) {
        return f(str, fgyk.class);
    }

    @Override // defpackage.ebid
    public final synchronized ListenableFuture c(String str) {
        return f(str, fgzq.class);
    }

    public final void d() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            List list = this.b;
            Field declaredField = ResolverConfig.b().getClass().getDeclaredField("servers");
            declaredField.setAccessible(true);
            if (!list.isEmpty()) {
                declaredField.set(ResolverConfig.b(), list.toArray(new String[0]));
            }
            fgya.c();
            fgya.f().e();
            dhja.k("Using name servers: %s", Arrays.toString(ResolverConfig.b().servers));
        } catch (IllegalAccessException | LinkageError | NoSuchFieldException e) {
            dhja.e(e, "Exception setting name servers", new Object[0]);
        }
    }
}
