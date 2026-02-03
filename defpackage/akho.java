package defpackage;

import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akho implements akhp {
    private final fdjx a;
    private final atol b;
    private final cifw c;
    private final asra d;
    private final atut e;

    public akho(fdjx fdjxVar, atol atolVar, cifw cifwVar, asra asraVar, atut atutVar, ardl ardlVar, awnf awnfVar) {
        fdjxVar.getClass();
        atolVar.getClass();
        cifwVar.getClass();
        asraVar.getClass();
        ardlVar.getClass();
        awnfVar.getClass();
        this.a = fdjxVar;
        this.b = atolVar;
        this.c = cifwVar;
        this.d = asraVar;
        this.e = atutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x0029, B:44:0x012d, B:46:0x013d, B:47:0x013f, B:51:0x0145, B:20:0x003b, B:37:0x0073, B:39:0x00a5, B:41:0x00b5, B:42:0x00cb, B:28:0x0058, B:32:0x0067, B:36:0x006f), top: B:56:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ajts r10, defpackage.auib r11, java.lang.String r12, android.net.Uri r13, defpackage.fcxy r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akho.e(ajts, auib, java.lang.String, android.net.Uri, fcxy):java.lang.Object");
    }

    private static final aubq f(ajts ajtsVar) throws X {
        aoer aoerVarH = ajtsVar.h();
        if (aoerVarH == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Optional optionalO = aoerVarH.o();
        final fdap fdapVar = new fdap() { // from class: akhh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((alqm) obj).e();
            }
        };
        Object objOrElseThrow = optionalO.flatMap(new Function() { // from class: akhi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseThrow(new Supplier() { // from class: akhj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("Active self identity required");
            }
        });
        objOrElseThrow.getClass();
        return (aubq) objOrElseThrow;
    }

    @Override // defpackage.akhp
    public final eiju a(ajts ajtsVar, Uri uri) {
        ajtsVar.getClass();
        cifw cifwVar = this.c;
        auib auibVarA = cifwVar.a();
        cifw.v(cifwVar, 24, 0, null, auibVarA, null, null, 0, null, null, 502);
        return auvw.c(this.a, fcyi.a, fdjz.a, new akhk(this, ajtsVar, auibVarA, uri, null));
    }

    @Override // defpackage.akhp
    public final eiju b(ajts ajtsVar, String str) {
        ajtsVar.getClass();
        str.getClass();
        cifw cifwVar = this.c;
        auib auibVarA = cifwVar.a();
        cifw.v(cifwVar, 22, 0, null, auibVarA, null, null, 0, null, null, 502);
        return auvw.c(this.a, fcyi.a, fdjz.a, new akhm(this, ajtsVar, auibVarA, str, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ajts r21, defpackage.auib r22, android.net.Uri r23, defpackage.fcxy r24) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akho.c(ajts, auib, android.net.Uri, fcxy):java.lang.Object");
    }
}
