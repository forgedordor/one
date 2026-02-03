package defpackage;

import android.util.Base64;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chxx {
    public static final ejxr a = cdag.v("mms_group_name_to_telephony");
    private static final eksp b = eksp.c("Bugle");

    public static chus a(Optional optional, chva chvaVar) {
        final chus chusVar = (chus) chut.a.createBuilder();
        chusVar.copyOnWrite();
        chut chutVar = (chut) chusVar.instance;
        chvb chvbVar = (chvb) chvaVar.build();
        chvbVar.getClass();
        chutVar.d = chvbVar;
        chutVar.c = 2;
        optional.map(new Function() { // from class: chxr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cnru.a((UUID) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: chxs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                chus chusVar2 = chusVar;
                evqs evqsVar = (evqs) obj;
                chusVar2.copyOnWrite();
                chut chutVar2 = (chut) chusVar2.instance;
                chut chutVar3 = chut.a;
                evqsVar.getClass();
                chutVar2.b |= 1;
                chutVar2.e = evqsVar;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return chusVar;
    }

    public static chuy b(String str, String str2, String str3) {
        chuy chuyVar = (chuy) chuz.a.createBuilder();
        chuyVar.copyOnWrite();
        ((chuz) chuyVar.instance).b = str;
        chuyVar.copyOnWrite();
        ((chuz) chuyVar.instance).d = str3;
        if (str2 != null) {
            chuyVar.copyOnWrite();
            ((chuz) chuyVar.instance).c = str2;
        }
        return chuyVar;
    }

    public static chxw c(String str) {
        return d(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: evtj -> 0x0170, TryCatch #0 {evtj -> 0x0170, blocks: (B:18:0x0049, B:21:0x0053, B:31:0x0096, B:33:0x00a2, B:34:0x00a9, B:37:0x00b0, B:39:0x00c1, B:43:0x00ea, B:45:0x00fe, B:47:0x0102, B:49:0x0109, B:48:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0136, B:54:0x0134, B:59:0x0149, B:27:0x0078, B:29:0x007e, B:30:0x0082, B:23:0x0058, B:25:0x005f, B:26:0x0063), top: B:70:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[Catch: evtj -> 0x0170, TryCatch #0 {evtj -> 0x0170, blocks: (B:18:0x0049, B:21:0x0053, B:31:0x0096, B:33:0x00a2, B:34:0x00a9, B:37:0x00b0, B:39:0x00c1, B:43:0x00ea, B:45:0x00fe, B:47:0x0102, B:49:0x0109, B:48:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0136, B:54:0x0134, B:59:0x0149, B:27:0x0078, B:29:0x007e, B:30:0x0082, B:23:0x0058, B:25:0x005f, B:26:0x0063), top: B:70:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[Catch: evtj -> 0x0170, TryCatch #0 {evtj -> 0x0170, blocks: (B:18:0x0049, B:21:0x0053, B:31:0x0096, B:33:0x00a2, B:34:0x00a9, B:37:0x00b0, B:39:0x00c1, B:43:0x00ea, B:45:0x00fe, B:47:0x0102, B:49:0x0109, B:48:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0136, B:54:0x0134, B:59:0x0149, B:27:0x0078, B:29:0x007e, B:30:0x0082, B:23:0x0058, B:25:0x005f, B:26:0x0063), top: B:70:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.chxw d(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chxx.d(java.lang.String, boolean):chxw");
    }

    public static String e(String str, String str2, Optional optional) {
        chuu chuuVar = (chuu) chuv.a.createBuilder();
        if (str != null) {
            evqs evqsVarX = evqs.x(str.getBytes(StandardCharsets.US_ASCII));
            chuuVar.copyOnWrite();
            ((chuv) chuuVar.instance).c = evqsVarX;
        }
        chuuVar.copyOnWrite();
        ((chuv) chuuVar.instance).d = str2;
        return f((chuv) chuuVar.build(), optional);
    }

    public static String f(chuv chuvVar, Optional optional) {
        chus chusVar = (chus) chut.a.createBuilder();
        chusVar.copyOnWrite();
        chut chutVar = (chut) chusVar.instance;
        chuvVar.getClass();
        chutVar.d = chuvVar;
        chutVar.c = 3;
        if (optional.isPresent()) {
            evqs evqsVarA = cnru.a((UUID) optional.get());
            chusVar.copyOnWrite();
            chut chutVar2 = (chut) chusVar.instance;
            chutVar2.b |= 1;
            chutVar2.e = evqsVarA;
        }
        return h((chut) chusVar.build());
    }

    public static String g(Optional optional) {
        chus chusVar = (chus) chut.a.createBuilder();
        chvd chvdVar = chvd.a;
        chusVar.copyOnWrite();
        chut chutVar = (chut) chusVar.instance;
        chvdVar.getClass();
        chutVar.d = chvdVar;
        chutVar.c = 4;
        if (optional.isPresent()) {
            evqs evqsVarA = cnru.a((UUID) optional.get());
            chusVar.copyOnWrite();
            chut chutVar2 = (chut) chusVar.instance;
            chutVar2.b |= 1;
            chutVar2.e = evqsVarA;
        }
        return h((chut) chusVar.build());
    }

    public static String h(chut chutVar) {
        evqs byteString = chutVar.toByteString();
        chuq chuqVar = (chuq) chur.a.createBuilder();
        chuqVar.copyOnWrite();
        chur churVar = (chur) chuqVar.instance;
        evub evubVar = churVar.b;
        if (!evubVar.b) {
            churVar.b = evubVar.a();
        }
        churVar.b.put("com.google.android.apps.messaging.", byteString);
        return "proto:".concat(String.valueOf(Base64.encodeToString(((chur) chuqVar.build()).toByteArray(), 2)));
    }

    private static Optional i(chut chutVar) {
        evqs evqsVar = chutVar.e;
        return evqsVar.H() ? Optional.empty() : Optional.of(cnru.b(evqsVar));
    }
}
