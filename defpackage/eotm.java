package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eotm {
    public final ekhx a;
    private final Map b = new ConcurrentHashMap();
    private final Map c = new ConcurrentHashMap();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Map e;
    private final Optional f;
    private final Optional g;

    public eotm(Optional optional, Optional optional2, Map map) {
        this.f = optional2;
        this.e = map;
        this.g = optional;
        optional2.isPresent();
        this.a = ekon.a;
    }

    public static final Optional f(String str) {
        String strA = ecek.a("debug.".concat(String.valueOf(str)), null);
        return (TextUtils.isEmpty(strA) ? Optional.empty() : Optional.of(strA)).map(new Function() { // from class: eotl
            public final /* synthetic */ String a = "true";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.equals((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final synchronized ListenableFuture a() {
        AtomicBoolean atomicBoolean = this.d;
        if (!atomicBoolean.get()) {
            return eorv.a;
        }
        ekgp.j(this.b);
        atomicBoolean.set(false);
        return ((eotn) this.f.orElseThrow()).a();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final Optional b(String str) {
        if (e()) {
            Optional optional = (Optional) Map.EL.computeIfAbsent(this.c, str, new Function() { // from class: eotj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return eotm.f((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (optional.isPresent()) {
                return optional;
            }
        }
        g();
        return Optional.empty();
    }

    public final synchronized void c(String str, Optional optional) {
        g();
        ejwl.a(false);
        ejwl.a(this.a.contains(str));
        if (f(str).isPresent()) {
            return;
        }
        this.b.put(str, optional);
        this.d.set(true);
    }

    public final boolean d(String str) {
        g();
        ejwl.a(false);
        return ((Boolean) ((fcsu) Map.EL.getOrDefault(this.e, str, new fcsu() { // from class: eoti
            @Override // defpackage.fcsu
            public final Object b() {
                return false;
            }
        })).b()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) ((fcsu) this.g.orElse(new fcsu() { // from class: eotk
            @Override // defpackage.fcsu
            public final Object b() {
                this.a.g();
                return false;
            }
        })).b()).booleanValue();
    }

    public final void g() {
        this.f.isPresent();
    }
}
